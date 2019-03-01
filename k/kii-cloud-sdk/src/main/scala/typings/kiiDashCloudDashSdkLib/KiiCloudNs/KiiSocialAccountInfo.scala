package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiSocialAccountInfo extends js.Object {
  var createdAt: scala.Double
  var provider: KiiSocialNetworkName
  var socialAccountId: java.lang.String
}

object KiiSocialAccountInfo {
  @scala.inline
  def apply(createdAt: scala.Double, provider: KiiSocialNetworkName, socialAccountId: java.lang.String): KiiSocialAccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createdAt")(createdAt)
    __obj.updateDynamic("provider")(provider)
    __obj.updateDynamic("socialAccountId")(socialAccountId)
    __obj.asInstanceOf[KiiSocialAccountInfo]
  }
}

