package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Commute details related to this job.
  */
@js.native
trait SchemaCommuteInfo extends StObject {
  
  /**
    * Location used as the destination in the commute calculation.
    */
  var jobLocation: js.UndefOr[SchemaLocation] = js.native
  
  /**
    * The number of seconds required to travel to the job location from the
    * query location. A duration of 0 seconds indicates that the job is not
    * reachable within the requested duration, but was returned as part of an
    * expanded query.
    */
  var travelDuration: js.UndefOr[String] = js.native
}
object SchemaCommuteInfo {
  
  @scala.inline
  def apply(): SchemaCommuteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommuteInfo]
  }
  
  @scala.inline
  implicit class SchemaCommuteInfoMutableBuilder[Self <: SchemaCommuteInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobLocation(value: SchemaLocation): Self = StObject.set(x, "jobLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobLocationUndefined: Self = StObject.set(x, "jobLocation", js.undefined)
    
    @scala.inline
    def setTravelDuration(value: String): Self = StObject.set(x, "travelDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravelDurationUndefined: Self = StObject.set(x, "travelDuration", js.undefined)
  }
}
