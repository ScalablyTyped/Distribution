package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFlowErrorDetails extends StObject {
  
  /**
    * The type of exception (as a class name).
    */
  var exceptionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The step that failed.
    */
  var flowStepId: js.UndefOr[String | Null] = js.undefined
}
object SchemaFlowErrorDetails {
  
  inline def apply(): SchemaFlowErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlowErrorDetails]
  }
  
  extension [Self <: SchemaFlowErrorDetails](x: Self) {
    
    inline def setExceptionType(value: String): Self = StObject.set(x, "exceptionType", value.asInstanceOf[js.Any])
    
    inline def setExceptionTypeNull: Self = StObject.set(x, "exceptionType", null)
    
    inline def setExceptionTypeUndefined: Self = StObject.set(x, "exceptionType", js.undefined)
    
    inline def setFlowStepId(value: String): Self = StObject.set(x, "flowStepId", value.asInstanceOf[js.Any])
    
    inline def setFlowStepIdNull: Self = StObject.set(x, "flowStepId", null)
    
    inline def setFlowStepIdUndefined: Self = StObject.set(x, "flowStepId", js.undefined)
  }
}
