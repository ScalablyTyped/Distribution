package typings
package htmlDashWebpackDashTemplateLib.htmlDashWebpackDashTemplateMod.HtmlWebpackTemplateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleAnalyticsOptions extends js.Object {
  /** Log a pageview event after the analytics code loads. */
  var pageViewOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  var trackingId: java.lang.String
}

object GoogleAnalyticsOptions {
  @scala.inline
  def apply(trackingId: java.lang.String, pageViewOnLoad: js.UndefOr[scala.Boolean] = js.undefined): GoogleAnalyticsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trackingId")(trackingId)
    if (!js.isUndefined(pageViewOnLoad)) __obj.updateDynamic("pageViewOnLoad")(pageViewOnLoad)
    __obj.asInstanceOf[GoogleAnalyticsOptions]
  }
}

