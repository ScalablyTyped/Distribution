package typings.jqueryDotPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyStyling extends StylingOptions {
  // reference
  var athing: js.UndefOr[String] = js.undefined
  // confirm
  var btn: js.UndefOr[String] = js.undefined
  var btnactive: js.UndefOr[String] = js.undefined
  var btnfocus: js.UndefOr[String] = js.undefined
  var btnhover: js.UndefOr[String] = js.undefined
  // buttons
  var closer: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var error_icon: js.UndefOr[String] = js.undefined
  var hi_btn: js.UndefOr[String] = js.undefined
  var hi_btnhov: js.UndefOr[String] = js.undefined
  var hi_hnd: js.UndefOr[String] = js.undefined
  // history
  var hi_menu: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var info_icon: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[String] = js.undefined
  var notice: js.UndefOr[String] = js.undefined
  var notice_icon: js.UndefOr[String] = js.undefined
  var pin_down: js.UndefOr[String] = js.undefined
  var pin_up: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[String] = js.undefined
  var success_icon: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object PNotifyStyling {
  @scala.inline
  def apply(
    athing: String = null,
    btn: String = null,
    btnactive: String = null,
    btnfocus: String = null,
    btnhover: String = null,
    closer: String = null,
    container: String = null,
    error: String = null,
    error_icon: String = null,
    hi_btn: String = null,
    hi_btnhov: String = null,
    hi_hnd: String = null,
    hi_menu: String = null,
    info: String = null,
    info_icon: String = null,
    input: String = null,
    notice: String = null,
    notice_icon: String = null,
    pin_down: String = null,
    pin_up: String = null,
    success: String = null,
    success_icon: String = null,
    text: String = null
  ): PNotifyStyling = {
    val __obj = js.Dynamic.literal()
    if (athing != null) __obj.updateDynamic("athing")(athing.asInstanceOf[js.Any])
    if (btn != null) __obj.updateDynamic("btn")(btn.asInstanceOf[js.Any])
    if (btnactive != null) __obj.updateDynamic("btnactive")(btnactive.asInstanceOf[js.Any])
    if (btnfocus != null) __obj.updateDynamic("btnfocus")(btnfocus.asInstanceOf[js.Any])
    if (btnhover != null) __obj.updateDynamic("btnhover")(btnhover.asInstanceOf[js.Any])
    if (closer != null) __obj.updateDynamic("closer")(closer.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (error_icon != null) __obj.updateDynamic("error_icon")(error_icon.asInstanceOf[js.Any])
    if (hi_btn != null) __obj.updateDynamic("hi_btn")(hi_btn.asInstanceOf[js.Any])
    if (hi_btnhov != null) __obj.updateDynamic("hi_btnhov")(hi_btnhov.asInstanceOf[js.Any])
    if (hi_hnd != null) __obj.updateDynamic("hi_hnd")(hi_hnd.asInstanceOf[js.Any])
    if (hi_menu != null) __obj.updateDynamic("hi_menu")(hi_menu.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (info_icon != null) __obj.updateDynamic("info_icon")(info_icon.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (notice != null) __obj.updateDynamic("notice")(notice.asInstanceOf[js.Any])
    if (notice_icon != null) __obj.updateDynamic("notice_icon")(notice_icon.asInstanceOf[js.Any])
    if (pin_down != null) __obj.updateDynamic("pin_down")(pin_down.asInstanceOf[js.Any])
    if (pin_up != null) __obj.updateDynamic("pin_up")(pin_up.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (success_icon != null) __obj.updateDynamic("success_icon")(success_icon.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNotifyStyling]
  }
}

