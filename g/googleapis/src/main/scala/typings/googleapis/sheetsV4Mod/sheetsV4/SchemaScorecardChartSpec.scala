package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScorecardChartSpec extends StObject {
  
  /**
    * The aggregation type for key and baseline chart data in scorecard chart. This field is not supported for data source charts. Use the ChartData.aggregateType field of the key_value_data or baseline_value_data instead for data source charts. This field is optional.
    */
  var aggregateType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The data for scorecard baseline value. This field is optional.
    */
  var baselineValueData: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * Formatting options for baseline value. This field is needed only if baseline_value_data is specified.
    */
  var baselineValueFormat: js.UndefOr[SchemaBaselineValueFormat] = js.undefined
  
  /**
    * Custom formatting options for numeric key/baseline values in scorecard chart. This field is used only when number_format_source is set to CUSTOM. This field is optional.
    */
  var customFormatOptions: js.UndefOr[SchemaChartCustomNumberFormatOptions] = js.undefined
  
  /**
    * The data for scorecard key value.
    */
  var keyValueData: js.UndefOr[SchemaChartData] = js.undefined
  
  /**
    * Formatting options for key value.
    */
  var keyValueFormat: js.UndefOr[SchemaKeyValueFormat] = js.undefined
  
  /**
    * The number format source used in the scorecard chart. This field is optional.
    */
  var numberFormatSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value to scale scorecard key and baseline value. For example, a factor of 10 can be used to divide all values in the chart by 10. This field is optional.
    */
  var scaleFactor: js.UndefOr[Double | Null] = js.undefined
}
object SchemaScorecardChartSpec {
  
  inline def apply(): SchemaScorecardChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScorecardChartSpec]
  }
  
  extension [Self <: SchemaScorecardChartSpec](x: Self) {
    
    inline def setAggregateType(value: String): Self = StObject.set(x, "aggregateType", value.asInstanceOf[js.Any])
    
    inline def setAggregateTypeNull: Self = StObject.set(x, "aggregateType", null)
    
    inline def setAggregateTypeUndefined: Self = StObject.set(x, "aggregateType", js.undefined)
    
    inline def setBaselineValueData(value: SchemaChartData): Self = StObject.set(x, "baselineValueData", value.asInstanceOf[js.Any])
    
    inline def setBaselineValueDataUndefined: Self = StObject.set(x, "baselineValueData", js.undefined)
    
    inline def setBaselineValueFormat(value: SchemaBaselineValueFormat): Self = StObject.set(x, "baselineValueFormat", value.asInstanceOf[js.Any])
    
    inline def setBaselineValueFormatUndefined: Self = StObject.set(x, "baselineValueFormat", js.undefined)
    
    inline def setCustomFormatOptions(value: SchemaChartCustomNumberFormatOptions): Self = StObject.set(x, "customFormatOptions", value.asInstanceOf[js.Any])
    
    inline def setCustomFormatOptionsUndefined: Self = StObject.set(x, "customFormatOptions", js.undefined)
    
    inline def setKeyValueData(value: SchemaChartData): Self = StObject.set(x, "keyValueData", value.asInstanceOf[js.Any])
    
    inline def setKeyValueDataUndefined: Self = StObject.set(x, "keyValueData", js.undefined)
    
    inline def setKeyValueFormat(value: SchemaKeyValueFormat): Self = StObject.set(x, "keyValueFormat", value.asInstanceOf[js.Any])
    
    inline def setKeyValueFormatUndefined: Self = StObject.set(x, "keyValueFormat", js.undefined)
    
    inline def setNumberFormatSource(value: String): Self = StObject.set(x, "numberFormatSource", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatSourceNull: Self = StObject.set(x, "numberFormatSource", null)
    
    inline def setNumberFormatSourceUndefined: Self = StObject.set(x, "numberFormatSource", js.undefined)
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleFactorNull: Self = StObject.set(x, "scaleFactor", null)
    
    inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
  }
}
