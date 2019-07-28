package typings.mathjs.mathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Help extends js.Object {
  def toJSON(): String
}

object Help {
  @scala.inline
  def apply(toJSON: () => String, toString: () => String): Help = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Help]
  }
}

