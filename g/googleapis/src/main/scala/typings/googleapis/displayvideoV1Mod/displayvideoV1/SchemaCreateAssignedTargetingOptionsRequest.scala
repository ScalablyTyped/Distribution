package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateAssignedTargetingOptionsRequest extends StObject {
  
  /**
    * Required. The assigned targeting options to create and add.
    */
  var assignedTargetingOptions: js.UndefOr[js.Array[SchemaAssignedTargetingOption]] = js.undefined
  
  /**
    * Required. Identifies the type of this assigned targeting option.
    */
  var targetingType: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateAssignedTargetingOptionsRequest {
  
  inline def apply(): SchemaCreateAssignedTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateAssignedTargetingOptionsRequest]
  }
  
  extension [Self <: SchemaCreateAssignedTargetingOptionsRequest](x: Self) {
    
    inline def setAssignedTargetingOptions(value: js.Array[SchemaAssignedTargetingOption]): Self = StObject.set(x, "assignedTargetingOptions", value.asInstanceOf[js.Any])
    
    inline def setAssignedTargetingOptionsUndefined: Self = StObject.set(x, "assignedTargetingOptions", js.undefined)
    
    inline def setAssignedTargetingOptionsVarargs(value: SchemaAssignedTargetingOption*): Self = StObject.set(x, "assignedTargetingOptions", js.Array(value*))
    
    inline def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    inline def setTargetingTypeNull: Self = StObject.set(x, "targetingType", null)
    
    inline def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
  }
}
