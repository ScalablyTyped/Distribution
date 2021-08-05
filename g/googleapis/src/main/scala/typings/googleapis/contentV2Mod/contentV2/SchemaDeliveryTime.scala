package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryTime extends StObject {
  
  /**
    * Business days cutoff time definition. If not configured the cutoff time
    * will be defaulted to 8AM PST.
    */
  var cutoffTime: js.UndefOr[SchemaCutoffTime] = js.undefined
  
  /**
    * Holiday cutoff definitions. If configured, they specify order cutoff
    * times for holiday-specific shipping.
    */
  var holidayCutoffs: js.UndefOr[js.Array[SchemaHolidayCutoff]] = js.undefined
  
  /**
    * Maximum number of business days spent before an order is shipped. 0 means
    * same day shipped, 1 means next day shipped. Must be greater than or equal
    * to minHandlingTimeInDays.
    */
  var maxHandlingTimeInDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum number of business days that is spent in transit. 0 means same
    * day delivery, 1 means next day delivery. Must be greater than or equal to
    * minTransitTimeInDays.
    */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of business days spent before an order is shipped. 0 means
    * same day shipped, 1 means next day shipped.
    */
  var minHandlingTimeInDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of business days that is spent in transit. 0 means same
    * day delivery, 1 means next day delivery. Either
    * {min,max}transitTimeInDays or transitTimeTable must be set, but not both.
    */
  var minTransitTimeInDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Transit time table, number of business days spent in transit based on row
    * and column dimensions. Either {min,max}transitTimeInDays or
    * transitTimeTable can be set, but not both.
    */
  var transitTimeTable: js.UndefOr[SchemaTransitTable] = js.undefined
}
object SchemaDeliveryTime {
  
  inline def apply(): SchemaDeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryTime]
  }
  
  extension [Self <: SchemaDeliveryTime](x: Self) {
    
    inline def setCutoffTime(value: SchemaCutoffTime): Self = StObject.set(x, "cutoffTime", value.asInstanceOf[js.Any])
    
    inline def setCutoffTimeUndefined: Self = StObject.set(x, "cutoffTime", js.undefined)
    
    inline def setHolidayCutoffs(value: js.Array[SchemaHolidayCutoff]): Self = StObject.set(x, "holidayCutoffs", value.asInstanceOf[js.Any])
    
    inline def setHolidayCutoffsUndefined: Self = StObject.set(x, "holidayCutoffs", js.undefined)
    
    inline def setHolidayCutoffsVarargs(value: SchemaHolidayCutoff*): Self = StObject.set(x, "holidayCutoffs", js.Array(value :_*))
    
    inline def setMaxHandlingTimeInDays(value: Double): Self = StObject.set(x, "maxHandlingTimeInDays", value.asInstanceOf[js.Any])
    
    inline def setMaxHandlingTimeInDaysUndefined: Self = StObject.set(x, "maxHandlingTimeInDays", js.undefined)
    
    inline def setMaxTransitTimeInDays(value: Double): Self = StObject.set(x, "maxTransitTimeInDays", value.asInstanceOf[js.Any])
    
    inline def setMaxTransitTimeInDaysUndefined: Self = StObject.set(x, "maxTransitTimeInDays", js.undefined)
    
    inline def setMinHandlingTimeInDays(value: Double): Self = StObject.set(x, "minHandlingTimeInDays", value.asInstanceOf[js.Any])
    
    inline def setMinHandlingTimeInDaysUndefined: Self = StObject.set(x, "minHandlingTimeInDays", js.undefined)
    
    inline def setMinTransitTimeInDays(value: Double): Self = StObject.set(x, "minTransitTimeInDays", value.asInstanceOf[js.Any])
    
    inline def setMinTransitTimeInDaysUndefined: Self = StObject.set(x, "minTransitTimeInDays", js.undefined)
    
    inline def setTransitTimeTable(value: SchemaTransitTable): Self = StObject.set(x, "transitTimeTable", value.asInstanceOf[js.Any])
    
    inline def setTransitTimeTableUndefined: Self = StObject.set(x, "transitTimeTable", js.undefined)
  }
}
