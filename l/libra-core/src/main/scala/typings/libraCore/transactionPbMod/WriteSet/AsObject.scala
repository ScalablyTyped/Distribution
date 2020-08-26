package typings.libraCore.transactionPbMod.WriteSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var writeSetList: js.Array[typings.libraCore.transactionPbMod.WriteOp.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(writeSetList: js.Array[typings.libraCore.transactionPbMod.WriteOp.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(writeSetList = writeSetList.asInstanceOf[js.Any])
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
    def setWriteSetListVarargs(value: typings.libraCore.transactionPbMod.WriteOp.AsObject*): Self = this.set("writeSetList", js.Array(value :_*))
    @scala.inline
    def setWriteSetList(value: js.Array[typings.libraCore.transactionPbMod.WriteOp.AsObject]): Self = this.set("writeSetList", value.asInstanceOf[js.Any])
  }
  
}

