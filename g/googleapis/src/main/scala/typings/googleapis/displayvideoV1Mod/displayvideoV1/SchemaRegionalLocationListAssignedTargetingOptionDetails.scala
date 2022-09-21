package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionalLocationListAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Indicates if this option is being negatively targeted.
    */
  var negative: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. ID of the regional location list. Should refer to the location_list_id field of a LocationList resource whose type is `TARGETING_LOCATION_TYPE_REGIONAL`.
    */
  var regionalLocationListId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRegionalLocationListAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaRegionalLocationListAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionalLocationListAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaRegionalLocationListAssignedTargetingOptionDetails](x: Self) {
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeNull: Self = StObject.set(x, "negative", null)
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    inline def setRegionalLocationListId(value: String): Self = StObject.set(x, "regionalLocationListId", value.asInstanceOf[js.Any])
    
    inline def setRegionalLocationListIdNull: Self = StObject.set(x, "regionalLocationListId", null)
    
    inline def setRegionalLocationListIdUndefined: Self = StObject.set(x, "regionalLocationListId", js.undefined)
  }
}
