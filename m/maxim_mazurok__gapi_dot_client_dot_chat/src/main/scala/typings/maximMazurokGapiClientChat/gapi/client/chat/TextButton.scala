package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextButton extends StObject {
  
  /** The onclick action of the button. */
  var onClick: js.UndefOr[OnClick] = js.undefined
  
  /** The text of the button. */
  var text: js.UndefOr[String] = js.undefined
}
object TextButton {
  
  inline def apply(): TextButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextButton] (val x: Self) extends AnyVal {
    
    inline def setOnClick(value: OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
