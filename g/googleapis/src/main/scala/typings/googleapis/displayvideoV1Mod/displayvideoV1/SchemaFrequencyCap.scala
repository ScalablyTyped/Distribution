package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFrequencyCap extends StObject {
  
  /**
    * The maximum number of times a user may be shown the same ad during this period. Must be greater than 0. Required when unlimited is `false` and max_views is not set.
    */
  var maxImpressions: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The time unit in which the frequency cap will be applied. Required when unlimited is `false`.
    */
  var timeUnit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of time_unit the frequency cap will last. Required when unlimited is `false`. The following restrictions apply based on the value of time_unit: * `TIME_UNIT_LIFETIME` - this field is output only and will default to 1 * `TIME_UNIT_MONTHS` - must be between 1 and 2 * `TIME_UNIT_WEEKS` - must be between 1 and 4 * `TIME_UNIT_DAYS` - must be between 1 and 6 * `TIME_UNIT_HOURS` - must be between 1 and 23 * `TIME_UNIT_MINUTES` - must be between 1 and 59
    */
  var timeUnitCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether unlimited frequency capping is applied. When this field is set to `true`, the remaining frequency cap fields are not applicable.
    */
  var unlimited: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaFrequencyCap {
  
  inline def apply(): SchemaFrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFrequencyCap]
  }
  
  extension [Self <: SchemaFrequencyCap](x: Self) {
    
    inline def setMaxImpressions(value: Double): Self = StObject.set(x, "maxImpressions", value.asInstanceOf[js.Any])
    
    inline def setMaxImpressionsNull: Self = StObject.set(x, "maxImpressions", null)
    
    inline def setMaxImpressionsUndefined: Self = StObject.set(x, "maxImpressions", js.undefined)
    
    inline def setTimeUnit(value: String): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitCount(value: Double): Self = StObject.set(x, "timeUnitCount", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitCountNull: Self = StObject.set(x, "timeUnitCount", null)
    
    inline def setTimeUnitCountUndefined: Self = StObject.set(x, "timeUnitCount", js.undefined)
    
    inline def setTimeUnitNull: Self = StObject.set(x, "timeUnit", null)
    
    inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
    
    inline def setUnlimited(value: Boolean): Self = StObject.set(x, "unlimited", value.asInstanceOf[js.Any])
    
    inline def setUnlimitedNull: Self = StObject.set(x, "unlimited", null)
    
    inline def setUnlimitedUndefined: Self = StObject.set(x, "unlimited", js.undefined)
  }
}
