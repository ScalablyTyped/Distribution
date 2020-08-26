package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for the `ExpandQuestion`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ExpandChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  var ExpandChoiceOptions: typings.inquirer.mod.ExpandChoiceOptions[T] = js.native
}

object ExpandChoiceMap {
  @scala.inline
  def apply[/* <: typings.inquirer.mod.Answers */ T](
    Choice: typings.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    ExpandChoiceOptions: ExpandChoiceOptions[T],
    Separator: typings.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): ExpandChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], ExpandChoiceOptions = ExpandChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandChoiceMap[T]]
  }
  @scala.inline
  implicit class ExpandChoiceMapOps[Self <: ExpandChoiceMap[_], /* <: typings.inquirer.mod.Answers */ T] (val x: Self with ExpandChoiceMap[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpandChoiceOptions(value: ExpandChoiceOptions[T]): Self = this.set("ExpandChoiceOptions", value.asInstanceOf[js.Any])
  }
  
}

