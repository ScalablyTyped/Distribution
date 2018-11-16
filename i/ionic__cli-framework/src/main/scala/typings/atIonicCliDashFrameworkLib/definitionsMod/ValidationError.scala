package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends js.Object {
  var key: java.lang.String = js.native
  var message: java.lang.String = js.native
  @JSName("validator")
  var validator_Original: Validator = js.native
  def validator(): atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibNumbers.`true` | java.lang.String = js.native
  def validator(input: java.lang.String): atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibNumbers.`true` | java.lang.String = js.native
  def validator(input: java.lang.String, key: java.lang.String): atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibNumbers.`true` | java.lang.String = js.native
}

