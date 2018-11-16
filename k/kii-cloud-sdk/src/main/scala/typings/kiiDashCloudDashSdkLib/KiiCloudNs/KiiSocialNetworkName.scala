package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KiiSocialNetworkName extends js.Object

@JSGlobal("KiiCloud.KiiSocialNetworkName")
@js.native
object KiiSocialNetworkName extends js.Object {
  @js.native
  sealed trait FACEBOOK
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSocialNetworkName
  
  @js.native
  sealed trait GOOGLEPLUS
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSocialNetworkName
  
  @js.native
  sealed trait QQ
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSocialNetworkName
  
  @js.native
  sealed trait RENREN
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSocialNetworkName
  
  @js.native
  sealed trait TWITTER
    extends kiiDashCloudDashSdkLib.KiiCloudNs.KiiSocialNetworkName
  
  /* 1 */ val FACEBOOK: FACEBOOK with scala.Double = js.native
  /* 4 */ val GOOGLEPLUS: GOOGLEPLUS with scala.Double = js.native
  /* 3 */ val QQ: QQ with scala.Double = js.native
  /* 5 */ val RENREN: RENREN with scala.Double = js.native
  /* 2 */ val TWITTER: TWITTER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[kiiDashCloudDashSdkLib.KiiCloudNs.KiiSocialNetworkName with scala.Double] = js.native
}

