package typings.keepNetworkTbtcJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionID extends js.Object {
  
  var transactionID: String = js.native
}
object TransactionID {
  
  @scala.inline
  def apply(transactionID: String): TransactionID = {
    val __obj = js.Dynamic.literal(transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionID]
  }
  
  @scala.inline
  implicit class TransactionIDOps[Self <: TransactionID] (val x: Self) extends AnyVal {
    
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
    def setTransactionID(value: String): Self = this.set("transactionID", value.asInstanceOf[js.Any])
  }
}
