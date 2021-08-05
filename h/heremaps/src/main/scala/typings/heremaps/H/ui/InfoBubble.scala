package typings.heremaps.H.ui

import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.geo.Point
import typings.heremaps.H.ui.InfoBubble.State
import typings.heremaps.H.ui.base.Element
import typings.heremaps.H.util.Event
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents an information bubble bound to a geo-position on the map.
  */
@js.native
trait InfoBubble
  extends StObject
     with Element {
  
  /**
    * This method closes the info bubble (setting its state to CLOSED)
    */
  def close(): Unit = js.native
  
  /**
    * This method returns the bubble's content element.
    *
    * Note: Before adding an info bubble to a UI object the content element is null.
    * @returns {?HTMLElement} - the content element of this info bubble
    */
  def getContentElement(): HTMLElement = js.native
  
  /**
    * This method returns this info bubble's current state.
    * @returns {H.ui.InfoBubble.State} - this bubble's current state
    */
  def getState(): State = js.native
  
  /**
    * This method opens the info bubble (setting its state to OPEN)
    */
  def open(): Unit = js.native
  
  /**
    * This methods sets the content of the info bubble. This can either be a string (applied as innerHTML) to the content element of this info bubble or a HTML node which is appended
    * to the content element.
    * @param content {(string | Node)} - the content for this bubble
    */
  def setContent(content: String): Unit = js.native
  def setContent(content: Node): Unit = js.native
  
  /**
    * This method sets the geo-position of this info bubble
    * @param position {(H.geo.IPoint | H.geo.Point)} - the new geo-position of this bubble
    */
  def setPosition(position: IPoint): Unit = js.native
  def setPosition(position: Point): Unit = js.native
  
  /**
    * This method sets the info bubble's state.
    * @param state {H.ui.InfoBubble.State} - the new state
    */
  def setState(state: State): Unit = js.native
}
object InfoBubble {
  
  @js.native
  sealed trait State extends StObject
  /**
    * This enumeration holds the state an info bubble can have.
    */
  @JSGlobal("H.ui.InfoBubble.State")
  @js.native
  object State extends StObject {
    
    /** This value represents the state where an info bubble is closed and invisible (value: 'closed') */
    @js.native
    sealed trait CLOSED
      extends StObject
         with State
    
    /** This value represents the state where an info bubble is open and visible (value: 'open'). */
    @js.native
    sealed trait OPEN
      extends StObject
         with State
  }
  
  trait Options extends StObject {
    
    /**
      * content to be added to the info bubble
      */
    var content: String | Node
    
    /**
      * a callback to be invoked when the info bubble's state changes
      * @param event {H.util.Event}
      */
    var onStateChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(content: String | Node): Options = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContent(value: String | Node): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setOnStateChange(value: /* event */ Event => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    }
  }
}
