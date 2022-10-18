package typings.maplibreGl.mod

import typings.maplibreGl.anon.Animate
import typings.maplibreGl.anon.Duration
import typings.maplibreGl.anon.EaseToOptionseaseIdstring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera extends Evented {
  
  def _afterEase(): scala.Unit = js.native
  def _afterEase(eventData: Any): scala.Unit = js.native
  def _afterEase(eventData: Any, easeId: String): scala.Unit = js.native
  def _afterEase(eventData: scala.Unit, easeId: String): scala.Unit = js.native
  
  var _bearingSnap: Double = js.native
  
  /**
  	 * Calculate the center of these two points in the viewport and use
  	 * the highest zoom level up to and including `Map#getMaxZoom()` that fits
  	 * the points in the viewport at the specified bearing.
  	 * @memberof Map#
  	 * @param {LngLatLike} p0 First point
  	 * @param {LngLatLike} p1 Second point
  	 * @param bearing Desired map bearing at end of animation, in degrees
  	 * @param options
  	 * @param {number | PaddingOptions} [options.padding] The amount of padding in pixels to add to the given bounds.
  	 * @param {PointLike} [options.offset=[0, 0]] The center of the given bounds relative to the map's center, measured in pixels.
  	 * @param {number} [options.maxZoom] The maximum zoom level to allow when the camera would transition to the specified bounds.
  	 * @returns {CenterZoomBearing} If map is able to fit to provided bounds, returns `center`, `zoom`, and `bearing`.
  	 *      If map is unable to fit, method will warn and return undefined.
  	 * @private
  	 * @example
  	 * var p0 = [-79, 43];
  	 * var p1 = [-73, 45];
  	 * var bearing = 90;
  	 * var newCameraTransform = map._cameraForBoxAndBearing(p0, p1, bearing, {
  	 *   padding: {top: 10, bottom:25, left: 15, right: 5}
  	 * });
  	 */
  def _cameraForBoxAndBearing(p0: LngLatLike, p1: LngLatLike, bearing: Double): CenterZoomBearing = js.native
  def _cameraForBoxAndBearing(p0: LngLatLike, p1: LngLatLike, bearing: Double, options: CameraForBoundsOptions): CenterZoomBearing = js.native
  
  def _cancelRenderFrame(_underscore: TaskID): scala.Unit = js.native
  
  def _ease(
    frame: js.Function1[/* _ */ Double, scala.Unit],
    finish: js.Function0[scala.Unit],
    options: Animate
  ): scala.Unit = js.native
  
  var _easeFrameId: TaskID = js.native
  
  var _easeId: String | scala.Unit = js.native
  
  var _easeOptions: Duration = js.native
  
  var _easeStart: Double = js.native
  
  def _fireMoveEvents(): scala.Unit = js.native
  def _fireMoveEvents(eventData: Any): scala.Unit = js.native
  
  def _fitInternal(): this.type = js.native
  def _fitInternal(calculatedOptions: scala.Unit, options: scala.Unit, eventData: Any): this.type = js.native
  def _fitInternal(calculatedOptions: scala.Unit, options: FitBoundsOptions): this.type = js.native
  def _fitInternal(calculatedOptions: scala.Unit, options: FitBoundsOptions, eventData: Any): this.type = js.native
  def _fitInternal(calculatedOptions: CenterZoomBearing): this.type = js.native
  def _fitInternal(calculatedOptions: CenterZoomBearing, options: scala.Unit, eventData: Any): this.type = js.native
  def _fitInternal(calculatedOptions: CenterZoomBearing, options: FitBoundsOptions): this.type = js.native
  def _fitInternal(calculatedOptions: CenterZoomBearing, options: FitBoundsOptions, eventData: Any): this.type = js.native
  
  var _moving: Boolean = js.native
  
  def _normalizeBearing(bearing: Double, currentBearing: Double): Double = js.native
  
  def _normalizeCenter(center: LngLat): scala.Unit = js.native
  
  def _onEaseEnd(): scala.Unit = js.native
  def _onEaseEnd(easeId: String): scala.Unit = js.native
  
  def _onEaseFrame(_underscore: Double): scala.Unit = js.native
  
  var _padding: Boolean = js.native
  
  var _pitching: Boolean = js.native
  
  def _prepareEase(eventData: Any, noMoveStart: Boolean): scala.Unit = js.native
  def _prepareEase(eventData: Any, noMoveStart: Boolean, currently: Any): scala.Unit = js.native
  
  def _renderFrameCallback(): scala.Unit = js.native
  
  def _requestRenderFrame(a: js.Function0[scala.Unit]): TaskID = js.native
  
  var _rotating: Boolean = js.native
  
  def _stop(): this.type = js.native
  def _stop(allowGestures: Boolean): this.type = js.native
  def _stop(allowGestures: Boolean, easeId: String): this.type = js.native
  def _stop(allowGestures: scala.Unit, easeId: String): this.type = js.native
  
  var _zooming: Boolean = js.native
  
  /**
  	 * Calculates pitch, zoom and bearing for looking at @param newCenter with the camera position being @param newCenter
  	 * and returns them as Cameraoptions.
  	 * @memberof Map#
  	 * @param from The camera to look from
  	 * @param altitudeFrom The altitude of the camera to look from
  	 * @param to The center to look at
  	 * @param altitudeTo Optional altitude of the center to look at. If none given the ground height will be used.
  	 * @returns {CameraOptions} the calculated camera options
  	 */
  def calculateCameraOptionsFromTo(from: LngLat, altitudeFrom: Double, to: LngLat): CameraOptions = js.native
  def calculateCameraOptionsFromTo(from: LngLat, altitudeFrom: Double, to: LngLat, altitudeTo: Double): CameraOptions = js.native
  
  /**
  	 * @memberof Map#
  	 * @param {LngLatBoundsLike} bounds Calculate the center for these bounds in the viewport and use
  	 *      the highest zoom level up to and including `Map#getMaxZoom()` that fits
  	 *      in the viewport. LngLatBounds represent a box that is always axis-aligned with bearing 0.
  	 * @param options Options object
  	 * @param {number | PaddingOptions} [options.padding] The amount of padding in pixels to add to the given bounds.
  	 * @param {number} [options.bearing=0] Desired map bearing at end of animation, in degrees.
  	 * @param {PointLike} [options.offset=[0, 0]] The center of the given bounds relative to the map's center, measured in pixels.
  	 * @param {number} [options.maxZoom] The maximum zoom level to allow when the camera would transition to the specified bounds.
  	 * @returns {CenterZoomBearing} If map is able to fit to provided bounds, returns `center`, `zoom`, and `bearing`.
  	 *      If map is unable to fit, method will warn and return undefined.
  	 * @example
  	 * var bbox = [[-79, 43], [-73, 45]];
  	 * var newCameraTransform = map.cameraForBounds(bbox, {
  	 *   padding: {top: 10, bottom:25, left: 15, right: 5}
  	 * });
  	 */
  def cameraForBounds(bounds: LngLatBoundsLike): CenterZoomBearing = js.native
  def cameraForBounds(bounds: LngLatBoundsLike, options: CameraForBoundsOptions): CenterZoomBearing = js.native
  
  /**
  	 * Changes any combination of `center`, `zoom`, `bearing`, `pitch`, and `padding` with an animated transition
  	 * between old and new values. The map will retain its current values for any
  	 * details not specified in `options`.
  	 *
  	 * Note: The transition will happen instantly if the user has enabled
  	 * the `reduced motion` accesibility feature enabled in their operating system,
  	 * unless `options` includes `essential: true`.
  	 *
  	 * @memberof Map#
  	 * @param options Options describing the destination and animation of the transition.
  	 *            Accepts {@link CameraOptions} and {@link AnimationOptions}.
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires zoomstart
  	 * @fires pitchstart
  	 * @fires rotate
  	 * @fires move
  	 * @fires zoom
  	 * @fires pitch
  	 * @fires moveend
  	 * @fires zoomend
  	 * @fires pitchend
  	 * @returns {Map} `this`
  	 * @see [Navigate the map with game-like controls](https://maplibre.org/maplibre-gl-js-docs/example/game-controls/)
  	 */
  def easeTo(options: EaseToOptionseaseIdstring): this.type = js.native
  def easeTo(options: EaseToOptionseaseIdstring, eventData: Any): this.type = js.native
  
  /**
  	 * Pans and zooms the map to contain its visible area within the specified geographical bounds.
  	 * This function will also reset the map's bearing to 0 if bearing is nonzero.
  	 *
  	 * @memberof Map#
  	 * @param bounds Center these bounds in the viewport and use the highest
  	 *      zoom level up to and including `Map#getMaxZoom()` that fits them in the viewport.
  	 * @param {FitBoundsOptions} [options] Options supports all properties from {@link AnimationOptions} and {@link CameraOptions} in addition to the fields below.
  	 * @param {number | PaddingOptions} [options.padding] The amount of padding in pixels to add to the given bounds.
  	 * @param {boolean} [options.linear=false] If `true`, the map transitions using
  	 *     {@link Map#easeTo}. If `false`, the map transitions using {@link Map#flyTo}. See
  	 *     those functions and {@link AnimationOptions} for information about options available.
  	 * @param {Function} [options.easing] An easing function for the animated transition. See {@link AnimationOptions}.
  	 * @param {PointLike} [options.offset=[0, 0]] The center of the given bounds relative to the map's center, measured in pixels.
  	 * @param {number} [options.maxZoom] The maximum zoom level to allow when the map view transitions to the specified bounds.
  	 * @param {Object} [eventData] Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires moveend
  	 * @returns {Map} `this`
  	 * @example
  	 * var bbox = [[-79, 43], [-73, 45]];
  	 * map.fitBounds(bbox, {
  	 *   padding: {top: 10, bottom:25, left: 15, right: 5}
  	 * });
  	 * @see [Fit a map to a bounding box](https://maplibre.org/maplibre-gl-js-docs/example/fitbounds/)
  	 */
  def fitBounds(bounds: LngLatBoundsLike): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: scala.Unit, eventData: Any): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: FitBoundsOptions): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: FitBoundsOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Pans, rotates and zooms the map to to fit the box made by points p0 and p1
  	 * once the map is rotated to the specified bearing. To zoom without rotating,
  	 * pass in the current map bearing.
  	 *
  	 * @memberof Map#
  	 * @param p0 First point on screen, in pixel coordinates
  	 * @param p1 Second point on screen, in pixel coordinates
  	 * @param bearing Desired map bearing at end of animation, in degrees
  	 * @param options Options object
  	 * @param {number | PaddingOptions} [options.padding] The amount of padding in pixels to add to the given bounds.
  	 * @param {boolean} [options.linear=false] If `true`, the map transitions using
  	 *     {@link Map#easeTo}. If `false`, the map transitions using {@link Map#flyTo}. See
  	 *     those functions and {@link AnimationOptions} for information about options available.
  	 * @param {Function} [options.easing] An easing function for the animated transition. See {@link AnimationOptions}.
  	 * @param {PointLike} [options.offset=[0, 0]] The center of the given bounds relative to the map's center, measured in pixels.
  	 * @param {number} [options.maxZoom] The maximum zoom level to allow when the map view transitions to the specified bounds.
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires moveend
  	 * @returns {Map} `this`
  	 * @example
  	 * var p0 = [220, 400];
  	 * var p1 = [500, 900];
  	 * map.fitScreenCoordinates(p0, p1, map.getBearing(), {
  	 *   padding: {top: 10, bottom:25, left: 15, right: 5}
  	 * });
  	 * @see Used by {@link BoxZoomHandler}
  	 */
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: Double): this.type = js.native
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: Double, options: scala.Unit, eventData: Any): this.type = js.native
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: Double, options: FitBoundsOptions): this.type = js.native
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: Double, options: FitBoundsOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Changes any combination of center, zoom, bearing, and pitch, animating the transition along a curve that
  	 * evokes flight. The animation seamlessly incorporates zooming and panning to help
  	 * the user maintain her bearings even after traversing a great distance.
  	 *
  	 * Note: The animation will be skipped, and this will behave equivalently to `jumpTo`
  	 * if the user has the `reduced motion` accesibility feature enabled in their operating system,
  	 * unless 'options' includes `essential: true`.
  	 *
  	 * @memberof Map#
  	 * @param {FlyToOptions} options Options describing the destination and animation of the transition.
  	 *     Accepts {@link CameraOptions}, {@link AnimationOptions},
  	 *     and the following additional options.
  	 * @param {number} [options.curve=1.42] The zooming "curve" that will occur along the
  	 *     flight path. A high value maximizes zooming for an exaggerated animation, while a low
  	 *     value minimizes zooming for an effect closer to {@link Map#easeTo}. 1.42 is the average
  	 *     value selected by participants in the user study discussed in
  	 *     [van Wijk (2003)](https://www.win.tue.nl/~vanwijk/zoompan.pdf). A value of
  	 *     `Math.pow(6, 0.25)` would be equivalent to the root mean squared average velocity. A
  	 *     value of 1 would produce a circular motion.
  	 * @param {number} [options.minZoom] The zero-based zoom level at the peak of the flight path. If
  	 *     `options.curve` is specified, this option is ignored.
  	 * @param {number} [options.speed=1.2] The average speed of the animation defined in relation to
  	 *     `options.curve`. A speed of 1.2 means that the map appears to move along the flight path
  	 *     by 1.2 times `options.curve` screenfuls every second. A _screenful_ is the map's visible span.
  	 *     It does not correspond to a fixed physical distance, but varies by zoom level.
  	 * @param {number} [options.screenSpeed] The average speed of the animation measured in screenfuls
  	 *     per second, assuming a linear timing curve. If `options.speed` is specified, this option is ignored.
  	 * @param {number} [options.maxDuration] The animation's maximum duration, measured in milliseconds.
  	 *     If duration exceeds maximum duration, it resets to 0.
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires zoomstart
  	 * @fires pitchstart
  	 * @fires move
  	 * @fires zoom
  	 * @fires rotate
  	 * @fires pitch
  	 * @fires moveend
  	 * @fires zoomend
  	 * @fires pitchend
  	 * @returns {Map} `this`
  	 * @example
  	 * // fly with default options to null island
  	 * map.flyTo({center: [0, 0], zoom: 9});
  	 * // using flyTo options
  	 * map.flyTo({
  	 *   center: [0, 0],
  	 *   zoom: 9,
  	 *   speed: 0.2,
  	 *   curve: 1,
  	 *   easing(t) {
  	 *     return t;
  	 *   }
  	 * });
  	 * @see [Fly to a location](https://maplibre.org/maplibre-gl-js-docs/example/flyto/)
  	 * @see [Slowly fly to a location](https://maplibre.org/maplibre-gl-js-docs/example/flyto-options/)
  	 * @see [Fly to a location based on scroll position](https://maplibre.org/maplibre-gl-js-docs/example/scroll-fly-to/)
  	 */
  def flyTo(options: FlyToOptions): this.type = js.native
  def flyTo(options: FlyToOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Returns the map's current bearing. The bearing is the compass direction that is "up"; for example, a bearing
  	 * of 90° orients the map so that east is up.
  	 *
  	 * @memberof Map#
  	 * @returns The map's current bearing.
  	 * @see [Navigate the map with game-like controls](https://maplibre.org/maplibre-gl-js-docs/example/game-controls/)
  	 */
  def getBearing(): Double = js.native
  
  /**
  	 * Returns the map's geographical centerpoint.
  	 *
  	 * @memberof Map#
  	 * @returns The map's geographical centerpoint.
  	 * @example
  	 * // return a LngLat object such as {lng: 0, lat: 0}
  	 * var center = map.getCenter();
  	 * // access longitude and latitude values directly
  	 * var {lng, lat} = map.getCenter();
  	 */
  def getCenter(): LngLat = js.native
  
  /**
  	 * Returns the current padding applied around the map viewport.
  	 *
  	 * @memberof Map#
  	 * @returns The current padding around the map viewport.
  	 */
  def getPadding(): PaddingOptions = js.native
  
  /**
  	 * Returns the map's current pitch (tilt).
  	 *
  	 * @memberof Map#
  	 * @returns The map's current pitch, measured in degrees away from the plane of the screen.
  	 */
  def getPitch(): Double = js.native
  
  /**
  	 * Returns the map's current zoom level.
  	 *
  	 * @memberof Map#
  	 * @returns The map's current zoom level.
  	 * @example
  	 * map.getZoom();
  	 */
  def getZoom(): Double = js.native
  
  def isEasing(): Boolean = js.native
  
  /**
  	 * Changes any combination of center, zoom, bearing, and pitch, without
  	 * an animated transition. The map will retain its current values for any
  	 * details not specified in `options`.
  	 *
  	 * @memberof Map#
  	 * @param options Options object
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires zoomstart
  	 * @fires pitchstart
  	 * @fires rotate
  	 * @fires move
  	 * @fires zoom
  	 * @fires pitch
  	 * @fires moveend
  	 * @fires zoomend
  	 * @fires pitchend
  	 * @returns {Map} `this`
  	 * @example
  	 * // jump to coordinates at current zoom
  	 * map.jumpTo({center: [0, 0]});
  	 * // jump with zoom, pitch, and bearing options
  	 * map.jumpTo({
  	 *   center: [0, 0],
  	 *   zoom: 8,
  	 *   pitch: 45,
  	 *   bearing: 90
  	 * });
  	 * @see [Jump to a series of locations](https://maplibre.org/maplibre-gl-js-docs/example/jump-to/)
  	 * @see [Update a feature in realtime](https://maplibre.org/maplibre-gl-js-docs/example/live-update-feature/)
  	 */
  def jumpTo(options: JumpToOptions): this.type = js.native
  def jumpTo(options: JumpToOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Pans the map by the specified offset.
  	 *
  	 * @memberof Map#
  	 * @param offset `x` and `y` coordinates by which to pan the map.
  	 * @param options Options object
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires moveend
  	 * @returns {Map} `this`
  	 * @see [Navigate the map with game-like controls](https://maplibre.org/maplibre-gl-js-docs/example/game-controls/)
  	 */
  def panBy(offset: PointLike): this.type = js.native
  def panBy(offset: PointLike, options: scala.Unit, eventData: Any): this.type = js.native
  def panBy(offset: PointLike, options: AnimationOptions): this.type = js.native
  def panBy(offset: PointLike, options: AnimationOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Pans the map to the specified location with an animated transition.
  	 *
  	 * @memberof Map#
  	 * @param lnglat The location to pan the map to.
  	 * @param options Options describing the destination and animation of the transition.
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires moveend
  	 * @returns {Map} `this`
  	 * @example
  	 * map.panTo([-74, 38]);
  	 * @example
  	 * // Specify that the panTo animation should last 5000 milliseconds.
  	 * map.panTo([-74, 38], {duration: 5000});
  	 * @see [Update a feature in realtime](https://maplibre.org/maplibre-gl-js-docs/example/live-update-feature/)
  	 */
  def panTo(lnglat: LngLatLike): this.type = js.native
  def panTo(lnglat: LngLatLike, options: scala.Unit, eventData: Any): this.type = js.native
  def panTo(lnglat: LngLatLike, options: AnimationOptions): this.type = js.native
  def panTo(lnglat: LngLatLike, options: AnimationOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Rotates the map so that north is up (0° bearing), with an animated transition.
  	 *
  	 * @memberof Map#
  	 * @param options Options object
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires moveend
  	 * @returns {Map} `this`
  	 */
  def resetNorth(): this.type = js.native
  def resetNorth(options: scala.Unit, eventData: Any): this.type = js.native
  def resetNorth(options: AnimationOptions): this.type = js.native
  def resetNorth(options: AnimationOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Rotates and pitches the map so that north is up (0° bearing) and pitch is 0°, with an animated transition.
  	 *
  	 * @memberof Map#
  	 * @param options Options object
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires moveend
  	 * @returns {Map} `this`
  	 */
  def resetNorthPitch(): this.type = js.native
  def resetNorthPitch(options: scala.Unit, eventData: Any): this.type = js.native
  def resetNorthPitch(options: AnimationOptions): this.type = js.native
  def resetNorthPitch(options: AnimationOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Rotates the map to the specified bearing, with an animated transition. The bearing is the compass direction
  	 * that is \"up\"; for example, a bearing of 90° orients the map so that east is up.
  	 *
  	 * @memberof Map#
  	 * @param bearing The desired bearing.
  	 * @param options Options object
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires moveend
  	 * @returns {Map} `this`
  	 */
  def rotateTo(bearing: Double): this.type = js.native
  def rotateTo(bearing: Double, options: scala.Unit, eventData: Any): this.type = js.native
  def rotateTo(bearing: Double, options: AnimationOptions): this.type = js.native
  def rotateTo(bearing: Double, options: AnimationOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Sets the map's bearing (rotation). The bearing is the compass direction that is "up"; for example, a bearing
  	 * of 90° orients the map so that east is up.
  	 *
  	 * Equivalent to `jumpTo({bearing: bearing})`.
  	 *
  	 * @memberof Map#
  	 * @param bearing The desired bearing.
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires moveend
  	 * @returns {Map} `this`
  	 * @example
  	 * // rotate the map to 90 degrees
  	 * map.setBearing(90);
  	 */
  def setBearing(bearing: Double): this.type = js.native
  def setBearing(bearing: Double, eventData: Any): this.type = js.native
  
  /**
  	 * Sets the map's geographical centerpoint. Equivalent to `jumpTo({center: center})`.
  	 *
  	 * @memberof Map#
  	 * @param center The centerpoint to set.
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires moveend
  	 * @returns {Map} `this`
  	 * @example
  	 * map.setCenter([-74, 38]);
  	 */
  def setCenter(center: LngLatLike): this.type = js.native
  def setCenter(center: LngLatLike, eventData: Any): this.type = js.native
  
  /**
  	 * Sets the padding in pixels around the viewport.
  	 *
  	 * Equivalent to `jumpTo({padding: padding})`.
  	 *
  	 * @memberof Map#
  	 * @param padding The desired padding. Format: { left: number, right: number, top: number, bottom: number }
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires moveend
  	 * @returns {Map} `this`
  	 * @example
  	 * // Sets a left padding of 300px, and a top padding of 50px
  	 * map.setPadding({ left: 300, top: 50 });
  	 */
  def setPadding(padding: PaddingOptions): this.type = js.native
  def setPadding(padding: PaddingOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Sets the map's pitch (tilt). Equivalent to `jumpTo({pitch: pitch})`.
  	 *
  	 * @memberof Map#
  	 * @param pitch The pitch to set, measured in degrees away from the plane of the screen (0-60).
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires pitchstart
  	 * @fires movestart
  	 * @fires moveend
  	 * @returns {Map} `this`
  	 */
  def setPitch(pitch: Double): this.type = js.native
  def setPitch(pitch: Double, eventData: Any): this.type = js.native
  
  /**
  	 * Sets the map's zoom level. Equivalent to `jumpTo({zoom: zoom})`.
  	 *
  	 * @memberof Map#
  	 * @param zoom The zoom level to set (0-20).
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires zoomstart
  	 * @fires move
  	 * @fires zoom
  	 * @fires moveend
  	 * @fires zoomend
  	 * @returns {Map} `this`
  	 * @example
  	 * // Zoom to the zoom level 5 without an animated transition
  	 * map.setZoom(5);
  	 */
  def setZoom(zoom: Double): this.type = js.native
  def setZoom(zoom: Double, eventData: Any): this.type = js.native
  
  /**
  	 * Snaps the map so that north is up (0° bearing), if the current bearing is close enough to it (i.e. within the
  	 * `bearingSnap` threshold).
  	 *
  	 * @memberof Map#
  	 * @param options Options object
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires moveend
  	 * @returns {Map} `this`
  	 */
  def snapToNorth(): this.type = js.native
  def snapToNorth(options: scala.Unit, eventData: Any): this.type = js.native
  def snapToNorth(options: AnimationOptions): this.type = js.native
  def snapToNorth(options: AnimationOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Stops any animated transition underway.
  	 *
  	 * @memberof Map#
  	 * @returns {Map} `this`
  	 */
  def stop(): this.type = js.native
  
  var transform: Transform = js.native
  
  /**
  	 * Increases the map's zoom level by 1.
  	 *
  	 * @memberof Map#
  	 * @param options Options object
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires zoomstart
  	 * @fires move
  	 * @fires zoom
  	 * @fires moveend
  	 * @fires zoomend
  	 * @returns {Map} `this`
  	 * @example
  	 * // zoom the map in one level with a custom animation duration
  	 * map.zoomIn({duration: 1000});
  	 */
  def zoomIn(): this.type = js.native
  def zoomIn(options: scala.Unit, eventData: Any): this.type = js.native
  def zoomIn(options: AnimationOptions): this.type = js.native
  def zoomIn(options: AnimationOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Decreases the map's zoom level by 1.
  	 *
  	 * @memberof Map#
  	 * @param options Options object
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires zoomstart
  	 * @fires move
  	 * @fires zoom
  	 * @fires moveend
  	 * @fires zoomend
  	 * @returns {Map} `this`
  	 * @example
  	 * // zoom the map out one level with a custom animation offset
  	 * map.zoomOut({offset: [80, 60]});
  	 */
  def zoomOut(): this.type = js.native
  def zoomOut(options: scala.Unit, eventData: Any): this.type = js.native
  def zoomOut(options: AnimationOptions): this.type = js.native
  def zoomOut(options: AnimationOptions, eventData: Any): this.type = js.native
  
  /**
  	 * Zooms the map to the specified zoom level, with an animated transition.
  	 *
  	 * @memberof Map#
  	 * @param zoom The zoom level to transition to.
  	 * @param options Options object
  	 * @param eventData Additional properties to be added to event objects of events triggered by this method.
  	 * @fires movestart
  	 * @fires zoomstart
  	 * @fires move
  	 * @fires zoom
  	 * @fires moveend
  	 * @fires zoomend
  	 * @returns {Map} `this`
  	 * @example
  	 * // Zoom to the zoom level 5 without an animated transition
  	 * map.zoomTo(5);
  	 * // Zoom to the zoom level 8 with an animated transition
  	 * map.zoomTo(8, {
  	 *   duration: 2000,
  	 *   offset: [100, 50]
  	 * });
  	 */
  def zoomTo(zoom: Double): this.type = js.native
  def zoomTo(zoom: Double, options: Null, eventData: Any): this.type = js.native
  def zoomTo(zoom: Double, options: scala.Unit, eventData: Any): this.type = js.native
  def zoomTo(zoom: Double, options: AnimationOptions): this.type = js.native
  def zoomTo(zoom: Double, options: AnimationOptions, eventData: Any): this.type = js.native
}
