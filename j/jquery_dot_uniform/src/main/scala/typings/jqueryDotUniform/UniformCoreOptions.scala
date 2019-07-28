package typings.jqueryDotUniform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniformCoreOptions extends js.Object {
  var activeClass: js.UndefOr[String] = js.undefined
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var buttonClass: js.UndefOr[String] = js.undefined
  var checkboxClass: js.UndefOr[String] = js.undefined
  var checkedClass: js.UndefOr[String] = js.undefined
  var disabledClass: js.UndefOr[String] = js.undefined
  var eventNamespace: js.UndefOr[String] = js.undefined
  var fileButtonClass: js.UndefOr[String] = js.undefined
  var fileButtonHtml: js.UndefOr[String] = js.undefined
  var fileClass: js.UndefOr[String] = js.undefined
  var fileDefaultHtml: js.UndefOr[String] = js.undefined
  var filenameClass: js.UndefOr[String] = js.undefined
  var focusClass: js.UndefOr[String] = js.undefined
  var hoverClass: js.UndefOr[String] = js.undefined
  var idPrefix: js.UndefOr[String] = js.undefined
  var inputAddTypeAsClass: js.UndefOr[Boolean] = js.undefined
  var inputClass: js.UndefOr[String] = js.undefined
  var radioClass: js.UndefOr[String] = js.undefined
  var resetDefaultHtml: js.UndefOr[String] = js.undefined
  var resetSelector: js.UndefOr[js.Any] = js.undefined
  var selectAutoWidth: js.UndefOr[Boolean] = js.undefined
  var selectClass: js.UndefOr[String] = js.undefined
  var selectMultiClass: js.UndefOr[String] = js.undefined
  var submitDefaultHtml: js.UndefOr[String] = js.undefined
  var textareaClass: js.UndefOr[String] = js.undefined
  var useID: js.UndefOr[Boolean] = js.undefined
  var wrapperClass: js.UndefOr[String] = js.undefined
}

object UniformCoreOptions {
  @scala.inline
  def apply(
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
  ): UniformCoreOptions = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[UniformCoreOptions]
  }
}

