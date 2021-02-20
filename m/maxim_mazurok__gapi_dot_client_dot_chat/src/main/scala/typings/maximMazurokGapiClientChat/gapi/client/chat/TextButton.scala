package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextButton extends StObject {
  
  /** The onclick action of the button. */
  var onClick: js.UndefOr[OnClick] = js.native
  
  /** The text of the button. */
  var text: js.UndefOr[String] = js.native
}
object TextButton {
  
  @scala.inline
  def apply(): TextButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextButton]
  }
  
  @scala.inline
  implicit class TextButtonMutableBuilder[Self <: TextButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClick(value: OnClick): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
