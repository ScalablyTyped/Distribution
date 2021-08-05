package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataResource extends StObject {
  
  var dimensions: DimensionsResource
  
  var metrics: MetricsResource
}
object MetadataResource {
  
  inline def apply(dimensions: DimensionsResource, metrics: MetricsResource): MetadataResource = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataResource]
  }
  
  extension [Self <: MetadataResource](x: Self) {
    
    inline def setDimensions(value: DimensionsResource): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: MetricsResource): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
  }
}
