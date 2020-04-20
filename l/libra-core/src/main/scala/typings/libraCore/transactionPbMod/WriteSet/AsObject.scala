package typings.libraCore.transactionPbMod.WriteSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var writeSetList: js.Array[typings.libraCore.transactionPbMod.WriteOp.AsObject]
}

object AsObject {
  @scala.inline
  def apply(writeSetList: js.Array[typings.libraCore.transactionPbMod.WriteOp.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(writeSetList = writeSetList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

