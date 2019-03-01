package typings
package atIonicCliDashFrameworkLib.utilsFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordWrapOptions extends js.Object {
  var append: js.UndefOr[java.lang.String] = js.undefined
  var indentation: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object WordWrapOptions {
  @scala.inline
  def apply(
    append: java.lang.String = null,
    indentation: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): WordWrapOptions = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append)
    if (indentation != null) __obj.updateDynamic("indentation")(indentation.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordWrapOptions]
  }
}

