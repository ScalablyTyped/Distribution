package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KiiSocialAccountInfo extends StObject {
  
  var createdAt: Double = js.native
  
  var provider: KiiSocialNetworkName = js.native
  
  var socialAccountId: String = js.native
}
object KiiSocialAccountInfo {
  
  @scala.inline
  def apply(createdAt: Double, provider: KiiSocialNetworkName, socialAccountId: String): KiiSocialAccountInfo = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], socialAccountId = socialAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiSocialAccountInfo]
  }
  
  @scala.inline
  implicit class KiiSocialAccountInfoMutableBuilder[Self <: KiiSocialAccountInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: KiiSocialNetworkName): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialAccountId(value: String): Self = StObject.set(x, "socialAccountId", value.asInstanceOf[js.Any])
  }
}
