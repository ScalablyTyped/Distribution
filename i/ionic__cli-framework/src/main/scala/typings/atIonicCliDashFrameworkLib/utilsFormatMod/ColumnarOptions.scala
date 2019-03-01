package typings
package atIonicCliDashFrameworkLib.utilsFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnarOptions extends js.Object {
  var headers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hsep: js.UndefOr[java.lang.String] = js.undefined
  var vsep: js.UndefOr[java.lang.String] = js.undefined
}

object ColumnarOptions {
  @scala.inline
  def apply(
    headers: js.Array[java.lang.String] = null,
    hsep: java.lang.String = null,
    vsep: java.lang.String = null
  ): ColumnarOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hsep != null) __obj.updateDynamic("hsep")(hsep)
    if (vsep != null) __obj.updateDynamic("vsep")(vsep)
    __obj.asInstanceOf[ColumnarOptions]
  }
}

