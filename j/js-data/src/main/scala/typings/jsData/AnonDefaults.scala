package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaults extends js.Object {
  var defaults: js.Array[js.Object]
  var skip: Boolean
  var types: js.Array[_]
}

object AnonDefaults {
  @scala.inline
  def apply(defaults: js.Array[js.Object], skip: Boolean, types: js.Array[_]): AnonDefaults = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefaults]
  }
}

