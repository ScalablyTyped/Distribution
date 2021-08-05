package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushTimeDays extends StObject {
  
  var pushTimeDays: js.Array[Double]
  
  var pushTimeEndHour: Double
  
  var pushTimeStartHour: Double
}
object PushTimeDays {
  
  inline def apply(pushTimeDays: js.Array[Double], pushTimeEndHour: Double, pushTimeStartHour: Double): PushTimeDays = {
    val __obj = js.Dynamic.literal(pushTimeDays = pushTimeDays.asInstanceOf[js.Any], pushTimeEndHour = pushTimeEndHour.asInstanceOf[js.Any], pushTimeStartHour = pushTimeStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushTimeDays]
  }
  
  extension [Self <: PushTimeDays](x: Self) {
    
    inline def setPushTimeDays(value: js.Array[Double]): Self = StObject.set(x, "pushTimeDays", value.asInstanceOf[js.Any])
    
    inline def setPushTimeDaysVarargs(value: Double*): Self = StObject.set(x, "pushTimeDays", js.Array(value :_*))
    
    inline def setPushTimeEndHour(value: Double): Self = StObject.set(x, "pushTimeEndHour", value.asInstanceOf[js.Any])
    
    inline def setPushTimeStartHour(value: Double): Self = StObject.set(x, "pushTimeStartHour", value.asInstanceOf[js.Any])
  }
}
