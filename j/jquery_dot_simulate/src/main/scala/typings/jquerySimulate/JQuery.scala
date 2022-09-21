package typings.jquerySimulate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Simulates an event.
    *
    * @param type
    *            the type of event (eg: "mousemove", "keydown", etc...)
    * @param options
    *            the options for the event (these are event-specific)
    */
  def simulate(`type`: String): Unit = js.native
  def simulate(`type`: String, options: Any): Unit = js.native
}
