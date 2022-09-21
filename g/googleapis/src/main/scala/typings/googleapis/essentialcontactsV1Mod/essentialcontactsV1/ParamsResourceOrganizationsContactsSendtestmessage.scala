package typings.googleapis.essentialcontactsV1Mod.essentialcontactsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsContactsSendtestmessage
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudEssentialcontactsV1SendTestMessageRequest] = js.undefined
  
  /**
    * Required. The name of the resource to send the test message for. All contacts must either be set directly on this resource or inherited from another resource that is an ancestor of this one. Format: organizations/{organization_id\}, folders/{folder_id\} or projects/{project_id\}
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsContactsSendtestmessage {
  
  inline def apply(): ParamsResourceOrganizationsContactsSendtestmessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsContactsSendtestmessage]
  }
  
  extension [Self <: ParamsResourceOrganizationsContactsSendtestmessage](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleCloudEssentialcontactsV1SendTestMessageRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
