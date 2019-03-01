package typings
package lineDashColumnDashPathLib.lineDashColumnDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  var column: js.UndefOr[scala.Boolean] = js.undefined
  var file: js.UndefOr[scala.Boolean] = js.undefined
}

object StringifyOptions {
  @scala.inline
  def apply(column: js.UndefOr[scala.Boolean] = js.undefined, file: js.UndefOr[scala.Boolean] = js.undefined): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column)
    if (!js.isUndefined(file)) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[StringifyOptions]
  }
}

