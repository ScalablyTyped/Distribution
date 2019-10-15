package typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod

import typings.inquirer.inquirerMod.Answers
import typings.inquirer.inquirerMod.AsyncDynamicQuestionProperty
import typings.inquirer.inquirerMod.KeyUnion
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
    fallback: PromptValueCheckbox = null,
    filter: /* input */ js.Any => _ = null,
    name: KeyUnion[Answers] = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[Answers]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, Answers] = null
  ): PromptQuestionCheckbox = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptQuestionCheckbox]
  }
}

