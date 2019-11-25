package typings.maskedinput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedInputStatic extends js.Object {
  var defaults: MaskedInputDefaults
  def format(value: String, options: MaskedInputStaticDefaults): Boolean
  def isValid(value: String, options: MaskedInputStaticDefaults): Boolean
}

object MaskedInputStatic {
  @scala.inline
  def apply(
    defaults: MaskedInputDefaults,
    format: (String, MaskedInputStaticDefaults) => Boolean,
    isValid: (String, MaskedInputStaticDefaults) => Boolean
  ): MaskedInputStatic = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], format = js.Any.fromFunction2(format), isValid = js.Any.fromFunction2(isValid))
  
    __obj.asInstanceOf[MaskedInputStatic]
  }
}

