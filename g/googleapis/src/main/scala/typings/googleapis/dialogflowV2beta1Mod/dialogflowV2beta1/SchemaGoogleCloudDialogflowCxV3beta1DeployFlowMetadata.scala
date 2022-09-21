package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1DeployFlowMetadata extends StObject {
  
  /**
    * Errors of running deployment tests.
    */
  var testErrors: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1TestError]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1DeployFlowMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1DeployFlowMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1DeployFlowMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1DeployFlowMetadata](x: Self) {
    
    inline def setTestErrors(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1TestError]): Self = StObject.set(x, "testErrors", value.asInstanceOf[js.Any])
    
    inline def setTestErrorsUndefined: Self = StObject.set(x, "testErrors", js.undefined)
    
    inline def setTestErrorsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1TestError*): Self = StObject.set(x, "testErrors", js.Array(value*))
  }
}
