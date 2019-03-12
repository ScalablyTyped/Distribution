package typings
package atIonicCliDashFrameworkLib.libPromptsMod

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
    message: java.lang.String,
    `type`: PromptTypeOther,
    choices: js.Array[inquirerLib.inquirerMod.inquirerNs.ChoiceType] | (js.Function1[
      inquirerLib.inquirerMod.inquirerNs.Answers, 
      js.Array[inquirerLib.inquirerMod.inquirerNs.ChoiceType]
    ]) | (js.Function1[
      inquirerLib.inquirerMod.inquirerNs.Answers, 
      js.Promise[js.Array[inquirerLib.inquirerMod.inquirerNs.ChoiceType]]
    ]) = null,
    default: PromptValueOther = null,
    fallback: PromptValueOther = null,
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
  ): PromptQuestionOther = {
    val __obj = js.Dynamic.literal(message = message)
    __obj.updateDynamic("type")(`type`)
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
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
    __obj.asInstanceOf[PromptQuestionOther]
  }
}

