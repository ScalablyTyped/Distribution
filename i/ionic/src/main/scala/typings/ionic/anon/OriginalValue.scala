package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalValue extends js.Object {
  var originalValue: js.Any
  var property: String
}

object OriginalValue {
  @scala.inline
  def apply(originalValue: js.Any, property: String): OriginalValue = {
    val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalValue]
  }
}

