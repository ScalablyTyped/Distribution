package typings.googleapis.peopleV1Mod.peopleV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceContactgroupsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Set to true to also delete the contacts in the specified group.
    */
  var deleteContacts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource name of the contact group to delete.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object ParamsResourceContactgroupsDelete {
  
  inline def apply(): ParamsResourceContactgroupsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceContactgroupsDelete]
  }
  
  extension [Self <: ParamsResourceContactgroupsDelete](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDeleteContacts(value: Boolean): Self = StObject.set(x, "deleteContacts", value.asInstanceOf[js.Any])
    
    inline def setDeleteContactsUndefined: Self = StObject.set(x, "deleteContacts", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
