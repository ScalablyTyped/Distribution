package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identity delegation history of an authenticated service account.
  */
trait SchemaServiceAccountDelegationInfo extends StObject {
  
  /**
    * First party (Google) identity as the real authority.
    */
  var firstPartyPrincipal: js.UndefOr[SchemaFirstPartyPrincipal] = js.undefined
  
  /**
    * Third party identity as the real authority.
    */
  var thirdPartyPrincipal: js.UndefOr[SchemaThirdPartyPrincipal] = js.undefined
}
object SchemaServiceAccountDelegationInfo {
  
  @scala.inline
  def apply(): SchemaServiceAccountDelegationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountDelegationInfo]
  }
  
  @scala.inline
  implicit class SchemaServiceAccountDelegationInfoMutableBuilder[Self <: SchemaServiceAccountDelegationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstPartyPrincipal(value: SchemaFirstPartyPrincipal): Self = StObject.set(x, "firstPartyPrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPartyPrincipalUndefined: Self = StObject.set(x, "firstPartyPrincipal", js.undefined)
    
    @scala.inline
    def setThirdPartyPrincipal(value: SchemaThirdPartyPrincipal): Self = StObject.set(x, "thirdPartyPrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdPartyPrincipalUndefined: Self = StObject.set(x, "thirdPartyPrincipal", js.undefined)
  }
}
