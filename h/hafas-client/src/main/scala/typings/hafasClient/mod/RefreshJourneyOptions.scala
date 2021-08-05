package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshJourneyOptions extends StObject {
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * language
    * @default en
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * return a shape for each leg?
    * @default false
    */
  var polylines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * parse & expose hints & warnings?
    * @default true
    */
  var remarks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * return stations on the way?
    * @default false
    */
  var stopovers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * return tickets? only available with some profiles
    * @default false
    */
  var tickets: js.UndefOr[Boolean] = js.undefined
}
object RefreshJourneyOptions {
  
  inline def apply(): RefreshJourneyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshJourneyOptions]
  }
  
  extension [Self <: RefreshJourneyOptions](x: Self) {
    
    inline def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    inline def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPolylines(value: Boolean): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    inline def setPolylinesUndefined: Self = StObject.set(x, "polylines", js.undefined)
    
    inline def setRemarks(value: Boolean): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    inline def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    inline def setStopovers(value: Boolean): Self = StObject.set(x, "stopovers", value.asInstanceOf[js.Any])
    
    inline def setStopoversUndefined: Self = StObject.set(x, "stopovers", js.undefined)
    
    inline def setSubStops(value: Boolean): Self = StObject.set(x, "subStops", value.asInstanceOf[js.Any])
    
    inline def setSubStopsUndefined: Self = StObject.set(x, "subStops", js.undefined)
    
    inline def setTickets(value: Boolean): Self = StObject.set(x, "tickets", value.asInstanceOf[js.Any])
    
    inline def setTicketsUndefined: Self = StObject.set(x, "tickets", js.undefined)
  }
}
