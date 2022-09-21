package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdminsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the account from which to retrieve a list of admins. `accounts/{account_id\}/admins`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdminsList {
  
  inline def apply(): ParamsResourceAccountsAdminsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdminsList]
  }
  
  extension [Self <: ParamsResourceAccountsAdminsList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
