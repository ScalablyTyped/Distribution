package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOmidAssignedTargetingOptionDetails extends StObject {
  
  /**
    * The type of Open Measurement enabled inventory. Output only in v1. Required in v2.
    */
  var omid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_OMID`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOmidAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaOmidAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOmidAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaOmidAssignedTargetingOptionDetails](x: Self) {
    
    inline def setOmid(value: String): Self = StObject.set(x, "omid", value.asInstanceOf[js.Any])
    
    inline def setOmidNull: Self = StObject.set(x, "omid", null)
    
    inline def setOmidUndefined: Self = StObject.set(x, "omid", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
