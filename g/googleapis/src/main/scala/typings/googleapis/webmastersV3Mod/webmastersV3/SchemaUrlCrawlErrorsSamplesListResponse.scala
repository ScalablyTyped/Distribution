package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of crawl error samples.
  */
@js.native
trait SchemaUrlCrawlErrorsSamplesListResponse extends js.Object {
  
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
  implicit class SchemaUrlCrawlErrorsSamplesListResponseOps[Self <: SchemaUrlCrawlErrorsSamplesListResponse] (val x: Self) extends AnyVal {
    
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
    def setUrlCrawlErrorSampleVarargs(value: SchemaUrlCrawlErrorsSample*): Self = this.set("urlCrawlErrorSample", js.Array(value :_*))
    
    @scala.inline
    def setUrlCrawlErrorSample(value: js.Array[SchemaUrlCrawlErrorsSample]): Self = this.set("urlCrawlErrorSample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlCrawlErrorSample: Self = this.set("urlCrawlErrorSample", js.undefined)
  }
}
