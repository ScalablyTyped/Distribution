package typings.materialChips.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCChipRemovalEventDetail extends MDCChipInteractionEventDetail {
  var removedAnnouncement: String | Null = js.native
}

object MDCChipRemovalEventDetail {
  @scala.inline
  def apply(chipId: String): MDCChipRemovalEventDetail = {
    val __obj = js.Dynamic.literal(chipId = chipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCChipRemovalEventDetail]
  }
  @scala.inline
  implicit class MDCChipRemovalEventDetailOps[Self <: MDCChipRemovalEventDetail] (val x: Self) extends AnyVal {
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
    def setRemovedAnnouncement(value: String): Self = this.set("removedAnnouncement", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedAnnouncementNull: Self = this.set("removedAnnouncement", null)
  }
  
}

