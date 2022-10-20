package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.fail
import typings.johnnyFive.johnnyFiveStrings.info
import typings.johnnyFive.johnnyFiveStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardLogEvent extends StObject {
  
  var `class`: String
  
  var message: String
  
  var timestamp: Double
  
  var `type`: info | warn | fail
}
object BoardLogEvent {
  
  inline def apply(`class`: String, message: String, timestamp: Double, `type`: info | warn | fail): BoardLogEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardLogEvent]
  }
  
  extension [Self <: BoardLogEvent](x: Self) {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: info | warn | fail): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
