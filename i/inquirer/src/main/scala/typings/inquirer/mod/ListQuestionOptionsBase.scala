package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list-based question.
  *
  * @template T
  * The type of the answers.
  *
  * @template TChoiceMap
  * The valid choices for the question.
  */
trait ListQuestionOptionsBase[T, TChoiceMap] extends Question[T] {
  /**
    * The choices of the prompt.
    */
  var choices: js.UndefOr[AsyncDynamicQuestionProperty[js.Array[DistinctChoice[TChoiceMap]], T]] = js.undefined
  /**
    * The number of elements to show on each page.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}

object ListQuestionOptionsBase {
  @scala.inline
  def apply[T, TChoiceMap](
    choices: AsyncDynamicQuestionProperty[js.Array[DistinctChoice[TChoiceMap]], T] = null,
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    prefix: String = null,
    suffix: String = null,
    `type`: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): ListQuestionOptionsBase[T, TChoiceMap] = {
    val __obj = js.Dynamic.literal()
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQuestionOptionsBase[T, TChoiceMap]]
  }
}

