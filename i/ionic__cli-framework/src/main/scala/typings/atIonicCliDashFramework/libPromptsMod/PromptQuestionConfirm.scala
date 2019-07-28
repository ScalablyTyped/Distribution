package typings.atIonicCliDashFramework.libPromptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptQuestionConfirm
  extends PromptQuestionBase
     with PromptQuestion {
  @JSName("default")
  var default_PromptQuestionConfirm: js.UndefOr[PromptValueConfirm] = js.undefined
  @JSName("fallback")
  var fallback_PromptQuestionConfirm: js.UndefOr[PromptValueConfirm] = js.undefined
  @JSName("type")
  var type_PromptQuestionConfirm: PromptTypeConfirm
}

object PromptQuestionConfirm {
  @scala.inline
  def apply(
    message: String,
    `type`: PromptTypeConfirm,
    default: js.UndefOr[PromptValueConfirm] = js.undefined,
    fallback: js.UndefOr[PromptValueConfirm] = js.undefined
  ): PromptQuestionConfirm = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback)
    __obj.asInstanceOf[PromptQuestionConfirm]
  }
}

