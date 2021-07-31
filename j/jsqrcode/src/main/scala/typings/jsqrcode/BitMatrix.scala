package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitMatrix extends StObject {
  
  val Dimension: Double
  
  val Height: Double
  
  val Width: Double
  
  var bits: js.Array[Double]
  
  def clear(): Unit
  
  def flip(x: Double, y: Double): Unit
  
  def get_Renamed(x: Double, y: Double): Boolean
  
  var height: Double
  
  var rowSize: Double
  
  def setRegion(left: Double, top: Double, width: Double, height: Double): Unit
  
  def set_Renamed(x: Double, y: Double): Unit
  
  var width: Double
}
object BitMatrix {
  
  @scala.inline
  def apply(
    Dimension: Double,
    Height: Double,
    Width: Double,
    bits: js.Array[Double],
    clear: () => Unit,
    flip: (Double, Double) => Unit,
    get_Renamed: (Double, Double) => Boolean,
    height: Double,
    rowSize: Double,
    setRegion: (Double, Double, Double, Double) => Unit,
    set_Renamed: (Double, Double) => Unit,
    width: Double
  ): BitMatrix = {
    val __obj = js.Dynamic.literal(Dimension = Dimension.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], bits = bits.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), flip = js.Any.fromFunction2(flip), get_Renamed = js.Any.fromFunction2(get_Renamed), height = height.asInstanceOf[js.Any], rowSize = rowSize.asInstanceOf[js.Any], setRegion = js.Any.fromFunction4(setRegion), set_Renamed = js.Any.fromFunction2(set_Renamed), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitMatrix]
  }
  
  @scala.inline
  implicit class BitMatrixMutableBuilder[Self <: BitMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBits(value: js.Array[Double]): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitsVarargs(value: Double*): Self = StObject.set(x, "bits", js.Array(value :_*))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDimension(value: Double): Self = StObject.set(x, "Dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlip(value: (Double, Double) => Unit): Self = StObject.set(x, "flip", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet_Renamed(value: (Double, Double) => Boolean): Self = StObject.set(x, "get_Renamed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSize(value: Double): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRegion(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setRegion", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSet_Renamed(value: (Double, Double) => Unit): Self = StObject.set(x, "set_Renamed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
