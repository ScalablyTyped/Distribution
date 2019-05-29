package typings
package inquirerLib.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmQuestion[A]
  extends QuestionCommon[A]
     with QuestionOptions[A]
     with Question[A] {
  var `type`: inquirerLib.inquirerLibStrings.confirm
}

object ConfirmQuestion {
  @scala.inline
  def apply[A](
    `type`: inquirerLib.inquirerLibStrings.confirm,
    choices: js.Array[ChoiceType[A]] | (js.Function1[A, js.Array[ChoiceType[A]] | js.Promise[js.Array[ChoiceType[A]]]]) = null,
    default: java.lang.String | scala.Double | scala.Boolean | js.Array[_] | (js.Function1[A, _ | js.Promise[_]]) = null,
    filter: /* input */ java.lang.String => _ = null,
    message: java.lang.String | (js.Function1[A, java.lang.String]) = null,
    name: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null,
    transformer: (/* input */ java.lang.String, A, /* flags */ js.Any) => java.lang.String = null,
    when: scala.Boolean | (js.Function1[A, scala.Boolean | js.Promise[scala.Boolean]]) = null
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

