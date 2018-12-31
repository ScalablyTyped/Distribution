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

