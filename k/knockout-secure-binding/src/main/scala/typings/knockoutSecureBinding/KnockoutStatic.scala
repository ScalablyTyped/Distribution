package typings.knockoutSecureBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  var secureBindingsProvider: AnonOptions
}

object KnockoutStatic {
  @scala.inline
  def apply(secureBindingsProvider: AnonOptions): KnockoutStatic = {
    val __obj = js.Dynamic.literal(secureBindingsProvider = secureBindingsProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutStatic]
  }
}

