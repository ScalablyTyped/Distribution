package typings.log4js.mod

import typings.log4js.log4jsStrings.stdout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardOutputAppender extends Appender {
  
  // (defaults to colouredLayout)
  var layout: js.UndefOr[Layout] = js.native
  
  var `type`: stdout = js.native
}
object StandardOutputAppender {
  
  @scala.inline
  def apply(`type`: stdout): StandardOutputAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardOutputAppender]
  }
  
  @scala.inline
  implicit class StandardOutputAppenderMutableBuilder[Self <: StandardOutputAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setType(value: stdout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
