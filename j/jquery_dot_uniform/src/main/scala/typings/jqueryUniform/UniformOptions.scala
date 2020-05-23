package typings.jqueryUniform

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniformOptions
  extends UniformCoreOptions
     with /* option */ StringDictionary[js.Any]

object UniformOptions {
  @scala.inline
  def apply(
    StringDictionary: /* option */ StringDictionary[js.Any] = null,
    activeClass: String = null,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    buttonClass: String = null,
    checkboxClass: String = null,
    checkedClass: String = null,
    disabledClass: String = null,
    eventNamespace: String = null,
    fileButtonClass: String = null,
    fileButtonHtml: String = null,
    fileClass: String = null,
    fileDefaultHtml: String = null,
    filenameClass: String = null,
    focusClass: String = null,
    hoverClass: String = null,
    idPrefix: String = null,
    inputAddTypeAsClass: js.UndefOr[Boolean] = js.undefined,
    inputClass: String = null,
    radioClass: String = null,
    resetDefaultHtml: String = null,
    resetSelector: js.Any = null,
    selectAutoWidth: js.UndefOr[Boolean] = js.undefined,
    selectClass: String = null,
    selectMultiClass: String = null,
    submitDefaultHtml: String = null,
    textareaClass: String = null,
    useID: js.UndefOr[Boolean] = js.undefined,
    wrapperClass: String = null
  ): UniformOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.get.asInstanceOf[js.Any])
    if (buttonClass != null) __obj.updateDynamic("buttonClass")(buttonClass.asInstanceOf[js.Any])
    if (checkboxClass != null) __obj.updateDynamic("checkboxClass")(checkboxClass.asInstanceOf[js.Any])
    if (checkedClass != null) __obj.updateDynamic("checkedClass")(checkedClass.asInstanceOf[js.Any])
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass.asInstanceOf[js.Any])
    if (eventNamespace != null) __obj.updateDynamic("eventNamespace")(eventNamespace.asInstanceOf[js.Any])
    if (fileButtonClass != null) __obj.updateDynamic("fileButtonClass")(fileButtonClass.asInstanceOf[js.Any])
    if (fileButtonHtml != null) __obj.updateDynamic("fileButtonHtml")(fileButtonHtml.asInstanceOf[js.Any])
    if (fileClass != null) __obj.updateDynamic("fileClass")(fileClass.asInstanceOf[js.Any])
    if (fileDefaultHtml != null) __obj.updateDynamic("fileDefaultHtml")(fileDefaultHtml.asInstanceOf[js.Any])
    if (filenameClass != null) __obj.updateDynamic("filenameClass")(filenameClass.asInstanceOf[js.Any])
    if (focusClass != null) __obj.updateDynamic("focusClass")(focusClass.asInstanceOf[js.Any])
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass.asInstanceOf[js.Any])
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(inputAddTypeAsClass)) __obj.updateDynamic("inputAddTypeAsClass")(inputAddTypeAsClass.get.asInstanceOf[js.Any])
    if (inputClass != null) __obj.updateDynamic("inputClass")(inputClass.asInstanceOf[js.Any])
    if (radioClass != null) __obj.updateDynamic("radioClass")(radioClass.asInstanceOf[js.Any])
    if (resetDefaultHtml != null) __obj.updateDynamic("resetDefaultHtml")(resetDefaultHtml.asInstanceOf[js.Any])
    if (resetSelector != null) __obj.updateDynamic("resetSelector")(resetSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAutoWidth)) __obj.updateDynamic("selectAutoWidth")(selectAutoWidth.get.asInstanceOf[js.Any])
    if (selectClass != null) __obj.updateDynamic("selectClass")(selectClass.asInstanceOf[js.Any])
    if (selectMultiClass != null) __obj.updateDynamic("selectMultiClass")(selectMultiClass.asInstanceOf[js.Any])
    if (submitDefaultHtml != null) __obj.updateDynamic("submitDefaultHtml")(submitDefaultHtml.asInstanceOf[js.Any])
    if (textareaClass != null) __obj.updateDynamic("textareaClass")(textareaClass.asInstanceOf[js.Any])
    if (!js.isUndefined(useID)) __obj.updateDynamic("useID")(useID.get.asInstanceOf[js.Any])
    if (wrapperClass != null) __obj.updateDynamic("wrapperClass")(wrapperClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniformOptions]
  }
}

