package typings
package atIonicCliDashFrameworkLib.libPromptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptQuestionBase
  extends inquirerLib.inquirerMod.inquirerNs.Question[inquirerLib.inquirerMod.inquirerNs.Answers] {
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
  var message_PromptQuestionBase: java.lang.String
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
    message: java.lang.String,
    `type`: PromptType,
    choices: js.Array[inquirerLib.inquirerMod.inquirerNs.ChoiceType] | (js.Function1[
      inquirerLib.inquirerMod.inquirerNs.Answers, 
      js.Array[inquirerLib.inquirerMod.inquirerNs.ChoiceType]
    ]) | (js.Function1[
      inquirerLib.inquirerMod.inquirerNs.Answers, 
      js.Promise[js.Array[inquirerLib.inquirerMod.inquirerNs.ChoiceType]]
    ]) = null,
    default: PromptValue = null,
    fallback: PromptValue = null,
    filter: /* input */ java.lang.String => _ = null,
    mask: java.lang.String = null,
    name: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    paginated: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null,
    transformer: /* input */ java.lang.String => java.lang.String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[inquirerLib.inquirerMod.inquirerNs.Answers]) => scala.Boolean | java.lang.String | (js.Promise[scala.Boolean | java.lang.String]) = null,
    when: scala.Boolean | (js.Function1[inquirerLib.inquirerMod.inquirerNs.Answers, scala.Boolean]) | (js.Function1[inquirerLib.inquirerMod.inquirerNs.Answers, js.Promise[scala.Boolean]]) = null
  ): PromptQuestionBase = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paginated)) __obj.updateDynamic("paginated")(paginated)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (transformer != null) __obj.updateDynamic("transformer")(js.Any.fromFunction1(transformer))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptQuestionBase]
  }
}

