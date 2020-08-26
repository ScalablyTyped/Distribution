package typings.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalErrorHandlers extends js.Object {
  var uncaughtException: js.Array[js.Function1[/* exception */ Exception, Unit]] = js.native
  var unhandledRejection: js.Array[js.Function2[/* exception */ Exception, /* promise */ js.Promise[_], Unit]] = js.native
}

object GlobalErrorHandlers {
  @scala.inline
  def apply(
    uncaughtException: js.Array[js.Function1[/* exception */ Exception, Unit]],
    unhandledRejection: js.Array[js.Function2[/* exception */ Exception, /* promise */ js.Promise[_], Unit]]
  ): GlobalErrorHandlers = {
    val __obj = js.Dynamic.literal(uncaughtException = uncaughtException.asInstanceOf[js.Any], unhandledRejection = unhandledRejection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalErrorHandlers]
  }
  @scala.inline
  implicit class GlobalErrorHandlersOps[Self <: GlobalErrorHandlers] (val x: Self) extends AnyVal {
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
    def setUncaughtExceptionVarargs(value: (js.Function1[/* exception */ Exception, Unit])*): Self = this.set("uncaughtException", js.Array(value :_*))
    @scala.inline
    def setUncaughtException(value: js.Array[js.Function1[/* exception */ Exception, Unit]]): Self = this.set("uncaughtException", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnhandledRejectionVarargs(value: (js.Function2[/* exception */ Exception, /* promise */ js.Promise[js.Any], Unit])*): Self = this.set("unhandledRejection", js.Array(value :_*))
    @scala.inline
    def setUnhandledRejection(value: js.Array[js.Function2[/* exception */ Exception, /* promise */ js.Promise[_], Unit]]): Self = this.set("unhandledRejection", value.asInstanceOf[js.Any])
  }
  
}

