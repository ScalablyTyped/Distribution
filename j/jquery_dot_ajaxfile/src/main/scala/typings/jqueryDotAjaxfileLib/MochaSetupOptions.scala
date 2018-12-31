package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaSetupOptions extends js.Object {
  // bail on the first test failure
  var bail: js.UndefOr[scala.Boolean] = js.undefined
  //array of accepted globals
  var globals: js.UndefOr[js.Array[_]] = js.undefined
  // grep string or regexp to filter tests with
  var grep: js.UndefOr[js.Any] = js.undefined
  // ignore global leaks
  var ignoreLeaks: js.UndefOr[scala.Boolean] = js.undefined
  // reporter instance (function or string), defaults to `mocha.reporters.Spec`
  var reporter: js.UndefOr[js.Any] = js.undefined
  //milliseconds to wait before considering a test slow
  var slow: js.UndefOr[scala.Double] = js.undefined
  // timeout in milliseconds
  var timeout: js.UndefOr[scala.Double] = js.undefined
  // ui name "bdd", "tdd", "exports" etc
  var ui: js.UndefOr[java.lang.String] = js.undefined
}

