package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var defaults: js.Array[js.Object]
  var types: js.Array[_]
}

object Types {
  @scala.inline
  def apply(defaults: js.Array[js.Object], types: js.Array[_]): Types = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
}

