package typings.hafasClient.mod

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
    * age
    * @default none
    */
  var age: js.UndefOr[Double] = js.undefined
  
  /**
    * arrival date, departure and arrival are mutually exclusive.
    * @default undefined
    */
  var arrival: js.UndefOr[js.Date] = js.undefined
  
  /**
    * only bike-friendly journeys
    * @default false
    */
  var bike: js.UndefOr[Boolean] = js.undefined
  
  /**
    * departure date, undefined corresponds to Date.Now
    * @default undefined
    */
  var departure: js.UndefOr[js.Date] = js.undefined
  
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
    * firstClass
    * @default false
    */
  var firstClass: js.UndefOr[Boolean] = js.undefined
  
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
    *  LoyaltyCard
    *  @default none
    */
  var loyaltyCard: js.UndefOr[LoyaltyCard] = js.undefined
  
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
  var when: js.UndefOr[js.Date] = js.undefined
}
object JourneysOptions {
  
  inline def apply(): JourneysOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneysOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JourneysOptions] (val x: Self) extends AnyVal {
    
    inline def setAccessibility(value: String): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setArrival(value: js.Date): Self = StObject.set(x, "arrival", value.asInstanceOf[js.Any])
    
    inline def setArrivalUndefined: Self = StObject.set(x, "arrival", js.undefined)
    
    inline def setBike(value: Boolean): Self = StObject.set(x, "bike", value.asInstanceOf[js.Any])
    
    inline def setBikeUndefined: Self = StObject.set(x, "bike", js.undefined)
    
    inline def setDeparture(value: js.Date): Self = StObject.set(x, "departure", value.asInstanceOf[js.Any])
    
    inline def setDepartureUndefined: Self = StObject.set(x, "departure", js.undefined)
    
    inline def setEarlierThan(value: String): Self = StObject.set(x, "earlierThan", value.asInstanceOf[js.Any])
    
    inline def setEarlierThanUndefined: Self = StObject.set(x, "earlierThan", js.undefined)
    
    inline def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    inline def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    inline def setFirstClass(value: Boolean): Self = StObject.set(x, "firstClass", value.asInstanceOf[js.Any])
    
    inline def setFirstClassUndefined: Self = StObject.set(x, "firstClass", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLaterThan(value: String): Self = StObject.set(x, "laterThan", value.asInstanceOf[js.Any])
    
    inline def setLaterThanUndefined: Self = StObject.set(x, "laterThan", js.undefined)
    
    inline def setLoyaltyCard(value: LoyaltyCard): Self = StObject.set(x, "loyaltyCard", value.asInstanceOf[js.Any])
    
    inline def setLoyaltyCardUndefined: Self = StObject.set(x, "loyaltyCard", js.undefined)
    
    inline def setPolylines(value: Boolean): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    inline def setPolylinesUndefined: Self = StObject.set(x, "polylines", js.undefined)
    
    inline def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setRemarks(value: Boolean): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    inline def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setScheduledDays(value: Boolean): Self = StObject.set(x, "scheduledDays", value.asInstanceOf[js.Any])
    
    inline def setScheduledDaysUndefined: Self = StObject.set(x, "scheduledDays", js.undefined)
    
    inline def setStartWithWalking(value: Boolean): Self = StObject.set(x, "startWithWalking", value.asInstanceOf[js.Any])
    
    inline def setStartWithWalkingUndefined: Self = StObject.set(x, "startWithWalking", js.undefined)
    
    inline def setStopovers(value: Boolean): Self = StObject.set(x, "stopovers", value.asInstanceOf[js.Any])
    
    inline def setStopoversUndefined: Self = StObject.set(x, "stopovers", js.undefined)
    
    inline def setSubStops(value: Boolean): Self = StObject.set(x, "subStops", value.asInstanceOf[js.Any])
    
    inline def setSubStopsUndefined: Self = StObject.set(x, "subStops", js.undefined)
    
    inline def setTickets(value: Boolean): Self = StObject.set(x, "tickets", value.asInstanceOf[js.Any])
    
    inline def setTicketsUndefined: Self = StObject.set(x, "tickets", js.undefined)
    
    inline def setTransferTime(value: Double): Self = StObject.set(x, "transferTime", value.asInstanceOf[js.Any])
    
    inline def setTransferTimeUndefined: Self = StObject.set(x, "transferTime", js.undefined)
    
    inline def setTransfers(value: Double): Self = StObject.set(x, "transfers", value.asInstanceOf[js.Any])
    
    inline def setTransfersUndefined: Self = StObject.set(x, "transfers", js.undefined)
    
    inline def setVia(value: String): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
    
    inline def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
    
    inline def setWalkingSpeed(value: String): Self = StObject.set(x, "walkingSpeed", value.asInstanceOf[js.Any])
    
    inline def setWalkingSpeedUndefined: Self = StObject.set(x, "walkingSpeed", js.undefined)
    
    inline def setWhen(value: js.Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
