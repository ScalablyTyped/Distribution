package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransitTableTransitTimeRowTransitTimeValue extends StObject {
  
  /**
    * Must be greater than or equal to `minTransitTimeInDays`.
    */
  var maxTransitTimeInDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Transit time range (min-max) in business days. 0 means same day delivery, 1 means next day delivery.
    */
  var minTransitTimeInDays: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTransitTableTransitTimeRowTransitTimeValue {
  
  inline def apply(): SchemaTransitTableTransitTimeRowTransitTimeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransitTableTransitTimeRowTransitTimeValue]
  }
  
  extension [Self <: SchemaTransitTableTransitTimeRowTransitTimeValue](x: Self) {
    
    inline def setMaxTransitTimeInDays(value: Double): Self = StObject.set(x, "maxTransitTimeInDays", value.asInstanceOf[js.Any])
    
    inline def setMaxTransitTimeInDaysNull: Self = StObject.set(x, "maxTransitTimeInDays", null)
    
    inline def setMaxTransitTimeInDaysUndefined: Self = StObject.set(x, "maxTransitTimeInDays", js.undefined)
    
    inline def setMinTransitTimeInDays(value: Double): Self = StObject.set(x, "minTransitTimeInDays", value.asInstanceOf[js.Any])
    
    inline def setMinTransitTimeInDaysNull: Self = StObject.set(x, "minTransitTimeInDays", null)
    
    inline def setMinTransitTimeInDaysUndefined: Self = StObject.set(x, "minTransitTimeInDays", js.undefined)
  }
}
