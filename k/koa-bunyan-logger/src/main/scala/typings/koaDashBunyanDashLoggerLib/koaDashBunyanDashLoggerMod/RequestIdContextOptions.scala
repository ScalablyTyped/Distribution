package typings
package koaDashBunyanDashLoggerLib.koaDashBunyanDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestIdContextOptions extends js.Object {
  var field: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var prop: js.UndefOr[java.lang.String] = js.undefined
  var requestProp: js.UndefOr[java.lang.String] = js.undefined
}

object RequestIdContextOptions {
  @scala.inline
  def apply(
    field: java.lang.String = null,
    header: java.lang.String = null,
    prop: java.lang.String = null,
    requestProp: java.lang.String = null
  ): RequestIdContextOptions = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (header != null) __obj.updateDynamic("header")(header)
    if (prop != null) __obj.updateDynamic("prop")(prop)
    if (requestProp != null) __obj.updateDynamic("requestProp")(requestProp)
    __obj.asInstanceOf[RequestIdContextOptions]
  }
}

