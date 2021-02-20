package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataMask extends StObject {
  
  def isMasked(i: Double, j: Double): Boolean = js.native
  
  def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
}
object DataMask {
  
  @scala.inline
  def apply(isMasked: (Double, Double) => Boolean, unmaskBitMatrix: (js.Array[Double], Double) => Unit): DataMask = {
    val __obj = js.Dynamic.literal(isMasked = js.Any.fromFunction2(isMasked), unmaskBitMatrix = js.Any.fromFunction2(unmaskBitMatrix))
    __obj.asInstanceOf[DataMask]
  }
  
  @scala.inline
  implicit class DataMaskMutableBuilder[Self <: DataMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMasked(value: (Double, Double) => Boolean): Self = StObject.set(x, "isMasked", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnmaskBitMatrix(value: (js.Array[Double], Double) => Unit): Self = StObject.set(x, "unmaskBitMatrix", js.Any.fromFunction2(value))
  }
}
