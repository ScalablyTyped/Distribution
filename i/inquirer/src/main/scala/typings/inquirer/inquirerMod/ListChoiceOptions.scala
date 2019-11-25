package typings.inquirer.inquirerMod

import typings.inquirer.inquirerStrings.choice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a choice of the `ListPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait ListChoiceOptions[T /* <: Answers */] extends ChoiceOptions[T] {
  /**
    * A value indicating whether the choice is disabled.
    */
  var disabled: js.UndefOr[DynamicQuestionProperty[Boolean | String, T]] = js.undefined
}

object ListChoiceOptions {
  @scala.inline
  def apply[T /* <: Answers */](
    disabled: DynamicQuestionProperty[Boolean | String, T] = null,
    extra: js.Any = null,
    name: String = null,
    short: String = null,
    `type`: choice = null,
    value: js.Any = null
  ): ListChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChoiceOptions[T]]
  }
}

