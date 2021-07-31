package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerPreviewPane extends StObject {
  
  var metaFields: js.UndefOr[js.Any] = js.undefined
  
  var multipleFilesTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var noFileTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var singleFileTemplate: js.UndefOr[String | js.Function] = js.undefined
}
object FileManagerPreviewPane {
  
  @scala.inline
  def apply(): FileManagerPreviewPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerPreviewPane]
  }
  
  @scala.inline
  implicit class FileManagerPreviewPaneMutableBuilder[Self <: FileManagerPreviewPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetaFields(value: js.Any): Self = StObject.set(x, "metaFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaFieldsUndefined: Self = StObject.set(x, "metaFields", js.undefined)
    
    @scala.inline
    def setMultipleFilesTemplate(value: String | js.Function): Self = StObject.set(x, "multipleFilesTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleFilesTemplateUndefined: Self = StObject.set(x, "multipleFilesTemplate", js.undefined)
    
    @scala.inline
    def setNoFileTemplate(value: String | js.Function): Self = StObject.set(x, "noFileTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoFileTemplateUndefined: Self = StObject.set(x, "noFileTemplate", js.undefined)
    
    @scala.inline
    def setSingleFileTemplate(value: String | js.Function): Self = StObject.set(x, "singleFileTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleFileTemplateUndefined: Self = StObject.set(x, "singleFileTemplate", js.undefined)
  }
}
