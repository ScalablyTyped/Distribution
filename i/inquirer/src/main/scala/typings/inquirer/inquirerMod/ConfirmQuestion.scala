package typings.inquirer.inquirerMod

import typings.inquirer.inquirerStrings.confirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmQuestion[A]
  extends QuestionCommon[A]
     with QuestionOptions[A]
     with Question[A] {
  var `type`: confirm
}

object ConfirmQuestion {
  @scala.inline
  def apply[A](
    `type`: confirm,
    choices: js.Array[ChoiceType[A]] | (js.Function1[A, js.Array[ChoiceType[A]] | js.Promise[js.Array[ChoiceType[A]]]]) = null,
    default: String | Double | Boolean | js.Array[_] | (js.Function1[A, _ | js.Promise[_]]) = null,
    filter: /* input */ String => _ = null,
    message: String | (js.Function1[A, String]) = null,
    name: String = null,
    pageSize: Int | Double = null,
    prefix: String = null,
    suffix: String = null,
    transformer: (/* input */ String, A, /* flags */ js.Any) => String = null,
    when: Boolean | (js.Function1[A, Boolean | js.Promise[Boolean]]) = null
  ): ConfirmQuestion[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (transformer != null) __obj.updateDynamic("transformer")(js.Any.fromFunction3(transformer))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmQuestion[A]]
  }
}

