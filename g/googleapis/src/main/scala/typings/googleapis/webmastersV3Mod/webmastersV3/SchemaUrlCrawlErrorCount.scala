package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entry in a URL crawl errors time series.
  */
@js.native
trait SchemaUrlCrawlErrorCount extends js.Object {
  /**
    * The error count at the given timestamp.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * The date and time when the crawl attempt took place, in RFC 3339 format.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object SchemaUrlCrawlErrorCount {
  @scala.inline
  def apply(count: String = null, timestamp: String = null): SchemaUrlCrawlErrorCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlCrawlErrorCount]
  }
}

