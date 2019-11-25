package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloud.KiiSocialConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accesstoken extends KiiSocialConnectOptions {
  var access_token: String
  var openID: js.UndefOr[String] = js.undefined
}

object Anon_Accesstoken {
  @scala.inline
  def apply(access_token: String, openID: String = null): Anon_Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    if (openID != null) __obj.updateDynamic("openID")(openID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Accesstoken]
  }
}

