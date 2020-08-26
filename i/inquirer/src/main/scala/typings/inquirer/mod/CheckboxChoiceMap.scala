package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for the `CheckboxQuestion`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait CheckboxChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  var CheckboxChoiceOptions: typings.inquirer.mod.CheckboxChoiceOptions[T] = js.native
}

object CheckboxChoiceMap {
  @scala.inline
  def apply[/* <: typings.inquirer.mod.Answers */ T](
    CheckboxChoiceOptions: CheckboxChoiceOptions[T],
    Choice: typings.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typings.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): CheckboxChoiceMap[T] = {
    val __obj = js.Dynamic.literal(CheckboxChoiceOptions = CheckboxChoiceOptions.asInstanceOf[js.Any], Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxChoiceMap[T]]
  }
  @scala.inline
  implicit class CheckboxChoiceMapOps[Self <: CheckboxChoiceMap[_], /* <: typings.inquirer.mod.Answers */ T] (val x: Self with CheckboxChoiceMap[T]) extends AnyVal {
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
    def setCheckboxChoiceOptions(value: CheckboxChoiceOptions[T]): Self = this.set("CheckboxChoiceOptions", value.asInstanceOf[js.Any])
  }
  
}

