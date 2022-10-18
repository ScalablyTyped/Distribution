package typings.leafletGeosearch

import typings.leafletGeosearch.anon.Accuracy
import typings.leafletGeosearch.anon.Coordinates
import typings.leafletGeosearch.distProvidersProviderMod.ProviderOptions
import typings.leafletGeosearch.leafletGeosearchStrings.Feature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProvidersPeliasProviderMod {
  
  @JSImport("leaflet-geosearch/dist/providers/peliasProvider", JSImport.Default)
  @js.native
  open class default () extends PeliasProvider {
    def this(options: PeliasProviderOptions) = this()
  }
  
  @js.native
  trait PeliasProvider
    extends typings.leafletGeosearch.distProvidersProviderMod.default[RequestResult, RawResult] {
    
    var host: String = js.native
  }
  
  trait PeliasProviderOptions
    extends StObject
       with ProviderOptions {
    
    var host: js.UndefOr[String] = js.undefined
  }
  object PeliasProviderOptions {
    
    inline def apply(): PeliasProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeliasProviderOptions]
    }
    
    extension [Self <: PeliasProviderOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    }
  }
  
  trait RawResult extends StObject {
    
    var bbox: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
    
    var geometry: Coordinates
    
    var properties: Accuracy
    
    var `type`: Feature
  }
  object RawResult {
    
    inline def apply(geometry: Coordinates, properties: Accuracy): RawResult = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Feature")
      __obj.asInstanceOf[RawResult]
    }
    
    extension [Self <: RawResult](x: Self) {
      
      inline def setBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setGeometry(value: Coordinates): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Accuracy): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: Feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestResult extends StObject {
    
    var features: js.Array[RawResult]
    
    var geocoding: js.Object
  }
  object RequestResult {
    
    inline def apply(features: js.Array[RawResult], geocoding: js.Object): RequestResult = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], geocoding = geocoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    extension [Self <: RequestResult](x: Self) {
      
      inline def setFeatures(value: js.Array[RawResult]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: RawResult*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setGeocoding(value: js.Object): Self = StObject.set(x, "geocoding", value.asInstanceOf[js.Any])
    }
  }
}
