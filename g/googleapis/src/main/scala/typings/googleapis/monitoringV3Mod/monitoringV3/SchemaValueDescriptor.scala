package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValueDescriptor extends StObject {
  
  /**
    * The value key.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value stream kind.
    */
  var metricKind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unit in which time_series point values are reported. unit follows the UCUM format for units as seen in https://unitsofmeasure.org/ucum.html. unit is only valid if value_type is INTEGER, DOUBLE, DISTRIBUTION.
    */
  var unit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value type.
    */
  var valueType: js.UndefOr[String | Null] = js.undefined
}
object SchemaValueDescriptor {
  
  inline def apply(): SchemaValueDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValueDescriptor]
  }
  
  extension [Self <: SchemaValueDescriptor](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMetricKind(value: String): Self = StObject.set(x, "metricKind", value.asInstanceOf[js.Any])
    
    inline def setMetricKindNull: Self = StObject.set(x, "metricKind", null)
    
    inline def setMetricKindUndefined: Self = StObject.set(x, "metricKind", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeNull: Self = StObject.set(x, "valueType", null)
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
