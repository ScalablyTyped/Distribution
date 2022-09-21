package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepLinkData extends StObject {
  
  /** Application ID (or project ID) from Google API Console. */
  var appId: js.UndefOr[String] = js.undefined
  
  /** The data for a Google API Console client is entered by a developer during client registration and is stored in PackagingService. */
  var client: js.UndefOr[js.Array[PackagingServiceClient]] = js.undefined
  
  /**
    * The ID for non-URL content. Embeds may either have no analogous web presence or prefer a native mobile experience if supported. In the case of no web presence, instead of setting
    * the "url" field of an embed, such developers will set this field and other content fields, e.g. thumbnail, title, description. If set, this field is used to construct the deep-link
    * URI. Note that the native experience is preferred over the web link and the web link is used as a fallback.
    */
  var deepLinkId: js.UndefOr[String] = js.undefined
  
  /** Analogous web presence. Used as desktop fallback or when no native link data is present. */
  var url: js.UndefOr[String] = js.undefined
}
object DeepLinkData {
  
  inline def apply(): DeepLinkData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepLinkData]
  }
  
  extension [Self <: DeepLinkData](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setClient(value: js.Array[PackagingServiceClient]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setClientVarargs(value: PackagingServiceClient*): Self = StObject.set(x, "client", js.Array(value*))
    
    inline def setDeepLinkId(value: String): Self = StObject.set(x, "deepLinkId", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkIdUndefined: Self = StObject.set(x, "deepLinkId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
