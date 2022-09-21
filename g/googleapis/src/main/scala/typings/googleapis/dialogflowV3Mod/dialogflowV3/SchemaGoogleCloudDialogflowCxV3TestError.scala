package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3TestError extends StObject {
  
  /**
    * The status associated with the test.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * The test case resource name.
    */
  var testCase: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when the test was completed.
    */
  var testTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3TestError {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3TestError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3TestError]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3TestError](x: Self) {
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTestCase(value: String): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    inline def setTestCaseNull: Self = StObject.set(x, "testCase", null)
    
    inline def setTestCaseUndefined: Self = StObject.set(x, "testCase", js.undefined)
    
    inline def setTestTime(value: String): Self = StObject.set(x, "testTime", value.asInstanceOf[js.Any])
    
    inline def setTestTimeNull: Self = StObject.set(x, "testTime", null)
    
    inline def setTestTimeUndefined: Self = StObject.set(x, "testTime", js.undefined)
  }
}
