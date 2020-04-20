package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypes extends js.Object {
  var defaults: js.Array[js.Object]
  var types: js.Array[_]
}

object AnonTypes {
  @scala.inline
  def apply(defaults: js.Array[js.Object], types: js.Array[_]): AnonTypes = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypes]
  }
}

