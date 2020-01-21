package typings.jqueryTagsmanager

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagsManagerOptions extends js.Object {
  var AjaxPush: js.UndefOr[String] = js.undefined
  var CapitalizeFirstLetter: js.UndefOr[Boolean] = js.undefined
  var backspace: js.UndefOr[js.Array[Double]] = js.undefined
  var blinkBGColor_1: js.UndefOr[String] = js.undefined
  var blinkBGColor_2: js.UndefOr[String] = js.undefined
  var deleteTagsOnBackspace: js.UndefOr[Boolean] = js.undefined
   //url
  var delimeters: js.UndefOr[js.Array[Double]] = js.undefined
  var hiddenTagListId: js.UndefOr[String] = js.undefined
  var hiddenTagListName: js.UndefOr[String] = js.undefined
  var isClearInputOnEsc: js.UndefOr[Boolean] = js.undefined
  var maxTags: js.UndefOr[Double] = js.undefined
  var prefilled: js.UndefOr[js.Any] = js.undefined
  var preventSubmitOnEnter: js.UndefOr[Boolean] = js.undefined
  var tagClass: js.UndefOr[String] = js.undefined
  var tagCloseIcon: js.UndefOr[String] = js.undefined
  var tagsContainer: js.UndefOr[HTMLElement] = js.undefined
  var typeahead: js.UndefOr[Boolean] = js.undefined
  var typeaheadAjaxPolling: js.UndefOr[Boolean] = js.undefined
  var typeaheadAjaxSource: js.UndefOr[String] = js.undefined
  var typeaheadDelegate: js.UndefOr[js.Function] = js.undefined
  var typeaheadOverrides: js.UndefOr[ITypeaheadOverrides] = js.undefined
  var typeaheadSource: js.UndefOr[js.Any] = js.undefined
  var validator: js.UndefOr[js.Function] = js.undefined
}

object ITagsManagerOptions {
  @scala.inline
  def apply(
    AjaxPush: String = null,
    CapitalizeFirstLetter: js.UndefOr[Boolean] = js.undefined,
    backspace: js.Array[Double] = null,
    blinkBGColor_1: String = null,
    blinkBGColor_2: String = null,
    deleteTagsOnBackspace: js.UndefOr[Boolean] = js.undefined,
    delimeters: js.Array[Double] = null,
    hiddenTagListId: String = null,
    hiddenTagListName: String = null,
    isClearInputOnEsc: js.UndefOr[Boolean] = js.undefined,
    maxTags: Int | Double = null,
    prefilled: js.Any = null,
    preventSubmitOnEnter: js.UndefOr[Boolean] = js.undefined,
    tagClass: String = null,
    tagCloseIcon: String = null,
    tagsContainer: HTMLElement = null,
    typeahead: js.UndefOr[Boolean] = js.undefined,
    typeaheadAjaxPolling: js.UndefOr[Boolean] = js.undefined,
    typeaheadAjaxSource: String = null,
    typeaheadDelegate: js.Function = null,
    typeaheadOverrides: ITypeaheadOverrides = null,
    typeaheadSource: js.Any = null,
    validator: js.Function = null
  ): ITagsManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (AjaxPush != null) __obj.updateDynamic("AjaxPush")(AjaxPush.asInstanceOf[js.Any])
    if (!js.isUndefined(CapitalizeFirstLetter)) __obj.updateDynamic("CapitalizeFirstLetter")(CapitalizeFirstLetter.asInstanceOf[js.Any])
    if (backspace != null) __obj.updateDynamic("backspace")(backspace.asInstanceOf[js.Any])
    if (blinkBGColor_1 != null) __obj.updateDynamic("blinkBGColor_1")(blinkBGColor_1.asInstanceOf[js.Any])
    if (blinkBGColor_2 != null) __obj.updateDynamic("blinkBGColor_2")(blinkBGColor_2.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteTagsOnBackspace)) __obj.updateDynamic("deleteTagsOnBackspace")(deleteTagsOnBackspace.asInstanceOf[js.Any])
    if (delimeters != null) __obj.updateDynamic("delimeters")(delimeters.asInstanceOf[js.Any])
    if (hiddenTagListId != null) __obj.updateDynamic("hiddenTagListId")(hiddenTagListId.asInstanceOf[js.Any])
    if (hiddenTagListName != null) __obj.updateDynamic("hiddenTagListName")(hiddenTagListName.asInstanceOf[js.Any])
    if (!js.isUndefined(isClearInputOnEsc)) __obj.updateDynamic("isClearInputOnEsc")(isClearInputOnEsc.asInstanceOf[js.Any])
    if (maxTags != null) __obj.updateDynamic("maxTags")(maxTags.asInstanceOf[js.Any])
    if (prefilled != null) __obj.updateDynamic("prefilled")(prefilled.asInstanceOf[js.Any])
    if (!js.isUndefined(preventSubmitOnEnter)) __obj.updateDynamic("preventSubmitOnEnter")(preventSubmitOnEnter.asInstanceOf[js.Any])
    if (tagClass != null) __obj.updateDynamic("tagClass")(tagClass.asInstanceOf[js.Any])
    if (tagCloseIcon != null) __obj.updateDynamic("tagCloseIcon")(tagCloseIcon.asInstanceOf[js.Any])
    if (tagsContainer != null) __obj.updateDynamic("tagsContainer")(tagsContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(typeahead)) __obj.updateDynamic("typeahead")(typeahead.asInstanceOf[js.Any])
    if (!js.isUndefined(typeaheadAjaxPolling)) __obj.updateDynamic("typeaheadAjaxPolling")(typeaheadAjaxPolling.asInstanceOf[js.Any])
    if (typeaheadAjaxSource != null) __obj.updateDynamic("typeaheadAjaxSource")(typeaheadAjaxSource.asInstanceOf[js.Any])
    if (typeaheadDelegate != null) __obj.updateDynamic("typeaheadDelegate")(typeaheadDelegate.asInstanceOf[js.Any])
    if (typeaheadOverrides != null) __obj.updateDynamic("typeaheadOverrides")(typeaheadOverrides.asInstanceOf[js.Any])
    if (typeaheadSource != null) __obj.updateDynamic("typeaheadSource")(typeaheadSource.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagsManagerOptions]
  }
}

