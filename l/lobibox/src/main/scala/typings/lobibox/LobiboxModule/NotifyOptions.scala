package typings.lobibox.LobiboxModule

import typings.lobibox.anon.ClassString
import typings.lobibox.anon.Icon
import typings.lobibox.anon.Width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyOptions
  extends NotifyDefault
     with NotifyMethods {
  var `class`: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[Icon] = js.undefined
  var info: js.UndefOr[Icon] = js.undefined
   //You can override options for large notifications from here
  var large: js.UndefOr[Width] = js.undefined
    //You can override options for small notifications from here
  var mini: js.UndefOr[ClassString] = js.undefined
     //Default options of different style notifications
  var success: js.UndefOr[Icon] = js.undefined
  var warning: js.UndefOr[Icon] = js.undefined
}

object NotifyOptions {
  @scala.inline
  def apply(
    `class`: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    continueDelayOnInactiveTab: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    delayIndicator: js.UndefOr[Boolean] = js.undefined,
    error: Icon = null,
    hideClass: String = null,
    icon: js.UndefOr[Boolean] = js.undefined,
    img: String = null,
    info: Icon = null,
    large: Width = null,
    mini: ClassString = null,
    msg: String = null,
    onClick: js.Function = null,
    onClickUrl: String = null,
    position: String = null,
    remove: () => _ = null,
    showAfterPrevious: js.UndefOr[Boolean] = js.undefined,
    showClass: String = null,
    size: String = null,
    sound: js.UndefOr[Boolean] = js.undefined,
    soundExt: String = null,
    soundPath: String = null,
    success: Icon = null,
    title: String | Boolean = null,
    warning: Icon = null,
    width: js.UndefOr[Double] = js.undefined
  ): NotifyOptions = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(continueDelayOnInactiveTab)) __obj.updateDynamic("continueDelayOnInactiveTab")(continueDelayOnInactiveTab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayIndicator)) __obj.updateDynamic("delayIndicator")(delayIndicator.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.get.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (mini != null) __obj.updateDynamic("mini")(mini.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onClickUrl != null) __obj.updateDynamic("onClickUrl")(onClickUrl.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction0(remove))
    if (!js.isUndefined(showAfterPrevious)) __obj.updateDynamic("showAfterPrevious")(showAfterPrevious.get.asInstanceOf[js.Any])
    if (showClass != null) __obj.updateDynamic("showClass")(showClass.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound.get.asInstanceOf[js.Any])
    if (soundExt != null) __obj.updateDynamic("soundExt")(soundExt.asInstanceOf[js.Any])
    if (soundPath != null) __obj.updateDynamic("soundPath")(soundPath.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyOptions]
  }
}

