package typings
package logDashProcessDashErrorsLib.logDashProcessDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * log-process-errors constructor options.
  */
trait Options extends js.Object {
  /**
    * Whether or not to colorize messages.
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#colors
    */
  var colors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Which process should trigger `process.exit(1)`
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#exiton
    */
  var exitOn: js.UndefOr[js.Array[ExceptionType]] = js.undefined
  /**
    * Which log level to use for different exceptions.
    *
    * https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#log
    */
  var level: js.UndefOr[
    (stdLib.Partial[stdLib.Record[ExceptionType, LogLevel]]) with logDashProcessDashErrorsLib.Anon_Default
  ] = js.undefined
  /**
    * Override logger
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#log
    */
  var log: js.UndefOr[
    js.Function2[/* error */ stdLib.Error, /* level */ LogLevel, js.Promise[scala.Unit] | scala.Unit]
  ] = js.undefined
  /**
    * When running tests, makes them fail if there are any process errors.
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#testing
    */
  var testing: js.UndefOr[
    logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.ava | logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.mocha | logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.jasmine | logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.tape | logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.`node-tap`
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    colors: js.UndefOr[scala.Boolean] = js.undefined,
    exitOn: js.Array[ExceptionType] = null,
    level: (stdLib.Partial[stdLib.Record[ExceptionType, LogLevel]]) with logDashProcessDashErrorsLib.Anon_Default = null,
    log: (/* error */ stdLib.Error, /* level */ LogLevel) => js.Promise[scala.Unit] | scala.Unit = null,
    testing: logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.ava | logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.mocha | logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.jasmine | logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.tape | logDashProcessDashErrorsLib.logDashProcessDashErrorsLibStrings.`node-tap` = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors)
    if (exitOn != null) __obj.updateDynamic("exitOn")(exitOn)
    if (level != null) __obj.updateDynamic("level")(level)
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (testing != null) __obj.updateDynamic("testing")(testing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

