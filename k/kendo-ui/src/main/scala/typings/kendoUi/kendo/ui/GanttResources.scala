package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttResources extends StObject {
  
  var dataColorField: js.UndefOr[String] = js.undefined
  
  var dataFormatField: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[Any | DataSource] = js.undefined
  
  var dataTextField: js.UndefOr[String] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
}
object GanttResources {
  
  inline def apply(): GanttResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttResources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GanttResources] (val x: Self) extends AnyVal {
    
    inline def setDataColorField(value: String): Self = StObject.set(x, "dataColorField", value.asInstanceOf[js.Any])
    
    inline def setDataColorFieldUndefined: Self = StObject.set(x, "dataColorField", js.undefined)
    
    inline def setDataFormatField(value: String): Self = StObject.set(x, "dataFormatField", value.asInstanceOf[js.Any])
    
    inline def setDataFormatFieldUndefined: Self = StObject.set(x, "dataFormatField", js.undefined)
    
    inline def setDataSource(value: Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    inline def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
