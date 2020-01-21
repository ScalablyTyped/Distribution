package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question.
  *
  * @template T
  * The type of the answers.
  */
trait Question[T /* <: Answers */] extends js.Object {
  /**
    * The default value of the question.
    */
  var default: js.UndefOr[AsyncDynamicQuestionProperty[_, T]] = js.undefined
  /**
    * Post-processes the answer.
    *
    * @param input
    * The answer provided by the user.
    */
  var filter: js.UndefOr[js.Function1[/* input */ js.Any, _]] = js.undefined
  /**
    * The message to show to the user.
    */
  var message: js.UndefOr[AsyncDynamicQuestionProperty[String, T]] = js.undefined
  /**
    * The key to save the answer to the answers-hash.
    */
  var name: js.UndefOr[KeyUnion[T]] = js.undefined
  /**
    * The prefix of the `message`.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * The suffix of the `message`.
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * The type of the question.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Validates the integrity of the answer.
    *
    * @param input
    * The answer provided by the user.
    *
    * @param answers
    * The answers provided by the user.
    *
    * @returns
    * Either a value indicating whether the answer is valid or a `string` which describes the error.
    */
  var validate: js.UndefOr[
    js.Function2[
      /* input */ js.Any, 
      /* answers */ js.UndefOr[T], 
      Boolean | String | (js.Promise[Boolean | String])
    ]
  ] = js.undefined
  /**
    * A value indicating whether the question should be prompted.
    */
  var when: js.UndefOr[AsyncDynamicQuestionProperty[Boolean, T]] = js.undefined
}

object Question {
  @scala.inline
  def apply[T /* <: Answers */](
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    prefix: String = null,
    suffix: String = null,
    `type`: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): Question[T] = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[Question[T]]
  }
}

