package typings.jsgraph.jsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  var u: String
  var v: String
}

object Edge {
  @scala.inline
  def apply(u: String, v: String): Edge = {
    val __obj = js.Dynamic.literal(u = u, v = v)
  
    __obj.asInstanceOf[Edge]
  }
}

