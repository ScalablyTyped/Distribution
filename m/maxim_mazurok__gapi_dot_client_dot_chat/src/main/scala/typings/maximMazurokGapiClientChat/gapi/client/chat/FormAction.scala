package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormAction extends StObject {
  
  /**
    * The method name is used to identify which part of the form triggered the form submission. This information is echoed back to the bot as part of the card click event. The same method
    * name can be used for several elements that trigger a common behavior if desired.
    */
  var actionMethodName: js.UndefOr[String] = js.native
  
  /** List of action parameters. */
  var parameters: js.UndefOr[js.Array[ActionParameter]] = js.native
}
object FormAction {
  
  @scala.inline
  def apply(): FormAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormAction]
  }
  
  @scala.inline
  implicit class FormActionMutableBuilder[Self <: FormAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionMethodName(value: String): Self = StObject.set(x, "actionMethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionMethodNameUndefined: Self = StObject.set(x, "actionMethodName", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[ActionParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ActionParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
