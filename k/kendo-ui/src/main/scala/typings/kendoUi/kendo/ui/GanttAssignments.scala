package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttAssignments extends StObject {
  
  var dataResourceIdField: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var dataTaskIdField: js.UndefOr[String] = js.native
  
  var dataValueField: js.UndefOr[String] = js.native
}
object GanttAssignments {
  
  @scala.inline
  def apply(): GanttAssignments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttAssignments]
  }
  
  @scala.inline
  implicit class GanttAssignmentsMutableBuilder[Self <: GanttAssignments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataResourceIdField(value: String): Self = StObject.set(x, "dataResourceIdField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataResourceIdFieldUndefined: Self = StObject.set(x, "dataResourceIdField", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataTaskIdField(value: String): Self = StObject.set(x, "dataTaskIdField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTaskIdFieldUndefined: Self = StObject.set(x, "dataTaskIdField", js.undefined)
    
    @scala.inline
    def setDataValueField(value: String): Self = StObject.set(x, "dataValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataValueFieldUndefined: Self = StObject.set(x, "dataValueField", js.undefined)
  }
}
