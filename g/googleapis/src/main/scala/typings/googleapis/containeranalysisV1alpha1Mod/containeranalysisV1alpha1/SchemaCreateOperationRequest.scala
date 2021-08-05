package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for creating an operation
  */
trait SchemaCreateOperationRequest extends StObject {
  
  /**
    * The operation to create.
    */
  var operation: js.UndefOr[SchemaOperation] = js.undefined
  
  /**
    * The ID to use for this operation.
    */
  var operationId: js.UndefOr[String] = js.undefined
}
object SchemaCreateOperationRequest {
  
  inline def apply(): SchemaCreateOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateOperationRequest]
  }
  
  extension [Self <: SchemaCreateOperationRequest](x: Self) {
    
    inline def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
