package typings.heremaps.HNs.uiNs

import typings.heremaps.HNs.Map
import typings.heremaps.HNs.serviceNs.DefaultLayers
import typings.heremaps.HNs.serviceNs.PlatformNs.MapTypes
import typings.heremaps.HNs.uiNs.UINs.Options
import typings.heremaps.HNs.uiNs.i18nNs.Localization
import typings.heremaps.HNs.utilNs.ICapturable
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class encapsulates map UI functionality.
  */
@JSGlobal("H.ui.UI")
@js.native
class UI protected () extends ICapturable {
  /**
    * Constructor
    * @param map {H.Map}
    * @param opt_options {H.ui.UI.Options=}
    */
  def this(map: Map) = this()
  def this(map: Map, opt_options: Options) = this()
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
  def getMap(): Map = js.native
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

/* static members */
@JSGlobal("H.ui.UI")
@js.native
object UI extends js.Object {
  def createDefault(map: Map, mapTypes: DefaultLayers): UI = js.native
  def createDefault(map: Map, mapTypes: DefaultLayers, opt_locale: String): UI = js.native
  def createDefault(map: Map, mapTypes: DefaultLayers, opt_locale: Localization): UI = js.native
  /**
    * This function creates the default UI including the zoom control,
    * map settings control and scalebar and panorama discovery control.
    * The default controls will be assigned the following values:
    *
    * Zoom control:
    *     id: 'zoom'
    *     alignment: 'right-middle'
    * Map settings control:
    *     id: 'mapsettings'
    *     alignment: 'bottom-right'
    * Scalebar:
    *     id: 'scalebar'
    *     alignment: 'bottom-right'
    * Pano:
    *     id: 'panorama'
    *     alignment: 'top-right'
    *
    * @param map {H.Map} - The map instance to which to append the UI
    * @param mapTypes {Object<H.service.MapType>} - The map types to use
    * @param opt_locale {(H.ui.i18n.Localization | string)=} - the language to use (or a full localization object).
    * @returns {H.ui.UI} - the UI instance configured with the default controls
    */
  def createDefault(map: Map, mapTypes: MapTypes): UI = js.native
  def createDefault(map: Map, mapTypes: MapTypes, opt_locale: String): UI = js.native
  def createDefault(map: Map, mapTypes: MapTypes, opt_locale: Localization): UI = js.native
}

