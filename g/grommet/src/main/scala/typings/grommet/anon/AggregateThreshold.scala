package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateThreshold extends StObject {
  
  var aggregateThreshold: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
}
object AggregateThreshold {
  
  inline def apply(): AggregateThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateThreshold]
  }
  
  extension [Self <: AggregateThreshold](x: Self) {
    
    inline def setAggregateThreshold(value: Double): Self = StObject.set(x, "aggregateThreshold", value.asInstanceOf[js.Any])
    
    inline def setAggregateThresholdUndefined: Self = StObject.set(x, "aggregateThreshold", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
  }
}
