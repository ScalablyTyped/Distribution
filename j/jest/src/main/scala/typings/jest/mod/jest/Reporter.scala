package typings.jest.mod.jest

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// To allow non-ES6 users the Set below
trait Reporter extends js.Object {
  var getLastError: js.UndefOr[js.Function0[Maybe[Error]]] = js.undefined
  var onRunComplete: js.UndefOr[
    js.Function2[/* contexts */ Set[Context], /* results */ AggregatedResult, Maybe[js.Promise[Unit]]]
  ] = js.undefined
  var onRunStart: js.UndefOr[
    js.Function2[/* results */ AggregatedResult, /* options */ ReporterOnStartOptions, Unit]
  ] = js.undefined
  var onTestResult: js.UndefOr[
    js.Function3[
      /* test */ Test, 
      /* testResult */ TestResult, 
      /* aggregatedResult */ AggregatedResult, 
      Unit
    ]
  ] = js.undefined
  var onTestStart: js.UndefOr[js.Function1[/* test */ Test, Unit]] = js.undefined
}

object Reporter {
  @scala.inline
  def apply(
    getLastError: () => Maybe[Error] = null,
    onRunComplete: (/* contexts */ Set[Context], /* results */ AggregatedResult) => Maybe[js.Promise[Unit]] = null,
    onRunStart: (/* results */ AggregatedResult, /* options */ ReporterOnStartOptions) => Unit = null,
    onTestResult: (/* test */ Test, /* testResult */ TestResult, /* aggregatedResult */ AggregatedResult) => Unit = null,
    onTestStart: /* test */ Test => Unit = null
  ): Reporter = {
    val __obj = js.Dynamic.literal()
    if (getLastError != null) __obj.updateDynamic("getLastError")(js.Any.fromFunction0(getLastError))
    if (onRunComplete != null) __obj.updateDynamic("onRunComplete")(js.Any.fromFunction2(onRunComplete))
    if (onRunStart != null) __obj.updateDynamic("onRunStart")(js.Any.fromFunction2(onRunStart))
    if (onTestResult != null) __obj.updateDynamic("onTestResult")(js.Any.fromFunction3(onTestResult))
    if (onTestStart != null) __obj.updateDynamic("onTestStart")(js.Any.fromFunction1(onTestStart))
    __obj.asInstanceOf[Reporter]
  }
}

