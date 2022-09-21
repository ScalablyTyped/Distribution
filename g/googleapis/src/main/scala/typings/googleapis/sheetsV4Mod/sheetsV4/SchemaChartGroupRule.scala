package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChartGroupRule extends StObject {
  
  /**
    * A ChartDateTimeRule.
    */
  var dateTimeRule: js.UndefOr[SchemaChartDateTimeRule] = js.undefined
  
  /**
    * A ChartHistogramRule
    */
  var histogramRule: js.UndefOr[SchemaChartHistogramRule] = js.undefined
}
object SchemaChartGroupRule {
  
  inline def apply(): SchemaChartGroupRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChartGroupRule]
  }
  
  extension [Self <: SchemaChartGroupRule](x: Self) {
    
    inline def setDateTimeRule(value: SchemaChartDateTimeRule): Self = StObject.set(x, "dateTimeRule", value.asInstanceOf[js.Any])
    
    inline def setDateTimeRuleUndefined: Self = StObject.set(x, "dateTimeRule", js.undefined)
    
    inline def setHistogramRule(value: SchemaChartHistogramRule): Self = StObject.set(x, "histogramRule", value.asInstanceOf[js.Any])
    
    inline def setHistogramRuleUndefined: Self = StObject.set(x, "histogramRule", js.undefined)
  }
}
