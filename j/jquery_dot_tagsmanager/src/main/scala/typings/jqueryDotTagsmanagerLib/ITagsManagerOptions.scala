package typings
package jqueryDotTagsmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagsManagerOptions extends js.Object {
  var AjaxPush: js.UndefOr[java.lang.String] = js.undefined
  var CapitalizeFirstLetter: js.UndefOr[scala.Boolean] = js.undefined
  var backspace: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var blinkBGColor_1: js.UndefOr[java.lang.String] = js.undefined
  var blinkBGColor_2: js.UndefOr[java.lang.String] = js.undefined
  var deleteTagsOnBackspace: js.UndefOr[scala.Boolean] = js.undefined
   //url
  var delimeters: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var hiddenTagListId: js.UndefOr[java.lang.String] = js.undefined
  var hiddenTagListName: js.UndefOr[java.lang.String] = js.undefined
  var isClearInputOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  var maxTags: js.UndefOr[scala.Double] = js.undefined
  var prefilled: js.UndefOr[js.Any] = js.undefined
  var preventSubmitOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  var tagClass: js.UndefOr[java.lang.String] = js.undefined
  var tagCloseIcon: js.UndefOr[java.lang.String] = js.undefined
  var tagsContainer: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var typeahead: js.UndefOr[scala.Boolean] = js.undefined
  var typeaheadAjaxPolling: js.UndefOr[scala.Boolean] = js.undefined
  var typeaheadAjaxSource: js.UndefOr[java.lang.String] = js.undefined
  var typeaheadDelegate: js.UndefOr[js.Function] = js.undefined
  var typeaheadOverrides: js.UndefOr[ITypeaheadOverrides] = js.undefined
  var typeaheadSource: js.UndefOr[js.Any] = js.undefined
  var validator: js.UndefOr[js.Function] = js.undefined
}

object ITagsManagerOptions {
  @scala.inline
  def apply(
    AjaxPush: java.lang.String = null,
    CapitalizeFirstLetter: js.UndefOr[scala.Boolean] = js.undefined,
    backspace: js.Array[scala.Double] = null,
    blinkBGColor_1: java.lang.String = null,
    blinkBGColor_2: java.lang.String = null,
    deleteTagsOnBackspace: js.UndefOr[scala.Boolean] = js.undefined,
    delimeters: js.Array[scala.Double] = null,
    hiddenTagListId: java.lang.String = null,
    hiddenTagListName: java.lang.String = null,
    isClearInputOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    maxTags: scala.Int | scala.Double = null,
    prefilled: js.Any = null,
    preventSubmitOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    tagClass: java.lang.String = null,
    tagCloseIcon: java.lang.String = null,
    tagsContainer: stdLib.HTMLElement = null,
    typeahead: js.UndefOr[scala.Boolean] = js.undefined,
    typeaheadAjaxPolling: js.UndefOr[scala.Boolean] = js.undefined,
    typeaheadAjaxSource: java.lang.String = null,
    typeaheadDelegate: js.Function = null,
    typeaheadOverrides: ITypeaheadOverrides = null,
    typeaheadSource: js.Any = null,
    validator: js.Function = null
  ): ITagsManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (AjaxPush != null) __obj.updateDynamic("AjaxPush")(AjaxPush)
    if (!js.isUndefined(CapitalizeFirstLetter)) __obj.updateDynamic("CapitalizeFirstLetter")(CapitalizeFirstLetter)
    if (backspace != null) __obj.updateDynamic("backspace")(backspace)
    if (blinkBGColor_1 != null) __obj.updateDynamic("blinkBGColor_1")(blinkBGColor_1)
    if (blinkBGColor_2 != null) __obj.updateDynamic("blinkBGColor_2")(blinkBGColor_2)
    if (!js.isUndefined(deleteTagsOnBackspace)) __obj.updateDynamic("deleteTagsOnBackspace")(deleteTagsOnBackspace)
    if (delimeters != null) __obj.updateDynamic("delimeters")(delimeters)
    if (hiddenTagListId != null) __obj.updateDynamic("hiddenTagListId")(hiddenTagListId)
    if (hiddenTagListName != null) __obj.updateDynamic("hiddenTagListName")(hiddenTagListName)
    if (!js.isUndefined(isClearInputOnEsc)) __obj.updateDynamic("isClearInputOnEsc")(isClearInputOnEsc)
    if (maxTags != null) __obj.updateDynamic("maxTags")(maxTags.asInstanceOf[js.Any])
    if (prefilled != null) __obj.updateDynamic("prefilled")(prefilled)
    if (!js.isUndefined(preventSubmitOnEnter)) __obj.updateDynamic("preventSubmitOnEnter")(preventSubmitOnEnter)
    if (tagClass != null) __obj.updateDynamic("tagClass")(tagClass)
    if (tagCloseIcon != null) __obj.updateDynamic("tagCloseIcon")(tagCloseIcon)
    if (tagsContainer != null) __obj.updateDynamic("tagsContainer")(tagsContainer)
    if (!js.isUndefined(typeahead)) __obj.updateDynamic("typeahead")(typeahead)
    if (!js.isUndefined(typeaheadAjaxPolling)) __obj.updateDynamic("typeaheadAjaxPolling")(typeaheadAjaxPolling)
    if (typeaheadAjaxSource != null) __obj.updateDynamic("typeaheadAjaxSource")(typeaheadAjaxSource)
    if (typeaheadDelegate != null) __obj.updateDynamic("typeaheadDelegate")(typeaheadDelegate)
    if (typeaheadOverrides != null) __obj.updateDynamic("typeaheadOverrides")(typeaheadOverrides)
    if (typeaheadSource != null) __obj.updateDynamic("typeaheadSource")(typeaheadSource)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[ITagsManagerOptions]
  }
}

