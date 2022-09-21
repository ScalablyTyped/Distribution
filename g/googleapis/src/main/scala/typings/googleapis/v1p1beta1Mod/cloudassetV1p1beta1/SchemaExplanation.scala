package typings.googleapis.v1p1beta1Mod.cloudassetV1p1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExplanation extends StObject {
  
  /**
    * The map from roles to their included permission matching the permission query (e.g. containing `policy.role.permissions:`). Example role string: "roles/compute.instanceAdmin". The roles can also be found in the returned `policy` bindings. Note that the map is populated only if requesting with a permission query.
    */
  var matchedPermissions: js.UndefOr[StringDictionary[SchemaPermissions] | Null] = js.undefined
}
object SchemaExplanation {
  
  inline def apply(): SchemaExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExplanation]
  }
  
  extension [Self <: SchemaExplanation](x: Self) {
    
    inline def setMatchedPermissions(value: StringDictionary[SchemaPermissions]): Self = StObject.set(x, "matchedPermissions", value.asInstanceOf[js.Any])
    
    inline def setMatchedPermissionsNull: Self = StObject.set(x, "matchedPermissions", null)
    
    inline def setMatchedPermissionsUndefined: Self = StObject.set(x, "matchedPermissions", js.undefined)
  }
}
