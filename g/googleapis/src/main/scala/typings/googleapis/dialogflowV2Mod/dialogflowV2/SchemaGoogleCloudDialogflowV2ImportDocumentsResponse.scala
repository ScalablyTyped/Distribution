package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ImportDocumentsResponse extends StObject {
  
  /**
    * Includes details about skipped documents or any other warnings.
    */
  var warnings: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ImportDocumentsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ImportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ImportDocumentsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ImportDocumentsResponse](x: Self) {
    
    inline def setWarnings(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
