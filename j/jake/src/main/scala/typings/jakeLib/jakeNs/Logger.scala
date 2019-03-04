package typings
package jakeLib.jakeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Logging and output ////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
trait Logger extends js.Object {
  def error(value: js.Any): scala.Unit
  def log(value: js.Any): scala.Unit
}

object Logger {
  @scala.inline
  def apply(error: js.Function1[js.Any, scala.Unit], log: js.Function1[js.Any, scala.Unit]): Logger = {
    val __obj = js.Dynamic.literal(error = error, log = log)
  
    __obj.asInstanceOf[Logger]
  }
}

