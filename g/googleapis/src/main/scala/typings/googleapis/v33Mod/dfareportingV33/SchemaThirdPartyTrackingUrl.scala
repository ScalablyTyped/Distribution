package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Third-party Tracking URL.
  */
@js.native
trait SchemaThirdPartyTrackingUrl extends js.Object {
  /**
    * Third-party URL type for in-stream video and in-stream audio creatives.
    */
  var thirdPartyUrlType: js.UndefOr[String] = js.native
  /**
    * URL for the specified third-party URL type.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaThirdPartyTrackingUrl {
  @scala.inline
  def apply(thirdPartyUrlType: String = null, url: String = null): SchemaThirdPartyTrackingUrl = {
    val __obj = js.Dynamic.literal()
    if (thirdPartyUrlType != null) __obj.updateDynamic("thirdPartyUrlType")(thirdPartyUrlType.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThirdPartyTrackingUrl]
  }
}

