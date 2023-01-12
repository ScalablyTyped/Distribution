package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1ButtonList extends StObject {
  
  /** An array of buttons. */
  var buttons: js.UndefOr[js.Array[GoogleAppsCardV1Button]] = js.undefined
}
object GoogleAppsCardV1ButtonList {
  
  inline def apply(): GoogleAppsCardV1ButtonList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1ButtonList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsCardV1ButtonList] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: js.Array[GoogleAppsCardV1Button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: GoogleAppsCardV1Button*): Self = StObject.set(x, "buttons", js.Array(value*))
  }
}
