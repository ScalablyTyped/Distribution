package typings.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BranchTransaction extends StObject {
  
  var branchTransaction: String = js.native
  
  var duration: Double = js.native
  
  var trunkTransaction: String = js.native
}
object BranchTransaction {
  
  @scala.inline
  def apply(branchTransaction: String, duration: Double, trunkTransaction: String): BranchTransaction = {
    val __obj = js.Dynamic.literal(branchTransaction = branchTransaction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], trunkTransaction = trunkTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchTransaction]
  }
  
  @scala.inline
  implicit class BranchTransactionMutableBuilder[Self <: BranchTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchTransaction(value: String): Self = StObject.set(x, "branchTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrunkTransaction(value: String): Self = StObject.set(x, "trunkTransaction", value.asInstanceOf[js.Any])
  }
}
