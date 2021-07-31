package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.TopLevel
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
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.cloudasset.gapi.client.cloudasset.Permissions}
    */ typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.Explanation & TopLevel[js.Any]
  ] = js.undefined
}
object Explanation {
  
  @scala.inline
  def apply(): Explanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Explanation]
  }
  
  @scala.inline
  implicit class ExplanationMutableBuilder[Self <: Explanation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchedPermissions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.cloudasset.gapi.client.cloudasset.Permissions}
      */ typings.maximMazurokGapiClientCloudasset.maximMazurokGapiClientCloudassetStrings.Explanation & TopLevel[js.Any]
    ): Self = StObject.set(x, "matchedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedPermissionsUndefined: Self = StObject.set(x, "matchedPermissions", js.undefined)
  }
}
