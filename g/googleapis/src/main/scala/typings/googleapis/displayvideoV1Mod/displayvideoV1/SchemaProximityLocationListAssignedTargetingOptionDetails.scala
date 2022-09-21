package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProximityLocationListAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. ID of the proximity location list. Should refer to the location_list_id field of a LocationList resource whose type is `TARGETING_LOCATION_TYPE_PROXIMITY`.
    */
  var proximityLocationListId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Radius range for proximity location list. This represents the size of the area around a chosen location that will be targeted. `All` proximity location targeting under a single resource must have the same radius range value. Set this value to match any existing targeting. If updated, this field will change the radius range for all proximity targeting under the resource.
    */
  var proximityRadiusRange: js.UndefOr[String | Null] = js.undefined
}
object SchemaProximityLocationListAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaProximityLocationListAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProximityLocationListAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaProximityLocationListAssignedTargetingOptionDetails](x: Self) {
    
    inline def setProximityLocationListId(value: String): Self = StObject.set(x, "proximityLocationListId", value.asInstanceOf[js.Any])
    
    inline def setProximityLocationListIdNull: Self = StObject.set(x, "proximityLocationListId", null)
    
    inline def setProximityLocationListIdUndefined: Self = StObject.set(x, "proximityLocationListId", js.undefined)
    
    inline def setProximityRadiusRange(value: String): Self = StObject.set(x, "proximityRadiusRange", value.asInstanceOf[js.Any])
    
    inline def setProximityRadiusRangeNull: Self = StObject.set(x, "proximityRadiusRange", null)
    
    inline def setProximityRadiusRangeUndefined: Self = StObject.set(x, "proximityRadiusRange", js.undefined)
  }
}
