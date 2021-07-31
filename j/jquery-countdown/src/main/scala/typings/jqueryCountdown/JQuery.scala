package typings.jqueryCountdown

import typings.jqueryCountdown.jQueryCountdown.Controls
import typings.jqueryCountdown.jQueryCountdown.Event
import typings.jqueryCountdown.jQueryCountdown.Methods
import typings.jqueryCountdown.jQueryCountdown.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
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
