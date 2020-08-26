package typings.grpcGrpcJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Console> */
@js.native
trait PartialConsole extends js.Object {
  var assert: js.UndefOr[js.Function2[/* condition */ Boolean, /* repeated */ js.Any, Unit]] = js.native
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  var count: js.UndefOr[js.Function0[Unit]] = js.native
  var countReset: js.UndefOr[js.Function0[Unit]] = js.native
  var debug: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var dir: js.UndefOr[js.Function0[Unit]] = js.native
  var dirxml: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var exception: js.UndefOr[js.Function2[/* message */ String, /* repeated */ js.Any, Unit]] = js.native
  var group: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var groupCollapsed: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var groupEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var info: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var memory: js.UndefOr[js.Any] = js.native
  var table: js.UndefOr[js.Function0[Unit]] = js.native
  var time: js.UndefOr[js.Function0[Unit]] = js.native
  var timeEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var timeLog: js.UndefOr[js.Function2[/* label */ String, /* repeated */ js.Any, Unit]] = js.native
  var timeStamp: js.UndefOr[js.Function0[Unit]] = js.native
  var trace: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var warn: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
}

object PartialConsole {
  @scala.inline
  def apply(): PartialConsole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConsole]
  }
  @scala.inline
  implicit class PartialConsoleOps[Self <: PartialConsole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssert(value: (/* condition */ Boolean, /* repeated */ js.Any) => Unit): Self = this.set("assert", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAssert: Self = this.set("assert", js.undefined)
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setCount(value: () => Unit): Self = this.set("count", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCountReset(value: () => Unit): Self = this.set("countReset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCountReset: Self = this.set("countReset", js.undefined)
    @scala.inline
    def setDebug(value: /* repeated */ js.Any => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDir(value: () => Unit): Self = this.set("dir", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDirxml(value: /* repeated */ js.Any => Unit): Self = this.set("dirxml", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDirxml: Self = this.set("dirxml", js.undefined)
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setException(value: (/* message */ String, /* repeated */ js.Any) => Unit): Self = this.set("exception", js.Any.fromFunction2(value))
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
    @scala.inline
    def setGroup(value: /* repeated */ js.Any => Unit): Self = this.set("group", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setGroupCollapsed(value: /* repeated */ js.Any => Unit): Self = this.set("groupCollapsed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGroupCollapsed: Self = this.set("groupCollapsed", js.undefined)
    @scala.inline
    def setGroupEnd(value: () => Unit): Self = this.set("groupEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGroupEnd: Self = this.set("groupEnd", js.undefined)
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setMemory(value: js.Any): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    @scala.inline
    def setTable(value: () => Unit): Self = this.set("table", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setTime(value: () => Unit): Self = this.set("time", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setTimeEnd(value: () => Unit): Self = this.set("timeEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTimeEnd: Self = this.set("timeEnd", js.undefined)
    @scala.inline
    def setTimeLog(value: (/* label */ String, /* repeated */ js.Any) => Unit): Self = this.set("timeLog", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTimeLog: Self = this.set("timeLog", js.undefined)
    @scala.inline
    def setTimeStamp(value: () => Unit): Self = this.set("timeStamp", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTimeStamp: Self = this.set("timeStamp", js.undefined)
    @scala.inline
    def setTrace(value: /* repeated */ js.Any => Unit): Self = this.set("trace", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
  
}

