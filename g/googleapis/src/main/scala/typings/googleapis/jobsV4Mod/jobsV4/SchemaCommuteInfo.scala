package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommuteInfo extends StObject {
  
  /**
    * Location used as the destination in the commute calculation.
    */
  var jobLocation: js.UndefOr[SchemaLocation] = js.undefined
  
  /**
    * The number of seconds required to travel to the job location from the query location. A duration of 0 seconds indicates that the job isn't reachable within the requested duration, but was returned as part of an expanded query.
    */
  var travelDuration: js.UndefOr[String | Null] = js.undefined
}
object SchemaCommuteInfo {
  
  inline def apply(): SchemaCommuteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommuteInfo]
  }
  
  extension [Self <: SchemaCommuteInfo](x: Self) {
    
    inline def setJobLocation(value: SchemaLocation): Self = StObject.set(x, "jobLocation", value.asInstanceOf[js.Any])
    
    inline def setJobLocationUndefined: Self = StObject.set(x, "jobLocation", js.undefined)
    
    inline def setTravelDuration(value: String): Self = StObject.set(x, "travelDuration", value.asInstanceOf[js.Any])
    
    inline def setTravelDurationNull: Self = StObject.set(x, "travelDuration", null)
    
    inline def setTravelDurationUndefined: Self = StObject.set(x, "travelDuration", js.undefined)
  }
}
