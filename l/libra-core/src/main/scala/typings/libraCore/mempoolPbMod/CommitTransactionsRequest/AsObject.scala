package typings.libraCore.mempoolPbMod.CommitTransactionsRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var blockTimestampUsecs: String
  var transactionsList: js.Array[typings.libraCore.mempoolPbMod.CommittedTransaction.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    blockTimestampUsecs: String,
    transactionsList: js.Array[typings.libraCore.mempoolPbMod.CommittedTransaction.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(blockTimestampUsecs = blockTimestampUsecs.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

