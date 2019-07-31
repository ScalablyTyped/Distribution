package typings.inquirer.inquirerMod

import typings.inquirer.inquirerStrings.confirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question for the `ConfirmPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait ConfirmQuestion[T /* <: Answers */]
  extends Question[T]
     with DistinctQuestion[T] {
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ConfirmQuestion: confirm
}

object ConfirmQuestion {
  @scala.inline
  def apply[T /* <: Answers */](
    `type`: confirm,
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => _ = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String]) = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): ConfirmQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmQuestion[T]]
  }
}

