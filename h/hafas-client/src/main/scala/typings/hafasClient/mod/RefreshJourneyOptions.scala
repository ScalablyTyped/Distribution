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
  
  @scala.inline
  def apply(): RefreshJourneyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshJourneyOptions]
  }
  
  @scala.inline
  implicit class RefreshJourneyOptionsMutableBuilder[Self <: RefreshJourneyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setPolylines(value: Boolean): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylinesUndefined: Self = StObject.set(x, "polylines", js.undefined)
    
    @scala.inline
    def setRemarks(value: Boolean): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
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
  }
}
