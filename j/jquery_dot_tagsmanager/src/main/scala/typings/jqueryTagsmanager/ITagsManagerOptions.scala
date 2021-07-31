package typings.jqueryTagsmanager

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITagsManagerOptions extends StObject {
  
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
  def apply(): ITagsManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITagsManagerOptions]
  }
  
  @scala.inline
  implicit class ITagsManagerOptionsMutableBuilder[Self <: ITagsManagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjaxPush(value: String): Self = StObject.set(x, "AjaxPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxPushUndefined: Self = StObject.set(x, "AjaxPush", js.undefined)
    
    @scala.inline
    def setBackspace(value: js.Array[Double]): Self = StObject.set(x, "backspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackspaceUndefined: Self = StObject.set(x, "backspace", js.undefined)
    
    @scala.inline
    def setBackspaceVarargs(value: Double*): Self = StObject.set(x, "backspace", js.Array(value :_*))
    
    @scala.inline
    def setBlinkBGColor_1(value: String): Self = StObject.set(x, "blinkBGColor_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlinkBGColor_1Undefined: Self = StObject.set(x, "blinkBGColor_1", js.undefined)
    
    @scala.inline
    def setBlinkBGColor_2(value: String): Self = StObject.set(x, "blinkBGColor_2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlinkBGColor_2Undefined: Self = StObject.set(x, "blinkBGColor_2", js.undefined)
    
    @scala.inline
    def setCapitalizeFirstLetter(value: Boolean): Self = StObject.set(x, "CapitalizeFirstLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapitalizeFirstLetterUndefined: Self = StObject.set(x, "CapitalizeFirstLetter", js.undefined)
    
    @scala.inline
    def setDeleteTagsOnBackspace(value: Boolean): Self = StObject.set(x, "deleteTagsOnBackspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTagsOnBackspaceUndefined: Self = StObject.set(x, "deleteTagsOnBackspace", js.undefined)
    
    @scala.inline
    def setDelimeters(value: js.Array[Double]): Self = StObject.set(x, "delimeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimetersUndefined: Self = StObject.set(x, "delimeters", js.undefined)
    
    @scala.inline
    def setDelimetersVarargs(value: Double*): Self = StObject.set(x, "delimeters", js.Array(value :_*))
    
    @scala.inline
    def setHiddenTagListId(value: String): Self = StObject.set(x, "hiddenTagListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenTagListIdUndefined: Self = StObject.set(x, "hiddenTagListId", js.undefined)
    
    @scala.inline
    def setHiddenTagListName(value: String): Self = StObject.set(x, "hiddenTagListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenTagListNameUndefined: Self = StObject.set(x, "hiddenTagListName", js.undefined)
    
    @scala.inline
    def setIsClearInputOnEsc(value: Boolean): Self = StObject.set(x, "isClearInputOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClearInputOnEscUndefined: Self = StObject.set(x, "isClearInputOnEsc", js.undefined)
    
    @scala.inline
    def setMaxTags(value: Double): Self = StObject.set(x, "maxTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTagsUndefined: Self = StObject.set(x, "maxTags", js.undefined)
    
    @scala.inline
    def setPrefilled(value: js.Any): Self = StObject.set(x, "prefilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefilledUndefined: Self = StObject.set(x, "prefilled", js.undefined)
    
    @scala.inline
    def setPreventSubmitOnEnter(value: Boolean): Self = StObject.set(x, "preventSubmitOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventSubmitOnEnterUndefined: Self = StObject.set(x, "preventSubmitOnEnter", js.undefined)
    
    @scala.inline
    def setTagClass(value: String): Self = StObject.set(x, "tagClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagClassUndefined: Self = StObject.set(x, "tagClass", js.undefined)
    
    @scala.inline
    def setTagCloseIcon(value: String): Self = StObject.set(x, "tagCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagCloseIconUndefined: Self = StObject.set(x, "tagCloseIcon", js.undefined)
    
    @scala.inline
    def setTagsContainer(value: HTMLElement): Self = StObject.set(x, "tagsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsContainerUndefined: Self = StObject.set(x, "tagsContainer", js.undefined)
    
    @scala.inline
    def setTypeahead(value: Boolean): Self = StObject.set(x, "typeahead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeaheadAjaxPolling(value: Boolean): Self = StObject.set(x, "typeaheadAjaxPolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeaheadAjaxPollingUndefined: Self = StObject.set(x, "typeaheadAjaxPolling", js.undefined)
    
    @scala.inline
    def setTypeaheadAjaxSource(value: String): Self = StObject.set(x, "typeaheadAjaxSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeaheadAjaxSourceUndefined: Self = StObject.set(x, "typeaheadAjaxSource", js.undefined)
    
    @scala.inline
    def setTypeaheadDelegate(value: js.Function): Self = StObject.set(x, "typeaheadDelegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeaheadDelegateUndefined: Self = StObject.set(x, "typeaheadDelegate", js.undefined)
    
    @scala.inline
    def setTypeaheadOverrides(value: ITypeaheadOverrides): Self = StObject.set(x, "typeaheadOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeaheadOverridesUndefined: Self = StObject.set(x, "typeaheadOverrides", js.undefined)
    
    @scala.inline
    def setTypeaheadSource(value: js.Any): Self = StObject.set(x, "typeaheadSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeaheadSourceUndefined: Self = StObject.set(x, "typeaheadSource", js.undefined)
    
    @scala.inline
    def setTypeaheadUndefined: Self = StObject.set(x, "typeahead", js.undefined)
    
    @scala.inline
    def setValidator(value: js.Function): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
