package typings.atIonicCliDashFramework.libPromptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptQuestionOther
  extends PromptQuestionBase
     with PromptQuestion {
  @JSName("default")
  var default_PromptQuestionOther: js.UndefOr[PromptValueOther] = js.undefined
  @JSName("fallback")
  var fallback_PromptQuestionOther: js.UndefOr[PromptValueOther] = js.undefined
  @JSName("type")
  var type_PromptQuestionOther: PromptTypeOther
}

object PromptQuestionOther {
  @scala.inline
  def apply(
    message: String,
    `type`: PromptTypeOther,
    default: PromptValueOther = null,
    fallback: PromptValueOther = null
  ): PromptQuestionOther = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    __obj.asInstanceOf[PromptQuestionOther]
  }
}

