package typings.log4js.mod

import typings.log4js.log4jsStrings.logLevelFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogLevelFilterAppender extends Appender {
  
  // the name of an appender, defined in the same configuration, that you want to filter
  var appender: String = js.native
  
  // the minimum level of event to allow through the filter
  var level: String = js.native
  
  // (defaults to FATAL) - the maximum level of event to allow through the filter
  var maxLevel: js.UndefOr[String] = js.native
  
  var `type`: logLevelFilter = js.native
}
object LogLevelFilterAppender {
  
  @scala.inline
  def apply(appender: String, level: String, `type`: logLevelFilter): LogLevelFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevelFilterAppender]
  }
  
  @scala.inline
  implicit class LogLevelFilterAppenderMutableBuilder[Self <: LogLevelFilterAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppender(value: String): Self = StObject.set(x, "appender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLevel(value: String): Self = StObject.set(x, "maxLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLevelUndefined: Self = StObject.set(x, "maxLevel", js.undefined)
    
    @scala.inline
    def setType(value: logLevelFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
