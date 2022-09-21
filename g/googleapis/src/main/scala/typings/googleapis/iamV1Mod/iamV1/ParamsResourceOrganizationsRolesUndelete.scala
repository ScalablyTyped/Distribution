package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsRolesUndelete
  extends StObject
     with StandardParameters {
  
  /**
    * The `name` parameter's value depends on the target resource for the request, namely [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles) or [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles). Each resource type's `name` value format is described below: * [`projects.roles.undelete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/undelete): `projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method undeletes only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the project level. Example request URL: `https://iam.googleapis.com/v1/projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}` * [`organizations.roles.undelete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/undelete): `organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method undeletes only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the organization level. Example request URL: `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}` Note: Wildcard (*) values are invalid; you must specify a complete project ID or organization ID.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUndeleteRoleRequest] = js.undefined
}
object ParamsResourceOrganizationsRolesUndelete {
  
  inline def apply(): ParamsResourceOrganizationsRolesUndelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsRolesUndelete]
  }
  
  extension [Self <: ParamsResourceOrganizationsRolesUndelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaUndeleteRoleRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
