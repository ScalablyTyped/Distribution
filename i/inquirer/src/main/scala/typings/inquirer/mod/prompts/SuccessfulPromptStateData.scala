package typings.inquirer.mod.prompts

import typings.inquirer.inquirerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data about the successful state of a prompt.
  *
  * @param T
  * The type of the answer.
  */
@js.native
trait SuccessfulPromptStateData[T] extends PromptStateData {
  /**
    * @inheritdoc
    */
  @JSName("isValid")
  var isValid_SuccessfulPromptStateData: `true` = js.native
  /**
    * The value of the prompt.
    */
  var value: T = js.native
}

object SuccessfulPromptStateData {
  @scala.inline
  def apply[T](isValid: `true`, value: T): SuccessfulPromptStateData[T] = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessfulPromptStateData[T]]
  }
  @scala.inline
  implicit class SuccessfulPromptStateDataOps[Self <: SuccessfulPromptStateData[_], T] (val x: Self with SuccessfulPromptStateData[T]) extends AnyVal {
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
    def setIsValid(value: `true`): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

