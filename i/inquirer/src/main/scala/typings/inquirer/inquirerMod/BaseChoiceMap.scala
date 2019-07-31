package typings.inquirer.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for any kind of question.
  *
  * @template T
  * The type of the answers.
  */
trait BaseChoiceMap[T /* <: Answers */] extends js.Object {
  var Choice: typings.inquirer.libObjectsChoiceMod.^[T]
  var ChoiceOptions: typings.inquirer.inquirerMod.ChoiceOptions[T]
  var Separator: typings.inquirer.libObjectsSeparatorMod.^
  var SeparatorOptions: typings.inquirer.inquirerMod.SeparatorOptions
}

object BaseChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    Choice: typings.inquirer.libObjectsChoiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typings.inquirer.libObjectsSeparatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): BaseChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice, ChoiceOptions = ChoiceOptions, Separator = Separator, SeparatorOptions = SeparatorOptions)
  
    __obj.asInstanceOf[BaseChoiceMap[T]]
  }
}

