package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttColumnFilterable extends StObject {
  
  var ui: js.UndefOr[String | js.Function] = js.undefined
}
object GanttColumnFilterable {
  
  inline def apply(): GanttColumnFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttColumnFilterable]
  }
  
  extension [Self <: GanttColumnFilterable](x: Self) {
    
    inline def setUi(value: String | js.Function): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}
