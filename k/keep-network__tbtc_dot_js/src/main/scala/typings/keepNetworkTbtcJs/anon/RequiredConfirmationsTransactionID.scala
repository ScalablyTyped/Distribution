package typings.keepNetworkTbtcJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequiredConfirmationsTransactionID extends js.Object {
  
  var requiredConfirmations: Double = js.native
  
  var transactionID: String = js.native
}
object RequiredConfirmationsTransactionID {
  
  @scala.inline
  def apply(requiredConfirmations: Double, transactionID: String): RequiredConfirmationsTransactionID = {
    val __obj = js.Dynamic.literal(requiredConfirmations = requiredConfirmations.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredConfirmationsTransactionID]
  }
  
  @scala.inline
  implicit class RequiredConfirmationsTransactionIDOps[Self <: RequiredConfirmationsTransactionID] (val x: Self) extends AnyVal {
    
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
    def setRequiredConfirmations(value: Double): Self = this.set("requiredConfirmations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: String): Self = this.set("transactionID", value.asInstanceOf[js.Any])
  }
}
