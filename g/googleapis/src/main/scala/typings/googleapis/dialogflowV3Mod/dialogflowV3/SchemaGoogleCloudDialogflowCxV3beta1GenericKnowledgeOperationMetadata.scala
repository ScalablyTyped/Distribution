package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1GenericKnowledgeOperationMetadata extends StObject {
  
  /**
    * Required. Output only. The current state of this operation.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1GenericKnowledgeOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1GenericKnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1GenericKnowledgeOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1GenericKnowledgeOperationMetadata](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
