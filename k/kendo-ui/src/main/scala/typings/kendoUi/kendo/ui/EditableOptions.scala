package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditableOptions extends StObject {
  
  var clearContainer: Boolean
  
  var editors: EditorDefinitions
  
  var errorTemplate: String
  
  var mobileEditors: MobileEditorDefinitions
  
  var name: String
  
  var skipFocus: Boolean
  
  var validateOnBlur: Boolean
  
  var validationSummary: Boolean
}
object EditableOptions {
  
  inline def apply(
    clearContainer: Boolean,
    editors: EditorDefinitions,
    errorTemplate: String,
    mobileEditors: MobileEditorDefinitions,
    name: String,
    skipFocus: Boolean,
    validateOnBlur: Boolean,
    validationSummary: Boolean
  ): EditableOptions = {
    val __obj = js.Dynamic.literal(clearContainer = clearContainer.asInstanceOf[js.Any], editors = editors.asInstanceOf[js.Any], errorTemplate = errorTemplate.asInstanceOf[js.Any], mobileEditors = mobileEditors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], skipFocus = skipFocus.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validationSummary = validationSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditableOptions]
  }
  
  extension [Self <: EditableOptions](x: Self) {
    
    inline def setClearContainer(value: Boolean): Self = StObject.set(x, "clearContainer", value.asInstanceOf[js.Any])
    
    inline def setEditors(value: EditorDefinitions): Self = StObject.set(x, "editors", value.asInstanceOf[js.Any])
    
    inline def setErrorTemplate(value: String): Self = StObject.set(x, "errorTemplate", value.asInstanceOf[js.Any])
    
    inline def setMobileEditors(value: MobileEditorDefinitions): Self = StObject.set(x, "mobileEditors", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSkipFocus(value: Boolean): Self = StObject.set(x, "skipFocus", value.asInstanceOf[js.Any])
    
    inline def setValidateOnBlur(value: Boolean): Self = StObject.set(x, "validateOnBlur", value.asInstanceOf[js.Any])
    
    inline def setValidationSummary(value: Boolean): Self = StObject.set(x, "validationSummary", value.asInstanceOf[js.Any])
  }
}
