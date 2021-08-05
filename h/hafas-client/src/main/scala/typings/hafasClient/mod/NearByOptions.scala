package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NearByOptions extends StObject {
  
  /**
    * maximum walking distance in meters
    * @default undefined
    */
  var distance: js.UndefOr[Double] = js.undefined
  
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
    * parse & expose lines at each stop/station?
    * @default false
    */
  var linesOfStops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * return points of interest?
    * @default false
    */
  var poi: js.UndefOr[Boolean] = js.undefined
  
  /**
    * maximum number of results
    * @default 8
    */
  var results: js.UndefOr[Double] = js.undefined
  
  /**
    * return stops/stations?
    * @default true
    */
  var stops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
}
object NearByOptions {
  
  inline def apply(): NearByOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NearByOptions]
  }
  
  extension [Self <: NearByOptions](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    inline def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLinesOfStops(value: Boolean): Self = StObject.set(x, "linesOfStops", value.asInstanceOf[js.Any])
    
    inline def setLinesOfStopsUndefined: Self = StObject.set(x, "linesOfStops", js.undefined)
    
    inline def setPoi(value: Boolean): Self = StObject.set(x, "poi", value.asInstanceOf[js.Any])
    
    inline def setPoiUndefined: Self = StObject.set(x, "poi", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setStops(value: Boolean): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setSubStops(value: Boolean): Self = StObject.set(x, "subStops", value.asInstanceOf[js.Any])
    
    inline def setSubStopsUndefined: Self = StObject.set(x, "subStops", js.undefined)
  }
}
