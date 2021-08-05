package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRedirectAction extends StObject {
  
  /**
    * The host that will be used in the redirect response instead of the one that was supplied in the request.
    * The value must be between 1 and 255 characters.
    */
  var hostRedirect: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request.
    * This must only be set for UrlMaps used in TargetHttpProxys. Setting this true for TargetHttpsProxy is not permitted.
    * The default is set to false.
    */
  var httpsRedirect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The path that will be used in the redirect response instead of the one that was supplied in the request.
    * pathRedirect cannot be supplied together with prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
    * The value must be between 1 and 1024 characters.
    */
  var pathRedirect: js.UndefOr[String] = js.undefined
  
  /**
    * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch, retaining the remaining portion of the URL before redirecting the request.
    * prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
    * The value must be between 1 and 1024 characters.
    */
  var prefixRedirect: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP Status code to use for this RedirectAction.
    * Supported values are:
    * - MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301.
    * - FOUND, which corresponds to 302.
    * - SEE_OTHER which corresponds to 303.
    * - TEMPORARY_REDIRECT, which corresponds to 307. In this case, the request method will be retained.
    * - PERMANENT_REDIRECT, which corresponds to 308. In this case, the request method will be retained.
    */
  var redirectResponseCode: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained.
    * The default is set to false.
    */
  var stripQuery: js.UndefOr[Boolean] = js.undefined
}
object HttpRedirectAction {
  
  inline def apply(): HttpRedirectAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRedirectAction]
  }
  
  extension [Self <: HttpRedirectAction](x: Self) {
    
    inline def setHostRedirect(value: String): Self = StObject.set(x, "hostRedirect", value.asInstanceOf[js.Any])
    
    inline def setHostRedirectUndefined: Self = StObject.set(x, "hostRedirect", js.undefined)
    
    inline def setHttpsRedirect(value: Boolean): Self = StObject.set(x, "httpsRedirect", value.asInstanceOf[js.Any])
    
    inline def setHttpsRedirectUndefined: Self = StObject.set(x, "httpsRedirect", js.undefined)
    
    inline def setPathRedirect(value: String): Self = StObject.set(x, "pathRedirect", value.asInstanceOf[js.Any])
    
    inline def setPathRedirectUndefined: Self = StObject.set(x, "pathRedirect", js.undefined)
    
    inline def setPrefixRedirect(value: String): Self = StObject.set(x, "prefixRedirect", value.asInstanceOf[js.Any])
    
    inline def setPrefixRedirectUndefined: Self = StObject.set(x, "prefixRedirect", js.undefined)
    
    inline def setRedirectResponseCode(value: String): Self = StObject.set(x, "redirectResponseCode", value.asInstanceOf[js.Any])
    
    inline def setRedirectResponseCodeUndefined: Self = StObject.set(x, "redirectResponseCode", js.undefined)
    
    inline def setStripQuery(value: Boolean): Self = StObject.set(x, "stripQuery", value.asInstanceOf[js.Any])
    
    inline def setStripQueryUndefined: Self = StObject.set(x, "stripQuery", js.undefined)
  }
}
