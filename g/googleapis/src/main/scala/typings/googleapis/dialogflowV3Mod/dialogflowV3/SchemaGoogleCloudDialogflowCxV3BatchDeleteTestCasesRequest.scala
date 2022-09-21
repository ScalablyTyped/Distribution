package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest extends StObject {
  
  /**
    * Required. Format of test case names: `projects//locations/ /agents//testCases/`.
    */
  var names: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesNull: Self = StObject.set(x, "names", null)
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
