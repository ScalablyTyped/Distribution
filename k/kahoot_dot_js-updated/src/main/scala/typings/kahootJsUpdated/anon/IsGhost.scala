package typings.kahootJsUpdated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsGhost extends StObject {
  
  var isGhost: Boolean
  
  var name: String
  
  var rank: Double
  
  var totalScore: Double
}
object IsGhost {
  
  inline def apply(isGhost: Boolean, name: String, rank: Double, totalScore: Double): IsGhost = {
    val __obj = js.Dynamic.literal(isGhost = isGhost.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], totalScore = totalScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsGhost]
  }
  
  extension [Self <: IsGhost](x: Self) {
    
    inline def setIsGhost(value: Boolean): Self = StObject.set(x, "isGhost", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setTotalScore(value: Double): Self = StObject.set(x, "totalScore", value.asInstanceOf[js.Any])
  }
}
