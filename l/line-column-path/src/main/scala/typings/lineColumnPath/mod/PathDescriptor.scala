package typings.lineColumnPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathDescriptor extends js.Object {
  val column: js.UndefOr[Double] = js.undefined
  val file: String
  val line: js.UndefOr[Double] = js.undefined
}

object PathDescriptor {
  @scala.inline
  def apply(file: String, column: Int | Double = null, line: Int | Double = null): PathDescriptor = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDescriptor]
  }
}

