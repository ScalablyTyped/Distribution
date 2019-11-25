package typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterEventDetail extends js.Object {
  var from: String | Null
  var redirectedFrom: String | Null
  var to: String
}

object RouterEventDetail {
  @scala.inline
  def apply(to: String, from: String = null, redirectedFrom: String = null): RouterEventDetail = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (redirectedFrom != null) __obj.updateDynamic("redirectedFrom")(redirectedFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterEventDetail]
  }
}

