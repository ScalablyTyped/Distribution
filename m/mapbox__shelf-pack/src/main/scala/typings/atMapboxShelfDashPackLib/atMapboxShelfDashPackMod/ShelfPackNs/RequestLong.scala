package typings
package atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLong extends Request {
  var height: scala.Double
  var width: scala.Double
}

object RequestLong {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, id: ID = null): RequestLong = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLong]
  }
}

