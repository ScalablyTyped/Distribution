package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestinationNotWorkingEvidence extends StObject {
  
  /**
    * DNS lookup errors.
    */
  var dnsError: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full non-working URL.
    */
  var expandedUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * HTTP error code (e.g. 404 or 5xx)
    */
  var httpError: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Page was crawled successfully, but was detected as either a page with no content or an error page.
    */
  var invalidPage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Approximate time when the ad destination was last checked.
    */
  var lastCheckTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Platform of the non-working URL.
    */
  var platform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * HTTP redirect chain error.
    */
  var redirectionError: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rejected because of malformed URLs or invalid requests.
    */
  var urlRejected: js.UndefOr[String | Null] = js.undefined
}
object SchemaDestinationNotWorkingEvidence {
  
  inline def apply(): SchemaDestinationNotWorkingEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestinationNotWorkingEvidence]
  }
  
  extension [Self <: SchemaDestinationNotWorkingEvidence](x: Self) {
    
    inline def setDnsError(value: String): Self = StObject.set(x, "dnsError", value.asInstanceOf[js.Any])
    
    inline def setDnsErrorNull: Self = StObject.set(x, "dnsError", null)
    
    inline def setDnsErrorUndefined: Self = StObject.set(x, "dnsError", js.undefined)
    
    inline def setExpandedUrl(value: String): Self = StObject.set(x, "expandedUrl", value.asInstanceOf[js.Any])
    
    inline def setExpandedUrlNull: Self = StObject.set(x, "expandedUrl", null)
    
    inline def setExpandedUrlUndefined: Self = StObject.set(x, "expandedUrl", js.undefined)
    
    inline def setHttpError(value: Double): Self = StObject.set(x, "httpError", value.asInstanceOf[js.Any])
    
    inline def setHttpErrorNull: Self = StObject.set(x, "httpError", null)
    
    inline def setHttpErrorUndefined: Self = StObject.set(x, "httpError", js.undefined)
    
    inline def setInvalidPage(value: String): Self = StObject.set(x, "invalidPage", value.asInstanceOf[js.Any])
    
    inline def setInvalidPageNull: Self = StObject.set(x, "invalidPage", null)
    
    inline def setInvalidPageUndefined: Self = StObject.set(x, "invalidPage", js.undefined)
    
    inline def setLastCheckTime(value: String): Self = StObject.set(x, "lastCheckTime", value.asInstanceOf[js.Any])
    
    inline def setLastCheckTimeNull: Self = StObject.set(x, "lastCheckTime", null)
    
    inline def setLastCheckTimeUndefined: Self = StObject.set(x, "lastCheckTime", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setRedirectionError(value: String): Self = StObject.set(x, "redirectionError", value.asInstanceOf[js.Any])
    
    inline def setRedirectionErrorNull: Self = StObject.set(x, "redirectionError", null)
    
    inline def setRedirectionErrorUndefined: Self = StObject.set(x, "redirectionError", js.undefined)
    
    inline def setUrlRejected(value: String): Self = StObject.set(x, "urlRejected", value.asInstanceOf[js.Any])
    
    inline def setUrlRejectedNull: Self = StObject.set(x, "urlRejected", null)
    
    inline def setUrlRejectedUndefined: Self = StObject.set(x, "urlRejected", js.undefined)
  }
}
