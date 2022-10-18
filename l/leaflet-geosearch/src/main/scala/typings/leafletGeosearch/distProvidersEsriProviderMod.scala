package typings.leafletGeosearch

import typings.leafletGeosearch.anon.Attributes
import typings.leafletGeosearch.anon.LatestWkid
import typings.leafletGeosearch.anon.Xmax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProvidersEsriProviderMod {
  
  @JSImport("leaflet-geosearch/dist/providers/esriProvider", JSImport.Default)
  @js.native
  open class default () extends EsriProvider
  
  @js.native
  trait EsriProvider
    extends typings.leafletGeosearch.distProvidersProviderMod.default[RequestResult, RawResult] {
    
    var searchUrl: String = js.native
  }
  
  trait RawResult extends StObject {
    
    var extent: Xmax
    
    var feature: Attributes
    
    var name: String
  }
  object RawResult {
    
    inline def apply(extent: Xmax, feature: Attributes, name: String): RawResult = {
      val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawResult]
    }
    
    extension [Self <: RawResult](x: Self) {
      
      inline def setExtent(value: Xmax): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setFeature(value: Attributes): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestResult extends StObject {
    
    var locations: js.Array[RawResult]
    
    var spatialReference: LatestWkid
  }
  object RequestResult {
    
    inline def apply(locations: js.Array[RawResult], spatialReference: LatestWkid): RequestResult = {
      val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    extension [Self <: RequestResult](x: Self) {
      
      inline def setLocations(value: js.Array[RawResult]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: RawResult*): Self = StObject.set(x, "locations", js.Array(value*))
      
      inline def setSpatialReference(value: LatestWkid): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    }
  }
}
