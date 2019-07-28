package typings.lobibox.LobiboxModuleNs

import typings.lobibox.Anon_Cancel
import typings.lobibox.Anon_Confirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOptions extends MessageBoxesOptions {
    // Override default option
  var autoload: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[js.Any] = js.undefined
  @JSName("height")
  var height_WindowOptions: js.UndefOr[js.Any] = js.undefined
    // Auto load from given url when window is created
  var loadMethod: js.UndefOr[String] = js.undefined
    // Show window after content is loaded or show and then load content
  var params: js.UndefOr[js.Object] = js.undefined
    // Ajax method to load content
  var showAfterLoad: js.UndefOr[Boolean] = js.undefined
    // HTML Content of window
  var url: js.UndefOr[String] = js.undefined
}

object WindowOptions {
  @scala.inline
  def apply(
    autoload: js.UndefOr[Boolean] = js.undefined,
    baseClass: String = null,
    beforeClose: /* lobibox */ js.Any => Unit = null,
    bodyClass: String = null,
    buttons: Anon_Cancel | js.Any = null,
    buttonsAlign: js.Any = null,
    callback: (/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any]) => Unit = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closed: /* lobibox */ js.Any => Unit = null,
    content: js.Any = null,
    customBtnClass: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delayToRemove: Int | Double = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    getTitle: () => String = null,
    height: js.Any = null,
    hide: () => WindowOptions = null,
    hideClass: String = null,
    horizontalOffset: Int | Double = null,
    loadMethod: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    modalClasses: Anon_Confirm = null,
    msg: String = null,
    onShow: /* lobibox */ js.Any => Unit = null,
    params: js.Object = null,
    setHeight: /* height */ js.UndefOr[Double] => WindowOptions = null,
    setPosition: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => WindowOptions = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => WindowOptions = null,
    setTitle: /* title */ js.UndefOr[String] => WindowOptions = null,
    setWidth: /* width */ js.UndefOr[Double] => WindowOptions = null,
    show: () => WindowOptions = null,
    showAfterLoad: js.UndefOr[Boolean] = js.undefined,
    showClass: String = null,
    shown: /* lobibox */ js.Any => Unit = null,
    title: String = null,
    url: String = null,
    width: Int | Double = null
  ): WindowOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoload)) __obj.updateDynamic("autoload")(autoload)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (bodyClass != null) __obj.updateDynamic("bodyClass")(bodyClass)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (buttonsAlign != null) __obj.updateDynamic("buttonsAlign")(buttonsAlign)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc)
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction1(closed))
    if (content != null) __obj.updateDynamic("content")(content)
    if (customBtnClass != null) __obj.updateDynamic("customBtnClass")(customBtnClass)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (delayToRemove != null) __obj.updateDynamic("delayToRemove")(delayToRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (height != null) __obj.updateDynamic("height")(height)
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass)
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (loadMethod != null) __obj.updateDynamic("loadMethod")(loadMethod)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (modalClasses != null) __obj.updateDynamic("modalClasses")(modalClasses)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (params != null) __obj.updateDynamic("params")(params)
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction2(setPosition))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (!js.isUndefined(showAfterLoad)) __obj.updateDynamic("showAfterLoad")(showAfterLoad)
    if (showClass != null) __obj.updateDynamic("showClass")(showClass)
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction1(shown))
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
}

