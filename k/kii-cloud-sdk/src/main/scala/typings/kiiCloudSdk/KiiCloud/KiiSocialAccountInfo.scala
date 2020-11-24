package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KiiSocialAccountInfo extends js.Object {
  
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
  implicit class KiiSocialAccountInfoOps[Self <: KiiSocialAccountInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedAt(value: Double): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: KiiSocialNetworkName): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialAccountId(value: String): Self = this.set("socialAccountId", value.asInstanceOf[js.Any])
  }
}
