package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.TypeofsetTimeout
import typings.maplibreGl.anon.`9`
import typings.maplibreGl.maplibreGlStrings.active
import typings.maplibreGl.maplibreGlStrings.inactive
import typings.maplibreGl.maplibreGlStrings.pending
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Marker")
@js.native
open class Marker () extends Evented {
  def this(options: MarkerOptions) = this()
  def this(options: scala.Unit, legacyOptions: MarkerOptions) = this()
  def this(options: MarkerOptions, legacyOptions: MarkerOptions) = this()
  
  def _addDragHandler(e: MapMouseEvent): scala.Unit = js.native
  def _addDragHandler(e: MapTouchEvent): scala.Unit = js.native
  
  var _anchor: PositionAnchor = js.native
  
  var _clickTolerance: Double = js.native
  
  var _color: String = js.native
  
  var _defaultMarker: Boolean = js.native
  
  var _draggable: Boolean = js.native
  
  var _element: HTMLElement = js.native
  
  var _isDragging: Boolean = js.native
  
  var _lngLat: LngLat = js.native
  
  var _map: Map = js.native
  
  var _offset: ^ = js.native
  
  def _onKeyPress(e: KeyboardEvent): scala.Unit = js.native
  
  def _onMapClick(e: MapMouseEvent): scala.Unit = js.native
  
  def _onMove(e: MapMouseEvent): scala.Unit = js.native
  def _onMove(e: MapTouchEvent): scala.Unit = js.native
  
  def _onUp(): scala.Unit = js.native
  
  var _opacityTimeout: ReturnType[TypeofsetTimeout] = js.native
  
  var _originalTabIndex: String = js.native
  
  var _pitchAlignment: String = js.native
  
  var _pointerdownPos: ^ = js.native
  
  var _popup: Popup = js.native
  
  var _pos: ^ = js.native
  
  var _positionDelta: ^ = js.native
  
  var _rotation: Double = js.native
  
  var _rotationAlignment: String = js.native
  
  var _scale: Double = js.native
  
  var _state: inactive | pending | active = js.native
  
  def _update(): scala.Unit = js.native
  def _update(e: `9`): scala.Unit = js.native
  
  /**
  	 * Attaches the `Marker` to a `Map` object.
  	 * @param {Map} map The MapLibre GL JS map to add the marker to.
  	 * @returns {Marker} `this`
  	 * @example
  	 * var marker = new maplibregl.Marker()
  	 *   .setLngLat([30.5, 50.5])
  	 *   .addTo(map); // add the marker to the map
  	 */
  def addTo(map: Map): this.type = js.native
  
  /**
  	 * Returns the `Marker`'s HTML element.
  	 * @returns {HTMLElement} element
  	 */
  def getElement(): HTMLElement = js.native
  
  /**
  	 * Get the marker's geographical location.
  	 *
  	 * The longitude of the result may differ by a multiple of 360 degrees from the longitude previously
  	 * set by `setLngLat` because `Marker` wraps the anchor longitude across copies of the world to keep
  	 * the marker on screen.
  	 *
  	 * @returns {LngLat} A {@link LngLat} describing the marker's location.
  	 * @example
  	 * // Store the marker's longitude and latitude coordinates in a variable
  	 * var lngLat = marker.getLngLat();
  	 * // Print the marker's longitude and latitude values in the console
  	 * console.log('Longitude: ' + lngLat.lng + ', Latitude: ' + lngLat.lat )
  	 * @see [Create a draggable Marker](https://maplibre.org/maplibre-gl-js-docs/example/drag-a-marker/)
  	 */
  def getLngLat(): LngLat = js.native
  
  /**
  	 * Get the marker's offset.
  	 * @returns {Point} The marker's screen coordinates in pixels.
  	 */
  def getOffset(): ^ = js.native
  
  /**
  	 * Returns the current `pitchAlignment` property of the marker.
  	 * @returns {string} The current pitch alignment of the marker in degrees.
  	 */
  def getPitchAlignment(): String = js.native
  
  /**
  	 * Returns the {@link Popup} instance that is bound to the {@link Marker}.
  	 * @returns {Popup} popup
  	 * @example
  	 * var marker = new maplibregl.Marker()
  	 *  .setLngLat([0, 0])
  	 *  .setPopup(new maplibregl.Popup().setHTML("<h1>Hello World!</h1>"))
  	 *  .addTo(map);
  	 *
  	 * console.log(marker.getPopup()); // return the popup instance
  	 */
  def getPopup(): Popup = js.native
  
  /**
  	 * Returns the current rotation angle of the marker (in degrees).
  	 * @returns {number} The current rotation angle of the marker.
  	 */
  def getRotation(): Double = js.native
  
  /**
  	 * Returns the current `rotationAlignment` property of the marker.
  	 * @returns {string} The current rotational alignment of the marker.
  	 */
  def getRotationAlignment(): String = js.native
  
  /**
  	 * Returns true if the marker can be dragged
  	 * @returns {boolean} True if the marker is draggable.
  	 */
  def isDraggable(): Boolean = js.native
  
  /**
  	 * Removes the marker from a map
  	 * @example
  	 * var marker = new maplibregl.Marker().addTo(map);
  	 * marker.remove();
  	 * @returns {Marker} `this`
  	 */
  def remove(): this.type = js.native
  
  /**
  	 * Sets the `draggable` property and functionality of the marker
  	 * @param {boolean} [shouldBeDraggable=false] Turns drag functionality on/off
  	 * @returns {Marker} `this`
  	 */
  def setDraggable(shouldBeDraggable: Boolean): this.type = js.native
  
  /**
  	 * Set the marker's geographical position and move it.
  	 * @param {LngLat} lnglat A {@link LngLat} describing where the marker should be located.
  	 * @returns {Marker} `this`
  	 * @example
  	 * // Create a new marker, set the longitude and latitude, and add it to the map
  	 * new maplibregl.Marker()
  	 *   .setLngLat([-65.017, -16.457])
  	 *   .addTo(map);
  	 * @see [Add custom icons with Markers](https://maplibre.org/maplibre-gl-js-docs/example/custom-marker-icons/)
  	 * @see [Create a draggable Marker](https://maplibre.org/maplibre-gl-js-docs/example/drag-a-marker/)
  	 */
  def setLngLat(lnglat: LngLatLike): this.type = js.native
  
  /**
  	 * Sets the offset of the marker
  	 * @param {PointLike} offset The offset in pixels as a {@link PointLike} object to apply relative to the element's center. Negatives indicate left and up.
  	 * @returns {Marker} `this`
  	 */
  def setOffset(offset: PointLike): this.type = js.native
  
  /**
  	 * Sets the `pitchAlignment` property of the marker.
  	 * @param {string} [alignment] Sets the `pitchAlignment` property of the marker. If alignment is 'auto', it will automatically match `rotationAlignment`.
  	 * @returns {Marker} `this`
  	 */
  def setPitchAlignment(alignment: String): this.type = js.native
  
  /**
  	 * Binds a {@link Popup} to the {@link Marker}.
  	 * @param popup An instance of the {@link Popup} class. If undefined or null, any popup
  	 * set on this {@link Marker} instance is unset.
  	 * @returns {Marker} `this`
  	 * @example
  	 * var marker = new maplibregl.Marker()
  	 *  .setLngLat([0, 0])
  	 *  .setPopup(new maplibregl.Popup().setHTML("<h1>Hello World!</h1>")) // add popup
  	 *  .addTo(map);
  	 * @see [Attach a popup to a marker instance](https://maplibre.org/maplibre-gl-js-docs/example/set-popup/)
  	 */
  def setPopup(): this.type = js.native
  def setPopup(popup: Popup): this.type = js.native
  
  /**
  	 * Sets the `rotation` property of the marker.
  	 * @param {number} [rotation=0] The rotation angle of the marker (clockwise, in degrees), relative to its respective {@link Marker#setRotationAlignment} setting.
  	 * @returns {Marker} `this`
  	 */
  def setRotation(rotation: Double): this.type = js.native
  
  /**
  	 * Sets the `rotationAlignment` property of the marker.
  	 * @param {string} [alignment='auto'] Sets the `rotationAlignment` property of the marker.
  	 * @returns {Marker} `this`
  	 */
  def setRotationAlignment(alignment: String): this.type = js.native
  
  /**
  	 * Opens or closes the {@link Popup} instance that is bound to the {@link Marker}, depending on the current state of the {@link Popup}.
  	 * @returns {Marker} `this`
  	 * @example
  	 * var marker = new maplibregl.Marker()
  	 *  .setLngLat([0, 0])
  	 *  .setPopup(new maplibregl.Popup().setHTML("<h1>Hello World!</h1>"))
  	 *  .addTo(map);
  	 *
  	 * marker.togglePopup(); // toggle popup open or closed
  	 */
  def togglePopup(): this.type = js.native
}
