package typings.jake.mod.global.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////////////////////
// Running shell-commands ////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////
trait ExecOptions extends js.Object {
  /**
    * stop execution on error, default true
    */
  var breakOnError: js.UndefOr[Boolean] = js.undefined
  /**
    * print to stderr, default false
    */
  var printStderr: js.UndefOr[Boolean] = js.undefined
  /**
    * print to stdout, default false
    */
  var printStdout: js.UndefOr[Boolean] = js.undefined
  /**
    *
    */
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}

object ExecOptions {
  @scala.inline
  def apply(
    breakOnError: js.UndefOr[Boolean] = js.undefined,
    printStderr: js.UndefOr[Boolean] = js.undefined,
    printStdout: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): ExecOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breakOnError)) __obj.updateDynamic("breakOnError")(breakOnError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(printStderr)) __obj.updateDynamic("printStderr")(printStderr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(printStdout)) __obj.updateDynamic("printStdout")(printStdout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecOptions]
  }
}

