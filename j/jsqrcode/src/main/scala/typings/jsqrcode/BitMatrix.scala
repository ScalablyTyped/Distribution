package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitMatrix extends js.Object {
  
  val Dimension: Double = js.native
  
  val Height: Double = js.native
  
  val Width: Double = js.native
  
  var bits: js.Array[Double] = js.native
  
  def clear(): Unit = js.native
  
  def flip(x: Double, y: Double): Unit = js.native
  
  def get_Renamed(x: Double, y: Double): Boolean = js.native
  
  var height: Double = js.native
  
  var rowSize: Double = js.native
  
  def setRegion(left: Double, top: Double, width: Double, height: Double): Unit = js.native
  
  def set_Renamed(x: Double, y: Double): Unit = js.native
  
  var width: Double = js.native
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
  implicit class BitMatrixOps[Self <: BitMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDimension(value: Double): Self = this.set("Dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitsVarargs(value: Double*): Self = this.set("bits", js.Array(value :_*))
    
    @scala.inline
    def setBits(value: js.Array[Double]): Self = this.set("bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlip(value: (Double, Double) => Unit): Self = this.set("flip", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet_Renamed(value: (Double, Double) => Boolean): Self = this.set("get_Renamed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowSize(value: Double): Self = this.set("rowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRegion(value: (Double, Double, Double, Double) => Unit): Self = this.set("setRegion", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSet_Renamed(value: (Double, Double) => Unit): Self = this.set("set_Renamed", js.Any.fromFunction2(value))
  }
}
