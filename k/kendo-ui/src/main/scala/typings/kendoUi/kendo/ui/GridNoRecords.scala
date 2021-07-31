package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridNoRecords extends StObject {
  
  var template: js.UndefOr[String | js.Function] = js.undefined
}
object GridNoRecords {
  
  @scala.inline
  def apply(): GridNoRecords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridNoRecords]
  }
  
  @scala.inline
  implicit class GridNoRecordsMutableBuilder[Self <: GridNoRecords] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
