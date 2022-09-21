package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesRequest extends StObject {
  
  /**
    * Optional. If not set, draft environment is assumed. Format: `projects//locations//agents//environments/`.
    */
  var environment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Format: `projects//locations//agents//testCases/`.
    */
  var testCases: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesRequest](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setTestCases(value: js.Array[String]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    inline def setTestCasesNull: Self = StObject.set(x, "testCases", null)
    
    inline def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    inline def setTestCasesVarargs(value: String*): Self = StObject.set(x, "testCases", js.Array(value*))
  }
}
