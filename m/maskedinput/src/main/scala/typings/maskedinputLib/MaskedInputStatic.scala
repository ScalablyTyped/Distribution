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
    format: js.Function2[java.lang.String, MaskedInputStaticDefaults, scala.Boolean],
    isValid: js.Function2[java.lang.String, MaskedInputStaticDefaults, scala.Boolean]
  ): MaskedInputStatic = {
    val __obj = js.Dynamic.literal(defaults = defaults, format = format, isValid = isValid)
  
    __obj.asInstanceOf[MaskedInputStatic]
  }
}

