package typings.inquirer.inquirerMod

import typings.inquirer.libObjectsChoiceMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for the `ExpandQuestion`.
  *
  * @template T
  * The type of the answers.
  */
trait ExpandChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  var ExpandChoiceOptions: typings.inquirer.inquirerMod.ExpandChoiceOptions[T]
}

object ExpandChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    Choice: ^[T],
    ChoiceOptions: ChoiceOptions[T],
    ExpandChoiceOptions: ExpandChoiceOptions[T],
    Separator: typings.inquirer.libObjectsSeparatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): ExpandChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice, ChoiceOptions = ChoiceOptions, ExpandChoiceOptions = ExpandChoiceOptions, Separator = Separator, SeparatorOptions = SeparatorOptions)
  
    __obj.asInstanceOf[ExpandChoiceMap[T]]
  }
}

