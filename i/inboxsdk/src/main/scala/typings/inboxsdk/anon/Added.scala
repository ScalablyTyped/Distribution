package typings.inboxsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Added extends js.Object {
  var added: js.Array[typings.inboxsdk.mod.Common.Contact] = js.native
  var removed: js.Array[typings.inboxsdk.mod.Common.Contact] = js.native
}

object Added {
  @scala.inline
  def apply(
    added: js.Array[typings.inboxsdk.mod.Common.Contact],
    removed: js.Array[typings.inboxsdk.mod.Common.Contact]
  ): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
  @scala.inline
  implicit class AddedOps[Self <: Added] (val x: Self) extends AnyVal {
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
    def setAddedVarargs(value: typings.inboxsdk.mod.Common.Contact*): Self = this.set("added", js.Array(value :_*))
    @scala.inline
    def setAdded(value: js.Array[typings.inboxsdk.mod.Common.Contact]): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedVarargs(value: typings.inboxsdk.mod.Common.Contact*): Self = this.set("removed", js.Array(value :_*))
    @scala.inline
    def setRemoved(value: js.Array[typings.inboxsdk.mod.Common.Contact]): Self = this.set("removed", value.asInstanceOf[js.Any])
  }
  
}

