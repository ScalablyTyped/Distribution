package typings.inquirer.inquirerMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a fetched answer.
  */
trait FetchedAnswer extends js.Object {
  /**
    * The value of the answer.
    */
  var answer: js.Any
  /**
    * The name of the answer.
    */
  var name: String
}

object FetchedAnswer {
  @scala.inline
  def apply(answer: js.Any, name: String): FetchedAnswer = {
    val __obj = js.Dynamic.literal(answer = answer, name = name)
  
    __obj.asInstanceOf[FetchedAnswer]
  }
}

