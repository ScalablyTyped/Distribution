package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONSourceOptions
  extends StObject
     with GeoJSONSourceSpecification {
  
  var collectResourceTiming: Boolean
  
  var workerOptions: js.UndefOr[Any] = js.undefined
}
object GeoJSONSourceOptions {
  
  inline def apply(collectResourceTiming: Boolean): GeoJSONSourceOptions = {
    val __obj = js.Dynamic.literal(collectResourceTiming = collectResourceTiming.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[GeoJSONSourceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoJSONSourceOptions] (val x: Self) extends AnyVal {
    
    inline def setCollectResourceTiming(value: Boolean): Self = StObject.set(x, "collectResourceTiming", value.asInstanceOf[js.Any])
    
    inline def setWorkerOptions(value: Any): Self = StObject.set(x, "workerOptions", value.asInstanceOf[js.Any])
    
    inline def setWorkerOptionsUndefined: Self = StObject.set(x, "workerOptions", js.undefined)
  }
}
