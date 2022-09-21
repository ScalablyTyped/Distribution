package typings.inferno.typesMod

import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemiSyntheticEvent[T]
  extends StObject
     with Event {
  
  /**
    * A reference to the element on which the event listener is registered.
    */
  @JSName("currentTarget")
  var currentTarget_SemiSyntheticEvent: EventTarget & T = js.native
  
  def isDefaultPrevented(): Boolean = js.native
  
  def isPropagationStopped(): Boolean = js.native
}
