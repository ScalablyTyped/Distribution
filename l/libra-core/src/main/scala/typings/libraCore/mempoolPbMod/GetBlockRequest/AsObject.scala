package typings.libraCore.mempoolPbMod.GetBlockRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var maxBlockSize: String
  var transactionsList: js.Array[typings.libraCore.mempoolPbMod.TransactionExclusion.AsObject]
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
}

