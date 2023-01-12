package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explanation extends StObject {
  
  /**
    * The map from roles to their included permissions that match the permission query (i.e., a query containing `policy.role.permissions:`). Example: if query
    * `policy.role.permissions:compute.disk.get` matches a policy binding that contains owner role, the matched_permissions will be `{"roles/owner": ["compute.disk.get"]}`. The roles can
    * also be found in the returned `policy` bindings. Note that the map is populated only for requests with permission queries.
    */
  var matchedPermissions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.cloudasset.gapi.client.cloudasset.Permissions} */ js.Any
  ] = js.undefined
}
object Explanation {
  
  inline def apply(): Explanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Explanation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Explanation] (val x: Self) extends AnyVal {
    
    inline def setMatchedPermissions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.cloudasset.gapi.client.cloudasset.Permissions} */ js.Any
    ): Self = StObject.set(x, "matchedPermissions", value.asInstanceOf[js.Any])
    
    inline def setMatchedPermissionsUndefined: Self = StObject.set(x, "matchedPermissions", js.undefined)
  }
}
