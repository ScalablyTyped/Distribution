package typings
package heremapsLib.HNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents an information bubble bound to a geo-position on the map.
  */
@JSGlobal("H.ui.InfoBubble")
@js.native
class InfoBubble protected ()
  extends heremapsLib.HNs.uiNs.baseNs.Element {
  /**
    * Constructor
    * @param position {H.geo.IPoint} - the geo-position to which this info bubble corresponds
    * @param opt_options {H.ui.InfoBubble.Options=} - optional parameters to be passed to the info bubble
    */
  def this(position: heremapsLib.HNs.geoNs.IPoint) = this()
  def this(position: heremapsLib.HNs.geoNs.IPoint, opt_options: heremapsLib.HNs.uiNs.InfoBubbleNs.Options) = this()
  /**
    * This method closes the info bubble (setting its state to CLOSED)
    */
  def close(): scala.Unit = js.native
  /**
    * This method returns the bubble's content element.
    *
    * Note: Before adding an info bubble to a UI object the content element is null.
    * @returns {?HTMLElement} - the content element of this info bubble
    */
  def getContentElement(): stdLib.HTMLElement = js.native
  /**
    * This method returns this info bubble's current state.
    * @returns {H.ui.InfoBubble.State} - this bubble's current state
    */
  def getState(): heremapsLib.HNs.uiNs.InfoBubbleNs.State = js.native
  /**
    * This method opens the info bubble (setting its state to OPEN)
    */
  def open(): scala.Unit = js.native
  /**
    * This methods sets the content of the info bubble. This can either be a string (applied as innerHTML) to the content element of this info bubble or a HTML node which is appended
    * to the content element.
    * @param content {(string | Node)} - the content for this bubble
    */
  def setContent(content: java.lang.String): scala.Unit = js.native
  def setContent(content: stdLib.Node): scala.Unit = js.native
  /**
    * This method sets the geo-position of this info bubble
    * @param position {(H.geo.IPoint | H.geo.Point)} - the new geo-position of this bubble
    */
  def setPosition(position: heremapsLib.HNs.geoNs.IPoint): scala.Unit = js.native
  def setPosition(position: heremapsLib.HNs.geoNs.Point): scala.Unit = js.native
  /**
    * This method sets the info bubble's state.
    * @param state {H.ui.InfoBubble.State} - the new state
    */
  def setState(state: heremapsLib.HNs.uiNs.InfoBubbleNs.State): scala.Unit = js.native
}

