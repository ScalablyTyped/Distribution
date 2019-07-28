package typings.mapsjs.mapsjsMod

import typings.mapsjs.Anon_Delta
import typings.mapsjs.Anon_H
import typings.mapsjs.mapsjsMod.tileNs.layer
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait mapsjsWidget extends js.Object {
  /**
  	 * Add a fixed element to the content area which resides at a z-level 
  	 * above tiled map content. These elements do not scale with the map
  	 * scale. This is used to place markers or callouts on the map
  	 * @param {HTMLElement} element Any html that can be added to the DOM.
    * @param {number} mapUnitsX The x coordinate of the insertion point in map units.
    * @param {number} mapUnitsY The y coordinate of the insertion point in map units.
    * @param {function} [addAction] Callback function called after the 
    * DOM element has been placed with signature addAction(element).
    * @param {object} dragOptions JavaScript object of the form {dragEnabled,
    * useElementInsteadOfNewGestureOverlay, downAction, moveAction, upAction, 
    * wheelAction } where dragEnabled flags whether dragging should be
    * enabled on the element, and downAction, moveAction, upAction, and 
    * wheelAction are callback functions invoked on mousedown, mousemove,
    * mouseup, and scroll events respectively.
  	 */
  def addFixedContentElement(element: HTMLElement, mapUnitsX: Double, mapUnitsY: Double): Unit = js.native
  def addFixedContentElement(
    element: HTMLElement,
    mapUnitsX: Double,
    mapUnitsY: Double,
    addAction: js.Function1[/* ele */ HTMLElement, Unit]
  ): Unit = js.native
  def addFixedContentElement(
    element: HTMLElement,
    mapUnitsX: Double,
    mapUnitsY: Double,
    addAction: js.Function1[/* ele */ HTMLElement, Unit],
    dragOptions: Anon_Delta
  ): Unit = js.native
  /**
  	 * Add a styled path geometry to the content area which resides at a z-level 
  	 * above tiled map content. The geometry is converted to SVG and added to the 
  	 * content area DOM. If an attempt to add a geometry is made with the same 
  	 * key, the geometry is swapped out. You must remove using removePathGeometry 
  	 * for resource cleanup.
  	 * @param {styleGeometry} styledGeom The styledGeometry to render.
  	 * @param {string} key String used to tie a geometry to its SVG
    * @param {function} addAction optional function that is called when mapsjs adds an svg element to the DOM representing this styledGeometry.
    * @param {function} removeAction optional function that is called when mapsjs adds an svg element to the DOM representing this styledGeometry.
  	 * rendering in the DOM.
  	 * @returns {element} The SVG element which was added to the DOM.
  	 */
  def addPathGeometry(styledGeom: styledGeometry, key: String): SVGElement = js.native
  def addPathGeometry(styledGeom: styledGeometry, key: String, addAction: js.Function1[/* svg */ SVGElement, Unit]): SVGElement = js.native
  def addPathGeometry(
    styledGeom: styledGeometry,
    key: String,
    addAction: js.Function1[/* svg */ SVGElement, Unit],
    removeAction: js.Function1[/* svg */ SVGElement, Unit]
  ): SVGElement = js.native
  /**
  	 * Initiates digitization on the map control. This creates a new
  	 * geometry and adds verticies to the geometry accord to mouse
  	 * click locations.
  	 * @param {object} options JavaScript object of the form { key,
  	 * shapeType, geometryStyle, styledGeometry, nodeTapAndHoldAction, nodeMoveAction,
  	 * shapeChangeAction, envelopeEndAction, circleEndAction, supressNodeAdd, leavePath }
  	 * where key is a a string associated with this geometry, shapeType
  	 * is the type of shape this geometry is, one of 'polygon', 'polyline', 'multipoint', 'envelope' or 'circle', 
    * geometryStyle is a geometryStyle which should be applied
  	 * to the digitized geometry, styledGeometry is an optional styledGeometry for existing paths to edit, set this to enter edit mode,
    * nodeTapAndHoldAction is a callback invoked
  	 * when any point in the geometry is clicked and held and has the
  	 * signature nodeTapAndHoldAction(setIdx, idx), nodeMoveAction is a
  	 * callback invoked after any node is dragged to a new location and
  	 * has signature nodeMoveAction(x, y, actionType), shapeChangeAction
  	 * is a callback that is invoked after the geometry shape changes and,
  	 * has signature shapeChangeAction(shape), envelopeEndAction is a callback 
  	 * invoked after an envelope is created and has signature envelopeEndAction(envelope), 
    * circleEndAction is similar to envelopeEndAction but takes a geometry.polygon representing the circle,
  	 * and leavePath is a flag that indicates whether the digitized shape
  	 * should be left on the map after digitization is complete.
  	 */
  def beginDigitize(options: beginDigitizeOptions): Unit = js.native
  /**
  	 * Gets a point in map units from supplied coordinates pixel units 
  	 * with respect to the currently displayed extents.
  	 * @param {number} x The x coordinate in pixels.
  	 * @param {number} y The y coordinate in pixels.
  	 * @returns {point} The generated point in map units.
  	 */
  def computeMapPointFromPixelLocation(x: Double, y: Double): point = js.native
  /**
  	 * Programmatically delete a node from the currently digitizing path.
  	 * @param {number} setIdx The index of the set from which to remove the node.
  	 * @param {number} nodeIdx The index of the node to remove.
  	 */
  def deleteNodeOnDigitizePath(setIdx: Double, nodeIdx: Double): Unit = js.native
  def endDigitize(): Unit = js.native
  /**
  	 * Animates parabolically from the current map center and zoom level
  	 * to the given map center and zoom level.
  	 * @param {point} center Desired map center as a point.
    * @param {number} zl Desired zoom level.
    * @param {number} [durationMs] Animation duration in miliseconds.
    * @param {function} [completeAction] Function to call after the animation
    * completes with signature completeAction().
  	 */
  def flyTo(center: point, zl: Double): Unit = js.native
  def flyTo(center: point, zl: Double, durationMs: Double): Unit = js.native
  def flyTo(center: point, zl: Double, durationMs: Double, completeAction: js.Function0[Unit]): Unit = js.native
  /**
  	 * Gets the current actual map scale. This is the ratio of units on 
  	 * the screen to actual units on the earth's surface at the latitude 
  	 * of the current map center.
  	 * @returns {number} The ratio of screen units to actual meters.
  	 */
  def getActualMapScale(): Double = js.native
  /**
  	 * Gets the best fit zoom level based on the supplied map extents for 
  	 * the current display extents in pixels.
  	 * @param {envelope} extentsNew New map extents to fit.
  	 * @returns {number} The zoom level which best fits the extents.
  	 */
  def getBestFitZoomLevelByExtents(extentsNew: envelope): Double = js.native
  /**
  	 * Gets a snapshot copy of the currently digitizing path.
  	 * @returns {geometry} The currently digitizing path.
  	 */
  def getDigitizeSnapshot(): geometry = js.native
  /**
  	 * Gets the center of the map in spherical mercator. Use 
  	 * sphericalMercator.deprojectToLatLon static function to convert to a lat/lon.
  	 * @return {point} A point map center
  	 */
  def getMapCenter(): point = js.native
  /**
  	 * Gets the current map extents in spherical mercator units.
  	 * @return {envelope} envelope The current map extents.
  	 */
  def getMapExtents(): envelope = js.native
  /**
  	 * Gets the current map units per pixel.
  	 * @returns {number} Map units (meters) per pixel.
  	 */
  def getMapUnitsPerPixel(): Double = js.native
  /**
  	 * Gets the current projected map scale. This is the ratio of units on
  	 * the screen to map units depicted.
  	 * @returns {number} Ratio of screen units to map units.
  	 */
  def getProjectedMapScale(): Double = js.native
  /**
  	 * Gets a tile layer from the display stack by its key.
  	 * @param {string} key The desired tile layer's key.
  	 * @returns {tile.layer} The tile layer associated with the key, or null
  	 * if no tile layer is associated with the key.
  	 */
  def getTileLayer(key: String): layer = js.native
  /**
  	 * Gets the current number of tile layers in the display stack.
  	 * @returns {number} The number of tile layers in the display stack.
  	 */
  def getTileLayerCount(): Double = js.native
  /**
  	 * Gets the map extents' width and height in pixels.
  	 * @returns {object} JavaScript object of the form {w, h} where w is
  	 * the current extents' width in pixels and h is the current extents'
  	 * height in pixels.
  	 */
  def getViewExtentsInPix(): Anon_H = js.native
  /**
  	 * Gets the current zoom level.
  	 * @returns {number} The current zoom level.
  	 */
  def getZoomLevel(): Double = js.native
  /**
  	 * Determines whether a shape is currently being digitized.
  	 * @returns {boolean} Whether or not a shape is being digitized.
  	 */
  def isDigitizingEnabled(): Boolean = js.native
  /**
  	 * Move an existing fixed content element.
  	 * @param {HTMLElement} element The existing DOM element to move.
  	 * @param {number} mapUnitsX The new x coordinate in map units.
  	 * @param {number} mapUnitsY The new y coordinate in map units.
  	 */
  def moveFixedContentElement(element: HTMLElement, mapUnitsX: Double, mapUnitsY: Double): Unit = js.native
  /**
    * Offsets the current map center by the specified deltas in pixels. 
    * @param {number} [dx] offset x in pixels.
    * @param {number} [dy] offset y in pixels.
    */
  def offsetMapCenterByPixelDelta(dx: Double, dy: Double): Unit = js.native
  /**
    * Offsets the current map center by the specified deltas in pixels - animated version.
    * @param {number} [dx] offset x in pixels.
    * @param {number} [dy] offset y in pixels.
    * @param {number} [durationMs] animation duration in mS.
    */
  def offsetMapCenterByPixelDeltaAnimate(dx: Double, dy: Double): Unit = js.native
  def offsetMapCenterByPixelDeltaAnimate(dx: Double, dy: Double, durationMs: Double): Unit = js.native
  /**
  	 * Removes the last set from the currently digitizing path.
  	 * @return {number[]} The last set from the currently digitizing path
  	 * in the form [xn,yn]. 
  	 */
  def popSetFromDigitizePath(): js.Array[Double] = js.native
  /**
  	 * Removes a tile layer off the top of the display stack
  	 * @returns {tile.layer} The removed tile layer.
  	 */
  def popTileLayer(): layer = js.native
  /** 
  	 * Forces additional digitized points to be pushed to a new set of the
  	 * currently digitizing geometry.
  	 */
  def pushSetOnDigitizePath(): Unit = js.native
  /**
  	 * Pushes a supplied tile layer onto the top of the display stack.
  	 * @param {tile.layer} tl The desired tile layer.
  	 */
  def pushTileLayer(tl: layer): Unit = js.native
  /**
  	 * Forces the map to redraw the currently loaded tile and geometry 
  	 * content. You should not have to call this as redraws are automatically
  	 * handled during programatic state changes. This would be for edge cases 
  	 * where the developer is affecting internal state in an undocumented way.
  	 */
  def redraw(): Unit = js.native
  /**
    * Removes all tile layers off the display stack
    */
  def removeAllTileLayers(): Unit = js.native
  /**
  	 * Removes a fixed content element.
  	 * @param {HTMLElement} element The DOM element to remove. Note: This
  	 * must be the same element added by addFixedContentElement.
  	 */
  def removeFixedContentElement(element: HTMLElement): Unit = js.native
  /**
  	 * Removes a styledGeometry from display.
  	 * @param {string} key The key of the geometry to remove.
    * @returns {element} The SVG element which was removed from the DOM.
  	 */
  def removePathGeometry(): SVGElement = js.native
  def removePathGeometry(key: String): SVGElement = js.native
  /**
    * Removes a tile layer off the display stack by reference
    * @param {tile.layer} tl A tile layer to remove.
    */
  def removeTileLayer(tl: layer): Unit = js.native
  /**
  	 * Updates the map to the size of its container. This updates internal 
  	 * parameters for computing map extents and handling the amount of tile 
  	 * content to download. This is handled automatically if the browser 
  	 * window is resized. But if you are sizing the map programatically 
  	 * (e.g. resizable panel or slider) then call this after the parent 
  	 * container has resized.
  	 */
  def resize(): Unit = js.native
  /**
  	* Sets the background color of the map using a css color string
  	* @param {number} b- a css color string
  	*/
  def setBackground(b: String): Unit = js.native
  /** 
  	* Sets the margin around the map in pixels for extra content fetched so that tile 
  	* rebuilding of the display is minimized. This is an advanced property and does not 
  	* generally need to be adjusted. The default is 128 pixels, or half the width
  	* of a tile. This should be increased for maps which are very large in pixels
  	* or where panning is constant. This should be decreased for very small maps,
  	* such as on mobile devices, or where panning is minimal.
  	* @param {number} cem The content extent margin in pixels.
  	*/
  def setContentExtentsMarginInPixels(cem: Double): Unit = js.native
  /**
  	 * Set the function called when map content (map tiles and fixed elements) are 
  	 * re-positioned in the DOM. This is done automatically as the map is panned 
  	 * beyond existing content and zoomed to a new level requiring content.
  	 * @param {function} action The function to call when the map content
  	 * completes repositioning with signature action(object) where object
  	 * is of the form { centerX, centerY, zoomLevel, mapUnitsPerPixel }.
  	 */
  def setContentRepositionAction(action: js.Function1[/* vals */ repositionStatsObj, Unit]): Unit = js.native
  /**
  	 * Sets the z-order of drawn content in relation to the gesture capture 
  	 * panel. The default behavior (false) is to have fixed content and 
  	 * geometry underneath the gesture panel in the DOM. If false, all 
  	 * pointer events are handled by the gesture capture panel and
  	 * optionally parents of the map control. If true, drawn content will
  	 * receive pointer events first and will block gestures to the map. If 
  	 * true, digitizing will not function and polygons will block map 
  	 * navigation. In some scenarios you may want to set this to true if you
  	 * are placing fixed content (such as point features) on the map and 
  	 * need to handle gestures on the placed content. You can call this 
  	 * function at any time to change the order.
    * @param {boolean} flag Whether or not the fixed content layer should 
    * reside above the gesture layer.
  	 */
  def setDrawnContentZorderToTop(flag: Boolean): Unit = js.native
  /** 
  	 * Set the function called when the map extents have stopped changing 
  	 * (e.g. after an animated pan or zoom).
  	 * @param {function} action The function to call when the extents
  	 * finish changing with signature action(object) where object is of
  	 * the form { centerX, centerY, centerLat, centerLon, zoomLevel, mapScale,
  	 * mapScaleProjected, mapUnitsPerPixel, extents }.
  	 */
  def setExtentChangeCompleteAction(action: js.Function1[/* vals */ extentChangeStatsObj, Unit]): Unit = js.native
  /**
  	 * Sets the center of the map in spherical mercator. Use
  	 * sphericalMercator.projectFromLatLon static function to convert from a lat/lon.
  	 * @param {point} center The map center as a point
  	 */
  def setMapCenter(center: point): Unit = js.native
  /**
  	 * Same as setMapCenter except will animate from current map center to the 
  	 * specified location
  	 * @param {point} center The map center as a point.
    * @param {number} [durationMs] Duration in miliseconds.
    * @param {function} [completeAction] Callback to perform on animaton complete.
  	 */
  def setMapCenterAnimate(center: point): Unit = js.native
  def setMapCenterAnimate(center: point, durationMs: Double): Unit = js.native
  def setMapCenterAnimate(center: point, durationMs: Double, completeAction: js.Function0[Unit]): Unit = js.native
  /**
  	 * Sets the map center to the current geolocation if supported. The map is
    * animated to the new location.
    * @param {number} [durationMs] Duration in miliseconds.
    * @param {function} [completeAction] Callback to perform on animaton complete.
  	 */
  def setMapCenterToGeolocationAnimate(): Unit = js.native
  def setMapCenterToGeolocationAnimate(durationMs: Double): Unit = js.native
  def setMapCenterToGeolocationAnimate(durationMs: Double, completeAction: js.Function0[Unit]): Unit = js.native
  /**
  	 * Sets the maximum zoom level for the map.
  	 * @param {number} z1 The desired maximum zoom level.
  	 */
  def setMaxZoomLevel(zl: Double): Unit = js.native
  /**
  	 * Sets the minimum zoom level for the map.
  	 * @param {number} zl Desired minimum zoom level.
  	 */
  def setMinZoomLevel(zl: Double): Unit = js.native
  /**
  	 * Sets function called when map is clicked or tapped.
  	 * @param {function} action The function to call on mouse click or tap 
  	 * with signature action(point).
  	 */
  def setPointerClickAction(action: js.Function1[/* pt */ point, Unit]): Unit = js.native
  /** 
  	 * Sets function called when the map pointer hovers over the map.
  	 * @param {function} action The function to call on mouse hover with 
  	 * signature action(point).
  	 */
  def setPointerHoverAction(action: js.Function1[/* pt */ point, Unit]): Unit = js.native
  /**
  	 * Flags whether or not map extent changes can occur through gestures 
  	 * like mouse or touch drag, mouse wheel, or pinch zoom.
  	 * @param {boolean} flag Whether or not gestures should affect map 
  	 * extent changes.
  	 */
  def setSuspendMapExtentChangesByGestures(flag: Boolean): Unit = js.native
  /**
  	 * Sets the current zoom level.
  	 * @param {number} z1 The desired zoom level.
  	 */
  def setZoomLevel(zl: Double): Unit = js.native
  /**
  	 * Animates the map from the current zoom level to the given zoom level.
  	 * @param {number} zl The desired zoom level.
    * @param {number} [durationMs] The duration in miliseconds.
    * @param {function} [completeAction] Function to call when the animation
    * completes with signature completeAction().
  	 */
  def setZoomLevelAnimate(zl: Double): Unit = js.native
  def setZoomLevelAnimate(zl: Double, durationMs: Double): Unit = js.native
  def setZoomLevelAnimate(zl: Double, durationMs: Double, completeAction: js.Function0[Unit]): Unit = js.native
  /**
  	 * Updates an existing path geometry to reflect a style change.
  	 * @param {geometryStyle} styleNew The new geometryStyle.
  	 * @param {string} key The key of the geometry to receive the new style.
  	 */
  def updatePathGeometryStyle(styleNew: geometryStyle, key: String): Unit = js.native
  /**
  	 * Changes the current zoom level.
  	 * @param {number} delta Change to be added to the current zoom level.
  	 */
  def zoomDelta(delta: Double): Unit = js.native
  /** 
  	 * Animates a change to the current zoom level.
  	 * @param {number} delta Change to be added to the current zoom level.
  	 * @param {number} [durationMs] Duration in miliseconds.
  	 */
  def zoomDeltaAnimate(delta: Double): Unit = js.native
  def zoomDeltaAnimate(delta: Double, durationMs: Double): Unit = js.native
}

