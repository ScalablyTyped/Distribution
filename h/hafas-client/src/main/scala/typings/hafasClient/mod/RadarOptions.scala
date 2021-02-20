package typings.hafasClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadarOptions extends StObject {
  
  /**
    * compute frames for the next n seconds
    * @default 20
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.native
  
  /**
    * nr of frames to compute
    * @default 3
    */
  var frames: js.UndefOr[Double] = js.native
  
  /**
    * return a shape for the trip?
    * @default false
    */
  var polylines: js.UndefOr[Boolean] = js.native
  
  /**
    * optionally an object of booleans
    * @default null
    */
  var products: js.UndefOr[Boolean | js.Object] = js.native
  
  /**
    * maximum number of vehicles
    * @default 256
    */
  var results: js.UndefOr[Double] = js.native
  
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.native
  
  /**
    * when
    * @default undefined
    */
  var when: js.UndefOr[Date] = js.native
}
object RadarOptions {
  
  @scala.inline
  def apply(): RadarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarOptions]
  }
  
  @scala.inline
  implicit class RadarOptionsMutableBuilder[Self <: RadarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    @scala.inline
    def setFrames(value: Double): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setPolylines(value: Boolean): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylinesUndefined: Self = StObject.set(x, "polylines", js.undefined)
    
    @scala.inline
    def setProducts(value: Boolean | js.Object): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
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
