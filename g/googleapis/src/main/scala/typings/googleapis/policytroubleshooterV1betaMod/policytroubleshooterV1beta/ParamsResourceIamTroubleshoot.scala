package typings.googleapis.policytroubleshooterV1betaMod.policytroubleshooterV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceIamTroubleshoot
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudPolicytroubleshooterV1betaTroubleshootIamPolicyRequest] = js.undefined
}
object ParamsResourceIamTroubleshoot {
  
  inline def apply(): ParamsResourceIamTroubleshoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIamTroubleshoot]
  }
  
  extension [Self <: ParamsResourceIamTroubleshoot](x: Self) {
    
    inline def setRequestBody(value: SchemaGoogleCloudPolicytroubleshooterV1betaTroubleshootIamPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
