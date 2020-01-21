package typings.htmlWebpackTemplate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleAnalyticsOptions extends js.Object {
  /** Log a pageview event after the analytics code loads. */
  var pageViewOnLoad: js.UndefOr[Boolean] = js.undefined
  var trackingId: String
}

object GoogleAnalyticsOptions {
  @scala.inline
  def apply(trackingId: String, pageViewOnLoad: js.UndefOr[Boolean] = js.undefined): GoogleAnalyticsOptions = {
    val __obj = js.Dynamic.literal(trackingId = trackingId.asInstanceOf[js.Any])
    if (!js.isUndefined(pageViewOnLoad)) __obj.updateDynamic("pageViewOnLoad")(pageViewOnLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleAnalyticsOptions]
  }
}

