package typings
package jsgraphLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var result: js.UndefOr[jsgraphLib.jsgraphMod.jsgraphNs.DirectedGraph] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(error: js.Any = null, result: jsgraphLib.jsgraphMod.jsgraphNs.DirectedGraph = null): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_Error]
  }
}

