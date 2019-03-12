package typings
package maskedinputLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedInputStatic extends js.Object {
  var defaults: MaskedInputDefaults
  def format(value: java.lang.String, options: MaskedInputStaticDefaults): scala.Boolean
  def isValid(value: java.lang.String, options: MaskedInputStaticDefaults): scala.Boolean
}

object MaskedInputStatic {
  @scala.inline
  def apply(
    defaults: MaskedInputDefaults,
    format: (java.lang.String, MaskedInputStaticDefaults) => scala.Boolean,
    isValid: (java.lang.String, MaskedInputStaticDefaults) => scala.Boolean
  ): MaskedInputStatic = {
    val __obj = js.Dynamic.literal(defaults = defaults, format = js.Any.fromFunction2(format), isValid = js.Any.fromFunction2(isValid))
  
    __obj.asInstanceOf[MaskedInputStatic]
  }
}

