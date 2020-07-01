package typings.gtmetrix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationInfo extends js.Object {
  var browsers: js.Array[Double]
  var default: Boolean
  var id: String
  var name: String
}

object LocationInfo {
  @scala.inline
  def apply(browsers: js.Array[Double], default: Boolean, id: String, name: String): LocationInfo = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationInfo]
  }
}

