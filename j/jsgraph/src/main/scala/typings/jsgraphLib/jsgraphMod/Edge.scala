package typings
package jsgraphLib.jsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  var u: java.lang.String
  var v: java.lang.String
}

object Edge {
  @scala.inline
  def apply(u: java.lang.String, v: java.lang.String): Edge = {
    val __obj = js.Dynamic.literal(u = u, v = v)
  
    __obj.asInstanceOf[Edge]
  }
}

