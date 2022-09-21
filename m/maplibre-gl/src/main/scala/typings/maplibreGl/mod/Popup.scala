package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Popup")
@js.native
open class Popup () extends Evented {
  def this(options: PopupOptions) = this()
  
  var _closeButton: HTMLButtonElement = js.native
  
  var _container: HTMLElement = js.native
  
  var _content: HTMLElement = js.native
  
  def _createCloseButton(): scala.Unit = js.native
  
  def _focusFirstElement(): scala.Unit = js.native
  
  var _lngLat: LngLat = js.native
  
  var _map: Map = js.native
  
  def _onClose(): scala.Unit = js.native
  
  def _onDrag(event: MapMouseEvent): scala.Unit = js.native
  
  def _onMouseMove(event: MapMouseEvent): scala.Unit = js.native
  
  def _onMouseUp(event: MapMouseEvent): scala.Unit = js.native
  
  var _pos: ^ = js.native
  
  var _tip: HTMLElement = js.native
  
  var _trackPointer: Boolean = js.native
  
  def _update(): scala.Unit = js.native
  def _update(cursor: ^): scala.Unit = js.native
  
  /**
  	 * Adds a CSS class to the popup container element.
  	 *
  	 * @param {string} className Non-empty string with CSS class name to add to popup container
  	 *
  	 * @example
  	 * let popup = new maplibregl.Popup()
  	 * popup.addClassName('some-class')
  	 */
  def addClassName(className: String): scala.Unit = js.native
  
  /**
  	 * Adds the popup to a map.
  	 *
  	 * @param {Map} map The MapLibre GL JS map to add the popup to.
  	 * @returns {Popup} `this`
  	 * @example
  	 * new maplibregl.Popup()
  	 *   .setLngLat([0, 0])
  	 *   .setHTML("<h1>Null Island</h1>")
  	 *   .addTo(map);
  	 * @see [Display a popup](https://maplibre.org/maplibre-gl-js-docs/example/popup/)
  	 * @see [Display a popup on hover](https://maplibre.org/maplibre-gl-js-docs/example/popup-on-hover/)
  	 * @see [Display a popup on click](https://maplibre.org/maplibre-gl-js-docs/example/popup-on-click/)
  	 * @see [Show polygon information on click](https://maplibre.org/maplibre-gl-js-docs/example/polygon-popup-on-click/)
  	 */
  def addTo(map: Map): this.type = js.native
  
  /**
  	 * Returns the `Popup`'s HTML element.
  	 * @example
  	 * // Change the `Popup` element's font size
  	 * var popup = new maplibregl.Popup()
  	 *   .setLngLat([-96, 37.8])
  	 *   .setHTML("<p>Hello World!</p>")
  	 *   .addTo(map);
  	 * var popupElem = popup.getElement();
  	 * popupElem.style.fontSize = "25px";
  	 * @returns {HTMLElement} element
  	 */
  def getElement(): HTMLElement = js.native
  
  /**
  	 * Returns the geographical location of the popup's anchor.
  	 *
  	 * The longitude of the result may differ by a multiple of 360 degrees from the longitude previously
  	 * set by `setLngLat` because `Popup` wraps the anchor longitude across copies of the world to keep
  	 * the popup on screen.
  	 *
  	 * @returns {LngLat} The geographical location of the popup's anchor.
  	 */
  def getLngLat(): LngLat = js.native
  
  /**
  	 * Returns the popup's maximum width.
  	 *
  	 * @returns {string} The maximum width of the popup.
  	 */
  def getMaxWidth(): String = js.native
  
  /**
  	 * @returns {boolean} `true` if the popup is open, `false` if it is closed.
  	 */
  def isOpen(): Boolean = js.native
  
  var options: PopupOptions = js.native
  
  /**
  	 * Removes the popup from the map it has been added to.
  	 *
  	 * @example
  	 * var popup = new maplibregl.Popup().addTo(map);
  	 * popup.remove();
  	 * @returns {Popup} `this`
  	 */
  def remove(): this.type = js.native
  
  /**
  	 * Removes a CSS class from the popup container element.
  	 *
  	 * @param {string} className Non-empty string with CSS class name to remove from popup container
  	 *
  	 * @example
  	 * let popup = new maplibregl.Popup()
  	 * popup.removeClassName('some-class')
  	 */
  def removeClassName(className: String): scala.Unit = js.native
  
  /**
  	 * Sets the popup's content to the element provided as a DOM node.
  	 *
  	 * @param htmlNode A DOM node to be used as content for the popup.
  	 * @returns {Popup} `this`
  	 * @example
  	 * // create an element with the popup content
  	 * var div = document.createElement('div');
  	 * div.innerHTML = 'Hello, world!';
  	 * var popup = new maplibregl.Popup()
  	 *   .setLngLat(e.lngLat)
  	 *   .setDOMContent(div)
  	 *   .addTo(map);
  	 */
  def setDOMContent(htmlNode: Node): this.type = js.native
  
  /**
  	 * Sets the popup's content to the HTML provided as a string.
  	 *
  	 * This method does not perform HTML filtering or sanitization, and must be
  	 * used only with trusted content. Consider {@link Popup#setText} if
  	 * the content is an untrusted text string.
  	 *
  	 * @param html A string representing HTML content for the popup.
  	 * @returns {Popup} `this`
  	 * @example
  	 * var popup = new maplibregl.Popup()
  	 *   .setLngLat(e.lngLat)
  	 *   .setHTML("<h1>Hello World!</h1>")
  	 *   .addTo(map);
  	 * @see [Display a popup](https://maplibre.org/maplibre-gl-js-docs/example/popup/)
  	 * @see [Display a popup on hover](https://maplibre.org/maplibre-gl-js-docs/example/popup-on-hover/)
  	 * @see [Display a popup on click](https://maplibre.org/maplibre-gl-js-docs/example/popup-on-click/)
  	 * @see [Attach a popup to a marker instance](https://maplibre.org/maplibre-gl-js-docs/example/set-popup/)
  	 */
  def setHTML(html: String): this.type = js.native
  
  /**
  	 * Sets the geographical location of the popup's anchor, and moves the popup to it. Replaces trackPointer() behavior.
  	 *
  	 * @param lnglat The geographical location to set as the popup's anchor.
  	 * @returns {Popup} `this`
  	 */
  def setLngLat(lnglat: LngLatLike): this.type = js.native
  
  /**
  	 * Sets the popup's maximum width. This is setting the CSS property `max-width`.
  	 * Available values can be found here: https://developer.mozilla.org/en-US/docs/Web/CSS/max-width
  	 *
  	 * @param maxWidth A string representing the value for the maximum width.
  	 * @returns {Popup} `this`
  	 */
  def setMaxWidth(maxWidth: String): this.type = js.native
  
  /**
  	 * Sets the popup's offset.
  	 *
  	 * @param offset Sets the popup's offset.
  	 * @returns {Popup} `this`
  	 */
  def setOffset(): this.type = js.native
  def setOffset(offset: Offset): this.type = js.native
  
  /**
  	 * Sets the popup's content to a string of text.
  	 *
  	 * This function creates a [Text](https://developer.mozilla.org/en-US/docs/Web/API/Text) node in the DOM,
  	 * so it cannot insert raw HTML. Use this method for security against XSS
  	 * if the popup content is user-provided.
  	 *
  	 * @param text Textual content for the popup.
  	 * @returns {Popup} `this`
  	 * @example
  	 * var popup = new maplibregl.Popup()
  	 *   .setLngLat(e.lngLat)
  	 *   .setText('Hello, world!')
  	 *   .addTo(map);
  	 */
  def setText(text: String): this.type = js.native
  
  /**
  	 * Add or remove the given CSS class on the popup container, depending on whether the container currently has that class.
  	 *
  	 * @param {string} className Non-empty string with CSS class name to add/remove
  	 *
  	 * @returns {boolean} if the class was removed return false, if class was added, then return true
  	 *
  	 * @example
  	 * let popup = new maplibregl.Popup()
  	 * popup.toggleClassName('toggleClass')
  	 */
  def toggleClassName(className: String): Boolean = js.native
  
  /**
  	 * Tracks the popup anchor to the cursor position on screens with a pointer device (it will be hidden on touchscreens). Replaces the `setLngLat` behavior.
  	 * For most use cases, set `closeOnClick` and `closeButton` to `false`.
  	 * @example
  	 * var popup = new maplibregl.Popup({ closeOnClick: false, closeButton: false })
  	 *   .setHTML("<h1>Hello World!</h1>")
  	 *   .trackPointer()
  	 *   .addTo(map);
  	 * @returns {Popup} `this`
  	 */
  def trackPointer(): this.type = js.native
}
