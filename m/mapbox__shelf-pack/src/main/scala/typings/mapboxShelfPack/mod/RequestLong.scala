package typings.mapboxShelfPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLong extends Request {
  var height: Double
  var width: Double
}

object RequestLong {
  @scala.inline
  def apply(height: Double, width: Double, id: ID = null): RequestLong = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLong]
  }
}

