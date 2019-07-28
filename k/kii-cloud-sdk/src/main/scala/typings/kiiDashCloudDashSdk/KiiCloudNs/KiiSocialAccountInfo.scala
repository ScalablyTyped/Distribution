package typings.kiiDashCloudDashSdk.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiSocialAccountInfo extends js.Object {
  var createdAt: Double
  var provider: KiiSocialNetworkName
  var socialAccountId: String
}

object KiiSocialAccountInfo {
  @scala.inline
  def apply(createdAt: Double, provider: KiiSocialNetworkName, socialAccountId: String): KiiSocialAccountInfo = {
    val __obj = js.Dynamic.literal(createdAt = createdAt, provider = provider, socialAccountId = socialAccountId)
  
    __obj.asInstanceOf[KiiSocialAccountInfo]
  }
}

