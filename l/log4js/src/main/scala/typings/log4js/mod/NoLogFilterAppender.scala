package typings.log4js.mod

import typings.log4js.log4jsStrings.noLogFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoLogFilterAppender extends StObject {
  
  // the name of an appender, defined in the same configuration, that you want to filter.
  var appender: String
  
  // the regular expression (or the regular expressions if you provide an array of values)
  // will be used for evaluating the events to pass to the appender.
  // The events, which will match the regular expression, will be excluded and so not logged.
  var exclude: String | js.Array[String]
  
  var `type`: noLogFilter
}
object NoLogFilterAppender {
  
  inline def apply(appender: String, exclude: String | js.Array[String]): NoLogFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("noLogFilter")
    __obj.asInstanceOf[NoLogFilterAppender]
  }
  
  extension [Self <: NoLogFilterAppender](x: Self) {
    
    inline def setAppender(value: String): Self = StObject.set(x, "appender", value.asInstanceOf[js.Any])
    
    inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setType(value: noLogFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
