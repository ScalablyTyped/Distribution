package typings.handsontable.handsontableMod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumericFormatOptions extends js.Object {
  var culture: js.UndefOr[String] = js.undefined
  var pattern: String
}

object NumericFormatOptions {
  @scala.inline
  def apply(pattern: String, culture: String = null): NumericFormatOptions = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericFormatOptions]
  }
}

