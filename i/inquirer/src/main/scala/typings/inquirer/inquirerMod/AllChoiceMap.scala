package typings.inquirer.inquirerMod

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
  var BaseChoiceMap: typings.inquirer.libObjectsChoiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.^ 
  var CheckboxChoiceMap: SeparatorOptions | CheckboxChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^  | ChoiceOptions[T] | typings.inquirer.libObjectsChoiceMod.^[T]
  var ExpandChoiceMap: SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.^  | ChoiceOptions[T] | typings.inquirer.libObjectsChoiceMod.^[T] | ExpandChoiceOptions[T]
  var ListChoiceMap: SeparatorOptions | ListChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^  | ChoiceOptions[T] | typings.inquirer.libObjectsChoiceMod.^[T]
}

object AllChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    BaseChoiceMap: typings.inquirer.libObjectsChoiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.^ ,
    CheckboxChoiceMap: SeparatorOptions | CheckboxChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^  | ChoiceOptions[T] | typings.inquirer.libObjectsChoiceMod.^[T],
    ExpandChoiceMap: SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.^  | ChoiceOptions[T] | typings.inquirer.libObjectsChoiceMod.^[T] | ExpandChoiceOptions[T],
    ListChoiceMap: SeparatorOptions | ListChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^  | ChoiceOptions[T] | typings.inquirer.libObjectsChoiceMod.^[T]
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
}

