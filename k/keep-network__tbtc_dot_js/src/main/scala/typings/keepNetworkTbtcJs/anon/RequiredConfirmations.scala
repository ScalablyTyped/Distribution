package typings.keepNetworkTbtcJs.anon

import typings.keepNetworkTbtcJs.bitcoinHelpersMod.FoundTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequiredConfirmations extends js.Object {
  
  var requiredConfirmations: Double = js.native
  
  var transaction: FoundTransaction = js.native
}
object RequiredConfirmations {
  
  @scala.inline
  def apply(requiredConfirmations: Double, transaction: FoundTransaction): RequiredConfirmations = {
    val __obj = js.Dynamic.literal(requiredConfirmations = requiredConfirmations.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredConfirmations]
  }
  
  @scala.inline
  implicit class RequiredConfirmationsOps[Self <: RequiredConfirmations] (val x: Self) extends AnyVal {
    
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
    def setTransaction(value: FoundTransaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
  }
}
