package typings.libraCore.mempoolPbMod.GetBlockRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var maxBlockSize: String = js.native
  
  var transactionsList: js.Array[typings.libraCore.mempoolPbMod.TransactionExclusion.AsObject] = js.native
}
object AsObject {
  
  @scala.inline
  def apply(
    maxBlockSize: String,
    transactionsList: js.Array[typings.libraCore.mempoolPbMod.TransactionExclusion.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(maxBlockSize = maxBlockSize.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
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
    def setMaxBlockSize(value: String): Self = this.set("maxBlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsListVarargs(value: typings.libraCore.mempoolPbMod.TransactionExclusion.AsObject*): Self = this.set("transactionsList", js.Array(value :_*))
    
    @scala.inline
    def setTransactionsList(value: js.Array[typings.libraCore.mempoolPbMod.TransactionExclusion.AsObject]): Self = this.set("transactionsList", value.asInstanceOf[js.Any])
  }
}
