package typings.materialTopAppBar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ACTIONITEMSELECTOR extends js.Object {
  var ACTION_ITEM_SELECTOR: String = js.native
  var NAVIGATION_EVENT: String = js.native
  var NAVIGATION_ICON_SELECTOR: String = js.native
  var ROOT_SELECTOR: String = js.native
  var TITLE_SELECTOR: String = js.native
}

object ACTIONITEMSELECTOR {
  @scala.inline
  def apply(
    ACTION_ITEM_SELECTOR: String,
    NAVIGATION_EVENT: String,
    NAVIGATION_ICON_SELECTOR: String,
    ROOT_SELECTOR: String,
    TITLE_SELECTOR: String
  ): ACTIONITEMSELECTOR = {
    val __obj = js.Dynamic.literal(ACTION_ITEM_SELECTOR = ACTION_ITEM_SELECTOR.asInstanceOf[js.Any], NAVIGATION_EVENT = NAVIGATION_EVENT.asInstanceOf[js.Any], NAVIGATION_ICON_SELECTOR = NAVIGATION_ICON_SELECTOR.asInstanceOf[js.Any], ROOT_SELECTOR = ROOT_SELECTOR.asInstanceOf[js.Any], TITLE_SELECTOR = TITLE_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ACTIONITEMSELECTOR]
  }
  @scala.inline
  implicit class ACTIONITEMSELECTOROps[Self <: ACTIONITEMSELECTOR] (val x: Self) extends AnyVal {
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
    def setACTION_ITEM_SELECTOR(value: String): Self = this.set("ACTION_ITEM_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setNAVIGATION_EVENT(value: String): Self = this.set("NAVIGATION_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setNAVIGATION_ICON_SELECTOR(value: String): Self = this.set("NAVIGATION_ICON_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setROOT_SELECTOR(value: String): Self = this.set("ROOT_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTITLE_SELECTOR(value: String): Self = this.set("TITLE_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

