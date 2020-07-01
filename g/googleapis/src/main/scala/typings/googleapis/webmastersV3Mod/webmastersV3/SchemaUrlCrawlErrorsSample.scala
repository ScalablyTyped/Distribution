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
  def apply(
    first_detected: String = null,
    last_crawled: String = null,
    pageUrl: String = null,
    responseCode: js.UndefOr[Double] = js.undefined,
    urlDetails: SchemaUrlSampleDetails = null
  ): SchemaUrlCrawlErrorsSample = {
    val __obj = js.Dynamic.literal()
    if (first_detected != null) __obj.updateDynamic("first_detected")(first_detected.asInstanceOf[js.Any])
    if (last_crawled != null) __obj.updateDynamic("last_crawled")(last_crawled.asInstanceOf[js.Any])
    if (pageUrl != null) __obj.updateDynamic("pageUrl")(pageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(responseCode)) __obj.updateDynamic("responseCode")(responseCode.get.asInstanceOf[js.Any])
    if (urlDetails != null) __obj.updateDynamic("urlDetails")(urlDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlCrawlErrorsSample]
  }
}

