package typings.googleapis.plusV1Mod.plusV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceActivitiesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the activity to get.
    */
  var activityId: js.UndefOr[String] = js.undefined
}
object ParamsResourceActivitiesGet {
  
  inline def apply(): ParamsResourceActivitiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceActivitiesGet]
  }
  
  extension [Self <: ParamsResourceActivitiesGet](x: Self) {
    
    inline def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    inline def setActivityIdUndefined: Self = StObject.set(x, "activityId", js.undefined)
  }
}
