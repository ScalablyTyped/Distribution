package typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteRedirect extends js.Object {
  var from: js.Array[String]
  var to: js.UndefOr[js.Array[String]] = js.undefined
}

object RouteRedirect {
  @scala.inline
  def apply(from: js.Array[String], to: js.Array[String] = null): RouteRedirect = {
    val __obj = js.Dynamic.literal(from = from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[RouteRedirect]
  }
}

