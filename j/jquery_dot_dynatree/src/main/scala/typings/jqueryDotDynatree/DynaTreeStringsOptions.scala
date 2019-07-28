package typings.jqueryDotDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynaTreeStringsOptions extends js.Object {
  var loadError: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[String] = js.undefined
}

object DynaTreeStringsOptions {
  @scala.inline
  def apply(loadError: String = null, loading: String = null): DynaTreeStringsOptions = {
    val __obj = js.Dynamic.literal()
    if (loadError != null) __obj.updateDynamic("loadError")(loadError)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    __obj.asInstanceOf[DynaTreeStringsOptions]
  }
}

