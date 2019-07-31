package typings.inquirer.inquirerMod

import typings.inquirer.inquirerStrings.choice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a choice of the `CheckboxPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait CheckboxChoiceOptions[T /* <: Answers */] extends ListChoiceOptions[T] {
  /**
    * A value indicating whether the choice should be initially checked.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
}

object CheckboxChoiceOptions {
  @scala.inline
  def apply[T /* <: Answers */](
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: DynamicQuestionProperty[Boolean | String, T] = null,
    extra: js.Any = null,
    name: String = null,
    short: String = null,
    `type`: choice = null,
    value: js.Any = null
  ): CheckboxChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (name != null) __obj.updateDynamic("name")(name)
    if (short != null) __obj.updateDynamic("short")(short)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CheckboxChoiceOptions[T]]
  }
}

