package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataMask extends StObject {
  
  def isMasked(i: Double, j: Double): Boolean
  
  def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit
}
object DataMask {
  
  inline def apply(isMasked: (Double, Double) => Boolean, unmaskBitMatrix: (js.Array[Double], Double) => Unit): DataMask = {
    val __obj = js.Dynamic.literal(isMasked = js.Any.fromFunction2(isMasked), unmaskBitMatrix = js.Any.fromFunction2(unmaskBitMatrix))
    __obj.asInstanceOf[DataMask]
  }
  
  extension [Self <: DataMask](x: Self) {
    
    inline def setIsMasked(value: (Double, Double) => Boolean): Self = StObject.set(x, "isMasked", js.Any.fromFunction2(value))
    
    inline def setUnmaskBitMatrix(value: (js.Array[Double], Double) => Unit): Self = StObject.set(x, "unmaskBitMatrix", js.Any.fromFunction2(value))
  }
}
