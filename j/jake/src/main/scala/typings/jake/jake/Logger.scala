package typings.jake.jake

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Logging and output ////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
trait Logger extends js.Object {
  def error(value: js.Any): Unit
  def log(value: js.Any): Unit
}

object Logger {
  @scala.inline
  def apply(error: js.Any => Unit, log: js.Any => Unit): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[Logger]
  }
}

@JSGlobal("jake.logger")
@js.native
object logger extends TopLevel[Logger]

