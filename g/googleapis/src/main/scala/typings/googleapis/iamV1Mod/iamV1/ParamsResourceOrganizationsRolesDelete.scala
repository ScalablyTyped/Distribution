package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsRolesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Used to perform a consistent read-modify-write.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The `name` parameter's value depends on the target resource for the request, namely [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles) or [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles). Each resource type's `name` value format is described below: * [`projects.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/delete): `projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method deletes only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the project level. Example request URL: `https://iam.googleapis.com/v1/projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}` * [`organizations.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/delete): `organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method deletes only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the organization level. Example request URL: `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}` Note: Wildcard (*) values are invalid; you must specify a complete project ID or organization ID.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsRolesDelete {
  
  inline def apply(): ParamsResourceOrganizationsRolesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsRolesDelete]
  }
  
  extension [Self <: ParamsResourceOrganizationsRolesDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
