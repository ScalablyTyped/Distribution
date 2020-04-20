package typings.knockoutSecureBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  var secureBindingsProvider: AnonInstantiable
}

object KnockoutStatic {
  @scala.inline
  def apply(secureBindingsProvider: AnonInstantiable): KnockoutStatic = {
    val __obj = js.Dynamic.literal(secureBindingsProvider = secureBindingsProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
}

