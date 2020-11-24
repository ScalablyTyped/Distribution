package typings.jqueryTagsmanager

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITagsManagerOptions extends js.Object {
  
  var AjaxPush: js.UndefOr[String] = js.native
  
  var CapitalizeFirstLetter: js.UndefOr[Boolean] = js.native
  
  var backspace: js.UndefOr[js.Array[Double]] = js.native
  
  var blinkBGColor_1: js.UndefOr[String] = js.native
  
  var blinkBGColor_2: js.UndefOr[String] = js.native
  
  var deleteTagsOnBackspace: js.UndefOr[Boolean] = js.native
  
   //url
  var delimeters: js.UndefOr[js.Array[Double]] = js.native
  
  var hiddenTagListId: js.UndefOr[String] = js.native
  
  var hiddenTagListName: js.UndefOr[String] = js.native
  
  var isClearInputOnEsc: js.UndefOr[Boolean] = js.native
  
  var maxTags: js.UndefOr[Double] = js.native
  
  var prefilled: js.UndefOr[js.Any] = js.native
  
  var preventSubmitOnEnter: js.UndefOr[Boolean] = js.native
  
  var tagClass: js.UndefOr[String] = js.native
  
  var tagCloseIcon: js.UndefOr[String] = js.native
  
  var tagsContainer: js.UndefOr[HTMLElement] = js.native
  
  var typeahead: js.UndefOr[Boolean] = js.native
  
  var typeaheadAjaxPolling: js.UndefOr[Boolean] = js.native
  
  var typeaheadAjaxSource: js.UndefOr[String] = js.native
  
  var typeaheadDelegate: js.UndefOr[js.Function] = js.native
  
  var typeaheadOverrides: js.UndefOr[ITypeaheadOverrides] = js.native
  
  var typeaheadSource: js.UndefOr[js.Any] = js.native
  
  var validator: js.UndefOr[js.Function] = js.native
}
object ITagsManagerOptions {
  
  @scala.inline
  def apply(): ITagsManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITagsManagerOptions]
  }
  
  @scala.inline
  implicit class ITagsManagerOptionsOps[Self <: ITagsManagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAjaxPush(value: String): Self = this.set("AjaxPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxPush: Self = this.set("AjaxPush", js.undefined)
    
    @scala.inline
    def setCapitalizeFirstLetter(value: Boolean): Self = this.set("CapitalizeFirstLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapitalizeFirstLetter: Self = this.set("CapitalizeFirstLetter", js.undefined)
    
    @scala.inline
    def setBackspaceVarargs(value: Double*): Self = this.set("backspace", js.Array(value :_*))
    
    @scala.inline
    def setBackspace(value: js.Array[Double]): Self = this.set("backspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackspace: Self = this.set("backspace", js.undefined)
    
    @scala.inline
    def setBlinkBGColor_1(value: String): Self = this.set("blinkBGColor_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlinkBGColor_1: Self = this.set("blinkBGColor_1", js.undefined)
    
    @scala.inline
    def setBlinkBGColor_2(value: String): Self = this.set("blinkBGColor_2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlinkBGColor_2: Self = this.set("blinkBGColor_2", js.undefined)
    
    @scala.inline
    def setDeleteTagsOnBackspace(value: Boolean): Self = this.set("deleteTagsOnBackspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteTagsOnBackspace: Self = this.set("deleteTagsOnBackspace", js.undefined)
    
    @scala.inline
    def setDelimetersVarargs(value: Double*): Self = this.set("delimeters", js.Array(value :_*))
    
    @scala.inline
    def setDelimeters(value: js.Array[Double]): Self = this.set("delimeters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimeters: Self = this.set("delimeters", js.undefined)
    
    @scala.inline
    def setHiddenTagListId(value: String): Self = this.set("hiddenTagListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenTagListId: Self = this.set("hiddenTagListId", js.undefined)
    
    @scala.inline
    def setHiddenTagListName(value: String): Self = this.set("hiddenTagListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenTagListName: Self = this.set("hiddenTagListName", js.undefined)
    
    @scala.inline
    def setIsClearInputOnEsc(value: Boolean): Self = this.set("isClearInputOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClearInputOnEsc: Self = this.set("isClearInputOnEsc", js.undefined)
    
    @scala.inline
    def setMaxTags(value: Double): Self = this.set("maxTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTags: Self = this.set("maxTags", js.undefined)
    
    @scala.inline
    def setPrefilled(value: js.Any): Self = this.set("prefilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefilled: Self = this.set("prefilled", js.undefined)
    
    @scala.inline
    def setPreventSubmitOnEnter(value: Boolean): Self = this.set("preventSubmitOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventSubmitOnEnter: Self = this.set("preventSubmitOnEnter", js.undefined)
    
    @scala.inline
    def setTagClass(value: String): Self = this.set("tagClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagClass: Self = this.set("tagClass", js.undefined)
    
    @scala.inline
    def setTagCloseIcon(value: String): Self = this.set("tagCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagCloseIcon: Self = this.set("tagCloseIcon", js.undefined)
    
    @scala.inline
    def setTagsContainer(value: HTMLElement): Self = this.set("tagsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagsContainer: Self = this.set("tagsContainer", js.undefined)
    
    @scala.inline
    def setTypeahead(value: Boolean): Self = this.set("typeahead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeahead: Self = this.set("typeahead", js.undefined)
    
    @scala.inline
    def setTypeaheadAjaxPolling(value: Boolean): Self = this.set("typeaheadAjaxPolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeaheadAjaxPolling: Self = this.set("typeaheadAjaxPolling", js.undefined)
    
    @scala.inline
    def setTypeaheadAjaxSource(value: String): Self = this.set("typeaheadAjaxSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeaheadAjaxSource: Self = this.set("typeaheadAjaxSource", js.undefined)
    
    @scala.inline
    def setTypeaheadDelegate(value: js.Function): Self = this.set("typeaheadDelegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeaheadDelegate: Self = this.set("typeaheadDelegate", js.undefined)
    
    @scala.inline
    def setTypeaheadOverrides(value: ITypeaheadOverrides): Self = this.set("typeaheadOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeaheadOverrides: Self = this.set("typeaheadOverrides", js.undefined)
    
    @scala.inline
    def setTypeaheadSource(value: js.Any): Self = this.set("typeaheadSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeaheadSource: Self = this.set("typeaheadSource", js.undefined)
    
    @scala.inline
    def setValidator(value: js.Function): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
}
