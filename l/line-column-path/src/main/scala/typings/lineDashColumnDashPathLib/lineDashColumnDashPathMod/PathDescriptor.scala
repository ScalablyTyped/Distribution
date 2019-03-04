package typings
package lineDashColumnDashPathLib.lineDashColumnDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathDescriptor extends js.Object {
  var column: js.UndefOr[scala.Double] = js.undefined
  var file: java.lang.String
  var line: js.UndefOr[scala.Double] = js.undefined
}

object PathDescriptor {
  @scala.inline
  def apply(
    file: java.lang.String,
    column: scala.Int | scala.Double = null,
    line: scala.Int | scala.Double = null
  ): PathDescriptor = {
    val __obj = js.Dynamic.literal(file = file)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDescriptor]
  }
}

