package typings
package grammarkdownLib.distDiagnosticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagnostic extends js.Object {
  var code: scala.Double
  var message: java.lang.String
  var warning: js.UndefOr[scala.Boolean] = js.undefined
}

object Diagnostic {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String, warning: js.UndefOr[scala.Boolean] = js.undefined): Diagnostic = {
    val __obj = js.Dynamic.literal(code = code, message = message)
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Diagnostic]
  }
}

