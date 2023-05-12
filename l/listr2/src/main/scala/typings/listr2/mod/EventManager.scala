package typings.listr2.mod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("listr2", "EventManager")
@js.native
open class EventManager[Event /* <: String */, Map /* <: Partial[Record[Event, Any]] */] () extends StObject {
  
  def complete(): Unit = js.native
  
  def emit[E /* <: Event */](dispatch: E): Unit = js.native
  def emit[E /* <: Event */](dispatch: E, args: EventData[E, Map]): Unit = js.native
  
  /* private */ val emitter: Any = js.native
  
  def off[E /* <: Event */](dispatch: E): Unit = js.native
  def off[E /* <: Event */](dispatch: E, handler: js.Function1[/* data */ EventData[E, Map], Unit]): Unit = js.native
  
  def on[E /* <: Event */](dispatch: E, handler: js.Function1[/* data */ EventData[E, Map], Unit]): Unit = js.native
  
  def once[E /* <: Event */](dispatch: E, handler: js.Function1[/* data */ EventData[E, Map], Unit]): Unit = js.native
}
