package typings.inquirer.mod.ui

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
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchedAnswer]
  }
}

