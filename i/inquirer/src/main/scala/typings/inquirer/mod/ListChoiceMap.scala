package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides all valid choice-types for the `ListQuestion`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ListChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  var ListChoiceOptions: typings.inquirer.mod.ListChoiceOptions[T] = js.native
}

object ListChoiceMap {
  @scala.inline
  def apply[/* <: typings.inquirer.mod.Answers */ T](
    Choice: typings.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    ListChoiceOptions: ListChoiceOptions[T],
    Separator: typings.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): ListChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], ListChoiceOptions = ListChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChoiceMap[T]]
  }
  @scala.inline
  implicit class ListChoiceMapOps[Self <: ListChoiceMap[_], /* <: typings.inquirer.mod.Answers */ T] (val x: Self with ListChoiceMap[T]) extends AnyVal {
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
    def setListChoiceOptions(value: ListChoiceOptions[T]): Self = this.set("ListChoiceOptions", value.asInstanceOf[js.Any])
  }
  
}

