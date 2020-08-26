package typings.materialChips.typesMod

import typings.materialChips.chipConstantsMod.EventSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCChipNavigationEventDetail extends MDCChipInteractionEventDetail {
  var key: String = js.native
  var source: EventSource = js.native
}

object MDCChipNavigationEventDetail {
  @scala.inline
  def apply(chipId: String, key: String, source: EventSource): MDCChipNavigationEventDetail = {
    val __obj = js.Dynamic.literal(chipId = chipId.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCChipNavigationEventDetail]
  }
  @scala.inline
  implicit class MDCChipNavigationEventDetailOps[Self <: MDCChipNavigationEventDetail] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: EventSource): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

