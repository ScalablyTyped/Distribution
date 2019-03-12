package typings
package mathjsLib.mathjsMod.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Help extends js.Object {
  def toJSON(): java.lang.String
}

object Help {
  @scala.inline
  def apply(toJSON: () => java.lang.String, toString: () => java.lang.String): Help = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Help]
  }
}

