package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KiiSocialNetworkName extends StObject
@JSGlobal("KiiCloud.KiiSocialNetworkName")
@js.native
object KiiSocialNetworkName extends StObject {
  
  @js.native
  sealed trait FACEBOOK
    extends StObject
       with KiiSocialNetworkName
  
  @js.native
  sealed trait GOOGLEPLUS
    extends StObject
       with KiiSocialNetworkName
  
  @js.native
  sealed trait QQ
    extends StObject
       with KiiSocialNetworkName
  
  @js.native
  sealed trait RENREN
    extends StObject
       with KiiSocialNetworkName
  
  @js.native
  sealed trait TWITTER
    extends StObject
       with KiiSocialNetworkName
}
