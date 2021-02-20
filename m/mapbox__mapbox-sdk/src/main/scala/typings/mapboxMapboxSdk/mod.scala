package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/mapbox-sdk/lib/classes/mapi-client", JSImport.Default)
  @js.native
  class default protected () extends MapiClient {
    def this(config: SdkConfig) = this()
  }
  
  @js.native
  trait MapiClient extends StObject {
    
    var accessToken: String = js.native
    
    def createRequest(requestOptions: js.Any): MapiRequest = js.native
    
    var origin: js.UndefOr[String] = js.native
  }
  object MapiClient {
    
    @scala.inline
    def apply(accessToken: String, createRequest: js.Any => MapiRequest): MapiClient = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], createRequest = js.Any.fromFunction1(createRequest))
      __obj.asInstanceOf[MapiClient]
    }
    
    @scala.inline
    implicit class MapiClientMutableBuilder[Self <: MapiClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateRequest(value: js.Any => MapiRequest): Self = StObject.set(x, "createRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
  
  @js.native
  trait SdkConfig extends StObject {
    
    var accessToken: String = js.native
    
    var origin: js.UndefOr[String] = js.native
  }
  object SdkConfig {
    
    @scala.inline
    def apply(accessToken: String): SdkConfig = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[SdkConfig]
    }
    
    @scala.inline
    implicit class SdkConfigMutableBuilder[Self <: SdkConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
}
