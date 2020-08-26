package typings.jqueryMockjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockJaxStandardLogger extends js.Object {
  var debug: js.UndefOr[MockJaxLoggingFunction] = js.native
  var error: js.UndefOr[MockJaxLoggingFunction] = js.native
  var info: js.UndefOr[MockJaxLoggingFunction] = js.native
  var log: js.UndefOr[MockJaxLoggingFunction] = js.native
  var warn: js.UndefOr[MockJaxLoggingFunction] = js.native
}

object MockJaxStandardLogger {
  @scala.inline
  def apply(): MockJaxStandardLogger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockJaxStandardLogger]
  }
  @scala.inline
  implicit class MockJaxStandardLoggerOps[Self <: MockJaxStandardLogger] (val x: Self) extends AnyVal {
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
    def setDebug(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = this.set("debug", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setError(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInfo(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = this.set("info", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setLog(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = this.set("log", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setWarn(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = this.set("warn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
  
}

