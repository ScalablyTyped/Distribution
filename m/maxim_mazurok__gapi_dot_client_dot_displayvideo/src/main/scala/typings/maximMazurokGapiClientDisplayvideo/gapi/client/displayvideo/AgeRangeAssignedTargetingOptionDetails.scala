package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgeRangeAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The age range of an audience. We only support targeting a continuous age range of an audience. Thus, the age range represented in this field can be 1) targeted solely,
    * or, 2) part of a larger continuous age range. The reach of a continuous age range targeting can be expanded by also targeting an audience of an unknown age.
    */
  var ageRange: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_AGE_RANGE`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object AgeRangeAssignedTargetingOptionDetails {
  
  inline def apply(): AgeRangeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgeRangeAssignedTargetingOptionDetails]
  }
  
  extension [Self <: AgeRangeAssignedTargetingOptionDetails](x: Self) {
    
    inline def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
