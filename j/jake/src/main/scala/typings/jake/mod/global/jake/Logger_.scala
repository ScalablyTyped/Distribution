package typings.jake.mod.global.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Logging and output ////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
trait Logger_ extends js.Object {
  def error(value: js.Any): Unit
  def log(value: js.Any): Unit
}

object Logger_ {
  @scala.inline
  def apply(error: js.Any => Unit, log: js.Any => Unit): Logger_ = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[Logger_]
  }
}

