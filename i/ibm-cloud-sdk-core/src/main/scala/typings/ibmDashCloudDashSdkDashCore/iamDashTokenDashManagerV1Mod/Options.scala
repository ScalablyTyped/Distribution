package typings.ibmDashCloudDashSdkDashCore.iamDashTokenDashManagerV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var iamAccessToken: js.UndefOr[String] = js.undefined
  var iamApikey: js.UndefOr[String] = js.undefined
  var iamUrl: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(iamAccessToken: String = null, iamApikey: String = null, iamUrl: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (iamAccessToken != null) __obj.updateDynamic("iamAccessToken")(iamAccessToken)
    if (iamApikey != null) __obj.updateDynamic("iamApikey")(iamApikey)
    if (iamUrl != null) __obj.updateDynamic("iamUrl")(iamUrl)
    __obj.asInstanceOf[Options]
  }
}

