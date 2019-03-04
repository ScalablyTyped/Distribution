package typings
package libxmljsLib.libxmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError
  extends nodeLib.Error {
  var code: scala.Double | scala.Null
  /**
    * 1-based column number, 0 if not applicable/available.
    */
  var column: scala.Double
  var domain: scala.Double | scala.Null
  var level: scala.Double | scala.Null
  var line: scala.Double | scala.Null
}

object ValidationError {
  @scala.inline
  def apply(
    column: scala.Double,
    code: scala.Int | scala.Double = null,
    domain: scala.Int | scala.Double = null,
    level: scala.Int | scala.Double = null,
    line: scala.Int | scala.Double = null,
    stack: java.lang.String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(column = column)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ValidationError]
  }
}

