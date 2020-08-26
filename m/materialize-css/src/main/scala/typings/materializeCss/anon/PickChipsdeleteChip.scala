package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Chips, 'deleteChip'> */
@js.native
trait PickChipsdeleteChip extends js.Object {
  var deleteChip: js.UndefOr[js.Any] = js.native
}

object PickChipsdeleteChip {
  @scala.inline
  def apply(): PickChipsdeleteChip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickChipsdeleteChip]
  }
  @scala.inline
  implicit class PickChipsdeleteChipOps[Self <: PickChipsdeleteChip] (val x: Self) extends AnyVal {
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
    def setDeleteChip(value: js.Any): Self = this.set("deleteChip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteChip: Self = this.set("deleteChip", js.undefined)
  }
  
}

