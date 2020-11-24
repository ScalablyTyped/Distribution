package typings.log4js.mod

import typings.log4js.log4jsStrings.noLogFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoLogFilterAppender extends Appender {
  
  // the name of an appender, defined in the same configuration, that you want to filter.
  var appender: String = js.native
  
  // the regular expression (or the regular expressions if you provide an array of values)
  // will be used for evaluating the events to pass to the appender.
  // The events, which will match the regular expression, will be excluded and so not logged.
  var exclude: String | js.Array[String] = js.native
  
  var `type`: noLogFilter = js.native
}
object NoLogFilterAppender {
  
  @scala.inline
  def apply(appender: String, exclude: String | js.Array[String], `type`: noLogFilter): NoLogFilterAppender = {
    val __obj = js.Dynamic.literal(appender = appender.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoLogFilterAppender]
  }
  
  @scala.inline
  implicit class NoLogFilterAppenderOps[Self <: NoLogFilterAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppender(value: String): Self = this.set("appender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: String | js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: noLogFilter): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
