package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for updating an existing operation
  */
@js.native
trait SchemaUpdateOperationRequest extends StObject {
  
  /**
    * The operation to create.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
  
  /**
    * The fields to update.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object SchemaUpdateOperationRequest {
  
  @scala.inline
  def apply(): SchemaUpdateOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateOperationRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateOperationRequestMutableBuilder[Self <: SchemaUpdateOperationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
