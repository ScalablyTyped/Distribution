package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkflowOperationMetadata extends StObject {
  
  /**
    * The namespace that the job was scheduled in. Must be included in the workflow metadata so the workflow status can be retrieved.
    */
  var namespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of action the operation is classified as.
    */
  var operationAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Which version of the workflow service this operation came from.
    */
  var workflowOperationType: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkflowOperationMetadata {
  
  inline def apply(): SchemaWorkflowOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkflowOperationMetadata]
  }
  
  extension [Self <: SchemaWorkflowOperationMetadata](x: Self) {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOperationAction(value: String): Self = StObject.set(x, "operationAction", value.asInstanceOf[js.Any])
    
    inline def setOperationActionNull: Self = StObject.set(x, "operationAction", null)
    
    inline def setOperationActionUndefined: Self = StObject.set(x, "operationAction", js.undefined)
    
    inline def setWorkflowOperationType(value: String): Self = StObject.set(x, "workflowOperationType", value.asInstanceOf[js.Any])
    
    inline def setWorkflowOperationTypeNull: Self = StObject.set(x, "workflowOperationType", null)
    
    inline def setWorkflowOperationTypeUndefined: Self = StObject.set(x, "workflowOperationType", js.undefined)
  }
}
