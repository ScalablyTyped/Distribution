package typings.atIonicCliDashFramework.libPromptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptQuestionCheckbox
  extends PromptQuestionBase
     with PromptQuestion {
  @JSName("default")
  var default_PromptQuestionCheckbox: js.UndefOr[PromptValueCheckbox] = js.undefined
  @JSName("fallback")
  var fallback_PromptQuestionCheckbox: js.UndefOr[PromptValueCheckbox] = js.undefined
  @JSName("type")
  var type_PromptQuestionCheckbox: PromptTypeCheckbox
}

object PromptQuestionCheckbox {
  @scala.inline
  def apply(
    message: String,
    `type`: PromptTypeCheckbox,
    default: PromptValueCheckbox = null,
    fallback: PromptValueCheckbox = null
  ): PromptQuestionCheckbox = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    __obj.asInstanceOf[PromptQuestionCheckbox]
  }
}

