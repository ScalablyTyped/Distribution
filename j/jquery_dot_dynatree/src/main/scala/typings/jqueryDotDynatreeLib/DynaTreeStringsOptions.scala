package typings
package jqueryDotDynatreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynaTreeStringsOptions extends js.Object {
  var loadError: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[java.lang.String] = js.undefined
}

object DynaTreeStringsOptions {
  @scala.inline
  def apply(loadError: java.lang.String = null, loading: java.lang.String = null): DynaTreeStringsOptions = {
    val __obj = js.Dynamic.literal()
    if (loadError != null) __obj.updateDynamic("loadError")(loadError)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    __obj.asInstanceOf[DynaTreeStringsOptions]
  }
}

