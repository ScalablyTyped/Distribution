package typings.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Help extends js.Object {
  def toJSON(): String
}

object Help {
  @scala.inline
  def apply(toJSON: () => String): Help = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Help]
  }
}

