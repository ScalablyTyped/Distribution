package typings.kafkajs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerEntryContent
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  val message: String
  
  val timestamp: String
}
object LoggerEntryContent {
  
  inline def apply(message: String, timestamp: String): LoggerEntryContent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerEntryContent]
  }
  
  extension [Self <: LoggerEntryContent](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
