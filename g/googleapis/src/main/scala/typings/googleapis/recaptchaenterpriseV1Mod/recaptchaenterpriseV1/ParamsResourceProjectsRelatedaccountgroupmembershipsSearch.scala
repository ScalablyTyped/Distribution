package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRelatedaccountgroupmembershipsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the project to search related account group memberships from. Specify the project name in the following format: "projects/{project\}".
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[
    SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsRequest
  ] = js.undefined
}
object ParamsResourceProjectsRelatedaccountgroupmembershipsSearch {
  
  inline def apply(): ParamsResourceProjectsRelatedaccountgroupmembershipsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRelatedaccountgroupmembershipsSearch]
  }
  
  extension [Self <: ParamsResourceProjectsRelatedaccountgroupmembershipsSearch](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
