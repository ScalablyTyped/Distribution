package typings.jsonTemplates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultValue extends js.Object {
  var defaultValue: String
  var key: String
}

object DefaultValue {
  @scala.inline
  def apply(defaultValue: String, key: String): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
}

