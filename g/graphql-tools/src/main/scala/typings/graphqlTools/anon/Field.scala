package typings.graphqlTools.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var field: String
  var fragment: String
}

object Field {
  @scala.inline
  def apply(field: String, fragment: String): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

