package typings.jquerySimulate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Simulates an event.
    *
    * @param type
    *            the type of event (eg: "mousemove", "keydown", etc...)
    * @param options
    *            the options for the event (these are event-specific)
    */
  def simulate(`type`: String): Unit = js.native
  def simulate(`type`: String, options: js.Any): Unit = js.native
}

