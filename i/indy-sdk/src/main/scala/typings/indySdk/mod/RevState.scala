package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevState extends StObject {
  
  var rev_reg: RevocReg
  
  var timestamp: Double
  
  var witness: Witness
}
object RevState {
  
  inline def apply(rev_reg: RevocReg, timestamp: Double, witness: Witness): RevState = {
    val __obj = js.Dynamic.literal(rev_reg = rev_reg.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], witness = witness.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevState]
  }
  
  extension [Self <: RevState](x: Self) {
    
    inline def setRev_reg(value: RevocReg): Self = StObject.set(x, "rev_reg", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setWitness(value: Witness): Self = StObject.set(x, "witness", value.asInstanceOf[js.Any])
  }
}
