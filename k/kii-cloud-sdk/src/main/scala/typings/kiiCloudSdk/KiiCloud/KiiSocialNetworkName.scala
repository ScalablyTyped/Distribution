package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KiiSocialNetworkName with Double] = js.native
  /* 1 */ @js.native
  object FACEBOOK extends TopLevel[FACEBOOK with Double]
  
  /* 4 */ @js.native
  object GOOGLEPLUS extends TopLevel[GOOGLEPLUS with Double]
  
  /* 3 */ @js.native
  object QQ extends TopLevel[QQ with Double]
  
  /* 5 */ @js.native
  object RENREN extends TopLevel[RENREN with Double]
  
  /* 2 */ @js.native
  object TWITTER extends TopLevel[TWITTER with Double]
  
}

