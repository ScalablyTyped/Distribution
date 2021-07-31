package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryTime extends StObject {
  
  /** Business days cutoff time definition. If not configured the cutoff time will be defaulted to 8AM PST. */
  var cutoffTime: js.UndefOr[CutoffTime] = js.undefined
  
  /** The business days during which orders can be handled. If not provided, Monday to Friday business days will be assumed. */
  var handlingBusinessDayConfig: js.UndefOr[BusinessDayConfig] = js.undefined
  
  /** Holiday cutoff definitions. If configured, they specify order cutoff times for holiday-specific shipping. */
  var holidayCutoffs: js.UndefOr[js.Array[HolidayCutoff]] = js.undefined
  
  /** Maximum number of business days spent before an order is shipped. 0 means same day shipped, 1 means next day shipped. Must be greater than or equal to `minHandlingTimeInDays`. */
  var maxHandlingTimeInDays: js.UndefOr[Double] = js.undefined
  
  /** Maximum number of business days that is spent in transit. 0 means same day delivery, 1 means next day delivery. Must be greater than or equal to `minTransitTimeInDays`. */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.undefined
  
  /** Minimum number of business days spent before an order is shipped. 0 means same day shipped, 1 means next day shipped. */
  var minHandlingTimeInDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of business days that is spent in transit. 0 means same day delivery, 1 means next day delivery. Either `{min,max}TransitTimeInDays` or `transitTimeTable` must be
    * set, but not both.
    */
  var minTransitTimeInDays: js.UndefOr[Double] = js.undefined
  
  /** The business days during which orders can be in-transit. If not provided, Monday to Friday business days will be assumed. */
  var transitBusinessDayConfig: js.UndefOr[BusinessDayConfig] = js.undefined
  
  /** Transit time table, number of business days spent in transit based on row and column dimensions. Either `{min,max}TransitTimeInDays` or `transitTimeTable` can be set, but not both. */
  var transitTimeTable: js.UndefOr[TransitTable] = js.undefined
}
object DeliveryTime {
  
  @scala.inline
  def apply(): DeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryTime]
  }
  
  @scala.inline
  implicit class DeliveryTimeMutableBuilder[Self <: DeliveryTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCutoffTime(value: CutoffTime): Self = StObject.set(x, "cutoffTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCutoffTimeUndefined: Self = StObject.set(x, "cutoffTime", js.undefined)
    
    @scala.inline
    def setHandlingBusinessDayConfig(value: BusinessDayConfig): Self = StObject.set(x, "handlingBusinessDayConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlingBusinessDayConfigUndefined: Self = StObject.set(x, "handlingBusinessDayConfig", js.undefined)
    
    @scala.inline
    def setHolidayCutoffs(value: js.Array[HolidayCutoff]): Self = StObject.set(x, "holidayCutoffs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolidayCutoffsUndefined: Self = StObject.set(x, "holidayCutoffs", js.undefined)
    
    @scala.inline
    def setHolidayCutoffsVarargs(value: HolidayCutoff*): Self = StObject.set(x, "holidayCutoffs", js.Array(value :_*))
    
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
    def setTransitBusinessDayConfig(value: BusinessDayConfig): Self = StObject.set(x, "transitBusinessDayConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitBusinessDayConfigUndefined: Self = StObject.set(x, "transitBusinessDayConfig", js.undefined)
    
    @scala.inline
    def setTransitTimeTable(value: TransitTable): Self = StObject.set(x, "transitTimeTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitTimeTableUndefined: Self = StObject.set(x, "transitTimeTable", js.undefined)
  }
}
