package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaSetupOptions extends js.Object {
  // bail on the first test failure
  var bail: js.UndefOr[Boolean] = js.undefined
  //array of accepted globals
  var globals: js.UndefOr[js.Array[_]] = js.undefined
  // grep string or regexp to filter tests with
  var grep: js.UndefOr[js.Any] = js.undefined
  // ignore global leaks
  var ignoreLeaks: js.UndefOr[Boolean] = js.undefined
  // reporter instance (function or string), defaults to `mocha.reporters.Spec`
  var reporter: js.UndefOr[js.Any] = js.undefined
  //milliseconds to wait before considering a test slow
  var slow: js.UndefOr[Double] = js.undefined
  // timeout in milliseconds
  var timeout: js.UndefOr[Double] = js.undefined
  // ui name "bdd", "tdd", "exports" etc
  var ui: js.UndefOr[String] = js.undefined
}

object MochaSetupOptions {
  @scala.inline
  def apply(
    bail: js.UndefOr[Boolean] = js.undefined,
    globals: js.Array[_] = null,
    grep: js.Any = null,
    ignoreLeaks: js.UndefOr[Boolean] = js.undefined,
    reporter: js.Any = null,
    slow: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    ui: String = null
  ): MochaSetupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail.get.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (grep != null) __obj.updateDynamic("grep")(grep.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreLeaks)) __obj.updateDynamic("ignoreLeaks")(ignoreLeaks.get.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (!js.isUndefined(slow)) __obj.updateDynamic("slow")(slow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaSetupOptions]
  }
}

