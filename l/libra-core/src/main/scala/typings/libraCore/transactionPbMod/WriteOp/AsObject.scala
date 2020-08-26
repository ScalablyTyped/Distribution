package typings.libraCore.transactionPbMod.WriteOp

import typings.libraCore.transactionPbMod.WriteOpType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var accessPath: js.UndefOr[typings.libraCore.accessPathPbMod.AccessPath.AsObject] = js.native
  var `type`: WriteOpType = js.native
  var value: Uint8Array | String = js.native
}

object AsObject {
  @scala.inline
  def apply(`type`: WriteOpType, value: Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setType(value: WriteOpType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Uint8Array | String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessPath(value: typings.libraCore.accessPathPbMod.AccessPath.AsObject): Self = this.set("accessPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessPath: Self = this.set("accessPath", js.undefined)
  }
  
}

