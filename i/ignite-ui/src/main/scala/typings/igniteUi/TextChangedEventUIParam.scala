package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextChangedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the old text.
    */
  var oldText: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the new text.
    */
  var text: js.UndefOr[String] = js.undefined
}
object TextChangedEventUIParam {
  
  inline def apply(): TextChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextChangedEventUIParam]
  }
  
  extension [Self <: TextChangedEventUIParam](x: Self) {
    
    inline def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
    
    inline def setOldTextUndefined: Self = StObject.set(x, "oldText", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
