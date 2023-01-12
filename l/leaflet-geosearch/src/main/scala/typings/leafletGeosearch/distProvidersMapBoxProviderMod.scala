package typings.leafletGeosearch

import typings.leafletGeosearch.distProvidersProviderMod.ProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProvidersMapBoxProviderMod {
  
  @JSImport("leaflet-geosearch/dist/providers/mapBoxProvider", JSImport.Default)
  @js.native
  open class default () extends MapBoxProvider {
    def this(options: MapBoxProviderOptions) = this()
  }
  
  @js.native
  trait MapBoxProvider
    extends typings.leafletGeosearch.distProvidersProviderMod.default[RequestResult, RawResult] {
    
    var searchUrl: String = js.native
  }
  
  trait MapBoxProviderOptions
    extends StObject
       with ProviderOptions {
    
    var reverseUrl: js.UndefOr[String] = js.undefined
    
    var searchUrl: js.UndefOr[String] = js.undefined
  }
  object MapBoxProviderOptions {
    
    inline def apply(): MapBoxProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapBoxProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapBoxProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setReverseUrl(value: String): Self = StObject.set(x, "reverseUrl", value.asInstanceOf[js.Any])
      
      inline def setReverseUrlUndefined: Self = StObject.set(x, "reverseUrl", js.undefined)
      
      inline def setSearchUrl(value: String): Self = StObject.set(x, "searchUrl", value.asInstanceOf[js.Any])
      
      inline def setSearchUrlUndefined: Self = StObject.set(x, "searchUrl", js.undefined)
    }
  }
  
  trait RawResult extends StObject {
    
    var bbox: js.Tuple4[String, String, String, String]
    
    var center: js.Tuple2[String, String]
    
    var place_name: String
    
    var text: String
  }
  object RawResult {
    
    inline def apply(
      bbox: js.Tuple4[String, String, String, String],
      center: js.Tuple2[String, String],
      place_name: String,
      text: String
    ): RawResult = {
      val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], place_name = place_name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RawResult] (val x: Self) extends AnyVal {
      
      inline def setBbox(value: js.Tuple4[String, String, String, String]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setCenter(value: js.Tuple2[String, String]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setPlace_name(value: String): Self = StObject.set(x, "place_name", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestResult extends StObject {
    
    var features: js.Array[RawResult]
  }
  object RequestResult {
    
    inline def apply(features: js.Array[RawResult]): RequestResult = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestResult] (val x: Self) extends AnyVal {
      
      inline def setFeatures(value: js.Array[RawResult]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: RawResult*): Self = StObject.set(x, "features", js.Array(value*))
    }
  }
}
