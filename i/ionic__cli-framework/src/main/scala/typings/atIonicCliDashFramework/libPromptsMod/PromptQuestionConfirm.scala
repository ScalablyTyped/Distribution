package typings.atIonicCliDashFramework.libPromptsMod

import typings.inquirer.inquirerMod.Answers
import typings.inquirer.inquirerMod.AsyncDynamicQuestionProperty
import typings.inquirer.inquirerMod.KeyUnion
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
    fallback: js.UndefOr[PromptValueConfirm] = js.undefined,
    filter: /* input */ js.Any => _ = null,
    name: KeyUnion[Answers] = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[Answers]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, Answers] = null
  ): PromptQuestionConfirm = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptQuestionConfirm]
  }
}

