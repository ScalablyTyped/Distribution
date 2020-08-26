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
@js.native
trait PromptEventPipes[T] extends js.Object {
  /**
    * An object representing an error.
    */
  var error: Observable_[FailedPromptStateData] = js.native
  /**
    * A pypeline for succesful inputs.
    */
  var success: Observable_[SuccessfulPromptStateData[T]] = js.native
}

object PromptEventPipes {
  @scala.inline
  def apply[T](error: Observable_[FailedPromptStateData], success: Observable_[SuccessfulPromptStateData[T]]): PromptEventPipes[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptEventPipes[T]]
  }
  @scala.inline
  implicit class PromptEventPipesOps[Self <: PromptEventPipes[_], T] (val x: Self with PromptEventPipes[T]) extends AnyVal {
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
    def setError(value: Observable_[FailedPromptStateData]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Observable_[SuccessfulPromptStateData[T]]): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

