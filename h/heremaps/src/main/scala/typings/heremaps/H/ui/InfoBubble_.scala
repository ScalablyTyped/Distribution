package typings.heremaps.H.ui

import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.geo.Point
import typings.heremaps.H.ui.InfoBubble.Options
import typings.heremaps.H.ui.InfoBubble.State
import typings.heremaps.H.ui.base.Element
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents an information bubble bound to a geo-position on the map.
  */
@JSGlobal("H.ui.InfoBubble")
@js.native
class InfoBubble_ protected () extends Element {
  /**
    * Constructor
    * @param position {H.geo.IPoint} - the geo-position to which this info bubble corresponds
    * @param opt_options {H.ui.InfoBubble.Options=} - optional parameters to be passed to the info bubble
    */
  def this(position: IPoint) = this()
  def this(position: IPoint, opt_options: Options) = this()
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

