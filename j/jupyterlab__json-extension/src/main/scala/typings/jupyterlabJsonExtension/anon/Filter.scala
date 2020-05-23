package typings.jupyterlabJsonExtension.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var filter: String
  var value: String
}

object Filter {
  @scala.inline
  def apply(filter: String, value: String): Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

