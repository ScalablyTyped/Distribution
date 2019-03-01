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
    getTitle: js.Function0[java.lang.String] = null,
    getValue: js.Function0[java.lang.String] = null,
    height: java.lang.String = null,
    hide: js.Function0[PromptOptions] = null,
    hideClass: java.lang.String = null,
    horizontalOffset: scala.Int | scala.Double = null,
    label: java.lang.String = null,
    lines: scala.Int | scala.Double = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    modalClasses: lobiboxLib.Anon_Confirm = null,
    msg: java.lang.String = null,
    multiline: js.UndefOr[scala.Boolean] = js.undefined,
    onShow: js.Function1[/* lobibox */ js.Any, scala.Unit] = null,
    setHeight: js.Function1[/* height */ js.UndefOr[scala.Double], PromptOptions] = null,
    setPosition: js.Function2[
      /* left */ js.UndefOr[scala.Double | java.lang.String], 
      /* top */ js.UndefOr[scala.Double], 
      PromptOptions
    ] = null,
    setSize: js.Function2[
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      PromptOptions
    ] = null,
    setTitle: js.Function1[/* title */ js.UndefOr[java.lang.String], PromptOptions] = null,
    setValue: js.Function1[/* val */ js.UndefOr[java.lang.String], PromptOptions] = null,
    setWidth: js.Function1[/* width */ js.UndefOr[scala.Double], PromptOptions] = null,
    show: js.Function0[PromptOptions] = null,
    showClass: java.lang.String = null,
    shown: js.Function1[/* lobibox */ js.Any, scala.Unit] = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): PromptOptions = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
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
    if (getTitle != null) __obj.updateDynamic("getTitle")(getTitle)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (height != null) __obj.updateDynamic("height")(height)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass)
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (modalClasses != null) __obj.updateDynamic("modalClasses")(modalClasses)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (setHeight != null) __obj.updateDynamic("setHeight")(setHeight)
    if (setPosition != null) __obj.updateDynamic("setPosition")(setPosition)
    if (setSize != null) __obj.updateDynamic("setSize")(setSize)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (setWidth != null) __obj.updateDynamic("setWidth")(setWidth)
    if (show != null) __obj.updateDynamic("show")(show)
    if (showClass != null) __obj.updateDynamic("showClass")(showClass)
    if (shown != null) __obj.updateDynamic("shown")(shown)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
}

