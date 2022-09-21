package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1BatchDeleteTestCasesRequest extends StObject {
  
  /**
    * Required. Format of test case names: `projects//locations/ /agents//testCases/`.
    */
  var names: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1BatchDeleteTestCasesRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1BatchDeleteTestCasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1BatchDeleteTestCasesRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1BatchDeleteTestCasesRequest](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesNull: Self = StObject.set(x, "names", null)
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
