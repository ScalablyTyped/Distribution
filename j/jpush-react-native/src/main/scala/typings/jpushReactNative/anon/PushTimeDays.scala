package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushTimeDays extends StObject {
  
  var pushTimeDays: js.Array[Double] = js.native
  
  var pushTimeEndHour: Double = js.native
  
  var pushTimeStartHour: Double = js.native
}
object PushTimeDays {
  
  @scala.inline
  def apply(pushTimeDays: js.Array[Double], pushTimeEndHour: Double, pushTimeStartHour: Double): PushTimeDays = {
    val __obj = js.Dynamic.literal(pushTimeDays = pushTimeDays.asInstanceOf[js.Any], pushTimeEndHour = pushTimeEndHour.asInstanceOf[js.Any], pushTimeStartHour = pushTimeStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushTimeDays]
  }
  
  @scala.inline
  implicit class PushTimeDaysMutableBuilder[Self <: PushTimeDays] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPushTimeDays(value: js.Array[Double]): Self = StObject.set(x, "pushTimeDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushTimeDaysVarargs(value: Double*): Self = StObject.set(x, "pushTimeDays", js.Array(value :_*))
    
    @scala.inline
    def setPushTimeEndHour(value: Double): Self = StObject.set(x, "pushTimeEndHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushTimeStartHour(value: Double): Self = StObject.set(x, "pushTimeStartHour", value.asInstanceOf[js.Any])
  }
}
