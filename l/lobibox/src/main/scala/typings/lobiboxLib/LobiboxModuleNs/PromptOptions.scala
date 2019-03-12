package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptOptions
  extends MessageBoxesOptions
     with PromptMethods {
  var attrs: js.UndefOr[js.Any] = js.undefined
         // Prompt type. Available types (text|number|color)
  var label: js.UndefOr[java.lang.String] = js.undefined
     // Set this true for multiline prompt
  var lines: js.UndefOr[scala.Double] = js.undefined
            // Value which is given to textfield when messagebox is created
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
             // This works only for multiline prompt. Number of lines
  var `type`: js.UndefOr[java.lang.String] = js.undefined
           // Object of any valid attribute of input field
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object PromptOptions {
  @scala.inline
  def apply(
    attrs: js.Any = null,
    baseClass: java.lang.String = null,
    beforeClose: /* lobibox */ js.Any => scala.Unit = null,
    bodyClass: java.lang.String = null,
    buttons: lobiboxLib.Anon_Cancel | js.Any = null,
    buttonsAlign: js.Any = null,
    callback: (/* lobibox */ js.Any, /* type */ js.UndefOr[java.lang.String], /* ev */ js.UndefOr[js.Any]) => scala.Unit = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    closed: /* lobibox */ js.Any => scala.Unit = null,
    customBtnClass: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    delayToRemove: scala.Int | scala.Double = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    getTitle: () => java.lang.String = null,
    getValue: () => java.lang.String = null,
    height: java.lang.String = null,
    hide: () => PromptOptions = null,
    hideClass: java.lang.String = null,
    horizontalOffset: scala.Int | scala.Double = null,
    label: java.lang.String = null,
    lines: scala.Int | scala.Double = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    modalClasses: lobiboxLib.Anon_Confirm = null,
    msg: java.lang.String = null,
    multiline: js.UndefOr[scala.Boolean] = js.undefined,
    onShow: /* lobibox */ js.Any => scala.Unit = null,
    setHeight: /* height */ js.UndefOr[scala.Double] => PromptOptions = null,
    setPosition: (/* left */ js.UndefOr[scala.Double | java.lang.String], /* top */ js.UndefOr[scala.Double]) => PromptOptions = null,
    setSize: (/* width */ js.UndefOr[scala.Double], /* height */ js.UndefOr[scala.Double]) => PromptOptions = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => PromptOptions = null,
    setValue: /* val */ js.UndefOr[java.lang.String] => PromptOptions = null,
    setWidth: /* width */ js.UndefOr[scala.Double] => PromptOptions = null,
    show: () => PromptOptions = null,
    showClass: java.lang.String = null,
    shown: /* lobibox */ js.Any => scala.Unit = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): PromptOptions = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
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
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (height != null) __obj.updateDynamic("height")(height)
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass)
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (modalClasses != null) __obj.updateDynamic("modalClasses")(modalClasses)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction2(setPosition))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (showClass != null) __obj.updateDynamic("showClass")(showClass)
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction1(shown))
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
}

