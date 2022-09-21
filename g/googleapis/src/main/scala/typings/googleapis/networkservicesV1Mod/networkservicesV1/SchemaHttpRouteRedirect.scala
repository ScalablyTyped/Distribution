package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteRedirect extends StObject {
  
  /**
    * The host that will be used in the redirect response instead of the one that was supplied in the request.
    */
  var hostRedirect: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request. The default is set to false.
    */
  var httpsRedirect: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The path that will be used in the redirect response instead of the one that was supplied in the request. path_redirect can not be supplied together with prefix_redirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
    */
  var pathRedirect: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The port that will be used in the redirected request instead of the one that was supplied in the request.
    */
  var portRedirect: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Indicates that during redirection, the matched prefix (or path) should be swapped with this value. This option allows URLs be dynamically created based on the request.
    */
  var prefixRewrite: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The HTTP Status code to use for the redirect.
    */
  var responseCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * if set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained. The default is set to false.
    */
  var stripQuery: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaHttpRouteRedirect {
  
  inline def apply(): SchemaHttpRouteRedirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteRedirect]
  }
  
  extension [Self <: SchemaHttpRouteRedirect](x: Self) {
    
    inline def setHostRedirect(value: String): Self = StObject.set(x, "hostRedirect", value.asInstanceOf[js.Any])
    
    inline def setHostRedirectNull: Self = StObject.set(x, "hostRedirect", null)
    
    inline def setHostRedirectUndefined: Self = StObject.set(x, "hostRedirect", js.undefined)
    
    inline def setHttpsRedirect(value: Boolean): Self = StObject.set(x, "httpsRedirect", value.asInstanceOf[js.Any])
    
    inline def setHttpsRedirectNull: Self = StObject.set(x, "httpsRedirect", null)
    
    inline def setHttpsRedirectUndefined: Self = StObject.set(x, "httpsRedirect", js.undefined)
    
    inline def setPathRedirect(value: String): Self = StObject.set(x, "pathRedirect", value.asInstanceOf[js.Any])
    
    inline def setPathRedirectNull: Self = StObject.set(x, "pathRedirect", null)
    
    inline def setPathRedirectUndefined: Self = StObject.set(x, "pathRedirect", js.undefined)
    
    inline def setPortRedirect(value: Double): Self = StObject.set(x, "portRedirect", value.asInstanceOf[js.Any])
    
    inline def setPortRedirectNull: Self = StObject.set(x, "portRedirect", null)
    
    inline def setPortRedirectUndefined: Self = StObject.set(x, "portRedirect", js.undefined)
    
    inline def setPrefixRewrite(value: String): Self = StObject.set(x, "prefixRewrite", value.asInstanceOf[js.Any])
    
    inline def setPrefixRewriteNull: Self = StObject.set(x, "prefixRewrite", null)
    
    inline def setPrefixRewriteUndefined: Self = StObject.set(x, "prefixRewrite", js.undefined)
    
    inline def setResponseCode(value: String): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeNull: Self = StObject.set(x, "responseCode", null)
    
    inline def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
    
    inline def setStripQuery(value: Boolean): Self = StObject.set(x, "stripQuery", value.asInstanceOf[js.Any])
    
    inline def setStripQueryNull: Self = StObject.set(x, "stripQuery", null)
    
    inline def setStripQueryUndefined: Self = StObject.set(x, "stripQuery", js.undefined)
  }
}
