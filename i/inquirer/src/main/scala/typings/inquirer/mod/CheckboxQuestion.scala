package typings.inquirer.mod

import typings.inquirer.inquirerStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question for the `CheckboxPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait CheckboxQuestion[T /* <: Answers */] extends ListQuestionOptionsBase[T, CheckboxChoiceMap[T]] {
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_CheckboxQuestion: checkbox
}

object CheckboxQuestion {
  @scala.inline
  def apply[T /* <: Answers */](
    `type`: checkbox,
    choices: AsyncDynamicQuestionProperty[js.Array[DistinctChoice[CheckboxChoiceMap[T]]], T] = null,
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    pageSize: Int | Double = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): CheckboxQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxQuestion[T]]
  }
}

