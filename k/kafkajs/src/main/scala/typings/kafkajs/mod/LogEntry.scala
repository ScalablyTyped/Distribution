package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogEntry extends StObject {
  
  var label: String
  
  var level: logLevel
  
  var log: LoggerEntryContent
  
  var namespace: String
}
object LogEntry {
  
  inline def apply(label: String, level: logLevel, log: LoggerEntryContent, namespace: String): LogEntry = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogEntry] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: logLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLog(value: LoggerEntryContent): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
