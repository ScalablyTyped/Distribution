package typings.inquirer.mod.prompts

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides pipes for handling events of a prompt.
  *
  * @param T
  * The type of the answer.
  */
trait PromptEventPipes[T] extends js.Object {
  /**
    * An object representing an error.
    */
  var error: Observable_[FailedPromptStateData]
  /**
    * A pypeline for succesful inputs.
    */
  var success: Observable_[SuccessfulPromptStateData[T]]
}

object PromptEventPipes {
  @scala.inline
  def apply[T](error: Observable_[FailedPromptStateData], success: Observable_[SuccessfulPromptStateData[T]]): PromptEventPipes[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptEventPipes[T]]
  }
}

