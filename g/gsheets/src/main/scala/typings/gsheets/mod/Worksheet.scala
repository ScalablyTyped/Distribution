package typings.gsheets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Worksheet extends js.Object {
  var data: js.Array[Row] | Null
  var title: String
  var updated: String
}

object Worksheet {
  @scala.inline
  def apply(title: String, updated: String, data: js.Array[Row] = null): Worksheet = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Worksheet]
  }
}

