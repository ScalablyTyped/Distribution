package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsOptions extends StObject {
  
  /**
    * return addresses
    * @default false
    */
  var addresses: js.UndefOr[Boolean] = js.undefined
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * find only exact matches?
    * @default true
    */
  var fuzzy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Language of the results
    * @default en
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * parse & expose lines at each stop/station?
    * @default false
    */
  var linesOfStops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * points of interest
    * @default true
    */
  var poi: js.UndefOr[Boolean] = js.undefined
  
  /**
    * how many search results?
    * @default 10
    */
  var results: js.UndefOr[Double] = js.undefined
  
  /**
    * return stops/stations?
    * @default true
    */
  var stops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * parse & expose sub-stops of stations?
    * @default false
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
}
object LocationsOptions {
  
  inline def apply(): LocationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationsOptions]
  }
  
  extension [Self <: LocationsOptions](x: Self) {
    
    inline def setAddresses(value: Boolean): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    inline def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    inline def setFuzzy(value: Boolean): Self = StObject.set(x, "fuzzy", value.asInstanceOf[js.Any])
    
    inline def setFuzzyUndefined: Self = StObject.set(x, "fuzzy", js.undefined)
    
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
