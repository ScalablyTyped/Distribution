package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata in google::longrunning::Operation for Knowledge operations.
  */
trait SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata extends StObject {
  
  /**
    * Required. The current state of this operation.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1KnowledgeOperationMetadata](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
