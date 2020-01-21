package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A time series of the number of URL crawl errors per error category and
  * platform.
  */
@js.native
trait SchemaUrlCrawlErrorsCountsQueryResponse extends js.Object {
  /**
    * The time series of the number of URL crawl errors per error category and
    * platform.
    */
  var countPerTypes: js.UndefOr[js.Array[SchemaUrlCrawlErrorCountsPerType]] = js.native
}

object SchemaUrlCrawlErrorsCountsQueryResponse {
  @scala.inline
  def apply(countPerTypes: js.Array[SchemaUrlCrawlErrorCountsPerType] = null): SchemaUrlCrawlErrorsCountsQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (countPerTypes != null) __obj.updateDynamic("countPerTypes")(countPerTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlCrawlErrorsCountsQueryResponse]
  }
}

