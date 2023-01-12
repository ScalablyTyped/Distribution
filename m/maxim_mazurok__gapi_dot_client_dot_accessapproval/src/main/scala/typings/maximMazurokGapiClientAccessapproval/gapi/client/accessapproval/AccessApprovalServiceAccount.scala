package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessApprovalServiceAccount extends StObject {
  
  /** Email address of the service account. */
  var accountEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the Access Approval service account. Format is one of: * "projects/{project}/serviceAccount" * "folders/{folder}/serviceAccount" *
    * "organizations/{organization}/serviceAccount"
    */
  var name: js.UndefOr[String] = js.undefined
}
object AccessApprovalServiceAccount {
  
  inline def apply(): AccessApprovalServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessApprovalServiceAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessApprovalServiceAccount] (val x: Self) extends AnyVal {
    
    inline def setAccountEmail(value: String): Self = StObject.set(x, "accountEmail", value.asInstanceOf[js.Any])
    
    inline def setAccountEmailUndefined: Self = StObject.set(x, "accountEmail", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
