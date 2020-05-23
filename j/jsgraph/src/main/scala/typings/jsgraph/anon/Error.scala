package typings.jsgraph.anon

import typings.jsgraph.mod.DirectedGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var result: js.UndefOr[DirectedGraph] = js.undefined
}

object Error {
  @scala.inline
  def apply(error: js.Any = null, result: DirectedGraph = null): Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

