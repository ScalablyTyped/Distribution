package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyTopicEvidence extends StObject {
  
  /**
    * The creative's destination URL was not crawlable by Google.
    */
  var destinationNotCrawlable: js.UndefOr[SchemaDestinationNotCrawlableEvidence] = js.undefined
  
  /**
    * The creative's destination URL did not function properly or was incorrectly set up.
    */
  var destinationNotWorking: js.UndefOr[SchemaDestinationNotWorkingEvidence] = js.undefined
  
  /**
    * URL of the actual landing page.
    */
  var destinationUrl: js.UndefOr[SchemaDestinationUrlEvidence] = js.undefined
  
  /**
    * Number of HTTP calls made by the creative, broken down by domain.
    */
  var domainCall: js.UndefOr[SchemaDomainCallEvidence] = js.undefined
  
  /**
    * Total download size and URL-level download size breakdown for resources in a creative.
    */
  var downloadSize: js.UndefOr[SchemaDownloadSizeEvidence] = js.undefined
  
  /**
    * HTTP calls made by the creative that resulted in policy violations.
    */
  var httpCall: js.UndefOr[SchemaHttpCallEvidence] = js.undefined
  
  /**
    * Evidence for HTTP cookie-related policy violations.
    */
  var httpCookie: js.UndefOr[SchemaHttpCookieEvidence] = js.undefined
}
object SchemaPolicyTopicEvidence {
  
  inline def apply(): SchemaPolicyTopicEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyTopicEvidence]
  }
  
  extension [Self <: SchemaPolicyTopicEvidence](x: Self) {
    
    inline def setDestinationNotCrawlable(value: SchemaDestinationNotCrawlableEvidence): Self = StObject.set(x, "destinationNotCrawlable", value.asInstanceOf[js.Any])
    
    inline def setDestinationNotCrawlableUndefined: Self = StObject.set(x, "destinationNotCrawlable", js.undefined)
    
    inline def setDestinationNotWorking(value: SchemaDestinationNotWorkingEvidence): Self = StObject.set(x, "destinationNotWorking", value.asInstanceOf[js.Any])
    
    inline def setDestinationNotWorkingUndefined: Self = StObject.set(x, "destinationNotWorking", js.undefined)
    
    inline def setDestinationUrl(value: SchemaDestinationUrlEvidence): Self = StObject.set(x, "destinationUrl", value.asInstanceOf[js.Any])
    
    inline def setDestinationUrlUndefined: Self = StObject.set(x, "destinationUrl", js.undefined)
    
    inline def setDomainCall(value: SchemaDomainCallEvidence): Self = StObject.set(x, "domainCall", value.asInstanceOf[js.Any])
    
    inline def setDomainCallUndefined: Self = StObject.set(x, "domainCall", js.undefined)
    
    inline def setDownloadSize(value: SchemaDownloadSizeEvidence): Self = StObject.set(x, "downloadSize", value.asInstanceOf[js.Any])
    
    inline def setDownloadSizeUndefined: Self = StObject.set(x, "downloadSize", js.undefined)
    
    inline def setHttpCall(value: SchemaHttpCallEvidence): Self = StObject.set(x, "httpCall", value.asInstanceOf[js.Any])
    
    inline def setHttpCallUndefined: Self = StObject.set(x, "httpCall", js.undefined)
    
    inline def setHttpCookie(value: SchemaHttpCookieEvidence): Self = StObject.set(x, "httpCookie", value.asInstanceOf[js.Any])
    
    inline def setHttpCookieUndefined: Self = StObject.set(x, "httpCookie", js.undefined)
  }
}
