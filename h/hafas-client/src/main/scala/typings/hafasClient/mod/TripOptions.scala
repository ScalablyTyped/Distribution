package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TripOptions extends StObject {
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Language of the results
    * @default en
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * return a shape for the trip?
    * @default false
    */
  var polyline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * parse & expose hints & warnings?
    * @default true
    */
  var remarks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * return stations on the way?
    * @default true
    */
  var stopovers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
}
object TripOptions {
  
  @scala.inline
  def apply(): TripOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripOptions]
  }
  
  @scala.inline
  implicit class TripOptionsMutableBuilder[Self <: TripOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setPolyline(value: Boolean): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
    
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
  }
}
