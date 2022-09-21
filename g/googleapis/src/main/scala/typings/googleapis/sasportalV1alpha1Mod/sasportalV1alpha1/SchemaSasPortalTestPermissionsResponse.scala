package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalTestPermissionsResponse extends StObject {
  
  /**
    * A set of permissions that the caller is allowed.
    */
  var permissions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSasPortalTestPermissionsResponse {
  
  inline def apply(): SchemaSasPortalTestPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalTestPermissionsResponse]
  }
  
  extension [Self <: SchemaSasPortalTestPermissionsResponse](x: Self) {
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
