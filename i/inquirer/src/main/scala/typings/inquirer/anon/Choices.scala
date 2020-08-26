package typings.inquirer.anon

import typings.inquirer.choicesMod.^
import typings.inquirer.mod.Answers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Choices extends js.Object {
  /**
    * The choices of the prompt.
    */
  var choices: ^[Answers] = js.native
}

object Choices {
  @scala.inline
  def apply(choices: ^[Answers]): Choices = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choices]
  }
  @scala.inline
  implicit class ChoicesOps[Self <: Choices] (val x: Self) extends AnyVal {
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
    def setChoices(value: ^[Answers]): Self = this.set("choices", value.asInstanceOf[js.Any])
  }
  
}

