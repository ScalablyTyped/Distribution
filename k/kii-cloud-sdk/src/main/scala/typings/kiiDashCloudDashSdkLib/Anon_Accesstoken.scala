package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accesstoken
  extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSocialConnectOptions {
  var access_token: java.lang.String
  var openID: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Accesstoken {
  @scala.inline
  def apply(access_token: java.lang.String, openID: java.lang.String = null): Anon_Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token)
    if (openID != null) __obj.updateDynamic("openID")(openID)
    __obj.asInstanceOf[Anon_Accesstoken]
  }
}

