package typings.grammarkdown.distDiagnosticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagnostic extends js.Object {
  var code: Double
  var message: String
  var warning: js.UndefOr[Boolean] = js.undefined
}

object Diagnostic {
  @scala.inline
  def apply(code: Double, message: String, warning: js.UndefOr[Boolean] = js.undefined): Diagnostic = {
    val __obj = js.Dynamic.literal(code = code, message = message)
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Diagnostic]
  }
}

