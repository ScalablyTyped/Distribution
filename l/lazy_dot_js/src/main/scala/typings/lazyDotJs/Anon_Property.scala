package typings.lazyDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Property extends js.Object {
  var property: String
  var value: js.Any
}

object Anon_Property {
  @scala.inline
  def apply(property: String, value: js.Any): Anon_Property = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Property]
  }
}

