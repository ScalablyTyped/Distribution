package typings
package gulpDashJasmineLib.gulpDashJasmineMod

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
  var errorOnFail: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Include stack traces in failures in default reporter.
       * @default false
       */
  var includeStackTrace: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Reporter(s) to use.
       */
  var reporter: js.UndefOr[
    jasmineLib.jasmineNs.CustomReporter | js.Array[jasmineLib.jasmineNs.CustomReporter]
  ] = js.undefined
  /**
       * Time to wait in milliseconds before a test automatically fails.
       * @default 5000
       */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
       *  Display spec names in default reporter.
       */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

