package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Authentication rules for the service.  By default, if a method has any
  * authentication requirements, every request must include a valid credential
  * matching one of the requirements. It&#39;s an error to include more than
  * one kind of credential in a single request.  If a method doesn&#39;t have
  * any auth requirements, request credentials will be ignored.
  */
@js.native
trait SchemaAuthenticationRule extends StObject {
  
  /**
    * If true, the service accepts API keys without any other credential.
    */
  var allowWithoutCredential: js.UndefOr[Boolean] = js.native
  
  /**
    * The requirements for OAuth credentials.
    */
  var oauth: js.UndefOr[SchemaOAuthRequirements] = js.native
  
  /**
    * Requirements for additional authentication providers.
    */
  var requirements: js.UndefOr[js.Array[SchemaAuthRequirement]] = js.native
  
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}
object SchemaAuthenticationRule {
  
  @scala.inline
  def apply(): SchemaAuthenticationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticationRule]
  }
  
  @scala.inline
  implicit class SchemaAuthenticationRuleMutableBuilder[Self <: SchemaAuthenticationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowWithoutCredential(value: Boolean): Self = StObject.set(x, "allowWithoutCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowWithoutCredentialUndefined: Self = StObject.set(x, "allowWithoutCredential", js.undefined)
    
    @scala.inline
    def setOauth(value: SchemaOAuthRequirements): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthUndefined: Self = StObject.set(x, "oauth", js.undefined)
    
    @scala.inline
    def setRequirements(value: js.Array[SchemaAuthRequirement]): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    @scala.inline
    def setRequirementsVarargs(value: SchemaAuthRequirement*): Self = StObject.set(x, "requirements", js.Array(value :_*))
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
