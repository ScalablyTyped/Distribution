package typings.inquirer.mod.prompts

import typings.inquirer.inquirerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data about the failed state of a prompt.
  */
@js.native
trait FailedPromptStateData extends PromptStateData {
  /**
    * @inheritdoc
    */
  @JSName("isValid")
  var isValid_FailedPromptStateData: `false` | String = js.native
}

object FailedPromptStateData {
  @scala.inline
  def apply(isValid: `false` | String): FailedPromptStateData = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedPromptStateData]
  }
  @scala.inline
  implicit class FailedPromptStateDataOps[Self <: FailedPromptStateData] (val x: Self) extends AnyVal {
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
    def setIsValid(value: `false` | String): Self = this.set("isValid", value.asInstanceOf[js.Any])
  }
  
}

