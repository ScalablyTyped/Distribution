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
  def apply(file: String, column: js.UndefOr[Double] = js.undefined, line: js.UndefOr[Double] = js.undefined): PathDescriptor = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDescriptor]
  }
}

