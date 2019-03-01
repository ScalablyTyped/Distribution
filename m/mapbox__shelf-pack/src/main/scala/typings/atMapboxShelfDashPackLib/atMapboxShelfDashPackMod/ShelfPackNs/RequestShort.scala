package typings
package atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("w")(w)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestShort]
  }
}

