package typings
package atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterEventDetail extends js.Object {
  var from: java.lang.String | scala.Null
  var redirectedFrom: java.lang.String | scala.Null
  var to: java.lang.String
}

object RouterEventDetail {
  @scala.inline
  def apply(to: java.lang.String, from: java.lang.String = null, redirectedFrom: java.lang.String = null): RouterEventDetail = {
    val __obj = js.Dynamic.literal(to = to)
    if (from != null) __obj.updateDynamic("from")(from)
    if (redirectedFrom != null) __obj.updateDynamic("redirectedFrom")(redirectedFrom)
    __obj.asInstanceOf[RouterEventDetail]
  }
}

