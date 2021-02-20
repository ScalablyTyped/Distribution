package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of crawl error samples.
  */
@js.native
trait SchemaUrlCrawlErrorsSamplesListResponse extends StObject {
  
  /**
    * Information about the sample URL and its crawl error.
    */
  var urlCrawlErrorSample: js.UndefOr[js.Array[SchemaUrlCrawlErrorsSample]] = js.native
}
object SchemaUrlCrawlErrorsSamplesListResponse {
  
  @scala.inline
  def apply(): SchemaUrlCrawlErrorsSamplesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorsSamplesListResponse]
  }
  
  @scala.inline
  implicit class SchemaUrlCrawlErrorsSamplesListResponseMutableBuilder[Self <: SchemaUrlCrawlErrorsSamplesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrlCrawlErrorSample(value: js.Array[SchemaUrlCrawlErrorsSample]): Self = StObject.set(x, "urlCrawlErrorSample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlCrawlErrorSampleUndefined: Self = StObject.set(x, "urlCrawlErrorSample", js.undefined)
    
    @scala.inline
    def setUrlCrawlErrorSampleVarargs(value: SchemaUrlCrawlErrorsSample*): Self = StObject.set(x, "urlCrawlErrorSample", js.Array(value :_*))
  }
}
