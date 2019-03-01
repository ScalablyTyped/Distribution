package typings
package jsoneditoronlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONFormatterOptions extends js.Object {
  var change: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var indentation: js.UndefOr[scala.Double] = js.undefined
}

object JSONFormatterOptions {
  @scala.inline
  def apply(change: js.Function0[scala.Unit] = null, indentation: scala.Int | scala.Double = null): JSONFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (indentation != null) __obj.updateDynamic("indentation")(indentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONFormatterOptions]
  }
}

