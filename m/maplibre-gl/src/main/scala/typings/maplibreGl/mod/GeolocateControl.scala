package typings.maplibreGl.mod

import typings.maplibreGl.anon.TypeofsetTimeout
import typings.maplibreGl.maplibreGlStrings.ACTIVE_ERROR
import typings.maplibreGl.maplibreGlStrings.ACTIVE_LOCK
import typings.maplibreGl.maplibreGlStrings.BACKGROUND
import typings.maplibreGl.maplibreGlStrings.BACKGROUND_ERROR
import typings.maplibreGl.maplibreGlStrings.OFF
import typings.maplibreGl.maplibreGlStrings.WAITING_ACTIVE
import typings.std.GeolocationPosition
import typings.std.GeolocationPositionError
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "GeolocateControl")
@js.native
open class GeolocateControl protected ()
  extends Evented
     with IControl {
  def this(options: GeolocateOptions) = this()
  
  var _accuracy: Double = js.native
  
  var _accuracyCircleMarker: Marker = js.native
  
  var _circleElement: HTMLElement = js.native
  
  def _clearWatch(): scala.Unit = js.native
  
  var _container: HTMLElement = js.native
  
  var _dotElement: HTMLElement = js.native
  
  def _finish(): scala.Unit = js.native
  
  var _geolocateButton: HTMLButtonElement = js.native
  
  var _geolocationWatchID: Double = js.native
  
  /**
  	 * Check if the Geolocation API Position is outside the map's maxbounds.
  	 *
  	 * @param {Position} position the Geolocation API Position
  	 * @returns {boolean} Returns `true` if position is outside the map's maxbounds, otherwise returns `false`.
  	 * @private
  	 */
  def _isOutOfMapMaxBounds(position: GeolocationPosition): Boolean = js.native
  
  var _lastKnownPosition: Any = js.native
  
  var _map: Map = js.native
  
  def _onError(error: GeolocationPositionError): scala.Unit = js.native
  
  /**
  	 * When the Geolocation API returns a new location, update the GeolocateControl.
  	 *
  	 * @param {Position} position the Geolocation API Position
  	 * @private
  	 */
  def _onSuccess(position: GeolocationPosition): scala.Unit = js.native
  
  def _onZoom(): scala.Unit = js.native
  
  def _setErrorState(): scala.Unit = js.native
  
  var _setup: Boolean = js.native
  
  def _setupUI(supported: Boolean): scala.Unit = js.native
  
  var _timeoutId: ReturnType[TypeofsetTimeout] = js.native
  
  /**
  	 * Update the camera location to center on the current position
  	 *
  	 * @param {Position} position the Geolocation API Position
  	 * @private
  	 */
  def _updateCamera(position: GeolocationPosition): scala.Unit = js.native
  
  def _updateCircleRadius(): scala.Unit = js.native
  
  /**
  	 * Update the user location dot Marker to the current position
  	 *
  	 * @param {Position} [position] the Geolocation API Position
  	 * @private
  	 */
  def _updateMarker(): scala.Unit = js.native
  def _updateMarker(position: GeolocationPosition): scala.Unit = js.native
  
  var _userLocationDotMarker: Marker = js.native
  
  var _watchState: OFF | ACTIVE_LOCK | WAITING_ACTIVE | ACTIVE_ERROR | BACKGROUND | BACKGROUND_ERROR = js.native
  
  /**
  	 * Register a control on the map and give it a chance to register event listeners
  	 * and resources. This method is called by {@link Map#addControl}
  	 * internally.
  	 *
  	 * @function
  	 * @memberof IControl
  	 * @instance
  	 * @name onAdd
  	 * @param {Map} map the Map this control will be added to
  	 * @returns {HTMLElement} The control's container element. This should
  	 * be created by the control and returned by onAdd without being attached
  	 * to the DOM: the map will insert the control's element into the DOM
  	 * as necessary.
  	 */
  /* CompleteClass */
  override def onAdd(map: Map): HTMLElement = js.native
  
  def onRemove(): scala.Unit = js.native
  /**
  	 * Unregister a control on the map and give it a chance to detach event listeners
  	 * and resources. This method is called by {@link Map#removeControl}
  	 * internally.
  	 *
  	 * @function
  	 * @memberof IControl
  	 * @instance
  	 * @name onRemove
  	 * @param {Map} map the Map this control will be removed from
  	 * @returns {undefined} there is no required return value for this method
  	 */
  /* CompleteClass */
  override def onRemove(map: Map): scala.Unit = js.native
  
  var options: GeolocateOptions = js.native
  
  /**
  	 * Programmatically request and move the map to the user's location.
  	 *
  	 * @returns {boolean} Returns `false` if called before control was added to a map, otherwise returns `true`.
  	 * @example
  	 * // Initialize the geolocate control.
  	 * var geolocate = new maplibregl.GeolocateControl({
  	 *  positionOptions: {
  	 *    enableHighAccuracy: true
  	 *  },
  	 *  trackUserLocation: true
  	 * });
  	 * // Add the control to the map.
  	 * map.addControl(geolocate);
  	 * map.on('load', function() {
  	 *   geolocate.trigger();
  	 * });
  	 */
  def trigger(): Boolean = js.native
}
