package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dialog extends StObject {
  
  /** Input only. Body of the dialog, which is rendered in a modal. Google Chat apps do not support the following card entities: `DateTimePicker`, `OnChangeAction`. */
  var body: js.UndefOr[GoogleAppsCardV1Card] = js.undefined
}
object Dialog {
  
  inline def apply(): Dialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dialog]
  }
  
  extension [Self <: Dialog](x: Self) {
    
    inline def setBody(value: GoogleAppsCardV1Card): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
