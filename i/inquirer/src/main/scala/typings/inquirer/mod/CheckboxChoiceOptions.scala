package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a choice of the `CheckboxPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait CheckboxChoiceOptions[T /* <: Answers */] extends ListChoiceOptions[T] {
  /**
    * A value indicating whether the choice should be initially checked.
    */
  var checked: js.UndefOr[Boolean] = js.native
}

object CheckboxChoiceOptions {
  @scala.inline
  def apply[/* <: typings.inquirer.mod.Answers */ T](): CheckboxChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxChoiceOptions[T]]
  }
  @scala.inline
  implicit class CheckboxChoiceOptionsOps[Self <: CheckboxChoiceOptions[_], /* <: typings.inquirer.mod.Answers */ T] (val x: Self with CheckboxChoiceOptions[T]) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
  }
  
}

