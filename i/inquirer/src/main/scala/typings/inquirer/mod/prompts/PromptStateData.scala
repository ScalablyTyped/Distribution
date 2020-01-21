package typings.inquirer.mod.prompts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data about the state of a prompt.
  */
trait PromptStateData extends js.Object {
  /**
    * Either a string which describes the error of the prompt or a boolean indicating whether the prompt-value is valid.
    */
  var isValid: String | Boolean
}

object PromptStateData {
  @scala.inline
  def apply(isValid: String | Boolean): PromptStateData = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromptStateData]
  }
}

