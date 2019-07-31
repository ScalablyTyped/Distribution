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
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (key != null) __obj.updateDynamic("key")(key)
    if (name != null) __obj.updateDynamic("name")(name)
    if (short != null) __obj.updateDynamic("short")(short)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ExpandChoiceOptions[T]]
  }
}

