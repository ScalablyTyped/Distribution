package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsUserPermissionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * GTM UserPermission's API relative path. Example: accounts/{account_id\}/user_permissions/{user_permission_id\}
    */
  var path: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsUserPermissionsDelete {
  
  inline def apply(): ParamsResourceAccountsUserPermissionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsUserPermissionsDelete]
  }
  
  extension [Self <: ParamsResourceAccountsUserPermissionsDelete](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
