package typings.log4js.mod

import typings.log4js.log4jsStrings.messagePassThrough
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePassThroughLayout extends Layout {
  
  var `type`: messagePassThrough = js.native
}
object MessagePassThroughLayout {
  
  @scala.inline
  def apply(`type`: messagePassThrough): MessagePassThroughLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePassThroughLayout]
  }
  
  @scala.inline
  implicit class MessagePassThroughLayoutMutableBuilder[Self <: MessagePassThroughLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: messagePassThrough): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
