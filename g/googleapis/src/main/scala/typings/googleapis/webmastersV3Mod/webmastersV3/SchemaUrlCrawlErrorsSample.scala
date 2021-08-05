package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about specific crawl errors.
  */
trait SchemaUrlCrawlErrorsSample extends StObject {
  
  /**
    * The time the error was first detected, in RFC 3339 format.
    */
  var first_detected: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the URL was last crawled, in RFC 3339 format.
    */
  var last_crawled: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of an error, relative to the site.
    */
  var pageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP response code, if any.
    */
  var responseCode: js.UndefOr[Double] = js.undefined
  
  /**
    * Additional details about the URL, set only when calling get().
    */
  var urlDetails: js.UndefOr[SchemaUrlSampleDetails] = js.undefined
}
object SchemaUrlCrawlErrorsSample {
  
  inline def apply(): SchemaUrlCrawlErrorsSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorsSample]
  }
  
  extension [Self <: SchemaUrlCrawlErrorsSample](x: Self) {
    
    inline def setFirst_detected(value: String): Self = StObject.set(x, "first_detected", value.asInstanceOf[js.Any])
    
    inline def setFirst_detectedUndefined: Self = StObject.set(x, "first_detected", js.undefined)
    
    inline def setLast_crawled(value: String): Self = StObject.set(x, "last_crawled", value.asInstanceOf[js.Any])
    
    inline def setLast_crawledUndefined: Self = StObject.set(x, "last_crawled", js.undefined)
    
    inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
    
    inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    
    inline def setResponseCode(value: Double): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
    
    inline def setUrlDetails(value: SchemaUrlSampleDetails): Self = StObject.set(x, "urlDetails", value.asInstanceOf[js.Any])
    
    inline def setUrlDetailsUndefined: Self = StObject.set(x, "urlDetails", js.undefined)
  }
}
