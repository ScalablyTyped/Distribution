package typings.lazyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  var property: String
  var value: js.Any
}

object Property {
  @scala.inline
  def apply(property: String, value: js.Any): Property = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
}

