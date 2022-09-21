package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFrequencyCap extends StObject {
  
  /**
    * The maximum number of impressions that can be served to a user within the specified time period.
    */
  var maxImpressions: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The amount of time, in the units specified by time_unit_type. Defines the amount of time over which impressions per user are counted and capped.
    */
  var numTimeUnits: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The time unit. Along with num_time_units defines the amount of time over which impressions per user are counted and capped.
    */
  var timeUnitType: js.UndefOr[String | Null] = js.undefined
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
    
    inline def setNumTimeUnits(value: Double): Self = StObject.set(x, "numTimeUnits", value.asInstanceOf[js.Any])
    
    inline def setNumTimeUnitsNull: Self = StObject.set(x, "numTimeUnits", null)
    
    inline def setNumTimeUnitsUndefined: Self = StObject.set(x, "numTimeUnits", js.undefined)
    
    inline def setTimeUnitType(value: String): Self = StObject.set(x, "timeUnitType", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitTypeNull: Self = StObject.set(x, "timeUnitType", null)
    
    inline def setTimeUnitTypeUndefined: Self = StObject.set(x, "timeUnitType", js.undefined)
  }
}
