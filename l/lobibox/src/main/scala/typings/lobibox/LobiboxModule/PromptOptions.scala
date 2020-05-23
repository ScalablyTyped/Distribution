package typings.lobibox.LobiboxModule

import typings.lobibox.anon.Cancel
import typings.lobibox.anon.Confirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptOptions
  extends MessageBoxesOptions
     with PromptMethods {
  var attrs: js.UndefOr[js.Any] = js.undefined
         // Prompt type. Available types (text|number|color)
  var label: js.UndefOr[String] = js.undefined
     // Set this true for multiline prompt
  var lines: js.UndefOr[Double] = js.undefined
            // Value which is given to textfield when messagebox is created
  var multiline: js.UndefOr[Boolean] = js.undefined
             // This works only for multiline prompt. Number of lines
  var `type`: js.UndefOr[String] = js.undefined
           // Object of any valid attribute of input field
  var value: js.UndefOr[String] = js.undefined
}

object PromptOptions {
  @scala.inline
  def apply(
    attrs: js.Any = null,
    baseClass: String = null,
    beforeClose: /* lobibox */ js.Any => Unit = null,
    bodyClass: String = null,
    buttons: Cancel | js.Any = null,
    buttonsAlign: js.Any = null,
    callback: (/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any]) => Unit = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closed: /* lobibox */ js.Any => Unit = null,
    customBtnClass: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delayToRemove: js.UndefOr[Double] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    getTitle: () => String = null,
    getValue: () => String = null,
    height: String = null,
    hide: () => PromptOptions = null,
    hideClass: String = null,
    horizontalOffset: js.UndefOr[Double] = js.undefined,
    label: String = null,
    lines: js.UndefOr[Double] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined,
    modalClasses: Confirm = null,
    msg: String = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onShow: /* lobibox */ js.Any => Unit = null,
    setHeight: /* height */ js.UndefOr[Double] => PromptOptions = null,
    setPosition: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => PromptOptions = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => PromptOptions = null,
    setTitle: /* title */ js.UndefOr[String] => PromptOptions = null,
    setValue: /* val */ js.UndefOr[String] => PromptOptions = null,
    setWidth: /* width */ js.UndefOr[Double] => PromptOptions = null,
    show: () => PromptOptions = null,
    showClass: String = null,
    shown: /* lobibox */ js.Any => Unit = null,
    title: String = null,
    `type`: String = null,
    value: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): PromptOptions = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (bodyClass != null) __obj.updateDynamic("bodyClass")(bodyClass.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (buttonsAlign != null) __obj.updateDynamic("buttonsAlign")(buttonsAlign.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.get.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction1(closed))
    if (customBtnClass != null) __obj.updateDynamic("customBtnClass")(customBtnClass.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayToRemove)) __obj.updateDynamic("delayToRemove")(delayToRemove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalOffset)) __obj.updateDynamic("horizontalOffset")(horizontalOffset.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(lines)) __obj.updateDynamic("lines")(lines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (modalClasses != null) __obj.updateDynamic("modalClasses")(modalClasses.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.get.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction2(setPosition))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (showClass != null) __obj.updateDynamic("showClass")(showClass.asInstanceOf[js.Any])
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction1(shown))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
}

