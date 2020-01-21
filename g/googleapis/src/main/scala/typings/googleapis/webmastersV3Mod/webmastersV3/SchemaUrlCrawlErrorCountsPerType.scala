package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Number of errors per day for a specific error type (defined by platform and
  * category).
  */
@js.native
trait SchemaUrlCrawlErrorCountsPerType extends js.Object {
  /**
    * The crawl error type.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * The error count entries time series.
    */
  var entries: js.UndefOr[js.Array[SchemaUrlCrawlErrorCount]] = js.native
  /**
    * The general type of Googlebot that made the request (see list of
    * Googlebot user-agents for the user-agents used).
    */
  var platform: js.UndefOr[String] = js.native
}

object SchemaUrlCrawlErrorCountsPerType {
  @scala.inline
  def apply(
    category: String = null,
    entries: js.Array[SchemaUrlCrawlErrorCount] = null,
    platform: String = null
  ): SchemaUrlCrawlErrorCountsPerType = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlCrawlErrorCountsPerType]
  }
}

