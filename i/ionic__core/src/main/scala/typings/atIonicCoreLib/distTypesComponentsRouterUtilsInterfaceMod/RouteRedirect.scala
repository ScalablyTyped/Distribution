package typings
package atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteRedirect extends js.Object {
  var from: js.Array[java.lang.String]
  var to: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RouteRedirect {
  @scala.inline
  def apply(from: js.Array[java.lang.String], to: js.Array[java.lang.String] = null): RouteRedirect = {
    val __obj = js.Dynamic.literal(from = from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[RouteRedirect]
  }
}

