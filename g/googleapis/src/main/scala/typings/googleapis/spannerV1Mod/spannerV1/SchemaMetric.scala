package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetric extends StObject {
  
  /**
    * The aggregation function used to aggregate each key bucket
    */
  var aggregation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The category of the metric, e.g. "Activity", "Alerts", "Reads", etc.
    */
  var category: js.UndefOr[SchemaLocalizedString] = js.undefined
  
  /**
    * The references to numerator and denominator metrics for a derived metric.
    */
  var derived: js.UndefOr[SchemaDerivedMetric] = js.undefined
  
  /**
    * The displayed label of the metric.
    */
  var displayLabel: js.UndefOr[SchemaLocalizedString] = js.undefined
  
  /**
    * Whether the metric has any non-zero data.
    */
  var hasNonzeroData: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The value that is considered hot for the metric. On a per metric basis hotness signals high utilization and something that might potentially be a cause for concern by the end user. hot_value is used to calibrate and scale visual color scales.
    */
  var hotValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The (sparse) mapping from time index to an IndexedHotKey message, representing those time intervals for which there are hot keys.
    */
  var indexedHotKeys: js.UndefOr[StringDictionary[SchemaIndexedHotKey] | Null] = js.undefined
  
  /**
    * The (sparse) mapping from time interval index to an IndexedKeyRangeInfos message, representing those time intervals for which there are informational messages concerning key ranges.
    */
  var indexedKeyRangeInfos: js.UndefOr[StringDictionary[SchemaIndexedKeyRangeInfos] | Null] = js.undefined
  
  /**
    * Information about the metric.
    */
  var info: js.UndefOr[SchemaLocalizedString] = js.undefined
  
  /**
    * The data for the metric as a matrix.
    */
  var matrix: js.UndefOr[SchemaMetricMatrix] = js.undefined
  
  /**
    * The unit of the metric.
    */
  var unit: js.UndefOr[SchemaLocalizedString] = js.undefined
  
  /**
    * Whether the metric is visible to the end user.
    */
  var visible: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaMetric {
  
  inline def apply(): SchemaMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetric]
  }
  
  extension [Self <: SchemaMetric](x: Self) {
    
    inline def setAggregation(value: String): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationNull: Self = StObject.set(x, "aggregation", null)
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setCategory(value: SchemaLocalizedString): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDerived(value: SchemaDerivedMetric): Self = StObject.set(x, "derived", value.asInstanceOf[js.Any])
    
    inline def setDerivedUndefined: Self = StObject.set(x, "derived", js.undefined)
    
    inline def setDisplayLabel(value: SchemaLocalizedString): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
    
    inline def setDisplayLabelUndefined: Self = StObject.set(x, "displayLabel", js.undefined)
    
    inline def setHasNonzeroData(value: Boolean): Self = StObject.set(x, "hasNonzeroData", value.asInstanceOf[js.Any])
    
    inline def setHasNonzeroDataNull: Self = StObject.set(x, "hasNonzeroData", null)
    
    inline def setHasNonzeroDataUndefined: Self = StObject.set(x, "hasNonzeroData", js.undefined)
    
    inline def setHotValue(value: Double): Self = StObject.set(x, "hotValue", value.asInstanceOf[js.Any])
    
    inline def setHotValueNull: Self = StObject.set(x, "hotValue", null)
    
    inline def setHotValueUndefined: Self = StObject.set(x, "hotValue", js.undefined)
    
    inline def setIndexedHotKeys(value: StringDictionary[SchemaIndexedHotKey]): Self = StObject.set(x, "indexedHotKeys", value.asInstanceOf[js.Any])
    
    inline def setIndexedHotKeysNull: Self = StObject.set(x, "indexedHotKeys", null)
    
    inline def setIndexedHotKeysUndefined: Self = StObject.set(x, "indexedHotKeys", js.undefined)
    
    inline def setIndexedKeyRangeInfos(value: StringDictionary[SchemaIndexedKeyRangeInfos]): Self = StObject.set(x, "indexedKeyRangeInfos", value.asInstanceOf[js.Any])
    
    inline def setIndexedKeyRangeInfosNull: Self = StObject.set(x, "indexedKeyRangeInfos", null)
    
    inline def setIndexedKeyRangeInfosUndefined: Self = StObject.set(x, "indexedKeyRangeInfos", js.undefined)
    
    inline def setInfo(value: SchemaLocalizedString): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setMatrix(value: SchemaMetricMatrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setUnit(value: SchemaLocalizedString): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleNull: Self = StObject.set(x, "visible", null)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
