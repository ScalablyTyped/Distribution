package typings.inquirer.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corresponding to the answer object creation in:
  * https://github.com/SBoudrias/Inquirer.js/blob/ff075f587ef78504f0eae4ee5ca0656432429026/packages/inquirer/lib/ui/prompt.js#L88
  */
trait Answer extends js.Object {
  var answer: js.Any
  var name: String
}

object Answer {
  @scala.inline
  def apply(answer: js.Any, name: String): Answer = {
    val __obj = js.Dynamic.literal(answer = answer, name = name)
  
    __obj.asInstanceOf[Answer]
  }
}

