package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDerivedMetric extends StObject {
  
  /**
    * The name of the denominator metric. e.g. "rows".
    */
  var denominator: js.UndefOr[SchemaLocalizedString] = js.undefined
  
  /**
    * The name of the numerator metric. e.g. "latency".
    */
  var numerator: js.UndefOr[SchemaLocalizedString] = js.undefined
}
object SchemaDerivedMetric {
  
  inline def apply(): SchemaDerivedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDerivedMetric]
  }
  
  extension [Self <: SchemaDerivedMetric](x: Self) {
    
    inline def setDenominator(value: SchemaLocalizedString): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
    
    inline def setDenominatorUndefined: Self = StObject.set(x, "denominator", js.undefined)
    
    inline def setNumerator(value: SchemaLocalizedString): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
    
    inline def setNumeratorUndefined: Self = StObject.set(x, "numerator", js.undefined)
  }
}
