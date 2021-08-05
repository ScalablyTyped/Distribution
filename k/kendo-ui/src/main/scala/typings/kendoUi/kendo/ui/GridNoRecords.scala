package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridNoRecords extends StObject {
  
  var template: js.UndefOr[String | js.Function] = js.undefined
}
object GridNoRecords {
  
  inline def apply(): GridNoRecords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridNoRecords]
  }
  
  extension [Self <: GridNoRecords](x: Self) {
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
