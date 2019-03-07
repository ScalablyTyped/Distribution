package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericFormatOptions extends js.Object {
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var pattern: java.lang.String
}

object NumericFormatOptions {
  @scala.inline
  def apply(pattern: java.lang.String, culture: java.lang.String = null): NumericFormatOptions = {
    val __obj = js.Dynamic.literal(pattern = pattern)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    __obj.asInstanceOf[NumericFormatOptions]
  }
}

