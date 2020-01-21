package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(urlCrawlErrorSample: js.Array[SchemaUrlCrawlErrorsSample] = null): SchemaUrlCrawlErrorsSamplesListResponse = {
    val __obj = js.Dynamic.literal()
    if (urlCrawlErrorSample != null) __obj.updateDynamic("urlCrawlErrorSample")(urlCrawlErrorSample.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlCrawlErrorsSamplesListResponse]
  }
}

