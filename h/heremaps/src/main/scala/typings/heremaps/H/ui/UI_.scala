package typings.heremaps.H.ui

import typings.heremaps.H.Map_
import typings.heremaps.H.ui.UI.Options
import typings.heremaps.H.util.ICapturable
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class encapsulates map UI functionality.
  */
@JSGlobal("H.ui.UI")
@js.native
class UI_ protected () extends ICapturable {
  /**
    * Constructor
    * @param map {H.Map}
    * @param opt_options {H.ui.UI.Options=}
    */
  def this(map: Map_) = this()
  def this(map: Map_, opt_options: Options) = this()
  /**
    * This method adds an info bubble to the UI.
    * @param bubble {H.ui.InfoBubble} - the info bubble to be added
    */
  def addBubble(bubble: InfoBubble): Unit = js.native
  /**
    * This method appends a control to the UI.
    * @param name {string} - the name under which to register this control
    * @param control {H.ui.Control} - the control to add to this UI
    */
  def addControl(name: String, control: Control): Unit = js.native
  /**
    * This method returns a list of info bubble objects which are currently attached to this UI.
    * @returns {Array<H.ui.InfoBubble>} - the list of info bubbles
    */
  def getBubbles(): js.Array[InfoBubble] = js.native
  /**
    * This method returns a UI control which was previously registered with the provided name.
    * @param name {string} - the name under which the control was registered.
    * @returns {H.ui.Control} - the control or undefined if the control does not exist.
    */
  def getControl(name: String): Control = js.native
  /**
    * This method returns this ui's root element.
    * @returns {ELement} - the root element
    */
  def getElement(): Element = js.native
  /**
    * Returns the map instance to which this UI was added.
    * @returns {H.Map}
    */
  def getMap(): Map_ = js.native
  /**
    * This method returns this UI object's current unit system.
    * @returns {H.ui.UnitSystem} - the current unit system
    */
  def getUnitSystem(): UnitSystem = js.native
  /**
    * This method removes a previously added info bubble from the UI.
    * @param bubble {H.ui.InfoBubble} - the info bubble to be removed
    */
  def removeBubble(bubble: InfoBubble): Unit = js.native
  /**
    * Removes a previously registered control from the UI object.
    * @param name {string} - the name under which this control was previously registered
    * @returns {H.ui.Control} - the removed control
    */
  def removeControl(name: String): Control = js.native
  /**
    * This method sets this UI object's unit system for displaying distances.
    * @param unitSystem {H.ui.UnitSystem} - the unit system to use
    */
  def setUnitSystem(unitSystem: UnitSystem): Unit = js.native
  /**
    * Toggles this UI's unit system between {@link H.ui.UnitSystem.METRIC} and {@link H.ui.UnitSystem.IMPERIAL}.
    */
  def toggleUnitSystem(): Unit = js.native
}

