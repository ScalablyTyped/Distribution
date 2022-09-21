package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCollectdValue extends StObject {
  
  /**
    * The data source for the collectd value. For example, there are two data sources for network measurements: "rx" and "tx".
    */
  var dataSourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of measurement.
    */
  var dataSourceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The measurement value.
    */
  var value: js.UndefOr[SchemaTypedValue] = js.undefined
}
object SchemaCollectdValue {
  
  inline def apply(): SchemaCollectdValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectdValue]
  }
  
  extension [Self <: SchemaCollectdValue](x: Self) {
    
    inline def setDataSourceName(value: String): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNameNull: Self = StObject.set(x, "dataSourceName", null)
    
    inline def setDataSourceNameUndefined: Self = StObject.set(x, "dataSourceName", js.undefined)
    
    inline def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    inline def setDataSourceTypeNull: Self = StObject.set(x, "dataSourceType", null)
    
    inline def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    inline def setValue(value: SchemaTypedValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
