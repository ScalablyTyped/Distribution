package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestinationNotCrawlableEvidence extends StObject {
  
  /**
    * Approximate time of the crawl.
    */
  var crawlTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Destination URL that was attempted to be crawled.
    */
  var crawledUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reason of destination not crawlable.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaDestinationNotCrawlableEvidence {
  
  inline def apply(): SchemaDestinationNotCrawlableEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestinationNotCrawlableEvidence]
  }
  
  extension [Self <: SchemaDestinationNotCrawlableEvidence](x: Self) {
    
    inline def setCrawlTime(value: String): Self = StObject.set(x, "crawlTime", value.asInstanceOf[js.Any])
    
    inline def setCrawlTimeNull: Self = StObject.set(x, "crawlTime", null)
    
    inline def setCrawlTimeUndefined: Self = StObject.set(x, "crawlTime", js.undefined)
    
    inline def setCrawledUrl(value: String): Self = StObject.set(x, "crawledUrl", value.asInstanceOf[js.Any])
    
    inline def setCrawledUrlNull: Self = StObject.set(x, "crawledUrl", null)
    
    inline def setCrawledUrlUndefined: Self = StObject.set(x, "crawledUrl", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
