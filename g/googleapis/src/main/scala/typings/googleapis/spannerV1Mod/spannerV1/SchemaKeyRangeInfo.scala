package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyRangeInfo extends StObject {
  
  /**
    * The list of context values for this key range.
    */
  var contextValues: js.UndefOr[js.Array[SchemaContextValue]] = js.undefined
  
  /**
    * The index of the end key in indexed_keys.
    */
  var endKeyIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Information about this key range, for all metrics.
    */
  var info: js.UndefOr[SchemaLocalizedString] = js.undefined
  
  /**
    * The number of keys this range covers.
    */
  var keysCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the metric. e.g. "latency".
    */
  var metric: js.UndefOr[SchemaLocalizedString] = js.undefined
  
  /**
    * The index of the start key in indexed_keys.
    */
  var startKeyIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The time offset. This is the time since the start of the time interval.
    */
  var timeOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unit of the metric. This is an unstructured field and will be mapped as is to the user.
    */
  var unit: js.UndefOr[SchemaLocalizedString] = js.undefined
  
  /**
    * The value of the metric.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object SchemaKeyRangeInfo {
  
  inline def apply(): SchemaKeyRangeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyRangeInfo]
  }
  
  extension [Self <: SchemaKeyRangeInfo](x: Self) {
    
    inline def setContextValues(value: js.Array[SchemaContextValue]): Self = StObject.set(x, "contextValues", value.asInstanceOf[js.Any])
    
    inline def setContextValuesUndefined: Self = StObject.set(x, "contextValues", js.undefined)
    
    inline def setContextValuesVarargs(value: SchemaContextValue*): Self = StObject.set(x, "contextValues", js.Array(value*))
    
    inline def setEndKeyIndex(value: Double): Self = StObject.set(x, "endKeyIndex", value.asInstanceOf[js.Any])
    
    inline def setEndKeyIndexNull: Self = StObject.set(x, "endKeyIndex", null)
    
    inline def setEndKeyIndexUndefined: Self = StObject.set(x, "endKeyIndex", js.undefined)
    
    inline def setInfo(value: SchemaLocalizedString): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setKeysCount(value: String): Self = StObject.set(x, "keysCount", value.asInstanceOf[js.Any])
    
    inline def setKeysCountNull: Self = StObject.set(x, "keysCount", null)
    
    inline def setKeysCountUndefined: Self = StObject.set(x, "keysCount", js.undefined)
    
    inline def setMetric(value: SchemaLocalizedString): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setStartKeyIndex(value: Double): Self = StObject.set(x, "startKeyIndex", value.asInstanceOf[js.Any])
    
    inline def setStartKeyIndexNull: Self = StObject.set(x, "startKeyIndex", null)
    
    inline def setStartKeyIndexUndefined: Self = StObject.set(x, "startKeyIndex", js.undefined)
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetNull: Self = StObject.set(x, "timeOffset", null)
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
    
    inline def setUnit(value: SchemaLocalizedString): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
