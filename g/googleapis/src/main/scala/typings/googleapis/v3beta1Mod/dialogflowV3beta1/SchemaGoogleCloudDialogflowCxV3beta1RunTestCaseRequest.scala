package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1RunTestCaseRequest extends StObject {
  
  /**
    * Optional. Environment name. If not set, draft environment is assumed. Format: `projects//locations//agents//environments/`.
    */
  var environment: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1RunTestCaseRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1RunTestCaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1RunTestCaseRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1RunTestCaseRequest](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
