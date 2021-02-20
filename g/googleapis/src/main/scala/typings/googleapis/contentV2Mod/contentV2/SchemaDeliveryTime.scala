package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDeliveryTime extends StObject {
  
  /**
    * Business days cutoff time definition. If not configured the cutoff time
    * will be defaulted to 8AM PST.
    */
  var cutoffTime: js.UndefOr[SchemaCutoffTime] = js.native
  
  /**
    * Holiday cutoff definitions. If configured, they specify order cutoff
    * times for holiday-specific shipping.
    */
  var holidayCutoffs: js.UndefOr[js.Array[SchemaHolidayCutoff]] = js.native
  
  /**
    * Maximum number of business days spent before an order is shipped. 0 means
    * same day shipped, 1 means next day shipped. Must be greater than or equal
    * to minHandlingTimeInDays.
    */
  var maxHandlingTimeInDays: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of business days that is spent in transit. 0 means same
    * day delivery, 1 means next day delivery. Must be greater than or equal to
    * minTransitTimeInDays.
    */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of business days spent before an order is shipped. 0 means
    * same day shipped, 1 means next day shipped.
    */
  var minHandlingTimeInDays: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of business days that is spent in transit. 0 means same
    * day delivery, 1 means next day delivery. Either
    * {min,max}transitTimeInDays or transitTimeTable must be set, but not both.
    */
  var minTransitTimeInDays: js.UndefOr[Double] = js.native
  
  /**
    * Transit time table, number of business days spent in transit based on row
    * and column dimensions. Either {min,max}transitTimeInDays or
    * transitTimeTable can be set, but not both.
    */
  var transitTimeTable: js.UndefOr[SchemaTransitTable] = js.native
}
object SchemaDeliveryTime {
  
  @scala.inline
  def apply(): SchemaDeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryTime]
  }
  
  @scala.inline
  implicit class SchemaDeliveryTimeMutableBuilder[Self <: SchemaDeliveryTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCutoffTime(value: SchemaCutoffTime): Self = StObject.set(x, "cutoffTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCutoffTimeUndefined: Self = StObject.set(x, "cutoffTime", js.undefined)
    
    @scala.inline
    def setHolidayCutoffs(value: js.Array[SchemaHolidayCutoff]): Self = StObject.set(x, "holidayCutoffs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolidayCutoffsUndefined: Self = StObject.set(x, "holidayCutoffs", js.undefined)
    
    @scala.inline
    def setHolidayCutoffsVarargs(value: SchemaHolidayCutoff*): Self = StObject.set(x, "holidayCutoffs", js.Array(value :_*))
    
    @scala.inline
    def setMaxHandlingTimeInDays(value: Double): Self = StObject.set(x, "maxHandlingTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHandlingTimeInDaysUndefined: Self = StObject.set(x, "maxHandlingTimeInDays", js.undefined)
    
    @scala.inline
    def setMaxTransitTimeInDays(value: Double): Self = StObject.set(x, "maxTransitTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTransitTimeInDaysUndefined: Self = StObject.set(x, "maxTransitTimeInDays", js.undefined)
    
    @scala.inline
    def setMinHandlingTimeInDays(value: Double): Self = StObject.set(x, "minHandlingTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHandlingTimeInDaysUndefined: Self = StObject.set(x, "minHandlingTimeInDays", js.undefined)
    
    @scala.inline
    def setMinTransitTimeInDays(value: Double): Self = StObject.set(x, "minTransitTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTransitTimeInDaysUndefined: Self = StObject.set(x, "minTransitTimeInDays", js.undefined)
    
    @scala.inline
    def setTransitTimeTable(value: SchemaTransitTable): Self = StObject.set(x, "transitTimeTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitTimeTableUndefined: Self = StObject.set(x, "transitTimeTable", js.undefined)
  }
}
