package typings.koaBunyanLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeContextOptions extends js.Object {
  var logLevel: js.UndefOr[String] = js.native
  var updateLogFields: js.UndefOr[js.Function1[/* fields */ js.Any, _]] = js.native
}

object TimeContextOptions {
  @scala.inline
  def apply(): TimeContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeContextOptions]
  }
  @scala.inline
  implicit class TimeContextOptionsOps[Self <: TimeContextOptions] (val x: Self) extends AnyVal {
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
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setUpdateLogFields(value: /* fields */ js.Any => _): Self = this.set("updateLogFields", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdateLogFields: Self = this.set("updateLogFields", js.undefined)
  }
  
}

