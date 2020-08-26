package typings.jake.mod.global.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Logging and output ////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
@js.native
trait Logger_ extends js.Object {
  def error(value: js.Any): Unit = js.native
  def log(value: js.Any): Unit = js.native
}

object Logger_ {
  @scala.inline
  def apply(error: js.Any => Unit, log: js.Any => Unit): Logger_ = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[Logger_]
  }
  @scala.inline
  implicit class Logger_Ops[Self <: Logger_] (val x: Self) extends AnyVal {
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
    def setError(value: js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setLog(value: js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
  }
  
}

