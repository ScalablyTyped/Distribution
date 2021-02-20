package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NearByOptions extends StObject {
  
  /**
    * maximum walking distance in meters
    * @default undefined
    */
  var distance: js.UndefOr[Double] = js.native
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.native
  
  /**
    * language
    * @default en
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * parse & expose lines at each stop/station?
    * @default false
    */
  var linesOfStops: js.UndefOr[Boolean] = js.native
  
  /**
    * return points of interest?
    * @default false
    */
  var poi: js.UndefOr[Boolean] = js.native
  
  /**
    * maximum number of results
    * @default 8
    */
  var results: js.UndefOr[Double] = js.native
  
  /**
    * return stops/stations?
    * @default true
    */
  var stops: js.UndefOr[Boolean] = js.native
  
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.native
}
object NearByOptions {
  
  @scala.inline
  def apply(): NearByOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NearByOptions]
  }
  
  @scala.inline
  implicit class NearByOptionsMutableBuilder[Self <: NearByOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLinesOfStops(value: Boolean): Self = StObject.set(x, "linesOfStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesOfStopsUndefined: Self = StObject.set(x, "linesOfStops", js.undefined)
    
    @scala.inline
    def setPoi(value: Boolean): Self = StObject.set(x, "poi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoiUndefined: Self = StObject.set(x, "poi", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setStops(value: Boolean): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setSubStops(value: Boolean): Self = StObject.set(x, "subStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubStopsUndefined: Self = StObject.set(x, "subStops", js.undefined)
  }
}
