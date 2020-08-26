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
  def apply(): SchemaUrlCrawlErrorCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorCount]
  }
  @scala.inline
  implicit class SchemaUrlCrawlErrorCountOps[Self <: SchemaUrlCrawlErrorCount] (val x: Self) extends AnyVal {
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

