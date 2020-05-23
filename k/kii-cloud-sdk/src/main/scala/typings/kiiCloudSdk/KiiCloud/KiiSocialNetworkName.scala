package typings.kiiCloudSdk.KiiCloud

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
  
}

