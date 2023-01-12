package typings.matrixBotSdk.libModelsEventsMessageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextualMessageEventContent
  extends StObject
     with MessageEventContent {
  
  var format: js.UndefOr[String] = js.undefined
  
  var formatted_body: js.UndefOr[String] = js.undefined
}
object TextualMessageEventContent {
  
  inline def apply(body: String, msgtype: MessageType): TextualMessageEventContent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], msgtype = msgtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextualMessageEventContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextualMessageEventContent] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatted_body(value: String): Self = StObject.set(x, "formatted_body", value.asInstanceOf[js.Any])
    
    inline def setFormatted_bodyUndefined: Self = StObject.set(x, "formatted_body", js.undefined)
  }
}
