package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defaults extends js.Object {
  var defaults: js.Array[js.Object]
  var skip: scala.Boolean
  var types: js.Array[_]
}

object Defaults {
  @scala.inline
  def apply(defaults: js.Array[js.Object], skip: scala.Boolean, types: js.Array[_]): Defaults = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaults]
  }
}

