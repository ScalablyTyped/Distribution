package typings
package jqueryDotUniformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniformOptions
  extends UniformCoreOptions
     with /* option */ org.scalablytyped.runtime.StringDictionary[js.Any]

object UniformOptions {
  @scala.inline
  def apply(
    StringDictionary: /* option */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    activeClass: java.lang.String = null,
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    buttonClass: java.lang.String = null,
    checkboxClass: java.lang.String = null,
    checkedClass: java.lang.String = null,
    disabledClass: java.lang.String = null,
    eventNamespace: java.lang.String = null,
    fileButtonClass: java.lang.String = null,
    fileButtonHtml: java.lang.String = null,
    fileClass: java.lang.String = null,
    fileDefaultHtml: java.lang.String = null,
    filenameClass: java.lang.String = null,
    focusClass: java.lang.String = null,
    hoverClass: java.lang.String = null,
    idPrefix: java.lang.String = null,
    inputAddTypeAsClass: js.UndefOr[scala.Boolean] = js.undefined,
    inputClass: java.lang.String = null,
    radioClass: java.lang.String = null,
    resetDefaultHtml: java.lang.String = null,
    resetSelector: js.Any = null,
    selectAutoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    selectClass: java.lang.String = null,
    selectMultiClass: java.lang.String = null,
    submitDefaultHtml: java.lang.String = null,
    textareaClass: java.lang.String = null,
    useID: js.UndefOr[scala.Boolean] = js.undefined,
    wrapperClass: java.lang.String = null
  ): UniformOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (buttonClass != null) __obj.updateDynamic("buttonClass")(buttonClass)
    if (checkboxClass != null) __obj.updateDynamic("checkboxClass")(checkboxClass)
    if (checkedClass != null) __obj.updateDynamic("checkedClass")(checkedClass)
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass)
    if (eventNamespace != null) __obj.updateDynamic("eventNamespace")(eventNamespace)
    if (fileButtonClass != null) __obj.updateDynamic("fileButtonClass")(fileButtonClass)
    if (fileButtonHtml != null) __obj.updateDynamic("fileButtonHtml")(fileButtonHtml)
    if (fileClass != null) __obj.updateDynamic("fileClass")(fileClass)
    if (fileDefaultHtml != null) __obj.updateDynamic("fileDefaultHtml")(fileDefaultHtml)
    if (filenameClass != null) __obj.updateDynamic("filenameClass")(filenameClass)
    if (focusClass != null) __obj.updateDynamic("focusClass")(focusClass)
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass)
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix)
    if (!js.isUndefined(inputAddTypeAsClass)) __obj.updateDynamic("inputAddTypeAsClass")(inputAddTypeAsClass)
    if (inputClass != null) __obj.updateDynamic("inputClass")(inputClass)
    if (radioClass != null) __obj.updateDynamic("radioClass")(radioClass)
    if (resetDefaultHtml != null) __obj.updateDynamic("resetDefaultHtml")(resetDefaultHtml)
    if (resetSelector != null) __obj.updateDynamic("resetSelector")(resetSelector)
    if (!js.isUndefined(selectAutoWidth)) __obj.updateDynamic("selectAutoWidth")(selectAutoWidth)
    if (selectClass != null) __obj.updateDynamic("selectClass")(selectClass)
    if (selectMultiClass != null) __obj.updateDynamic("selectMultiClass")(selectMultiClass)
    if (submitDefaultHtml != null) __obj.updateDynamic("submitDefaultHtml")(submitDefaultHtml)
    if (textareaClass != null) __obj.updateDynamic("textareaClass")(textareaClass)
    if (!js.isUndefined(useID)) __obj.updateDynamic("useID")(useID)
    if (wrapperClass != null) __obj.updateDynamic("wrapperClass")(wrapperClass)
    __obj.asInstanceOf[UniformOptions]
  }
}

