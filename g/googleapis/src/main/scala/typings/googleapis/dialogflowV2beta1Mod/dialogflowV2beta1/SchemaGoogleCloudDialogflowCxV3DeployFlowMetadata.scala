package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3DeployFlowMetadata extends StObject {
  
  /**
    * Errors of running deployment tests.
    */
  var testErrors: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3TestError]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3DeployFlowMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3DeployFlowMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3DeployFlowMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3DeployFlowMetadata](x: Self) {
    
    inline def setTestErrors(value: js.Array[SchemaGoogleCloudDialogflowCxV3TestError]): Self = StObject.set(x, "testErrors", value.asInstanceOf[js.Any])
    
    inline def setTestErrorsUndefined: Self = StObject.set(x, "testErrors", js.undefined)
    
    inline def setTestErrorsVarargs(value: SchemaGoogleCloudDialogflowCxV3TestError*): Self = StObject.set(x, "testErrors", js.Array(value*))
  }
}
