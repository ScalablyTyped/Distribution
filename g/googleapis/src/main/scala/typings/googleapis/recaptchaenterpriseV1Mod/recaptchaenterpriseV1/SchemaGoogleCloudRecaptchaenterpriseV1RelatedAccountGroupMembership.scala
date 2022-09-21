package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership extends StObject {
  
  /**
    * The unique stable hashed user identifier of the member. The identifier corresponds to a `hashed_account_id` provided in a previous `CreateAssessment` or `AnnotateAssessment` call.
    */
  var hashedAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The resource name for this membership in the format `projects/{project\}/relatedaccountgroups/{relatedaccountgroup\}/memberships/{membership\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership](x: Self) {
    
    inline def setHashedAccountId(value: String): Self = StObject.set(x, "hashedAccountId", value.asInstanceOf[js.Any])
    
    inline def setHashedAccountIdNull: Self = StObject.set(x, "hashedAccountId", null)
    
    inline def setHashedAccountIdUndefined: Self = StObject.set(x, "hashedAccountId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
