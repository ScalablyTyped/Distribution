package typings.karmaJasmineHtmlReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineHtmlReporterOptions extends js.Object {
  /**
    * Suppress all messages (overrides other suppress settings)
    */
  var suppressAll: js.UndefOr[Boolean] = js.undefined
  /** Suppress failed messages */
  var suppressFailed: js.UndefOr[Boolean] = js.undefined
}

object JasmineHtmlReporterOptions {
  @scala.inline
  def apply(
    suppressAll: js.UndefOr[Boolean] = js.undefined,
    suppressFailed: js.UndefOr[Boolean] = js.undefined
  ): JasmineHtmlReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(suppressAll)) __obj.updateDynamic("suppressAll")(suppressAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressFailed)) __obj.updateDynamic("suppressFailed")(suppressFailed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JasmineHtmlReporterOptions]
  }
}

