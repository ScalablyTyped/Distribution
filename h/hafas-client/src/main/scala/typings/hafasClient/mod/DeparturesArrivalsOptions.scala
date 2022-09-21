package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeparturesArrivalsOptions extends StObject {
  
  /**
    * only show departures heading to this station
    * @default undefined
    */
  var direction: js.UndefOr[String] = js.undefined
  
  /**
    * show departures for the next n minutes
    * @default 120
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * departures at related stations
    * @default false
    */
  var includeRelatedStations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * language
    * @default en
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * filter by line ID
    * @default undefined
    */
  var line: js.UndefOr[String] = js.undefined
  
  /**
    * parse & expose lines at the stop/station?
    * @default false
    */
  var linesOfStops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * products
    * @default undefined
    */
  var products: js.UndefOr[Products] = js.undefined
  
  /**
    * parse & expose hints & warnings?
    * @default false
    */
  var remarks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * max. number of results; `null` means "whatever HAFAS wants"
    * @default 10
    */
  var results: js.UndefOr[Double] = js.undefined
  
  /**
    * fetch & parse previous/next stopovers?
    * @default false
    */
  var stopovers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * departure date, undefined corresponds to Date.Now
    * @default undefined
    */
  var when: js.UndefOr[js.Date] = js.undefined
}
object DeparturesArrivalsOptions {
  
  inline def apply(): DeparturesArrivalsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeparturesArrivalsOptions]
  }
  
  extension [Self <: DeparturesArrivalsOptions](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    inline def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    inline def setIncludeRelatedStations(value: Boolean): Self = StObject.set(x, "includeRelatedStations", value.asInstanceOf[js.Any])
    
    inline def setIncludeRelatedStationsUndefined: Self = StObject.set(x, "includeRelatedStations", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLinesOfStops(value: Boolean): Self = StObject.set(x, "linesOfStops", value.asInstanceOf[js.Any])
    
    inline def setLinesOfStopsUndefined: Self = StObject.set(x, "linesOfStops", js.undefined)
    
    inline def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setRemarks(value: Boolean): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    inline def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setStopovers(value: Boolean): Self = StObject.set(x, "stopovers", value.asInstanceOf[js.Any])
    
    inline def setStopoversUndefined: Self = StObject.set(x, "stopovers", js.undefined)
    
    inline def setSubStops(value: Boolean): Self = StObject.set(x, "subStops", value.asInstanceOf[js.Any])
    
    inline def setSubStopsUndefined: Self = StObject.set(x, "subStops", js.undefined)
    
    inline def setWhen(value: js.Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
