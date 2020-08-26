package typings.logat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogOptionsI extends js.Object {
  var logFileName: js.UndefOr[String] = js.native
  var logLevel: js.UndefOr[Double] = js.native
  var logMethod: js.UndefOr[Double] = js.native
}

object LogOptionsI {
  @scala.inline
  def apply(): LogOptionsI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogOptionsI]
  }
  @scala.inline
  implicit class LogOptionsIOps[Self <: LogOptionsI] (val x: Self) extends AnyVal {
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
    def setLogFileName(value: String): Self = this.set("logFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogFileName: Self = this.set("logFileName", js.undefined)
    @scala.inline
    def setLogLevel(value: Double): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setLogMethod(value: Double): Self = this.set("logMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogMethod: Self = this.set("logMethod", js.undefined)
  }
  
}

