package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryTime extends js.Object {
  
  /** Business days cutoff time definition. If not configured the cutoff time will be defaulted to 8AM PST. */
  var cutoffTime: js.UndefOr[CutoffTime] = js.native
  
  /** The business days during which orders can be handled. If not provided, Monday to Friday business days will be assumed. */
  var handlingBusinessDayConfig: js.UndefOr[BusinessDayConfig] = js.native
  
  /** Holiday cutoff definitions. If configured, they specify order cutoff times for holiday-specific shipping. */
  var holidayCutoffs: js.UndefOr[js.Array[HolidayCutoff]] = js.native
  
  /** Maximum number of business days spent before an order is shipped. 0 means same day shipped, 1 means next day shipped. Must be greater than or equal to `minHandlingTimeInDays`. */
  var maxHandlingTimeInDays: js.UndefOr[Double] = js.native
  
  /** Maximum number of business days that is spent in transit. 0 means same day delivery, 1 means next day delivery. Must be greater than or equal to `minTransitTimeInDays`. */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.native
  
  /** Minimum number of business days spent before an order is shipped. 0 means same day shipped, 1 means next day shipped. */
  var minHandlingTimeInDays: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of business days that is spent in transit. 0 means same day delivery, 1 means next day delivery. Either `{min,max}TransitTimeInDays` or `transitTimeTable` must be
    * set, but not both.
    */
  var minTransitTimeInDays: js.UndefOr[Double] = js.native
  
  /** The business days during which orders can be in-transit. If not provided, Monday to Friday business days will be assumed. */
  var transitBusinessDayConfig: js.UndefOr[BusinessDayConfig] = js.native
  
  /** Transit time table, number of business days spent in transit based on row and column dimensions. Either `{min,max}TransitTimeInDays` or `transitTimeTable` can be set, but not both. */
  var transitTimeTable: js.UndefOr[TransitTable] = js.native
}
object DeliveryTime {
  
  @scala.inline
  def apply(): DeliveryTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryTime]
  }
  
  @scala.inline
  implicit class DeliveryTimeOps[Self <: DeliveryTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCutoffTime(value: CutoffTime): Self = this.set("cutoffTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCutoffTime: Self = this.set("cutoffTime", js.undefined)
    
    @scala.inline
    def setHandlingBusinessDayConfig(value: BusinessDayConfig): Self = this.set("handlingBusinessDayConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlingBusinessDayConfig: Self = this.set("handlingBusinessDayConfig", js.undefined)
    
    @scala.inline
    def setHolidayCutoffsVarargs(value: HolidayCutoff*): Self = this.set("holidayCutoffs", js.Array(value :_*))
    
    @scala.inline
    def setHolidayCutoffs(value: js.Array[HolidayCutoff]): Self = this.set("holidayCutoffs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHolidayCutoffs: Self = this.set("holidayCutoffs", js.undefined)
    
    @scala.inline
    def setMaxHandlingTimeInDays(value: Double): Self = this.set("maxHandlingTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHandlingTimeInDays: Self = this.set("maxHandlingTimeInDays", js.undefined)
    
    @scala.inline
    def setMaxTransitTimeInDays(value: Double): Self = this.set("maxTransitTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTransitTimeInDays: Self = this.set("maxTransitTimeInDays", js.undefined)
    
    @scala.inline
    def setMinHandlingTimeInDays(value: Double): Self = this.set("minHandlingTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHandlingTimeInDays: Self = this.set("minHandlingTimeInDays", js.undefined)
    
    @scala.inline
    def setMinTransitTimeInDays(value: Double): Self = this.set("minTransitTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTransitTimeInDays: Self = this.set("minTransitTimeInDays", js.undefined)
    
    @scala.inline
    def setTransitBusinessDayConfig(value: BusinessDayConfig): Self = this.set("transitBusinessDayConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitBusinessDayConfig: Self = this.set("transitBusinessDayConfig", js.undefined)
    
    @scala.inline
    def setTransitTimeTable(value: TransitTable): Self = this.set("transitTimeTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitTimeTable: Self = this.set("transitTimeTable", js.undefined)
  }
}
