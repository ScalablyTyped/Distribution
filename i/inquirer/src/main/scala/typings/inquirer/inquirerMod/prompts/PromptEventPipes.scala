package typings.inquirer.inquirerMod.prompts

import typings.rxjs.rxjsMod.Observable
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
  var error: Observable[FailedPromptStateData]
  /**
    * A pypeline for succesful inputs.
    */
  var success: Observable[SuccessfulPromptStateData[T]]
}

object PromptEventPipes {
  @scala.inline
  def apply[T](error: Observable[FailedPromptStateData], success: Observable[SuccessfulPromptStateData[T]]): PromptEventPipes[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromptEventPipes[T]]
  }
}

