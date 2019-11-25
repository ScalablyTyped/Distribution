package typings.inquirer

import typings.inquirer.inquirerMod.Answers
import typings.inquirer.libObjectsChoicesMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Choices extends js.Object {
  /**
    * The choices of the prompt.
    */
  var choices: ^[Answers]
}

object Anon_Choices {
  @scala.inline
  def apply(choices: ^[Answers]): Anon_Choices = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Choices]
  }
}

