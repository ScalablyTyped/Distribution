package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradeHistory extends StObject {
  
  /** The teacher who made the grade change. */
  var actorUserId: js.UndefOr[String] = js.undefined
  
  /** The type of grade change at this time in the submission grade history. */
  var gradeChangeType: js.UndefOr[String] = js.undefined
  
  /** When the grade of the submission was changed. */
  var gradeTimestamp: js.UndefOr[String] = js.undefined
  
  /** The denominator of the grade at this time in the submission grade history. */
  var maxPoints: js.UndefOr[Double] = js.undefined
  
  /** The numerator of the grade at this time in the submission grade history. */
  var pointsEarned: js.UndefOr[Double] = js.undefined
}
object GradeHistory {
  
  inline def apply(): GradeHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradeHistory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GradeHistory] (val x: Self) extends AnyVal {
    
    inline def setActorUserId(value: String): Self = StObject.set(x, "actorUserId", value.asInstanceOf[js.Any])
    
    inline def setActorUserIdUndefined: Self = StObject.set(x, "actorUserId", js.undefined)
    
    inline def setGradeChangeType(value: String): Self = StObject.set(x, "gradeChangeType", value.asInstanceOf[js.Any])
    
    inline def setGradeChangeTypeUndefined: Self = StObject.set(x, "gradeChangeType", js.undefined)
    
    inline def setGradeTimestamp(value: String): Self = StObject.set(x, "gradeTimestamp", value.asInstanceOf[js.Any])
    
    inline def setGradeTimestampUndefined: Self = StObject.set(x, "gradeTimestamp", js.undefined)
    
    inline def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
    
    inline def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
    
    inline def setPointsEarned(value: Double): Self = StObject.set(x, "pointsEarned", value.asInstanceOf[js.Any])
    
    inline def setPointsEarnedUndefined: Self = StObject.set(x, "pointsEarned", js.undefined)
  }
}
