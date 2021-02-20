package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The service account create request.
  */
@js.native
trait SchemaCreateServiceAccountRequest extends StObject {
  
  /**
    * Required. The account id that is used to generate the service account
    * email address and a stable unique id. It is unique within a project, must
    * be 6-30 characters long, and match the regular expression
    * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The ServiceAccount resource to create. Currently, only the following
    * values are user assignable: `display_name` .
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.native
}
object SchemaCreateServiceAccountRequest {
  
  @scala.inline
  def apply(): SchemaCreateServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateServiceAccountRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateServiceAccountRequestMutableBuilder[Self <: SchemaCreateServiceAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: SchemaServiceAccount): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
  }
}
