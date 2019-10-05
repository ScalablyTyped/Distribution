package typings.inquirer.inquirerMod

import typings.inquirer.libObjectsChoiceMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for the `CheckboxQuestion`.
  *
  * @template T
  * The type of the answers.
  */
trait CheckboxChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  var CheckboxChoiceOptions: typings.inquirer.inquirerMod.CheckboxChoiceOptions[T]
}

object CheckboxChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    CheckboxChoiceOptions: CheckboxChoiceOptions[T],
    Choice: ^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typings.inquirer.libObjectsSeparatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): CheckboxChoiceMap[T] = {
    val __obj = js.Dynamic.literal(CheckboxChoiceOptions = CheckboxChoiceOptions, Choice = Choice, ChoiceOptions = ChoiceOptions, Separator = Separator, SeparatorOptions = SeparatorOptions)
  
    __obj.asInstanceOf[CheckboxChoiceMap[T]]
  }
}

