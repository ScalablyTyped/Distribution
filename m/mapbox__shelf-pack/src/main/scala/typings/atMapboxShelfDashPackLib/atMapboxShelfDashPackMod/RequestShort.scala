package typings
package atMapboxShelfDashPackLib.atMapboxShelfDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestShort extends Request {
  var h: scala.Double
  var w: scala.Double
}

object RequestShort {
  @scala.inline
  def apply(h: scala.Double, w: scala.Double, id: ID = null): RequestShort = {
    val __obj = js.Dynamic.literal(h = h, w = w)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestShort]
  }
}

