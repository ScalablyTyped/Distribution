package typings.grpcGrpcJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Console> */
trait PartialConsole extends js.Object {
  var assert: js.UndefOr[js.Function0[Unit]] = js.undefined
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  var count: js.UndefOr[js.Function0[Unit]] = js.undefined
  var countReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  var debug: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var dir: js.UndefOr[js.Function0[Unit]] = js.undefined
  var dirxml: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var exception: js.UndefOr[js.Function0[Unit]] = js.undefined
  var group: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var groupCollapsed: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var groupEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var info: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var memory: js.UndefOr[js.Any] = js.undefined
  var table: js.UndefOr[js.Function0[Unit]] = js.undefined
  var time: js.UndefOr[js.Function0[Unit]] = js.undefined
  var timeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var timeLog: js.UndefOr[js.Function0[Unit]] = js.undefined
  var timeStamp: js.UndefOr[js.Function0[Unit]] = js.undefined
  var trace: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var warn: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
}

object PartialConsole {
  @scala.inline
  def apply(
    assert: () => Unit = null,
    clear: () => Unit = null,
    count: () => Unit = null,
    countReset: () => Unit = null,
    debug: /* repeated */ js.Any => Unit = null,
    dir: () => Unit = null,
    dirxml: /* repeated */ js.Any => Unit = null,
    error: /* repeated */ js.Any => Unit = null,
    exception: () => Unit = null,
    group: /* repeated */ js.Any => Unit = null,
    groupCollapsed: /* repeated */ js.Any => Unit = null,
    groupEnd: () => Unit = null,
    info: /* repeated */ js.Any => Unit = null,
    log: /* repeated */ js.Any => Unit = null,
    memory: js.Any = null,
    table: () => Unit = null,
    time: () => Unit = null,
    timeEnd: () => Unit = null,
    timeLog: () => Unit = null,
    timeStamp: () => Unit = null,
    trace: /* repeated */ js.Any => Unit = null,
    warn: /* repeated */ js.Any => Unit = null
  ): PartialConsole = {
    val __obj = js.Dynamic.literal()
    if (assert != null) __obj.updateDynamic("assert")(js.Any.fromFunction0(assert))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (count != null) __obj.updateDynamic("count")(js.Any.fromFunction0(count))
    if (countReset != null) __obj.updateDynamic("countReset")(js.Any.fromFunction0(countReset))
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (dir != null) __obj.updateDynamic("dir")(js.Any.fromFunction0(dir))
    if (dirxml != null) __obj.updateDynamic("dirxml")(js.Any.fromFunction1(dirxml))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (exception != null) __obj.updateDynamic("exception")(js.Any.fromFunction0(exception))
    if (group != null) __obj.updateDynamic("group")(js.Any.fromFunction1(group))
    if (groupCollapsed != null) __obj.updateDynamic("groupCollapsed")(js.Any.fromFunction1(groupCollapsed))
    if (groupEnd != null) __obj.updateDynamic("groupEnd")(js.Any.fromFunction0(groupEnd))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1(info))
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(js.Any.fromFunction0(table))
    if (time != null) __obj.updateDynamic("time")(js.Any.fromFunction0(time))
    if (timeEnd != null) __obj.updateDynamic("timeEnd")(js.Any.fromFunction0(timeEnd))
    if (timeLog != null) __obj.updateDynamic("timeLog")(js.Any.fromFunction0(timeLog))
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(js.Any.fromFunction0(timeStamp))
    if (trace != null) __obj.updateDynamic("trace")(js.Any.fromFunction1(trace))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction1(warn))
    __obj.asInstanceOf[PartialConsole]
  }
}

