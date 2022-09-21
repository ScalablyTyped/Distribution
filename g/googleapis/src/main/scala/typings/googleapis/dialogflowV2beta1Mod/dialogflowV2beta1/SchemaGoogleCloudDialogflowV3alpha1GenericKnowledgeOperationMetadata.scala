package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV3alpha1GenericKnowledgeOperationMetadata extends StObject {
  
  /**
    * Required. Output only. The current state of this operation.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV3alpha1GenericKnowledgeOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowV3alpha1GenericKnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV3alpha1GenericKnowledgeOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV3alpha1GenericKnowledgeOperationMetadata](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
