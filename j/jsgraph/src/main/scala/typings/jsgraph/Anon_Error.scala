package typings.jsgraph

import typings.jsgraph.jsgraphMod.DirectedGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var result: js.UndefOr[DirectedGraph] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(error: js.Any = null, result: DirectedGraph = null): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Error]
  }
}

