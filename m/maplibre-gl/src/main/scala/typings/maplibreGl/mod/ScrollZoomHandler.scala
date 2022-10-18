package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.Easing
import typings.maplibreGl.anon.NeedsRenderFrame
import typings.maplibreGl.anon.TypeofsetTimeout
import typings.maplibreGl.maplibreGlStrings.trackpad
import typings.maplibreGl.maplibreGlStrings.wheel
import typings.std.HTMLElement
import typings.std.ReturnType
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ScrollZoomHandler")
@js.native
open class ScrollZoomHandler protected () extends StObject {
  /**
  	 * @private
  	 */
  def this(map: Map, handler: HandlerManager) = this()
  
  var _active: Boolean = js.native
  
  var _around: LngLat = js.native
  
  var _aroundCenter: Boolean = js.native
  
  var _aroundPoint: ^ = js.native
  
  var _defaultZoomRate: Double = js.native
  
  var _delta: Double = js.native
  
  def _easing(a: Double): Double = js.native
  
  var _el: HTMLElement = js.native
  
  var _enabled: Boolean = js.native
  
  var _finishTimeout: ReturnType[TypeofsetTimeout] = js.native
  
  var _frameId: Boolean = js.native
  
  var _handler: HandlerManager = js.native
  
  var _lastValue: Double = js.native
  
  var _lastWheelEvent: Any = js.native
  
  var _lastWheelEventTime: Double = js.native
  
  var _map: Map = js.native
  
  def _onTimeout(initialEvent: Any): scala.Unit = js.native
  
  var _prevEase: Easing = js.native
  
  def _smoothOutEasing(duration: Double): js.Function1[/* t */ Double, Double] = js.native
  
  def _start(e: Any): scala.Unit = js.native
  
  var _startZoom: Double = js.native
  
  var _targetZoom: Double = js.native
  
  var _timeout: ReturnType[TypeofsetTimeout] = js.native
  
  var _type: wheel | trackpad | Null = js.native
  
  var _wheelZoomRate: Double = js.native
  
  var _zooming: Boolean = js.native
  
  /**
  	 * Disables the "scroll to zoom" interaction.
  	 *
  	 * @example
  	 *   map.scrollZoom.disable();
  	 */
  def disable(): scala.Unit = js.native
  
  /**
  	 * Enables the "scroll to zoom" interaction.
  	 *
  	 * @param {Object} [options] Options object.
  	 * @param {string} [options.around] If "center" is passed, map will zoom around center of map
  	 *
  	 * @example
  	 *   map.scrollZoom.enable();
  	 * @example
  	 *  map.scrollZoom.enable({ around: 'center' })
  	 */
  def enable(): scala.Unit = js.native
  def enable(options: Any): scala.Unit = js.native
  
  def isActive(): Boolean = js.native
  
  /**
  	 * Returns a Boolean indicating whether the "scroll to zoom" interaction is enabled.
  	 *
  	 * @returns {boolean} `true` if the "scroll to zoom" interaction is enabled.
  	 */
  def isEnabled(): Boolean = js.native
  
  def isZooming(): Boolean = js.native
  
  def renderFrame(): NeedsRenderFrame = js.native
  
  def reset(): scala.Unit = js.native
  
  /**
  	 * Set the zoom rate of a mouse wheel
  	 * @param {number} [wheelZoomRate=1/450] The rate used to scale mouse wheel movement to a zoom value.
  	 * @example
  	 * // Slow down zoom of mouse wheel
  	 * map.scrollZoom.setWheelZoomRate(1/600);
  	 */
  def setWheelZoomRate(wheelZoomRate: Double): scala.Unit = js.native
  
  /**
  	 * Set the zoom rate of a trackpad
  	 * @param {number} [zoomRate=1/100] The rate used to scale trackpad movement to a zoom value.
  	 * @example
  	 * // Speed up trackpad zoom
  	 * map.scrollZoom.setZoomRate(1/25);
  	 */
  def setZoomRate(zoomRate: Double): scala.Unit = js.native
  
  def wheel(e: WheelEvent): scala.Unit = js.native
}
