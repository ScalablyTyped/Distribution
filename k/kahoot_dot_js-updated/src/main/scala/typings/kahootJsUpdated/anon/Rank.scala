package typings.kahootJsUpdated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rank extends StObject {
  
  var rank: Double
  
  var streak: Double
  
  var totalScore: Double
}
object Rank {
  
  inline def apply(rank: Double, streak: Double, totalScore: Double): Rank = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], streak = streak.asInstanceOf[js.Any], totalScore = totalScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rank]
  }
  
  extension [Self <: Rank](x: Self) {
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setStreak(value: Double): Self = StObject.set(x, "streak", value.asInstanceOf[js.Any])
    
    inline def setTotalScore(value: Double): Self = StObject.set(x, "totalScore", value.asInstanceOf[js.Any])
  }
}
