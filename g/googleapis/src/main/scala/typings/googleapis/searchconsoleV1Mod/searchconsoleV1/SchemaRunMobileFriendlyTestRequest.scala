package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile-friendly test request.
  */
@js.native
trait SchemaRunMobileFriendlyTestRequest extends js.Object {
  /**
    * Whether or not screenshot is requested. Default is false.
    */
  var requestScreenshot: js.UndefOr[Boolean] = js.native
  /**
    * URL for inspection.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaRunMobileFriendlyTestRequest {
  @scala.inline
  def apply(requestScreenshot: js.UndefOr[Boolean] = js.undefined, url: String = null): SchemaRunMobileFriendlyTestRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requestScreenshot)) __obj.updateDynamic("requestScreenshot")(requestScreenshot.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRunMobileFriendlyTestRequest]
  }
}

