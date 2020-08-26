package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about specific crawl errors.
  */
@js.native
trait SchemaUrlCrawlErrorsSample extends js.Object {
  /**
    * The time the error was first detected, in RFC 3339 format.
    */
  var first_detected: js.UndefOr[String] = js.native
  /**
    * The time when the URL was last crawled, in RFC 3339 format.
    */
  var last_crawled: js.UndefOr[String] = js.native
  /**
    * The URL of an error, relative to the site.
    */
  var pageUrl: js.UndefOr[String] = js.native
  /**
    * The HTTP response code, if any.
    */
  var responseCode: js.UndefOr[Double] = js.native
  /**
    * Additional details about the URL, set only when calling get().
    */
  var urlDetails: js.UndefOr[SchemaUrlSampleDetails] = js.native
}

object SchemaUrlCrawlErrorsSample {
  @scala.inline
  def apply(): SchemaUrlCrawlErrorsSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorsSample]
  }
  @scala.inline
  implicit class SchemaUrlCrawlErrorsSampleOps[Self <: SchemaUrlCrawlErrorsSample] (val x: Self) extends AnyVal {
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
    def setFirst_detected(value: String): Self = this.set("first_detected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst_detected: Self = this.set("first_detected", js.undefined)
    @scala.inline
    def setLast_crawled(value: String): Self = this.set("last_crawled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_crawled: Self = this.set("last_crawled", js.undefined)
    @scala.inline
    def setPageUrl(value: String): Self = this.set("pageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageUrl: Self = this.set("pageUrl", js.undefined)
    @scala.inline
    def setResponseCode(value: Double): Self = this.set("responseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseCode: Self = this.set("responseCode", js.undefined)
    @scala.inline
    def setUrlDetails(value: SchemaUrlSampleDetails): Self = this.set("urlDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlDetails: Self = this.set("urlDetails", js.undefined)
  }
  
}

