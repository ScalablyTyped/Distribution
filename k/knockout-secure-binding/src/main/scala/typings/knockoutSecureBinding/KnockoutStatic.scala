package typings.knockoutSecureBinding

import typings.knockoutSecureBinding.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  var secureBindingsProvider: Instantiable
}

object KnockoutStatic {
  @scala.inline
  def apply(secureBindingsProvider: Instantiable): KnockoutStatic = {
    val __obj = js.Dynamic.literal(secureBindingsProvider = secureBindingsProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
}

