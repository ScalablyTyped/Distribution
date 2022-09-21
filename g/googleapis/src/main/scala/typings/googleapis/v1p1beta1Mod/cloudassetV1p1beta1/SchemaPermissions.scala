package typings.googleapis.v1p1beta1Mod.cloudassetV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPermissions extends StObject {
  
  /**
    * A list of permissions. Example permission string: "compute.disk.get".
    */
  var permissions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPermissions {
  
  inline def apply(): SchemaPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissions]
  }
  
  extension [Self <: SchemaPermissions](x: Self) {
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
