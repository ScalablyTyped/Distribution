package typings.jupyterlabJsonExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: String
  var value: String
}

object AnonFilter {
  @scala.inline
  def apply(filter: String, value: String): AnonFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilter]
  }
}

