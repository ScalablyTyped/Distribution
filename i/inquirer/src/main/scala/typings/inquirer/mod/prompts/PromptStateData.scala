package typings.inquirer.mod.prompts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data about the state of a prompt.
  */
@js.native
trait PromptStateData extends js.Object {
  
  /**
    * Either a string which describes the error of the prompt or a boolean indicating whether the prompt-value is valid.
    */
  var isValid: String | Boolean = js.native
}
object PromptStateData {
  
  @scala.inline
  def apply(isValid: String | Boolean): PromptStateData = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptStateData]
  }
  
  @scala.inline
  implicit class PromptStateDataOps[Self <: PromptStateData] (val x: Self) extends AnyVal {
    
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
    def setIsValid(value: String | Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
  }
}
