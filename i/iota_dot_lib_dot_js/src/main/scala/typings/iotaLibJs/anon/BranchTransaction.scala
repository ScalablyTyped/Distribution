package typings.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BranchTransaction extends StObject {
  
  var branchTransaction: String
  
  var duration: Double
  
  var trunkTransaction: String
}
object BranchTransaction {
  
  inline def apply(branchTransaction: String, duration: Double, trunkTransaction: String): BranchTransaction = {
    val __obj = js.Dynamic.literal(branchTransaction = branchTransaction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], trunkTransaction = trunkTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchTransaction]
  }
  
  extension [Self <: BranchTransaction](x: Self) {
    
    inline def setBranchTransaction(value: String): Self = StObject.set(x, "branchTransaction", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setTrunkTransaction(value: String): Self = StObject.set(x, "trunkTransaction", value.asInstanceOf[js.Any])
  }
}
