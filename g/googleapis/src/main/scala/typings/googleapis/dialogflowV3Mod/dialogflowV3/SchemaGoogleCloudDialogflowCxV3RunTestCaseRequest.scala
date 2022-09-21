package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3RunTestCaseRequest extends StObject {
  
  /**
    * Optional. Environment name. If not set, draft environment is assumed. Format: `projects//locations//agents//environments/`.
    */
  var environment: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3RunTestCaseRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3RunTestCaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3RunTestCaseRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3RunTestCaseRequest](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
