package typings.log4js.mod

import typings.log4js.log4jsStrings.console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleAppender extends Appender {
  
  // defaults to colouredLayout
  var layout: js.UndefOr[Layout] = js.native
  
  var `type`: console = js.native
}
object ConsoleAppender {
  
  @scala.inline
  def apply(`type`: console): ConsoleAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleAppender]
  }
  
  @scala.inline
  implicit class ConsoleAppenderMutableBuilder[Self <: ConsoleAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setType(value: console): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
