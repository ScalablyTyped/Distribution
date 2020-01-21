package typings.jeeJsf.jsf.ajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsf.ajax.addOnError")
@js.native
object addOnError extends js.Object {
  /**
    * Register a callback for error handling.
    * @param callback a reference to a function to call on an error
    */
  def apply(callback: js.Function1[/* data */ RequestData, Unit]): Unit = js.native
}

