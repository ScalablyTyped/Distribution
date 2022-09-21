package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDashboardFilter extends StObject {
  
  /**
    * The specified filter type
    */
  var filterType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The key for the label
    */
  var labelKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A variable-length string value.
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The placeholder text that can be referenced in a filter string or MQL query. If omitted, the dashboard filter will be applied to all relevant widgets in the dashboard.
    */
  var templateVariable: js.UndefOr[String | Null] = js.undefined
}
object SchemaDashboardFilter {
  
  inline def apply(): SchemaDashboardFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDashboardFilter]
  }
  
  extension [Self <: SchemaDashboardFilter](x: Self) {
    
    inline def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setFilterTypeNull: Self = StObject.set(x, "filterType", null)
    
    inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    inline def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    inline def setLabelKeyNull: Self = StObject.set(x, "labelKey", null)
    
    inline def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setTemplateVariable(value: String): Self = StObject.set(x, "templateVariable", value.asInstanceOf[js.Any])
    
    inline def setTemplateVariableNull: Self = StObject.set(x, "templateVariable", null)
    
    inline def setTemplateVariableUndefined: Self = StObject.set(x, "templateVariable", js.undefined)
  }
}
