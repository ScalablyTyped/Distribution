package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPivotGroupRule extends StObject {
  
  /**
    * A DateTimeRule.
    */
  var dateTimeRule: js.UndefOr[SchemaDateTimeRule] = js.undefined
  
  /**
    * A HistogramRule.
    */
  var histogramRule: js.UndefOr[SchemaHistogramRule] = js.undefined
  
  /**
    * A ManualRule.
    */
  var manualRule: js.UndefOr[SchemaManualRule] = js.undefined
}
object SchemaPivotGroupRule {
  
  inline def apply(): SchemaPivotGroupRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotGroupRule]
  }
  
  extension [Self <: SchemaPivotGroupRule](x: Self) {
    
    inline def setDateTimeRule(value: SchemaDateTimeRule): Self = StObject.set(x, "dateTimeRule", value.asInstanceOf[js.Any])
    
    inline def setDateTimeRuleUndefined: Self = StObject.set(x, "dateTimeRule", js.undefined)
    
    inline def setHistogramRule(value: SchemaHistogramRule): Self = StObject.set(x, "histogramRule", value.asInstanceOf[js.Any])
    
    inline def setHistogramRuleUndefined: Self = StObject.set(x, "histogramRule", js.undefined)
    
    inline def setManualRule(value: SchemaManualRule): Self = StObject.set(x, "manualRule", value.asInstanceOf[js.Any])
    
    inline def setManualRuleUndefined: Self = StObject.set(x, "manualRule", js.undefined)
  }
}
