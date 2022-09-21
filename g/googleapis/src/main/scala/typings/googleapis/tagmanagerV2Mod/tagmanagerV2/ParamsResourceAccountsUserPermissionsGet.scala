package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsUserPermissionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * GTM UserPermission's API relative path. Example: accounts/{account_id\}/user_permissions/{user_permission_id\}
    */
  var path: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsUserPermissionsGet {
  
  inline def apply(): ParamsResourceAccountsUserPermissionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsUserPermissionsGet]
  }
  
  extension [Self <: ParamsResourceAccountsUserPermissionsGet](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
