package typings.atIonicCliDashFramework.libPromptsMod

import typings.inquirer.inquirerMod.Answers
import typings.inquirer.inquirerMod.AsyncDynamicQuestionProperty
import typings.inquirer.inquirerMod.KeyUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptQuestionBase
  extends typings.inquirer.inquirerMod.Question[Answers] {
  /**
    * Default value to use if nothing is entered.
    */
  @JSName("default")
  var default_PromptQuestionBase: js.UndefOr[PromptValue] = js.undefined
  /**
    * The fallback value to use in non-TTY mode.
    */
  var fallback: js.UndefOr[PromptValue] = js.undefined
  /**
    * The question to print.
    */
  @JSName("message")
  var message_PromptQuestionBase: String
  /**
    * The prompt type for this question.
    *    - 'confirm': Y/n
    *    - 'checkbox': Multi-value selection.
    *    - 'input': Text input.
    *    - 'password': Masked text input.
    *    - 'list': Single-value selection.
    */
  @JSName("type")
  var type_PromptQuestionBase: PromptType
}

object PromptQuestionBase {
  @scala.inline
  def apply(
    message: String,
    `type`: PromptType,
    default: PromptValue = null,
    fallback: PromptValue = null,
    filter: /* input */ js.Any => _ = null,
    name: KeyUnion[Answers] = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[Answers]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, Answers] = null
  ): PromptQuestionBase = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptQuestionBase]
  }
}

