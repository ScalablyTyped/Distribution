package typings.inquirer

import typings.inquirer.choicesMod.^
import typings.inquirer.mod.Answers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChoices extends js.Object {
  /**
    * The choices of the prompt.
    */
  var choices: ^[Answers]
}

object AnonChoices {
  @scala.inline
  def apply(choices: ^[Answers]): AnonChoices = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChoices]
  }
}

