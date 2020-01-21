package typings.mapboxShelfPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestShort extends Request {
  var h: Double
  var w: Double
}

object RequestShort {
  @scala.inline
  def apply(h: Double, w: Double, id: ID = null): RequestShort = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestShort]
  }
}

