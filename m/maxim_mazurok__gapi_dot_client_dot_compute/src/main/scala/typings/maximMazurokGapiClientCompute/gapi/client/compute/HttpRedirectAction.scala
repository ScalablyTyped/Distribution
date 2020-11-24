package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRedirectAction extends js.Object {
  
  /**
    * The host that will be used in the redirect response instead of the one that was supplied in the request.
    * The value must be between 1 and 255 characters.
    */
  var hostRedirect: js.UndefOr[String] = js.native
  
  /**
    * If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request.
    * This must only be set for UrlMaps used in TargetHttpProxys. Setting this true for TargetHttpsProxy is not permitted.
    * The default is set to false.
    */
  var httpsRedirect: js.UndefOr[Boolean] = js.native
  
  /**
    * The path that will be used in the redirect response instead of the one that was supplied in the request.
    * pathRedirect cannot be supplied together with prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
    * The value must be between 1 and 1024 characters.
    */
  var pathRedirect: js.UndefOr[String] = js.native
  
  /**
    * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch, retaining the remaining portion of the URL before redirecting the request.
    * prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
    * The value must be between 1 and 1024 characters.
    */
  var prefixRedirect: js.UndefOr[String] = js.native
  
  /**
    * The HTTP Status code to use for this RedirectAction.
    * Supported values are:
    * - MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301.
    * - FOUND, which corresponds to 302.
    * - SEE_OTHER which corresponds to 303.
    * - TEMPORARY_REDIRECT, which corresponds to 307. In this case, the request method will be retained.
    * - PERMANENT_REDIRECT, which corresponds to 308. In this case, the request method will be retained.
    */
  var redirectResponseCode: js.UndefOr[String] = js.native
  
  /**
    * If set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained.
    * The default is set to false.
    */
  var stripQuery: js.UndefOr[Boolean] = js.native
}
object HttpRedirectAction {
  
  @scala.inline
  def apply(): HttpRedirectAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRedirectAction]
  }
  
  @scala.inline
  implicit class HttpRedirectActionOps[Self <: HttpRedirectAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHostRedirect(value: String): Self = this.set("hostRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostRedirect: Self = this.set("hostRedirect", js.undefined)
    
    @scala.inline
    def setHttpsRedirect(value: Boolean): Self = this.set("httpsRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpsRedirect: Self = this.set("httpsRedirect", js.undefined)
    
    @scala.inline
    def setPathRedirect(value: String): Self = this.set("pathRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathRedirect: Self = this.set("pathRedirect", js.undefined)
    
    @scala.inline
    def setPrefixRedirect(value: String): Self = this.set("prefixRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixRedirect: Self = this.set("prefixRedirect", js.undefined)
    
    @scala.inline
    def setRedirectResponseCode(value: String): Self = this.set("redirectResponseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectResponseCode: Self = this.set("redirectResponseCode", js.undefined)
    
    @scala.inline
    def setStripQuery(value: Boolean): Self = this.set("stripQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripQuery: Self = this.set("stripQuery", js.undefined)
  }
}
