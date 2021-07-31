package typings.log4js.mod

import typings.log4js.log4jsStrings.messagePassThrough
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePassThroughLayout
  extends StObject
     with Layout {
  
  var `type`: messagePassThrough
}
object MessagePassThroughLayout {
  
  @scala.inline
  def apply(): MessagePassThroughLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("messagePassThrough")
    __obj.asInstanceOf[MessagePassThroughLayout]
  }
  
  @scala.inline
  implicit class MessagePassThroughLayoutMutableBuilder[Self <: MessagePassThroughLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: messagePassThrough): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
