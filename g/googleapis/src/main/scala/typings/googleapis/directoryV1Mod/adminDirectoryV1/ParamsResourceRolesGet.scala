package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRolesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable ID of the Google Workspace account.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable ID of the role.
    */
  var roleId: js.UndefOr[String] = js.undefined
}
object ParamsResourceRolesGet {
  
  inline def apply(): ParamsResourceRolesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRolesGet]
  }
  
  extension [Self <: ParamsResourceRolesGet](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdUndefined: Self = StObject.set(x, "roleId", js.undefined)
  }
}
