package typings.lobibox.LobiboxModule

import typings.lobibox.Anon_Cancel
import typings.lobibox.Anon_Confirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageBoxesOptions extends MessageBoxesDefault {
  var bodyClass: js.UndefOr[String] = js.undefined
  var buttons: js.UndefOr[Anon_Cancel | js.Any] = js.undefined
  @JSName("buttonsAlign")
  var buttonsAlign_MessageBoxesOptions: js.UndefOr[js.Any] = js.undefined
  var callback: js.UndefOr[
    js.Function3[/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  var modalClasses: js.UndefOr[Anon_Confirm] = js.undefined
}

object MessageBoxesOptions {
  @scala.inline
  def apply(
    baseClass: String = null,
    beforeClose: /* lobibox */ js.Any => Unit = null,
    bodyClass: String = null,
    buttons: Anon_Cancel | js.Any = null,
    buttonsAlign: js.Any = null,
    callback: (/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any]) => Unit = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closed: /* lobibox */ js.Any => Unit = null,
    customBtnClass: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delayToRemove: Int | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    getTitle: () => String = null,
    height: String = null,
    hide: () => MessageBoxesOptions = null,
    hideClass: String = null,
    horizontalOffset: Int | Double = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    modalClasses: Anon_Confirm = null,
    msg: String = null,
    onShow: /* lobibox */ js.Any => Unit = null,
    setHeight: /* height */ js.UndefOr[Double] => MessageBoxesOptions = null,
    setPosition: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => MessageBoxesOptions = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => MessageBoxesOptions = null,
    setTitle: /* title */ js.UndefOr[String] => MessageBoxesOptions = null,
    setWidth: /* width */ js.UndefOr[Double] => MessageBoxesOptions = null,
    show: () => MessageBoxesOptions = null,
    showClass: String = null,
    shown: /* lobibox */ js.Any => Unit = null,
    title: String = null,
    width: Int | Double = null
  ): MessageBoxesOptions = {
    val __obj = js.Dynamic.literal()
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (bodyClass != null) __obj.updateDynamic("bodyClass")(bodyClass)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (buttonsAlign != null) __obj.updateDynamic("buttonsAlign")(buttonsAlign)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc)
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction1(closed))
    if (customBtnClass != null) __obj.updateDynamic("customBtnClass")(customBtnClass)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (delayToRemove != null) __obj.updateDynamic("delayToRemove")(delayToRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (height != null) __obj.updateDynamic("height")(height)
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass)
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (modalClasses != null) __obj.updateDynamic("modalClasses")(modalClasses)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction2(setPosition))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (showClass != null) __obj.updateDynamic("showClass")(showClass)
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction1(shown))
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBoxesOptions]
  }
}

