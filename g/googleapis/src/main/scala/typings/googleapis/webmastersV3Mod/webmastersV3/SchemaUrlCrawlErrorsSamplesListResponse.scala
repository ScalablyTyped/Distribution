package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of crawl error samples.
  */
trait SchemaUrlCrawlErrorsSamplesListResponse extends StObject {
  
  /**
    * Information about the sample URL and its crawl error.
    */
  var urlCrawlErrorSample: js.UndefOr[js.Array[SchemaUrlCrawlErrorsSample]] = js.undefined
}
object SchemaUrlCrawlErrorsSamplesListResponse {
  
  inline def apply(): SchemaUrlCrawlErrorsSamplesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorsSamplesListResponse]
  }
  
  extension [Self <: SchemaUrlCrawlErrorsSamplesListResponse](x: Self) {
    
    inline def setUrlCrawlErrorSample(value: js.Array[SchemaUrlCrawlErrorsSample]): Self = StObject.set(x, "urlCrawlErrorSample", value.asInstanceOf[js.Any])
    
    inline def setUrlCrawlErrorSampleUndefined: Self = StObject.set(x, "urlCrawlErrorSample", js.undefined)
    
    inline def setUrlCrawlErrorSampleVarargs(value: SchemaUrlCrawlErrorsSample*): Self = StObject.set(x, "urlCrawlErrorSample", js.Array(value :_*))
  }
}
