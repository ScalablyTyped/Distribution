package typings.materialDialog.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ACTIONATTRIBUTE extends js.Object {
  var ACTION_ATTRIBUTE: String = js.native
  var BUTTON_DEFAULT_ATTRIBUTE: String = js.native
  var BUTTON_SELECTOR: String = js.native
  var CLOSED_EVENT: String = js.native
  var CLOSE_ACTION: String = js.native
  var CLOSING_EVENT: String = js.native
  var CONTAINER_SELECTOR: String = js.native
  var CONTENT_SELECTOR: String = js.native
  var DESTROY_ACTION: String = js.native
  var INITIAL_FOCUS_ATTRIBUTE: String = js.native
  var OPENED_EVENT: String = js.native
  var OPENING_EVENT: String = js.native
  var SCRIM_SELECTOR: String = js.native
  var SUPPRESS_DEFAULT_PRESS_SELECTOR: String = js.native
  var SURFACE_SELECTOR: String = js.native
}

object ACTIONATTRIBUTE {
  @scala.inline
  def apply(
    ACTION_ATTRIBUTE: String,
    BUTTON_DEFAULT_ATTRIBUTE: String,
    BUTTON_SELECTOR: String,
    CLOSED_EVENT: String,
    CLOSE_ACTION: String,
    CLOSING_EVENT: String,
    CONTAINER_SELECTOR: String,
    CONTENT_SELECTOR: String,
    DESTROY_ACTION: String,
    INITIAL_FOCUS_ATTRIBUTE: String,
    OPENED_EVENT: String,
    OPENING_EVENT: String,
    SCRIM_SELECTOR: String,
    SUPPRESS_DEFAULT_PRESS_SELECTOR: String,
    SURFACE_SELECTOR: String
  ): ACTIONATTRIBUTE = {
    val __obj = js.Dynamic.literal(ACTION_ATTRIBUTE = ACTION_ATTRIBUTE.asInstanceOf[js.Any], BUTTON_DEFAULT_ATTRIBUTE = BUTTON_DEFAULT_ATTRIBUTE.asInstanceOf[js.Any], BUTTON_SELECTOR = BUTTON_SELECTOR.asInstanceOf[js.Any], CLOSED_EVENT = CLOSED_EVENT.asInstanceOf[js.Any], CLOSE_ACTION = CLOSE_ACTION.asInstanceOf[js.Any], CLOSING_EVENT = CLOSING_EVENT.asInstanceOf[js.Any], CONTAINER_SELECTOR = CONTAINER_SELECTOR.asInstanceOf[js.Any], CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any], DESTROY_ACTION = DESTROY_ACTION.asInstanceOf[js.Any], INITIAL_FOCUS_ATTRIBUTE = INITIAL_FOCUS_ATTRIBUTE.asInstanceOf[js.Any], OPENED_EVENT = OPENED_EVENT.asInstanceOf[js.Any], OPENING_EVENT = OPENING_EVENT.asInstanceOf[js.Any], SCRIM_SELECTOR = SCRIM_SELECTOR.asInstanceOf[js.Any], SUPPRESS_DEFAULT_PRESS_SELECTOR = SUPPRESS_DEFAULT_PRESS_SELECTOR.asInstanceOf[js.Any], SURFACE_SELECTOR = SURFACE_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ACTIONATTRIBUTE]
  }
  @scala.inline
  implicit class ACTIONATTRIBUTEOps[Self <: ACTIONATTRIBUTE] (val x: Self) extends AnyVal {
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
    def setACTION_ATTRIBUTE(value: String): Self = this.set("ACTION_ATTRIBUTE", value.asInstanceOf[js.Any])
    @scala.inline
    def setBUTTON_DEFAULT_ATTRIBUTE(value: String): Self = this.set("BUTTON_DEFAULT_ATTRIBUTE", value.asInstanceOf[js.Any])
    @scala.inline
    def setBUTTON_SELECTOR(value: String): Self = this.set("BUTTON_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLOSED_EVENT(value: String): Self = this.set("CLOSED_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLOSE_ACTION(value: String): Self = this.set("CLOSE_ACTION", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLOSING_EVENT(value: String): Self = this.set("CLOSING_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setCONTAINER_SELECTOR(value: String): Self = this.set("CONTAINER_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setCONTENT_SELECTOR(value: String): Self = this.set("CONTENT_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setDESTROY_ACTION(value: String): Self = this.set("DESTROY_ACTION", value.asInstanceOf[js.Any])
    @scala.inline
    def setINITIAL_FOCUS_ATTRIBUTE(value: String): Self = this.set("INITIAL_FOCUS_ATTRIBUTE", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPENED_EVENT(value: String): Self = this.set("OPENED_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPENING_EVENT(value: String): Self = this.set("OPENING_EVENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSCRIM_SELECTOR(value: String): Self = this.set("SCRIM_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSUPPRESS_DEFAULT_PRESS_SELECTOR(value: String): Self = this.set("SUPPRESS_DEFAULT_PRESS_SELECTOR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSURFACE_SELECTOR(value: String): Self = this.set("SURFACE_SELECTOR", value.asInstanceOf[js.Any])
  }
  
}

