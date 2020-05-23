package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiSocialConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accesstoken extends KiiSocialConnectOptions {
  var access_token: String
  var openID: js.UndefOr[String] = js.undefined
}

object Accesstoken {
  @scala.inline
  def apply(access_token: String, openID: String = null): Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    if (openID != null) __obj.updateDynamic("openID")(openID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
}

