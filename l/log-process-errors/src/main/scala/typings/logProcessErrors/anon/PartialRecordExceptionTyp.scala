package typings.logProcessErrors.anon

import typings.logProcessErrors.logProcessErrorsStrings.default
import typings.logProcessErrors.logProcessErrorsStrings.silent
import typings.logProcessErrors.mod.LogLevel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<log-process-errors.log-process-errors.ExceptionType, log-process-errors.log-process-errors.LogLevel>> & {  default :(error : std.Error): 'silent' | 'default' | undefined} */
@js.native
trait PartialRecordExceptionTyp extends js.Object {
  var default: js.UndefOr[
    js.Function1[
      /* error */ Error, 
      silent | typings.logProcessErrors.logProcessErrorsStrings.default
    ]
  ] = js.native
  var multipleResolves: js.UndefOr[LogLevel] = js.native
  var rejectionHandled: js.UndefOr[LogLevel] = js.native
  var uncaughtException: js.UndefOr[LogLevel] = js.native
  var unhandledRejection: js.UndefOr[LogLevel] = js.native
  var warning: js.UndefOr[LogLevel] = js.native
}

object PartialRecordExceptionTyp {
  @scala.inline
  def apply(): PartialRecordExceptionTyp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordExceptionTyp]
  }
  @scala.inline
  implicit class PartialRecordExceptionTypOps[Self <: PartialRecordExceptionTyp] (val x: Self) extends AnyVal {
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
    def setDefault(value: /* error */ Error => silent | default): Self = this.set("default", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setMultipleResolves(value: LogLevel): Self = this.set("multipleResolves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleResolves: Self = this.set("multipleResolves", js.undefined)
    @scala.inline
    def setRejectionHandled(value: LogLevel): Self = this.set("rejectionHandled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectionHandled: Self = this.set("rejectionHandled", js.undefined)
    @scala.inline
    def setUncaughtException(value: LogLevel): Self = this.set("uncaughtException", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncaughtException: Self = this.set("uncaughtException", js.undefined)
    @scala.inline
    def setUnhandledRejection(value: LogLevel): Self = this.set("unhandledRejection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnhandledRejection: Self = this.set("unhandledRejection", js.undefined)
    @scala.inline
    def setWarning(value: LogLevel): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

