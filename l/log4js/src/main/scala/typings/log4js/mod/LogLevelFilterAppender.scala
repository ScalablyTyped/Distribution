package typings.log4js.mod

import typings.log4js.log4jsStrings.logLevelFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogLevelFilterAppender extends StObject {
  
  // the name of an appender, defined in the same configuration, that you want to filter
  var appender: String
  
  // the minimum level of event to allow through the filter
  var level: String
  
  // (defaults to FATAL) the maximum level of event to allow through the filter
  var maxLevel: js.UndefOr[String] = js.undefined
  
  var `type`: logLevelFilter
}
object LogLevelFilterAppender {
  
  inline def apply(appender: String, level: String): LogLevelFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("logLevelFilter")
    __obj.asInstanceOf[LogLevelFilterAppender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogLevelFilterAppender] (val x: Self) extends AnyVal {
    
    inline def setAppender(value: String): Self = StObject.set(x, "appender", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMaxLevel(value: String): Self = StObject.set(x, "maxLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxLevelUndefined: Self = StObject.set(x, "maxLevel", js.undefined)
    
    inline def setType(value: logLevelFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
