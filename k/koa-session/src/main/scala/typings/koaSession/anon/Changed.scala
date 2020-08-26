package typings.koaSession.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Changed extends js.Object {
  var changed: Boolean = js.native
  var rolling: js.UndefOr[Boolean] = js.native
}

object Changed {
  @scala.inline
  def apply(changed: Boolean): Changed = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changed]
  }
  @scala.inline
  implicit class ChangedOps[Self <: Changed] (val x: Self) extends AnyVal {
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
    def setChanged(value: Boolean): Self = this.set("changed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRolling(value: Boolean): Self = this.set("rolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRolling: Self = this.set("rolling", js.undefined)
  }
  
}

