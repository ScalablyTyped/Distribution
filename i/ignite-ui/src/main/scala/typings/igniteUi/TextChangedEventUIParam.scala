package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextChangedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the old text.
    */
  var oldText: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the new text.
    */
  var text: js.UndefOr[String] = js.native
}
object TextChangedEventUIParam {
  
  @scala.inline
  def apply(): TextChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextChangedEventUIParam]
  }
  
  @scala.inline
  implicit class TextChangedEventUIParamMutableBuilder[Self <: TextChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldTextUndefined: Self = StObject.set(x, "oldText", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
