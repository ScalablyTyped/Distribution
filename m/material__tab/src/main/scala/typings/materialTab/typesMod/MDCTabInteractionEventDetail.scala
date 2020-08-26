package typings.materialTab.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCTabInteractionEventDetail extends js.Object {
  var tabId: String = js.native
}

object MDCTabInteractionEventDetail {
  @scala.inline
  def apply(tabId: String): MDCTabInteractionEventDetail = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCTabInteractionEventDetail]
  }
  @scala.inline
  implicit class MDCTabInteractionEventDetailOps[Self <: MDCTabInteractionEventDetail] (val x: Self) extends AnyVal {
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
    def setTabId(value: String): Self = this.set("tabId", value.asInstanceOf[js.Any])
  }
  
}

