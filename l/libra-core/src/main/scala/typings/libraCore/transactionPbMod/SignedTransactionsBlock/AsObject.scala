package typings.libraCore.transactionPbMod.SignedTransactionsBlock

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var transactionsList: js.Array[typings.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
  
  var validatorPublicKey: Uint8Array | String = js.native
  
  var validatorSignature: Uint8Array | String = js.native
}
object AsObject {
  
  @scala.inline
  def apply(
    transactionsList: js.Array[typings.libraCore.transactionPbMod.SignedTransaction.AsObject],
    validatorPublicKey: Uint8Array | String,
    validatorSignature: Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(transactionsList = transactionsList.asInstanceOf[js.Any], validatorPublicKey = validatorPublicKey.asInstanceOf[js.Any], validatorSignature = validatorSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
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
    def setTransactionsListVarargs(value: typings.libraCore.transactionPbMod.SignedTransaction.AsObject*): Self = this.set("transactionsList", js.Array(value :_*))
    
    @scala.inline
    def setTransactionsList(value: js.Array[typings.libraCore.transactionPbMod.SignedTransaction.AsObject]): Self = this.set("transactionsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorPublicKey(value: Uint8Array | String): Self = this.set("validatorPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorSignature(value: Uint8Array | String): Self = this.set("validatorSignature", value.asInstanceOf[js.Any])
  }
}
