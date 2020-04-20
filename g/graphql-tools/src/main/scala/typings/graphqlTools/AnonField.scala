package typings.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonField extends js.Object {
  var field: String
  var fragment: String
}

object AnonField {
  @scala.inline
  def apply(field: String, fragment: String): AnonField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonField]
  }
}

