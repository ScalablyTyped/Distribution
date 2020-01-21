package typings.inquirer.mod.prompts

import typings.inquirer.inquirerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data about the successful state of a prompt.
  *
  * @param T
  * The type of the answer.
  */
trait SuccessfulPromptStateData[T] extends PromptStateData {
  /**
    * @inheritdoc
    */
  @JSName("isValid")
  var isValid_SuccessfulPromptStateData: `true`
  /**
    * The value of the prompt.
    */
  var value: T
}

object SuccessfulPromptStateData {
  @scala.inline
  def apply[T](isValid: `true`, value: T): SuccessfulPromptStateData[T] = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuccessfulPromptStateData[T]]
  }
}

