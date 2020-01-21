package typings.gulpJasmine.mod

import typings.jasmine.jasmine.CustomReporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineOptions extends js.Object {
  /**
    * Passes the config to Jasmine's loadConfig method.
    */
  var config: js.UndefOr[js.Object] = js.undefined
  /**
    * Stops the stream on failed tests.
    * @default true
    */
  var errorOnFail: js.UndefOr[Boolean] = js.undefined
  /**
    * Include stack traces in failures in default reporter.
    * @default false
    */
  var includeStackTrace: js.UndefOr[Boolean] = js.undefined
  /**
    * Reporter(s) to use.
    */
  var reporter: js.UndefOr[CustomReporter | js.Array[CustomReporter]] = js.undefined
  /**
    * Time to wait in milliseconds before a test automatically fails.
    * @default 5000
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    *  Display spec names in default reporter.
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object JasmineOptions {
  @scala.inline
  def apply(
    config: js.Object = null,
    errorOnFail: js.UndefOr[Boolean] = js.undefined,
    includeStackTrace: js.UndefOr[Boolean] = js.undefined,
    reporter: CustomReporter | js.Array[CustomReporter] = null,
    timeout: Int | Double = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): JasmineOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(errorOnFail)) __obj.updateDynamic("errorOnFail")(errorOnFail.asInstanceOf[js.Any])
    if (!js.isUndefined(includeStackTrace)) __obj.updateDynamic("includeStackTrace")(includeStackTrace.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[JasmineOptions]
  }
}

