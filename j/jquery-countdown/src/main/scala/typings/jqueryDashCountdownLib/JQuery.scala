package typings
package jqueryDashCountdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Methods to control the execution flow of countdown
    */
  def countdown(control: jqueryDashCountdownLib.jQueryCountdownNs.Controls): JQuery = js.native
  /**
    * Initialize the countdown
    */
  def countdown(finalDate: java.lang.String): JQuery = js.native
  def countdown(
    finalDate: java.lang.String,
    callback: js.Function1[/* event */ jqueryDashCountdownLib.jQueryCountdownNs.Event, scala.Unit]
  ): JQuery = js.native
  /**
    * Initialize the countdown with options
    */
  def countdown(finalDate: java.lang.String, options: jqueryDashCountdownLib.jQueryCountdownNs.Options): JQuery = js.native
  def countdown(
    finalDate: java.lang.String,
    options: jqueryDashCountdownLib.jQueryCountdownNs.Options,
    callback: js.Function1[/* event */ jqueryDashCountdownLib.jQueryCountdownNs.Event, scala.Unit]
  ): JQuery = js.native
  /**
    * Trigger an event whenever some state change
    */
  def on(
    method: jqueryDashCountdownLib.jQueryCountdownNs.Methods,
    callback: js.Function1[/* event */ jqueryDashCountdownLib.jQueryCountdownNs.Event, scala.Unit]
  ): JQuery = js.native
}

