package typings.inquirer.mod

import typings.inquirer.inquirerStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `CheckboxPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait CheckboxQuestion[T /* <: Answers */] extends ListQuestionOptionsBase[T, CheckboxChoiceMap[T]] {
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_CheckboxQuestion: checkbox = js.native
}

object CheckboxQuestion {
  @scala.inline
  def apply[/* <: typings.inquirer.mod.Answers */ T](`type`: checkbox): CheckboxQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxQuestion[T]]
  }
  @scala.inline
  implicit class CheckboxQuestionOps[Self <: CheckboxQuestion[_], /* <: typings.inquirer.mod.Answers */ T] (val x: Self with CheckboxQuestion[T]) extends AnyVal {
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
    def setType(value: checkbox): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

