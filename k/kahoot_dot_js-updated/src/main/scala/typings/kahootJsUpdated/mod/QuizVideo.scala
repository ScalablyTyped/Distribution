package typings.kahootJsUpdated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuizVideo extends StObject {
  
  var endTime: Double
  
  var fullUrl: String
  
  var service: String
  
  var startTime: Double
}
object QuizVideo {
  
  inline def apply(endTime: Double, fullUrl: String, service: String, startTime: Double): QuizVideo = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], fullUrl = fullUrl.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuizVideo]
  }
  
  extension [Self <: QuizVideo](x: Self) {
    
    inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setFullUrl(value: String): Self = StObject.set(x, "fullUrl", value.asInstanceOf[js.Any])
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
