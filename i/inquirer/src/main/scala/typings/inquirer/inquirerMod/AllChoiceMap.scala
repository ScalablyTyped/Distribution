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
  var CheckboxChoiceMap: typings.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ChoiceOptions[T] | CheckboxChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^ 
  var ExpandChoiceMap: typings.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ExpandChoiceOptions[T] | ChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^ 
  var ListChoiceMap: typings.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ChoiceOptions[T] | ListChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^ 
}

object AllChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    BaseChoiceMap: typings.inquirer.libObjectsChoiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.^ ,
    CheckboxChoiceMap: typings.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ChoiceOptions[T] | CheckboxChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^ ,
    ExpandChoiceMap: typings.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ExpandChoiceOptions[T] | ChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^ ,
    ListChoiceMap: typings.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ChoiceOptions[T] | ListChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^ 
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
}

