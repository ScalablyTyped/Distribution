package typings
package immerLib.immerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Patch extends js.Object {
  var op: immerLib.immerLibStrings.replace | immerLib.immerLibStrings.remove | immerLib.immerLibStrings.add
  var path: js.Array[java.lang.String | scala.Double]
  var value: js.UndefOr[js.Any] = js.undefined
}

object Patch {
  @scala.inline
  def apply(
    op: immerLib.immerLibStrings.replace | immerLib.immerLibStrings.remove | immerLib.immerLibStrings.add,
    path: js.Array[java.lang.String | scala.Double],
    value: js.Any = null
  ): Patch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Patch]
  }
}

