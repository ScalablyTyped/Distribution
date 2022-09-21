package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ImportDocumentsResponse extends StObject {
  
  /**
    * Includes details about skipped documents or any other warnings.
    */
  var warnings: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ImportDocumentsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ImportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ImportDocumentsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ImportDocumentsResponse](x: Self) {
    
    inline def setWarnings(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
