package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormAction extends js.Object {
  
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
  implicit class FormActionOps[Self <: FormAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionMethodName(value: String): Self = this.set("actionMethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionMethodName: Self = this.set("actionMethodName", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ActionParameter*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[ActionParameter]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
