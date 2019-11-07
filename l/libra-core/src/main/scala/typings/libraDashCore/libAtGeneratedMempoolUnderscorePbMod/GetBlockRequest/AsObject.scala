package typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.GetBlockRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var maxBlockSize: String
  var transactionsList: js.Array[
    typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.TransactionExclusion.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    maxBlockSize: String,
    transactionsList: js.Array[
      typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.TransactionExclusion.AsObject
    ]
  ): AsObject = {
    val __obj = js.Dynamic.literal(maxBlockSize = maxBlockSize, transactionsList = transactionsList)
  
    __obj.asInstanceOf[AsObject]
  }
}

