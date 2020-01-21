package typings.inquirer.mod

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
  var Choice: typings.inquirer.choiceMod.^[T]
  var ChoiceOptions: typings.inquirer.mod.ChoiceOptions[T]
  var Separator: typings.inquirer.separatorMod.^
  var SeparatorOptions: typings.inquirer.mod.SeparatorOptions
}

object BaseChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    Choice: typings.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typings.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): BaseChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseChoiceMap[T]]
  }
}

