package typings.jqueryUniform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniformCoreOptions extends js.Object {
  
  var activeClass: js.UndefOr[String] = js.native
  
  var autoHide: js.UndefOr[Boolean] = js.native
  
  var buttonClass: js.UndefOr[String] = js.native
  
  var checkboxClass: js.UndefOr[String] = js.native
  
  var checkedClass: js.UndefOr[String] = js.native
  
  var disabledClass: js.UndefOr[String] = js.native
  
  var eventNamespace: js.UndefOr[String] = js.native
  
  var fileButtonClass: js.UndefOr[String] = js.native
  
  var fileButtonHtml: js.UndefOr[String] = js.native
  
  var fileClass: js.UndefOr[String] = js.native
  
  var fileDefaultHtml: js.UndefOr[String] = js.native
  
  var filenameClass: js.UndefOr[String] = js.native
  
  var focusClass: js.UndefOr[String] = js.native
  
  var hoverClass: js.UndefOr[String] = js.native
  
  var idPrefix: js.UndefOr[String] = js.native
  
  var inputAddTypeAsClass: js.UndefOr[Boolean] = js.native
  
  var inputClass: js.UndefOr[String] = js.native
  
  var radioClass: js.UndefOr[String] = js.native
  
  var resetDefaultHtml: js.UndefOr[String] = js.native
  
  var resetSelector: js.UndefOr[js.Any] = js.native
  
  var selectAutoWidth: js.UndefOr[Boolean] = js.native
  
  var selectClass: js.UndefOr[String] = js.native
  
  var selectMultiClass: js.UndefOr[String] = js.native
  
  var submitDefaultHtml: js.UndefOr[String] = js.native
  
  var textareaClass: js.UndefOr[String] = js.native
  
  var useID: js.UndefOr[Boolean] = js.native
  
  var wrapperClass: js.UndefOr[String] = js.native
}
object UniformCoreOptions {
  
  @scala.inline
  def apply(): UniformCoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniformCoreOptions]
  }
  
  @scala.inline
  implicit class UniformCoreOptionsOps[Self <: UniformCoreOptions] (val x: Self) extends AnyVal {
    
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
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    
    @scala.inline
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    
    @scala.inline
    def setButtonClass(value: String): Self = this.set("buttonClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonClass: Self = this.set("buttonClass", js.undefined)
    
    @scala.inline
    def setCheckboxClass(value: String): Self = this.set("checkboxClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxClass: Self = this.set("checkboxClass", js.undefined)
    
    @scala.inline
    def setCheckedClass(value: String): Self = this.set("checkedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedClass: Self = this.set("checkedClass", js.undefined)
    
    @scala.inline
    def setDisabledClass(value: String): Self = this.set("disabledClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledClass: Self = this.set("disabledClass", js.undefined)
    
    @scala.inline
    def setEventNamespace(value: String): Self = this.set("eventNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventNamespace: Self = this.set("eventNamespace", js.undefined)
    
    @scala.inline
    def setFileButtonClass(value: String): Self = this.set("fileButtonClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileButtonClass: Self = this.set("fileButtonClass", js.undefined)
    
    @scala.inline
    def setFileButtonHtml(value: String): Self = this.set("fileButtonHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileButtonHtml: Self = this.set("fileButtonHtml", js.undefined)
    
    @scala.inline
    def setFileClass(value: String): Self = this.set("fileClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileClass: Self = this.set("fileClass", js.undefined)
    
    @scala.inline
    def setFileDefaultHtml(value: String): Self = this.set("fileDefaultHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileDefaultHtml: Self = this.set("fileDefaultHtml", js.undefined)
    
    @scala.inline
    def setFilenameClass(value: String): Self = this.set("filenameClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilenameClass: Self = this.set("filenameClass", js.undefined)
    
    @scala.inline
    def setFocusClass(value: String): Self = this.set("focusClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusClass: Self = this.set("focusClass", js.undefined)
    
    @scala.inline
    def setHoverClass(value: String): Self = this.set("hoverClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverClass: Self = this.set("hoverClass", js.undefined)
    
    @scala.inline
    def setIdPrefix(value: String): Self = this.set("idPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdPrefix: Self = this.set("idPrefix", js.undefined)
    
    @scala.inline
    def setInputAddTypeAsClass(value: Boolean): Self = this.set("inputAddTypeAsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAddTypeAsClass: Self = this.set("inputAddTypeAsClass", js.undefined)
    
    @scala.inline
    def setInputClass(value: String): Self = this.set("inputClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputClass: Self = this.set("inputClass", js.undefined)
    
    @scala.inline
    def setRadioClass(value: String): Self = this.set("radioClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioClass: Self = this.set("radioClass", js.undefined)
    
    @scala.inline
    def setResetDefaultHtml(value: String): Self = this.set("resetDefaultHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetDefaultHtml: Self = this.set("resetDefaultHtml", js.undefined)
    
    @scala.inline
    def setResetSelector(value: js.Any): Self = this.set("resetSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetSelector: Self = this.set("resetSelector", js.undefined)
    
    @scala.inline
    def setSelectAutoWidth(value: Boolean): Self = this.set("selectAutoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAutoWidth: Self = this.set("selectAutoWidth", js.undefined)
    
    @scala.inline
    def setSelectClass(value: String): Self = this.set("selectClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectClass: Self = this.set("selectClass", js.undefined)
    
    @scala.inline
    def setSelectMultiClass(value: String): Self = this.set("selectMultiClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectMultiClass: Self = this.set("selectMultiClass", js.undefined)
    
    @scala.inline
    def setSubmitDefaultHtml(value: String): Self = this.set("submitDefaultHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitDefaultHtml: Self = this.set("submitDefaultHtml", js.undefined)
    
    @scala.inline
    def setTextareaClass(value: String): Self = this.set("textareaClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextareaClass: Self = this.set("textareaClass", js.undefined)
    
    @scala.inline
    def setUseID(value: Boolean): Self = this.set("useID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseID: Self = this.set("useID", js.undefined)
    
    @scala.inline
    def setWrapperClass(value: String): Self = this.set("wrapperClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperClass: Self = this.set("wrapperClass", js.undefined)
  }
}
