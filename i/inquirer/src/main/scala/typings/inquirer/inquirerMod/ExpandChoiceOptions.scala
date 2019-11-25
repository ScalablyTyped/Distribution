package typings.inquirer.inquirerMod

import typings.inquirer.inquirerStrings.choice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a choice of the `ExpandPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait ExpandChoiceOptions[T /* <: Answers */] extends ChoiceOptions[T] {
  /**
    * The key to press for selecting the choice.
    */
  var key: js.UndefOr[String] = js.undefined
}

object ExpandChoiceOptions {
  @scala.inline
  def apply[T /* <: Answers */](
    extra: js.Any = null,
    key: String = null,
    name: String = null,
    short: String = null,
    `type`: choice = null,
    value: js.Any = null
  ): ExpandChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandChoiceOptions[T]]
  }
}

