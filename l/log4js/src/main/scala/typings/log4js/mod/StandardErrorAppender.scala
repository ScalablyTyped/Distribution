package typings.log4js.mod

import typings.log4js.log4jsStrings.stderr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardErrorAppender
  extends StObject
     with Appender {
  
  // (defaults to colouredLayout)
  var layout: js.UndefOr[Layout] = js.undefined
  
  var `type`: stderr
}
object StandardErrorAppender {
  
  @scala.inline
  def apply(): StandardErrorAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("stderr")
    __obj.asInstanceOf[StandardErrorAppender]
  }
  
  @scala.inline
  implicit class StandardErrorAppenderMutableBuilder[Self <: StandardErrorAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setType(value: stderr): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
