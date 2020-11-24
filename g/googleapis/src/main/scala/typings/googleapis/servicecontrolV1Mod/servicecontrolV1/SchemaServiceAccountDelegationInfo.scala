package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identity delegation history of an authenticated service account.
  */
@js.native
trait SchemaServiceAccountDelegationInfo extends js.Object {
  
  /**
    * First party (Google) identity as the real authority.
    */
  var firstPartyPrincipal: js.UndefOr[SchemaFirstPartyPrincipal] = js.native
  
  /**
    * Third party identity as the real authority.
    */
  var thirdPartyPrincipal: js.UndefOr[SchemaThirdPartyPrincipal] = js.native
}
object SchemaServiceAccountDelegationInfo {
  
  @scala.inline
  def apply(): SchemaServiceAccountDelegationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountDelegationInfo]
  }
  
  @scala.inline
  implicit class SchemaServiceAccountDelegationInfoOps[Self <: SchemaServiceAccountDelegationInfo] (val x: Self) extends AnyVal {
    
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
    def setFirstPartyPrincipal(value: SchemaFirstPartyPrincipal): Self = this.set("firstPartyPrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPartyPrincipal: Self = this.set("firstPartyPrincipal", js.undefined)
    
    @scala.inline
    def setThirdPartyPrincipal(value: SchemaThirdPartyPrincipal): Self = this.set("thirdPartyPrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThirdPartyPrincipal: Self = this.set("thirdPartyPrincipal", js.undefined)
  }
}
