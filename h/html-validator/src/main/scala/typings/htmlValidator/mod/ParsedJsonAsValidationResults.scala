package typings.htmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedJsonAsValidationResults extends js.Object {
  
  var messages: js.Array[ValidationMessageObject] = js.native
}
object ParsedJsonAsValidationResults {
  
  @scala.inline
  def apply(messages: js.Array[ValidationMessageObject]): ParsedJsonAsValidationResults = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedJsonAsValidationResults]
  }
  
  @scala.inline
  implicit class ParsedJsonAsValidationResultsOps[Self <: ParsedJsonAsValidationResults] (val x: Self) extends AnyVal {
    
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
    def setMessagesVarargs(value: ValidationMessageObject*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[ValidationMessageObject]): Self = this.set("messages", value.asInstanceOf[js.Any])
  }
}
