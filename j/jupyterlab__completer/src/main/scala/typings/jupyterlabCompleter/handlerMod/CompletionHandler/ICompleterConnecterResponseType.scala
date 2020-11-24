package typings.jupyterlabCompleter.handlerMod.CompletionHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompleterConnecterResponseType extends js.Object {
  
  var responseType: typings.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply = js.native
}
object ICompleterConnecterResponseType {
  
  @scala.inline
  def apply(responseType: typings.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply): ICompleterConnecterResponseType = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleterConnecterResponseType]
  }
  
  @scala.inline
  implicit class ICompleterConnecterResponseTypeOps[Self <: ICompleterConnecterResponseType] (val x: Self) extends AnyVal {
    
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
    def setResponseType(value: typings.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply): Self = this.set("responseType", value.asInstanceOf[js.Any])
  }
}
