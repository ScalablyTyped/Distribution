package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBeforeAssign extends js.Object {
  var beforeAssign: Double
  var defaults: js.Array[js.Object]
  var types: js.Array[_]
  def adapterArgs(mapper: js.Any, records: js.Any, opts: js.Any): js.Array[_]
}

object AnonBeforeAssign {
  @scala.inline
  def apply(
    adapterArgs: (js.Any, js.Any, js.Any) => js.Array[_],
    beforeAssign: Double,
    defaults: js.Array[js.Object],
    types: js.Array[_]
  ): AnonBeforeAssign = {
    val __obj = js.Dynamic.literal(adapterArgs = js.Any.fromFunction3(adapterArgs), beforeAssign = beforeAssign.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBeforeAssign]
  }
}

