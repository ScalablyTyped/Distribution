package typings.inquirer.libObjectsChoiceMod

import typings.inquirer.inquirerMod.Answers
import typings.inquirer.inquirerMod.CheckboxChoiceOptions
import typings.inquirer.inquirerStrings.choice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a choice for several question-types.
  *
  * @template T
  * The type of the answers.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.inquirer.inquirerMod.ExpandChoiceOptions because var conflicts: extra, name, short, `type`, value. Inlined key */ trait Choice[T /* <: Answers */] extends CheckboxChoiceOptions[T] {
  /**
    * @inheritdoc
    */
  @JSName("disabled")
  var disabled_Choice: Boolean
  /**
    * The key to press for selecting the choice.
    *
    * @inheritdoc
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * @inheritdoc
    */
  @JSName("name")
  var name_Choice: String
  /**
    * @inheritdoc
    */
  @JSName("short")
  var short_Choice: String
}

object Choice {
  @scala.inline
  def apply[T /* <: Answers */](
    disabled: Boolean,
    name: String,
    short: String,
    value: js.Any,
    checked: js.UndefOr[Boolean] = js.undefined,
    extra: js.Any = null,
    key: String = null,
    `type`: choice = null
  ): Choice[T] = {
    val __obj = js.Dynamic.literal(disabled = disabled, name = name, short = short, value = value)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (key != null) __obj.updateDynamic("key")(key)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Choice[T]]
  }
}

