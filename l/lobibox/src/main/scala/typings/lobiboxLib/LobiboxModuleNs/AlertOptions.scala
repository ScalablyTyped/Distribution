package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertOptions extends MessageBoxesOptions {
  var error: js.UndefOr[lobiboxLib.Anon_IconClass] = js.undefined
  var info: js.UndefOr[lobiboxLib.Anon_IconClass] = js.undefined
  var success: js.UndefOr[lobiboxLib.Anon_IconClass] = js.undefined
  var warning: js.UndefOr[lobiboxLib.Anon_IconClass] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(
    baseClass: java.lang.String = null,
    beforeClose: js.Function1[/* lobibox */ js.Any, scala.Unit] = null,
    bodyClass: java.lang.String = null,
    buttons: lobiboxLib.Anon_Cancel | js.Any = null,
    buttonsAlign: js.Any = null,
    callback: js.Function3[
      /* lobibox */ js.Any, 
      /* type */ js.UndefOr[java.lang.String], 
      /* ev */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    closed: js.Function1[/* lobibox */ js.Any, scala.Unit] = null,
    customBtnClass: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    delayToRemove: scala.Int | scala.Double = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    error: lobiboxLib.Anon_IconClass = null,
    getTitle: js.Function0[java.lang.String] = null,
    height: java.lang.String = null,
    hide: js.Function0[AlertOptions] = null,
    hideClass: java.lang.String = null,
    horizontalOffset: scala.Int | scala.Double = null,
    info: lobiboxLib.Anon_IconClass = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    modalClasses: lobiboxLib.Anon_Confirm = null,
    msg: java.lang.String = null,
    onShow: js.Function1[/* lobibox */ js.Any, scala.Unit] = null,
    setHeight: js.Function1[/* height */ js.UndefOr[scala.Double], AlertOptions] = null,
    setPosition: js.Function2[
      /* left */ js.UndefOr[scala.Double | java.lang.String], 
      /* top */ js.UndefOr[scala.Double], 
      AlertOptions
    ] = null,
    setSize: js.Function2[
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      AlertOptions
    ] = null,
    setTitle: js.Function1[/* title */ js.UndefOr[java.lang.String], AlertOptions] = null,
    setWidth: js.Function1[/* width */ js.UndefOr[scala.Double], AlertOptions] = null,
    show: js.Function0[AlertOptions] = null,
    showClass: java.lang.String = null,
    shown: js.Function1[/* lobibox */ js.Any, scala.Unit] = null,
    success: lobiboxLib.Anon_IconClass = null,
    title: java.lang.String = null,
    warning: lobiboxLib.Anon_IconClass = null,
    width: scala.Int | scala.Double = null
  ): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (bodyClass != null) __obj.updateDynamic("bodyClass")(bodyClass)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (buttonsAlign != null) __obj.updateDynamic("buttonsAlign")(buttonsAlign)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc)
    if (closed != null) __obj.updateDynamic("closed")(closed)
    if (customBtnClass != null) __obj.updateDynamic("customBtnClass")(customBtnClass)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (delayToRemove != null) __obj.updateDynamic("delayToRemove")(delayToRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (error != null) __obj.updateDynamic("error")(error)
    if (getTitle != null) __obj.updateDynamic("getTitle")(getTitle)
    if (height != null) __obj.updateDynamic("height")(height)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass)
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (modalClasses != null) __obj.updateDynamic("modalClasses")(modalClasses)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (setHeight != null) __obj.updateDynamic("setHeight")(setHeight)
    if (setPosition != null) __obj.updateDynamic("setPosition")(setPosition)
    if (setSize != null) __obj.updateDynamic("setSize")(setSize)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (setWidth != null) __obj.updateDynamic("setWidth")(setWidth)
    if (show != null) __obj.updateDynamic("show")(show)
    if (showClass != null) __obj.updateDynamic("showClass")(showClass)
    if (shown != null) __obj.updateDynamic("shown")(shown)
    if (success != null) __obj.updateDynamic("success")(success)
    if (title != null) __obj.updateDynamic("title")(title)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertOptions]
  }
}

