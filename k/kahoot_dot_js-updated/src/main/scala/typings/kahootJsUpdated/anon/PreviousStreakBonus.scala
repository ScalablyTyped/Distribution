package typings.kahootJsUpdated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousStreakBonus extends StObject {
  
  var previousStreakBonus: Double
  
  var previousStreakLevel: Double
  
  var streakBonus: Double
  
  var streakLevel: Double
  
  var totalStreakPoints: Double
}
object PreviousStreakBonus {
  
  inline def apply(
    previousStreakBonus: Double,
    previousStreakLevel: Double,
    streakBonus: Double,
    streakLevel: Double,
    totalStreakPoints: Double
  ): PreviousStreakBonus = {
    val __obj = js.Dynamic.literal(previousStreakBonus = previousStreakBonus.asInstanceOf[js.Any], previousStreakLevel = previousStreakLevel.asInstanceOf[js.Any], streakBonus = streakBonus.asInstanceOf[js.Any], streakLevel = streakLevel.asInstanceOf[js.Any], totalStreakPoints = totalStreakPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousStreakBonus]
  }
  
  extension [Self <: PreviousStreakBonus](x: Self) {
    
    inline def setPreviousStreakBonus(value: Double): Self = StObject.set(x, "previousStreakBonus", value.asInstanceOf[js.Any])
    
    inline def setPreviousStreakLevel(value: Double): Self = StObject.set(x, "previousStreakLevel", value.asInstanceOf[js.Any])
    
    inline def setStreakBonus(value: Double): Self = StObject.set(x, "streakBonus", value.asInstanceOf[js.Any])
    
    inline def setStreakLevel(value: Double): Self = StObject.set(x, "streakLevel", value.asInstanceOf[js.Any])
    
    inline def setTotalStreakPoints(value: Double): Self = StObject.set(x, "totalStreakPoints", value.asInstanceOf[js.Any])
  }
}
