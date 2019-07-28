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
    if (athing != null) __obj.updateDynamic("athing")(athing)
    if (btn != null) __obj.updateDynamic("btn")(btn)
    if (btnactive != null) __obj.updateDynamic("btnactive")(btnactive)
    if (btnfocus != null) __obj.updateDynamic("btnfocus")(btnfocus)
    if (btnhover != null) __obj.updateDynamic("btnhover")(btnhover)
    if (closer != null) __obj.updateDynamic("closer")(closer)
    if (container != null) __obj.updateDynamic("container")(container)
    if (error != null) __obj.updateDynamic("error")(error)
    if (error_icon != null) __obj.updateDynamic("error_icon")(error_icon)
    if (hi_btn != null) __obj.updateDynamic("hi_btn")(hi_btn)
    if (hi_btnhov != null) __obj.updateDynamic("hi_btnhov")(hi_btnhov)
    if (hi_hnd != null) __obj.updateDynamic("hi_hnd")(hi_hnd)
    if (hi_menu != null) __obj.updateDynamic("hi_menu")(hi_menu)
    if (info != null) __obj.updateDynamic("info")(info)
    if (info_icon != null) __obj.updateDynamic("info_icon")(info_icon)
    if (input != null) __obj.updateDynamic("input")(input)
    if (notice != null) __obj.updateDynamic("notice")(notice)
    if (notice_icon != null) __obj.updateDynamic("notice_icon")(notice_icon)
    if (pin_down != null) __obj.updateDynamic("pin_down")(pin_down)
    if (pin_up != null) __obj.updateDynamic("pin_up")(pin_up)
    if (success != null) __obj.updateDynamic("success")(success)
    if (success_icon != null) __obj.updateDynamic("success_icon")(success_icon)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PNotifyStyling]
  }
}

