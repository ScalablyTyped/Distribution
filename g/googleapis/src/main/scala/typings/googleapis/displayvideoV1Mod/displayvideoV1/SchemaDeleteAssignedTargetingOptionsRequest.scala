package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteAssignedTargetingOptionsRequest extends StObject {
  
  /**
    * Required. The assigned targeting option IDs to delete.
    */
  var assignedTargetingOptionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Identifies the type of this assigned targeting option.
    */
  var targetingType: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeleteAssignedTargetingOptionsRequest {
  
  inline def apply(): SchemaDeleteAssignedTargetingOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteAssignedTargetingOptionsRequest]
  }
  
  extension [Self <: SchemaDeleteAssignedTargetingOptionsRequest](x: Self) {
    
    inline def setAssignedTargetingOptionIds(value: js.Array[String]): Self = StObject.set(x, "assignedTargetingOptionIds", value.asInstanceOf[js.Any])
    
    inline def setAssignedTargetingOptionIdsNull: Self = StObject.set(x, "assignedTargetingOptionIds", null)
    
    inline def setAssignedTargetingOptionIdsUndefined: Self = StObject.set(x, "assignedTargetingOptionIds", js.undefined)
    
    inline def setAssignedTargetingOptionIdsVarargs(value: String*): Self = StObject.set(x, "assignedTargetingOptionIds", js.Array(value*))
    
    inline def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    inline def setTargetingTypeNull: Self = StObject.set(x, "targetingType", null)
    
    inline def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
  }
}
