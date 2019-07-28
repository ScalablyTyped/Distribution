package typings.kiiDashCloudDashSdk.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KiiSocialNetworkName extends js.Object

@JSGlobal("KiiCloud.KiiSocialNetworkName")
@js.native
object KiiSocialNetworkName extends js.Object {
  @js.native
  sealed trait FACEBOOK extends KiiSocialNetworkName
  
  @js.native
  sealed trait GOOGLEPLUS extends KiiSocialNetworkName
  
  @js.native
  sealed trait QQ extends KiiSocialNetworkName
  
  @js.native
  sealed trait RENREN extends KiiSocialNetworkName
  
  @js.native
  sealed trait TWITTER extends KiiSocialNetworkName
  
  /* 1 */ val FACEBOOK: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiSocialNetworkName.FACEBOOK with Double = js.native
  /* 4 */ val GOOGLEPLUS: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiSocialNetworkName.GOOGLEPLUS with Double = js.native
  /* 3 */ val QQ: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiSocialNetworkName.QQ with Double = js.native
  /* 5 */ val RENREN: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiSocialNetworkName.RENREN with Double = js.native
  /* 2 */ val TWITTER: typings.kiiDashCloudDashSdk.KiiCloudNs.KiiSocialNetworkName.TWITTER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KiiSocialNetworkName with Double] = js.native
}

