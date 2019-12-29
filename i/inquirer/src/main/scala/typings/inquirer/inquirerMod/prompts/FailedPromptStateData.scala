package typings.inquirer.inquirerMod.prompts

import typings.inquirer.inquirerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data about the failed state of a prompt.
  */
trait FailedPromptStateData extends PromptStateData {
  /**
    * @inheritdoc
    */
  @JSName("isValid")
  var isValid_FailedPromptStateData: `false` | String
}

object FailedPromptStateData {
  @scala.inline
  def apply(isValid: `false` | String): FailedPromptStateData = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FailedPromptStateData]
  }
}

