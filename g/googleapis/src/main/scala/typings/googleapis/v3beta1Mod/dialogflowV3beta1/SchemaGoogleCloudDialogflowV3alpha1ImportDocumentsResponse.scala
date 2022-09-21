package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV3alpha1ImportDocumentsResponse extends StObject {
  
  /**
    * Includes details about skipped documents or any other warnings.
    */
  var warnings: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
}
object SchemaGoogleCloudDialogflowV3alpha1ImportDocumentsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV3alpha1ImportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV3alpha1ImportDocumentsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV3alpha1ImportDocumentsResponse](x: Self) {
    
    inline def setWarnings(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
