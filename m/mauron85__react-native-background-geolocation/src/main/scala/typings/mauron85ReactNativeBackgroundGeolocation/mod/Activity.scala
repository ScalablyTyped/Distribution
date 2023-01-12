package typings.mauron85ReactNativeBackgroundGeolocation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activity extends StObject {
  
  /** Percentage indicating the likelihood user is performing this activity. */
  var confidence: Double
  
  /**
    * Type of the activity.
    *
    * Possible values:
    * IN_VEHICLE, ON_BICYCLE, ON_FOOT, RUNNING, STILL, TILTING, UNKNOWN, WALKING
    */
  var `type`: ActivityType
}
object Activity {
  
  inline def apply(confidence: Double, `type`: ActivityType): Activity = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setType(value: ActivityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
