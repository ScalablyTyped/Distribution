package typings
package handsontableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReadOnly extends js.Object {
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[Anon_Height] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ReadOnly {
  @scala.inline
  def apply(
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    style: Anon_Height = null,
    value: java.lang.String = null
  ): Anon_ReadOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ReadOnly]
  }
}

