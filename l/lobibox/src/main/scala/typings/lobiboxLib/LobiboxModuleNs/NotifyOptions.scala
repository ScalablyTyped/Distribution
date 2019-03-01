package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyOptions
  extends NotifyDefault
     with NotifyMethods {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[lobiboxLib.Anon_ClassIcon] = js.undefined
  var info: js.UndefOr[lobiboxLib.Anon_ClassIcon] = js.undefined
   //You can override options for large notifications from here
  var large: js.UndefOr[lobiboxLib.Anon_Width] = js.undefined
    //You can override options for small notifications from here
  var mini: js.UndefOr[lobiboxLib.Anon_ClassString] = js.undefined
     //Default options of different style notifications
  var success: js.UndefOr[lobiboxLib.Anon_ClassIcon] = js.undefined
  var warning: js.UndefOr[lobiboxLib.Anon_ClassIcon] = js.undefined
}

object NotifyOptions {
  @scala.inline
  def apply(
    `class`: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    continueDelayOnInactiveTab: js.UndefOr[scala.Boolean] = js.undefined,
    delay: scala.Int | scala.Double = null,
    delayIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    error: lobiboxLib.Anon_ClassIcon = null,
    hideClass: java.lang.String = null,
    icon: js.UndefOr[scala.Boolean] = js.undefined,
    img: java.lang.String = null,
    info: lobiboxLib.Anon_ClassIcon = null,
    large: lobiboxLib.Anon_Width = null,
    mini: lobiboxLib.Anon_ClassString = null,
    msg: java.lang.String = null,
    onClick: js.Function = null,
    onClickUrl: java.lang.String = null,
    position: java.lang.String = null,
    remove: js.Function0[_] = null,
    showAfterPrevious: js.UndefOr[scala.Boolean] = js.undefined,
    showClass: java.lang.String = null,
    size: java.lang.String = null,
    sound: js.UndefOr[scala.Boolean] = js.undefined,
    soundExt: java.lang.String = null,
    soundPath: java.lang.String = null,
    success: lobiboxLib.Anon_ClassIcon = null,
    title: java.lang.String | scala.Boolean = null,
    warning: lobiboxLib.Anon_ClassIcon = null,
    width: scala.Int | scala.Double = null
  ): NotifyOptions = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(continueDelayOnInactiveTab)) __obj.updateDynamic("continueDelayOnInactiveTab")(continueDelayOnInactiveTab)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(delayIndicator)) __obj.updateDynamic("delayIndicator")(delayIndicator)
    if (error != null) __obj.updateDynamic("error")(error)
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass)
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon)
    if (img != null) __obj.updateDynamic("img")(img)
    if (info != null) __obj.updateDynamic("info")(info)
    if (large != null) __obj.updateDynamic("large")(large)
    if (mini != null) __obj.updateDynamic("mini")(mini)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onClickUrl != null) __obj.updateDynamic("onClickUrl")(onClickUrl)
    if (position != null) __obj.updateDynamic("position")(position)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (!js.isUndefined(showAfterPrevious)) __obj.updateDynamic("showAfterPrevious")(showAfterPrevious)
    if (showClass != null) __obj.updateDynamic("showClass")(showClass)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    if (soundExt != null) __obj.updateDynamic("soundExt")(soundExt)
    if (soundPath != null) __obj.updateDynamic("soundPath")(soundPath)
    if (success != null) __obj.updateDynamic("success")(success)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyOptions]
  }
}

