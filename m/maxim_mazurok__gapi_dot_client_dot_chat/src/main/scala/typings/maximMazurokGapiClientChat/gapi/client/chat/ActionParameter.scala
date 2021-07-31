package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionParameter extends StObject {
  
  /** The name of the parameter for the action script. */
  var key: js.UndefOr[String] = js.undefined
  
  /** The value of the parameter. */
  var value: js.UndefOr[String] = js.undefined
}
object ActionParameter {
  
  @scala.inline
  def apply(): ActionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionParameter]
  }
  
  @scala.inline
  implicit class ActionParameterMutableBuilder[Self <: ActionParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
