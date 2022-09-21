package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenderAssignedTargetingOptionDetails extends StObject {
  
  /**
    * The gender of the audience. Output only in v1. Required in v2.
    */
  var gender: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_GENDER`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGenderAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaGenderAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenderAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaGenderAssignedTargetingOptionDetails](x: Self) {
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderNull: Self = StObject.set(x, "gender", null)
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
