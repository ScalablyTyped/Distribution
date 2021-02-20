package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for creating an operation
  */
@js.native
trait SchemaCreateOperationRequest extends StObject {
  
  /**
    * The operation to create.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
  
  /**
    * The ID to use for this operation.
    */
  var operationId: js.UndefOr[String] = js.native
}
object SchemaCreateOperationRequest {
  
  @scala.inline
  def apply(): SchemaCreateOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateOperationRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateOperationRequestMutableBuilder[Self <: SchemaCreateOperationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
