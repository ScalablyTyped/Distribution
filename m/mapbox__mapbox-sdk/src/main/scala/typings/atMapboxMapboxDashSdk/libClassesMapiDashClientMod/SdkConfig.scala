package typings.atMapboxMapboxDashSdk.libClassesMapiDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SdkConfig extends js.Object {
  var accessToken: String
  var origin: js.UndefOr[String] = js.undefined
}

object SdkConfig {
  @scala.inline
  def apply(accessToken: String, origin: String = null): SdkConfig = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkConfig]
  }
}

