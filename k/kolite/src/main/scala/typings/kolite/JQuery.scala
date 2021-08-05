package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def activity(options: KoLiteActivityOptions): JQuery
  
  def activityEx(isLoading: Boolean): JQuery
  
  @JSName("activity")
  var activity_Original: KoLiteActivity
}
object JQuery {
  
  inline def apply(activity: KoLiteActivity, activityEx: Boolean => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], activityEx = js.Any.fromFunction1(activityEx))
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setActivity(value: KoLiteActivity): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityEx(value: Boolean => JQuery): Self = StObject.set(x, "activityEx", js.Any.fromFunction1(value))
  }
}
