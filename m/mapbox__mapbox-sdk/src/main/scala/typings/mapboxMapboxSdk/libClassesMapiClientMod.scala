package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.libClassesMapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.libClassesMapiRequestMod.MapiRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassesMapiClientMod {
  
  @JSImport("@mapbox/mapbox-sdk/lib/classes/mapi-client", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MapiClient {
    def this(config: SdkConfig) = this()
    
    /* CompleteClass */
    var accessToken: String = js.native
    
    /* CompleteClass */
    override def createRequest(requestOptions: MapiRequestOptions): MapiRequest[Any] = js.native
  }
  
  trait MapiClient extends StObject {
    
    var accessToken: String
    
    def createRequest(requestOptions: MapiRequestOptions): MapiRequest[Any]
    
    var origin: js.UndefOr[String] = js.undefined
  }
  object MapiClient {
    
    inline def apply(accessToken: String, createRequest: MapiRequestOptions => MapiRequest[Any]): MapiClient = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], createRequest = js.Any.fromFunction1(createRequest))
      __obj.asInstanceOf[MapiClient]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapiClient] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setCreateRequest(value: MapiRequestOptions => MapiRequest[Any]): Self = StObject.set(x, "createRequest", js.Any.fromFunction1(value))
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
  
  trait SdkConfig extends StObject {
    
    var accessToken: String
    
    var origin: js.UndefOr[String] = js.undefined
  }
  object SdkConfig {
    
    inline def apply(accessToken: String): SdkConfig = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[SdkConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SdkConfig] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
}
