package typings.materialChips.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCChipSelectionEventDetail extends MDCChipInteractionEventDetail {
  var selected: Boolean = js.native
  var shouldIgnore: Boolean = js.native
}

object MDCChipSelectionEventDetail {
  @scala.inline
  def apply(chipId: String, selected: Boolean, shouldIgnore: Boolean): MDCChipSelectionEventDetail = {
    val __obj = js.Dynamic.literal(chipId = chipId.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], shouldIgnore = shouldIgnore.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCChipSelectionEventDetail]
  }
  @scala.inline
  implicit class MDCChipSelectionEventDetailOps[Self <: MDCChipSelectionEventDetail] (val x: Self) extends AnyVal {
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
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldIgnore(value: Boolean): Self = this.set("shouldIgnore", value.asInstanceOf[js.Any])
  }
  
}

