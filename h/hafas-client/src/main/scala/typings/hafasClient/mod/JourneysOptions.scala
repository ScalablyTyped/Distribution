package typings.hafasClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneysOptions extends StObject {
  
  /**
    * 'none', 'partial' or 'complete'
    *  @default none
    */
  var accessibility: js.UndefOr[String] = js.undefined
  
  /**
    * arrival date, departure and arrival are mutually exclusive.
    * @default undefined
    */
  var arrival: js.UndefOr[Date] = js.undefined
  
  /**
    * only bike-friendly journeys
    * @default false
    */
  var bike: js.UndefOr[Boolean] = js.undefined
  
  /**
    * departure date, undefined corresponds to Date.Now
    * @default undefined
    */
  var departure: js.UndefOr[Date] = js.undefined
  
  /**
    * earlierThan, use {@link Journeys#earlierRef}, earlierThan and departure/arrival are mutually exclusive.
    * @default undefined
    */
  var earlierThan: js.UndefOr[String] = js.undefined
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * language to get results in
    * @default en
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * laterThan, use {@link Journeys#laterRef}, laterThan and departure/arrival are mutually exclusive.
    *  @default undefined
    */
  var laterThan: js.UndefOr[String] = js.undefined
  
  /**
    * return a shape for each leg?
    * @default false
    */
  var polylines: js.UndefOr[Boolean] = js.undefined
  
  var products: js.UndefOr[Products] = js.undefined
  
  /**
    * parse & expose hints & warnings?
    * @default true
    */
  var remarks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * how many search results?
    * @default 3
    */
  var results: js.UndefOr[Double] = js.undefined
  
  /**
    * parse which days each journey is valid on
    * @default false
    */
  var scheduledDays: js.UndefOr[Boolean] = js.undefined
  
  /**
    * start with walking
    * @default false
    */
  var startWithWalking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * return stations on the way?
    * @default false
    */
  var stopovers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * parse & expose sub-stops of stations?
    * @default false
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * return tickets? only available with some profiles
    * @default false
    */
  var tickets: js.UndefOr[Boolean] = js.undefined
  
  /**
    * minimum time for a single transfer in minutes
    * @default 10
    */
  var transferTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum nr of transfers. Default: Let HAFAS decide.
    * @default 10
    */
  var transfers: js.UndefOr[Double] = js.undefined
  
  /**
    * let journeys pass this station
    * @default undefined
    */
  var via: js.UndefOr[String] = js.undefined
  
  /**
    * 'slow', 'normal', 'fast'
    * @default slow
    */
  var walkingSpeed: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated
    */
  var when: js.UndefOr[Date] = js.undefined
}
object JourneysOptions {
  
  @scala.inline
  def apply(): JourneysOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneysOptions]
  }
  
  @scala.inline
  implicit class JourneysOptionsMutableBuilder[Self <: JourneysOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: String): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setArrival(value: Date): Self = StObject.set(x, "arrival", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrivalUndefined: Self = StObject.set(x, "arrival", js.undefined)
    
    @scala.inline
    def setBike(value: Boolean): Self = StObject.set(x, "bike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBikeUndefined: Self = StObject.set(x, "bike", js.undefined)
    
    @scala.inline
    def setDeparture(value: Date): Self = StObject.set(x, "departure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartureUndefined: Self = StObject.set(x, "departure", js.undefined)
    
    @scala.inline
    def setEarlierThan(value: String): Self = StObject.set(x, "earlierThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEarlierThanUndefined: Self = StObject.set(x, "earlierThan", js.undefined)
    
    @scala.inline
    def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLaterThan(value: String): Self = StObject.set(x, "laterThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaterThanUndefined: Self = StObject.set(x, "laterThan", js.undefined)
    
    @scala.inline
    def setPolylines(value: Boolean): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylinesUndefined: Self = StObject.set(x, "polylines", js.undefined)
    
    @scala.inline
    def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setRemarks(value: Boolean): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setScheduledDays(value: Boolean): Self = StObject.set(x, "scheduledDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledDaysUndefined: Self = StObject.set(x, "scheduledDays", js.undefined)
    
    @scala.inline
    def setStartWithWalking(value: Boolean): Self = StObject.set(x, "startWithWalking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartWithWalkingUndefined: Self = StObject.set(x, "startWithWalking", js.undefined)
    
    @scala.inline
    def setStopovers(value: Boolean): Self = StObject.set(x, "stopovers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopoversUndefined: Self = StObject.set(x, "stopovers", js.undefined)
    
    @scala.inline
    def setSubStops(value: Boolean): Self = StObject.set(x, "subStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubStopsUndefined: Self = StObject.set(x, "subStops", js.undefined)
    
    @scala.inline
    def setTickets(value: Boolean): Self = StObject.set(x, "tickets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicketsUndefined: Self = StObject.set(x, "tickets", js.undefined)
    
    @scala.inline
    def setTransferTime(value: Double): Self = StObject.set(x, "transferTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferTimeUndefined: Self = StObject.set(x, "transferTime", js.undefined)
    
    @scala.inline
    def setTransfers(value: Double): Self = StObject.set(x, "transfers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfersUndefined: Self = StObject.set(x, "transfers", js.undefined)
    
    @scala.inline
    def setVia(value: String): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
    
    @scala.inline
    def setWalkingSpeed(value: String): Self = StObject.set(x, "walkingSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalkingSpeedUndefined: Self = StObject.set(x, "walkingSpeed", js.undefined)
    
    @scala.inline
    def setWhen(value: Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
