package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerPreviewPane extends StObject {
  
  var metaFields: js.UndefOr[Any] = js.undefined
  
  var multipleFilesTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var noFileTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var singleFileTemplate: js.UndefOr[String | js.Function] = js.undefined
}
object FileManagerPreviewPane {
  
  inline def apply(): FileManagerPreviewPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerPreviewPane]
  }
  
  extension [Self <: FileManagerPreviewPane](x: Self) {
    
    inline def setMetaFields(value: Any): Self = StObject.set(x, "metaFields", value.asInstanceOf[js.Any])
    
    inline def setMetaFieldsUndefined: Self = StObject.set(x, "metaFields", js.undefined)
    
    inline def setMultipleFilesTemplate(value: String | js.Function): Self = StObject.set(x, "multipleFilesTemplate", value.asInstanceOf[js.Any])
    
    inline def setMultipleFilesTemplateUndefined: Self = StObject.set(x, "multipleFilesTemplate", js.undefined)
    
    inline def setNoFileTemplate(value: String | js.Function): Self = StObject.set(x, "noFileTemplate", value.asInstanceOf[js.Any])
    
    inline def setNoFileTemplateUndefined: Self = StObject.set(x, "noFileTemplate", js.undefined)
    
    inline def setSingleFileTemplate(value: String | js.Function): Self = StObject.set(x, "singleFileTemplate", value.asInstanceOf[js.Any])
    
    inline def setSingleFileTemplateUndefined: Self = StObject.set(x, "singleFileTemplate", js.undefined)
  }
}
