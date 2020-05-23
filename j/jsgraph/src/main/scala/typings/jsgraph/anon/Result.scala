package typings.jsgraph.anon

import typings.jsgraph.mod.DirectedGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var result: DirectedGraph
}

object Result {
  @scala.inline
  def apply(result: DirectedGraph): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

