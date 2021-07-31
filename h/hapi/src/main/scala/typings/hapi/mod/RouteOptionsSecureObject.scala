package typings.hapi.mod

import typings.hapi.anon.IncludeSubdomains
import typings.hapi.anon.Rule
import typings.hapi.hapiBooleans.`false`
import typings.hapi.hapiBooleans.`true`
import typings.hapi.hapiStrings.deny
import typings.hapi.hapiStrings.sameorigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptionsSecureObject extends StObject {
  
  /**
    * hsts - controls the 'Strict-Transport-Security' header
    */
  var hsts: js.UndefOr[Boolean | Double | IncludeSubdomains] = js.undefined
  
  /**
    * boolean controlling the 'X-Download-Options' header for Internet Explorer, preventing downloads from executing in your context. Defaults to true setting the header to 'noopen'.
    */
  var noOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * boolean controlling the 'X-Content-Type-Options' header. Defaults to true setting the header to its only and default option, 'nosniff'.
    */
  var noSniff: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls the `Referrer-Policy` header, which has the following possible values.
    * @default false Header will not be send.
    */
  var referrer: js.UndefOr[`false` | ReferrerPolicy] = js.undefined
  
  /**
    * controls the 'X-Frame-Options' header
    */
  var xframe: js.UndefOr[`true` | deny | sameorigin | Rule] = js.undefined
  
  /**
    * boolean that controls the 'X-XSS-PROTECTION' header for Internet Explorer. Defaults to true which sets the header to equal '1; mode=block'.
    * Note: this setting can create a security vulnerability in versions of Internet Exploere below 8, as well as unpatched versions of IE8. See here and here for more information. If you actively
    * support old versions of IE, it may be wise to explicitly set this flag to false.
    */
  var xss: Boolean
}
object RouteOptionsSecureObject {
  
  @scala.inline
  def apply(xss: Boolean): RouteOptionsSecureObject = {
    val __obj = js.Dynamic.literal(xss = xss.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsSecureObject]
  }
  
  @scala.inline
  implicit class RouteOptionsSecureObjectMutableBuilder[Self <: RouteOptionsSecureObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsts(value: Boolean | Double | IncludeSubdomains): Self = StObject.set(x, "hsts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHstsUndefined: Self = StObject.set(x, "hsts", js.undefined)
    
    @scala.inline
    def setNoOpen(value: Boolean): Self = StObject.set(x, "noOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoOpenUndefined: Self = StObject.set(x, "noOpen", js.undefined)
    
    @scala.inline
    def setNoSniff(value: Boolean): Self = StObject.set(x, "noSniff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSniffUndefined: Self = StObject.set(x, "noSniff", js.undefined)
    
    @scala.inline
    def setReferrer(value: `false` | ReferrerPolicy): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    @scala.inline
    def setXframe(value: `true` | deny | sameorigin | Rule): Self = StObject.set(x, "xframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXframeUndefined: Self = StObject.set(x, "xframe", js.undefined)
    
    @scala.inline
    def setXss(value: Boolean): Self = StObject.set(x, "xss", value.asInstanceOf[js.Any])
  }
}
