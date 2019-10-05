package typings.jqueryDashCountdown

import typings.jqueryDashCountdown.jQueryCountdown.Controls
import typings.jqueryDashCountdown.jQueryCountdown.Event
import typings.jqueryDashCountdown.jQueryCountdown.Methods
import typings.jqueryDashCountdown.jQueryCountdown.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Methods to control the execution flow of countdown
    */
  def countdown(control: Controls): JQuery = js.native
  /**
    * Initialize the countdown
    */
  def countdown(finalDate: String): JQuery = js.native
  def countdown(finalDate: String, callback: js.Function1[/* event */ Event, Unit]): JQuery = js.native
  /**
    * Initialize the countdown with options
    */
  def countdown(finalDate: String, options: Options): JQuery = js.native
  def countdown(finalDate: String, options: Options, callback: js.Function1[/* event */ Event, Unit]): JQuery = js.native
  /**
    * Trigger an event whenever some state change
    */
  def on(method: Methods, callback: js.Function1[/* event */ Event, Unit]): JQuery = js.native
}

