package typings.hafasClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JourneysOptions extends js.Object {
  
  /**
    * 'none', 'partial' or 'complete'
    *  @default none
    */
  var accessibility: js.UndefOr[String] = js.native
  
  /**
    * arrival date, departure and arrival are mutually exclusive.
    * @default undefined
    */
  var arrival: js.UndefOr[Date] = js.native
  
  /**
    * only bike-friendly journeys
    * @default false
    */
  var bike: js.UndefOr[Boolean] = js.native
  
  /**
    * departure date, undefined corresponds to Date.Now
    * @default undefined
    */
  var departure: js.UndefOr[Date] = js.native
  
  /**
    * earlierThan, use {@link Journeys#earlierRef}, earlierThan and departure/arrival are mutually exclusive.
    * @default undefined
    */
  var earlierThan: js.UndefOr[String] = js.native
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.native
  
  /**
    * language to get results in
    * @default en
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * laterThan, use {@link Journeys#laterRef}, laterThan and departure/arrival are mutually exclusive.
    *  @default undefined
    */
  var laterThan: js.UndefOr[String] = js.native
  
  /**
    * return a shape for each leg?
    * @default false
    */
  var polylines: js.UndefOr[Boolean] = js.native
  
  var products: js.UndefOr[Products] = js.native
  
  /**
    * parse & expose hints & warnings?
    * @default true
    */
  var remarks: js.UndefOr[Boolean] = js.native
  
  /**
    * how many search results?
    * @default 3
    */
  var results: js.UndefOr[Double] = js.native
  
  /**
    * parse which days each journey is valid on
    * @default false
    */
  var scheduledDays: js.UndefOr[Boolean] = js.native
  
  /**
    * start with walking
    * @default false
    */
  var startWithWalking: js.UndefOr[Boolean] = js.native
  
  /**
    * return stations on the way?
    * @default false
    */
  var stopovers: js.UndefOr[Boolean] = js.native
  
  /**
    * parse & expose sub-stops of stations?
    * @default false
    */
  var subStops: js.UndefOr[Boolean] = js.native
  
  /**
    * return tickets? only available with some profiles
    * @default false
    */
  var tickets: js.UndefOr[Boolean] = js.native
  
  /**
    * minimum time for a single transfer in minutes
    * @default 10
    */
  var transferTime: js.UndefOr[Double] = js.native
  
  /**
    * Maximum nr of transfers. Default: Let HAFAS decide.
    * @default 10
    */
  var transfers: js.UndefOr[Double] = js.native
  
  /**
    * let journeys pass this station
    * @default undefined
    */
  var via: js.UndefOr[String] = js.native
  
  /**
    * 'slow', 'normal', 'fast'
    * @default slow
    */
  var walkingSpeed: js.UndefOr[String] = js.native
  
  /**
    * @deprecated
    */
  var when: js.UndefOr[Date] = js.native
}
object JourneysOptions {
  
  @scala.inline
  def apply(): JourneysOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneysOptions]
  }
  
  @scala.inline
  implicit class JourneysOptionsOps[Self <: JourneysOptions] (val x: Self) extends AnyVal {
    
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
    def setAccessibility(value: String): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    
    @scala.inline
    def setArrival(value: Date): Self = this.set("arrival", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrival: Self = this.set("arrival", js.undefined)
    
    @scala.inline
    def setBike(value: Boolean): Self = this.set("bike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBike: Self = this.set("bike", js.undefined)
    
    @scala.inline
    def setDeparture(value: Date): Self = this.set("departure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeparture: Self = this.set("departure", js.undefined)
    
    @scala.inline
    def setEarlierThan(value: String): Self = this.set("earlierThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarlierThan: Self = this.set("earlierThan", js.undefined)
    
    @scala.inline
    def setEntrances(value: Boolean): Self = this.set("entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntrances: Self = this.set("entrances", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLaterThan(value: String): Self = this.set("laterThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaterThan: Self = this.set("laterThan", js.undefined)
    
    @scala.inline
    def setPolylines(value: Boolean): Self = this.set("polylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylines: Self = this.set("polylines", js.undefined)
    
    @scala.inline
    def setProducts(value: Products): Self = this.set("products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
    
    @scala.inline
    def setRemarks(value: Boolean): Self = this.set("remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarks: Self = this.set("remarks", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setScheduledDays(value: Boolean): Self = this.set("scheduledDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledDays: Self = this.set("scheduledDays", js.undefined)
    
    @scala.inline
    def setStartWithWalking(value: Boolean): Self = this.set("startWithWalking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartWithWalking: Self = this.set("startWithWalking", js.undefined)
    
    @scala.inline
    def setStopovers(value: Boolean): Self = this.set("stopovers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopovers: Self = this.set("stopovers", js.undefined)
    
    @scala.inline
    def setSubStops(value: Boolean): Self = this.set("subStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubStops: Self = this.set("subStops", js.undefined)
    
    @scala.inline
    def setTickets(value: Boolean): Self = this.set("tickets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickets: Self = this.set("tickets", js.undefined)
    
    @scala.inline
    def setTransferTime(value: Double): Self = this.set("transferTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferTime: Self = this.set("transferTime", js.undefined)
    
    @scala.inline
    def setTransfers(value: Double): Self = this.set("transfers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransfers: Self = this.set("transfers", js.undefined)
    
    @scala.inline
    def setVia(value: String): Self = this.set("via", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVia: Self = this.set("via", js.undefined)
    
    @scala.inline
    def setWalkingSpeed(value: String): Self = this.set("walkingSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWalkingSpeed: Self = this.set("walkingSpeed", js.undefined)
    
    @scala.inline
    def setWhen(value: Date): Self = this.set("when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
}
