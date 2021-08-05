package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignedLocation extends StObject {
  
  /** Output only. The unique ID of the assigned location. The ID is only unique within a location list. It may be reused in other contexts. */
  var assignedLocationId: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource name of the assigned location. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. The ID of the targeting option assigned to the location list. Must be of type TARGETING_TYPE_GEO_REGION. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object AssignedLocation {
  
  inline def apply(): AssignedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedLocation]
  }
  
  extension [Self <: AssignedLocation](x: Self) {
    
    inline def setAssignedLocationId(value: String): Self = StObject.set(x, "assignedLocationId", value.asInstanceOf[js.Any])
    
    inline def setAssignedLocationIdUndefined: Self = StObject.set(x, "assignedLocationId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
