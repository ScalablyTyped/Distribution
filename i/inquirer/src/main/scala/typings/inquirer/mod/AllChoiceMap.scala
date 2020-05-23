package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types.
  *
  * @template T
  * The type of the answers.
  */
trait AllChoiceMap[T /* <: Answers */] extends js.Object {
  var BaseChoiceMap: typings.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typings.inquirer.separatorMod.^ 
  var CheckboxChoiceMap: ChoiceOptions[T] | typings.inquirer.separatorMod.^  | SeparatorOptions | CheckboxChoiceOptions[T] | typings.inquirer.choiceMod.^[T]
  var ExpandChoiceMap: ChoiceOptions[T] | typings.inquirer.separatorMod.^  | SeparatorOptions | ExpandChoiceOptions[T] | typings.inquirer.choiceMod.^[T]
  var ListChoiceMap: ChoiceOptions[T] | typings.inquirer.separatorMod.^  | ListChoiceOptions[T] | SeparatorOptions | typings.inquirer.choiceMod.^[T]
}

object AllChoiceMap {
  @scala.inline
  def apply[T](
    BaseChoiceMap: typings.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typings.inquirer.separatorMod.^ ,
    CheckboxChoiceMap: ChoiceOptions[T] | typings.inquirer.separatorMod.^  | SeparatorOptions | CheckboxChoiceOptions[T] | typings.inquirer.choiceMod.^[T],
    ExpandChoiceMap: ChoiceOptions[T] | typings.inquirer.separatorMod.^  | SeparatorOptions | ExpandChoiceOptions[T] | typings.inquirer.choiceMod.^[T],
    ListChoiceMap: ChoiceOptions[T] | typings.inquirer.separatorMod.^  | ListChoiceOptions[T] | SeparatorOptions | typings.inquirer.choiceMod.^[T]
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
}

