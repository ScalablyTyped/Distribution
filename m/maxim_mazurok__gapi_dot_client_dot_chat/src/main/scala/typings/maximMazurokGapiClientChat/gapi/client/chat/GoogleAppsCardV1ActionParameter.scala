package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1ActionParameter extends StObject {
  
  /** The name of the parameter for the action script. */
  var key: js.UndefOr[String] = js.undefined
  
  /** The value of the parameter. */
  var value: js.UndefOr[String] = js.undefined
}
object GoogleAppsCardV1ActionParameter {
  
  inline def apply(): GoogleAppsCardV1ActionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1ActionParameter]
  }
  
  extension [Self <: GoogleAppsCardV1ActionParameter](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
