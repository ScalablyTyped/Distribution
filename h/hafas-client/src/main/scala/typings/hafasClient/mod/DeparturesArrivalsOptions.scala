package typings.hafasClient.mod

import typings.std.Date
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
    * parse & expose lines at the stop/station?
    * @default false
    */
  var linesOfStops: js.UndefOr[Boolean] = js.undefined
  
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
  var when: js.UndefOr[Date] = js.undefined
}
object DeparturesArrivalsOptions {
  
  @scala.inline
  def apply(): DeparturesArrivalsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeparturesArrivalsOptions]
  }
  
  @scala.inline
  implicit class DeparturesArrivalsOptionsMutableBuilder[Self <: DeparturesArrivalsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    @scala.inline
    def setIncludeRelatedStations(value: Boolean): Self = StObject.set(x, "includeRelatedStations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRelatedStationsUndefined: Self = StObject.set(x, "includeRelatedStations", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLinesOfStops(value: Boolean): Self = StObject.set(x, "linesOfStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesOfStopsUndefined: Self = StObject.set(x, "linesOfStops", js.undefined)
    
    @scala.inline
    def setRemarks(value: Boolean): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setStopovers(value: Boolean): Self = StObject.set(x, "stopovers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopoversUndefined: Self = StObject.set(x, "stopovers", js.undefined)
    
    @scala.inline
    def setSubStops(value: Boolean): Self = StObject.set(x, "subStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubStopsUndefined: Self = StObject.set(x, "subStops", js.undefined)
    
    @scala.inline
    def setWhen(value: Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
