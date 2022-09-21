package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ImportDocumentsResponse extends StObject {
  
  /**
    * Includes details about skipped documents or any other warnings.
    */
  var warnings: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ImportDocumentsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ImportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ImportDocumentsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ImportDocumentsResponse](x: Self) {
    
    inline def setWarnings(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
