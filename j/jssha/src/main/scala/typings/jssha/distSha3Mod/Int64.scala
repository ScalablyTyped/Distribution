package typings.jssha.distSha3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Int_64 is a object for 2 32-bit numbers emulating a 64-bit number.
  */
trait Int64 extends StObject {
  
  /**
    * @param msint_32 The most significant 32-bits of a 64-bit number.
    * @param lsint_32 The least significant 32-bits of a 64-bit number.
    */
  val highOrder: Double
  
  val lowOrder: Double
}
object Int64 {
  
  inline def apply(highOrder: Double, lowOrder: Double): Int64 = {
    val __obj = js.Dynamic.literal(highOrder = highOrder.asInstanceOf[js.Any], lowOrder = lowOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Int64]
  }
  
  extension [Self <: Int64](x: Self) {
    
    inline def setHighOrder(value: Double): Self = StObject.set(x, "highOrder", value.asInstanceOf[js.Any])
    
    inline def setLowOrder(value: Double): Self = StObject.set(x, "lowOrder", value.asInstanceOf[js.Any])
  }
}
