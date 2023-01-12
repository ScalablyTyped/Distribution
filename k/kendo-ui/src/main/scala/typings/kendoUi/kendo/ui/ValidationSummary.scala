package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationSummary extends StObject {
  
  var container: js.UndefOr[String | JQuery] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
}
object ValidationSummary {
  
  inline def apply(): ValidationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationSummary] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: String | JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
