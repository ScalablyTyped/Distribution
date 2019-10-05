package typings.inquirer.inquirerMod

import typings.inquirer.libObjectsChoiceMod.^
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
  var BaseChoiceMap: ^[T] | ChoiceOptions[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.^ 
  var CheckboxChoiceMap: ^[T] | SeparatorOptions | ChoiceOptions[T] | CheckboxChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^ 
  var ExpandChoiceMap: ^[T] | SeparatorOptions | ExpandChoiceOptions[T] | ChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^ 
  var ListChoiceMap: ^[T] | SeparatorOptions | ChoiceOptions[T] | ListChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^ 
}

object AllChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    BaseChoiceMap: ^[T] | ChoiceOptions[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.^ ,
    CheckboxChoiceMap: ^[T] | SeparatorOptions | ChoiceOptions[T] | CheckboxChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^ ,
    ExpandChoiceMap: ^[T] | SeparatorOptions | ExpandChoiceOptions[T] | ChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^ ,
    ListChoiceMap: ^[T] | SeparatorOptions | ChoiceOptions[T] | ListChoiceOptions[T] | typings.inquirer.libObjectsSeparatorMod.^ 
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
}

