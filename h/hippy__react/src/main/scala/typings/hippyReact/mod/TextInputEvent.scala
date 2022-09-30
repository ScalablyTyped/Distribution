package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event response from onTextChange of TextInput
  */
trait TextInputEvent extends StObject {
  
  /**
    * The text content in TextInput
    */
  var text: String
}
object TextInputEvent {
  
  inline def apply(text: String): TextInputEvent = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputEvent]
  }
  
  extension [Self <: TextInputEvent](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
