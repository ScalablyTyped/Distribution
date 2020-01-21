package typings.ionicCore.interfaceMod

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
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRedirect]
  }
}

