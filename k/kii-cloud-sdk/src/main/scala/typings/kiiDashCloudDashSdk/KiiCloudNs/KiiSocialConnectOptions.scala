package typings.kiiDashCloudDashSdk.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiSocialConnectOptions extends js.Object {
  var access_token: js.UndefOr[String] = js.undefined
  var oauth_token: js.UndefOr[String] = js.undefined
  var oauth_token_secret: js.UndefOr[String] = js.undefined
  var openID: js.UndefOr[String] = js.undefined
}

object KiiSocialConnectOptions {
  @scala.inline
  def apply(
    access_token: String = null,
    oauth_token: String = null,
    oauth_token_secret: String = null,
    openID: String = null
  ): KiiSocialConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (oauth_token_secret != null) __obj.updateDynamic("oauth_token_secret")(oauth_token_secret)
    if (openID != null) __obj.updateDynamic("openID")(openID)
    __obj.asInstanceOf[KiiSocialConnectOptions]
  }
}

