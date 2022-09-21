package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttAssignments extends StObject {
  
  var dataResourceIdField: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[Any | DataSource] = js.undefined
  
  var dataTaskIdField: js.UndefOr[String] = js.undefined
  
  var dataValueField: js.UndefOr[String] = js.undefined
}
object GanttAssignments {
  
  inline def apply(): GanttAssignments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttAssignments]
  }
  
  extension [Self <: GanttAssignments](x: Self) {
    
    inline def setDataResourceIdField(value: String): Self = StObject.set(x, "dataResourceIdField", value.asInstanceOf[js.Any])
    
    inline def setDataResourceIdFieldUndefined: Self = StObject.set(x, "dataResourceIdField", js.undefined)
    
    inline def setDataSource(value: Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataTaskIdField(value: String): Self = StObject.set(x, "dataTaskIdField", value.asInstanceOf[js.Any])
    
    inline def setDataTaskIdFieldUndefined: Self = StObject.set(x, "dataTaskIdField", js.undefined)
    
    inline def setDataValueField(value: String): Self = StObject.set(x, "dataValueField", value.asInstanceOf[js.Any])
    
    inline def setDataValueFieldUndefined: Self = StObject.set(x, "dataValueField", js.undefined)
  }
}
