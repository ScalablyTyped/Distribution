package typings.karmaJasmineHtmlReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineHtmlReporterOptions extends js.Object {
  /** Suppress failed messages */
  var suppressFailed: js.UndefOr[Boolean] = js.undefined
}

object JasmineHtmlReporterOptions {
  @scala.inline
  def apply(suppressFailed: js.UndefOr[Boolean] = js.undefined): JasmineHtmlReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(suppressFailed)) __obj.updateDynamic("suppressFailed")(suppressFailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[JasmineHtmlReporterOptions]
  }
}

