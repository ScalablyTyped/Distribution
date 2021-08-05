package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for updating an existing operation
  */
trait SchemaUpdateOperationRequest extends StObject {
  
  /**
    * The operation to create.
    */
  var operation: js.UndefOr[SchemaOperation] = js.undefined
  
  /**
    * The fields to update.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object SchemaUpdateOperationRequest {
  
  inline def apply(): SchemaUpdateOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateOperationRequest]
  }
  
  extension [Self <: SchemaUpdateOperationRequest](x: Self) {
    
    inline def setOperation(value: SchemaOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
