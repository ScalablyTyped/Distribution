package typings.atIonicCliDashFramework.utilsFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnarOptions extends js.Object {
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  var hsep: js.UndefOr[String] = js.undefined
  var vsep: js.UndefOr[String] = js.undefined
}

object ColumnarOptions {
  @scala.inline
  def apply(headers: js.Array[String] = null, hsep: String = null, vsep: String = null): ColumnarOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hsep != null) __obj.updateDynamic("hsep")(hsep.asInstanceOf[js.Any])
    if (vsep != null) __obj.updateDynamic("vsep")(vsep.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnarOptions]
  }
}

