package typings.haxballHeadlessBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScoresObject extends StObject {
  
  var blue: Double
  
  var red: Double
  
  var scoreLimit: Double
  
  var time: Double
  
  var timeLimit: Double
}
object ScoresObject {
  
  inline def apply(blue: Double, red: Double, scoreLimit: Double, time: Double, timeLimit: Double): ScoresObject = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], scoreLimit = scoreLimit.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeLimit = timeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScoresObject]
  }
  
  extension [Self <: ScoresObject](x: Self) {
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setScoreLimit(value: Double): Self = StObject.set(x, "scoreLimit", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
  }
}
