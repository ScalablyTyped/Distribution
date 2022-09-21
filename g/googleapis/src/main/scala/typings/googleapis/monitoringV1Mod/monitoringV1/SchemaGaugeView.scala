package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGaugeView extends StObject {
  
  /**
    * The lower bound for this gauge chart. The value of the chart should always be greater than or equal to this.
    */
  var lowerBound: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The upper bound for this gauge chart. The value of the chart should always be less than or equal to this.
    */
  var upperBound: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGaugeView {
  
  inline def apply(): SchemaGaugeView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGaugeView]
  }
  
  extension [Self <: SchemaGaugeView](x: Self) {
    
    inline def setLowerBound(value: Double): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
    
    inline def setLowerBoundNull: Self = StObject.set(x, "lowerBound", null)
    
    inline def setLowerBoundUndefined: Self = StObject.set(x, "lowerBound", js.undefined)
    
    inline def setUpperBound(value: Double): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    
    inline def setUpperBoundNull: Self = StObject.set(x, "upperBound", null)
    
    inline def setUpperBoundUndefined: Self = StObject.set(x, "upperBound", js.undefined)
  }
}
