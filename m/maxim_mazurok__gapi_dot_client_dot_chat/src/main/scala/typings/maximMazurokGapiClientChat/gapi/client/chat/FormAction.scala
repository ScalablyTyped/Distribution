package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormAction extends StObject {
  
  /**
    * The method name is used to identify which part of the form triggered the form submission. This information is echoed back to the Chat app as part of the card click event. The same
    * method name can be used for several elements that trigger a common behavior if desired.
    */
  var actionMethodName: js.UndefOr[String] = js.undefined
  
  /** List of action parameters. */
  var parameters: js.UndefOr[js.Array[ActionParameter]] = js.undefined
}
object FormAction {
  
  inline def apply(): FormAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormAction] (val x: Self) extends AnyVal {
    
    inline def setActionMethodName(value: String): Self = StObject.set(x, "actionMethodName", value.asInstanceOf[js.Any])
    
    inline def setActionMethodNameUndefined: Self = StObject.set(x, "actionMethodName", js.undefined)
    
    inline def setParameters(value: js.Array[ActionParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: ActionParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
