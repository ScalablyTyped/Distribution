package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAchievementsIncrement
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the achievement used by this method.
    */
  var achievementId: js.UndefOr[String] = js.undefined
  
  /**
    * A randomly generated numeric ID for each request specified by the caller. This number is used at the server to ensure that the request is handled correctly across retries.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of steps to increment.
    */
  var stepsToIncrement: js.UndefOr[Double] = js.undefined
}
object ParamsResourceAchievementsIncrement {
  
  inline def apply(): ParamsResourceAchievementsIncrement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementsIncrement]
  }
  
  extension [Self <: ParamsResourceAchievementsIncrement](x: Self) {
    
    inline def setAchievementId(value: String): Self = StObject.set(x, "achievementId", value.asInstanceOf[js.Any])
    
    inline def setAchievementIdUndefined: Self = StObject.set(x, "achievementId", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setStepsToIncrement(value: Double): Self = StObject.set(x, "stepsToIncrement", value.asInstanceOf[js.Any])
    
    inline def setStepsToIncrementUndefined: Self = StObject.set(x, "stepsToIncrement", js.undefined)
  }
}
