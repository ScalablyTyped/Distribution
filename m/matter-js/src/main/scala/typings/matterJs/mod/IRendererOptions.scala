package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRendererOptions extends StObject {
  
  /**
    * Sets scene background
    * @type {string}
    * default undefined
    */
  var background: js.UndefOr[String] = js.undefined
  
  /**
    * A flag that specifies if `render.bounds` should be used when rendering.
    *
    * @property options.hasBounds
    * @type {boolean}
    * @default false
    */
  var hasBounds: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The target height in pixels of the `render.canvas` to be created.
    *
    * @property options.height
    * @type {number}
    * @default 600
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The pixel ratio to use when rendering.
    * @type {number}
    * @default 1
    */
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * A flag to enable or disable the body angle debug overlay.
    * @type {boolean}
    * @default false
    */
  var showAngleIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the body axes debug overlay.
    * @type {boolean}
    * @default false
    */
  var showAxes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the body bounds debug overlay.
    * @type {boolean}
    * @default false
    */
  var showBounds: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the collision broadphase debug overlay.
    * @deprecated no longer implemented
    * @type {boolean}
    * @default false
    */
  var showBroadphase: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the body collisions debug overlay.
    * @type {boolean}
    * @default false
    */
  var showCollisions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the body convex hulls debug overlay.
    * @type {boolean}
    * @default false
    */
  var showConvexHulls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the debug information overlay.
    * This includes and has priority over the values of:
    * - render.options.showStats
    * - render.options.showPerformance
    * @type {boolean}
    * @default false
    */
  var showDebug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the body and part ids debug overlay.
    * @type {boolean}
    * @default false
    */
  var showIds: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the body internal edges debug overlay.
    * @type {boolean}
    * @default false
    */
  var showInternalEdges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the mouse position debug overlay.
    * @type {boolean}
    * @default false
    */
  var showMousePosition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable performance charts.
    * From left to right, the values shown are:
    * - average render frequency (e.g. 60 fps)
    * - exact engine delta time used for last update (e.g. 16.66ms)
    * - average engine execution duration (e.g. 5.00ms)
    * - average render execution duration (e.g. 0.40ms)
    * - average effective play speed (e.g. '1.00x' is 'real-time')
    * Each value is recorded over a fixed sample of past frames (60 frames).
    * A chart shown below each value indicates the variance from the average over the sample. The more stable or fixed the value is the flatter the chart will appear.
    * @type {boolean}
    * @default false
    */
  var showPerformance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the body positions debug overlay.
    * @type {boolean}
    * @default false
    */
  var showPositions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the collision resolver separations debug overlay.
    * @type {boolean}
    * @default false
    */
  var showSeparations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets opacity of sleeping body if `render.options.showSleeping` is enabled
    * @type {boolean}
    * default true
    */
  var showSleeping: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the engine stats info overlay.
    * From left to right, the values shown are:
    * - body parts total
    * - body total
    * - constraints total
    * - composites total
    * - collision pairs total
    * @type {boolean}
    * @default false
    */
  var showStats: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the body velocity debug overlay.
    * @type {boolean}
    * @default false
    */
  var showVelocity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A flag to enable or disable the body vertex numbers debug overlay.
    * @type {boolean}
    * @default false
    */
  var showVertexNumbers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The target width in pixels of the `render.canvas` to be created.
    *
    * @property options.width
    * @type {number}
    * @default 800
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets wireframe background if `render.options.wireframes` is enabled
    * @type {string}
    * default undefined
    */
  var wireframeBackground: js.UndefOr[String] = js.undefined
  
  /**
    * Render wireframes only
    * @type {boolean}
    * @default true
    */
  var wireframes: js.UndefOr[Boolean] = js.undefined
}
object IRendererOptions {
  
  inline def apply(): IRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRendererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRendererOptions] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setHasBounds(value: Boolean): Self = StObject.set(x, "hasBounds", value.asInstanceOf[js.Any])
    
    inline def setHasBoundsUndefined: Self = StObject.set(x, "hasBounds", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setShowAngleIndicator(value: Boolean): Self = StObject.set(x, "showAngleIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowAngleIndicatorUndefined: Self = StObject.set(x, "showAngleIndicator", js.undefined)
    
    inline def setShowAxes(value: Boolean): Self = StObject.set(x, "showAxes", value.asInstanceOf[js.Any])
    
    inline def setShowAxesUndefined: Self = StObject.set(x, "showAxes", js.undefined)
    
    inline def setShowBounds(value: Boolean): Self = StObject.set(x, "showBounds", value.asInstanceOf[js.Any])
    
    inline def setShowBoundsUndefined: Self = StObject.set(x, "showBounds", js.undefined)
    
    inline def setShowBroadphase(value: Boolean): Self = StObject.set(x, "showBroadphase", value.asInstanceOf[js.Any])
    
    inline def setShowBroadphaseUndefined: Self = StObject.set(x, "showBroadphase", js.undefined)
    
    inline def setShowCollisions(value: Boolean): Self = StObject.set(x, "showCollisions", value.asInstanceOf[js.Any])
    
    inline def setShowCollisionsUndefined: Self = StObject.set(x, "showCollisions", js.undefined)
    
    inline def setShowConvexHulls(value: Boolean): Self = StObject.set(x, "showConvexHulls", value.asInstanceOf[js.Any])
    
    inline def setShowConvexHullsUndefined: Self = StObject.set(x, "showConvexHulls", js.undefined)
    
    inline def setShowDebug(value: Boolean): Self = StObject.set(x, "showDebug", value.asInstanceOf[js.Any])
    
    inline def setShowDebugUndefined: Self = StObject.set(x, "showDebug", js.undefined)
    
    inline def setShowIds(value: Boolean): Self = StObject.set(x, "showIds", value.asInstanceOf[js.Any])
    
    inline def setShowIdsUndefined: Self = StObject.set(x, "showIds", js.undefined)
    
    inline def setShowInternalEdges(value: Boolean): Self = StObject.set(x, "showInternalEdges", value.asInstanceOf[js.Any])
    
    inline def setShowInternalEdgesUndefined: Self = StObject.set(x, "showInternalEdges", js.undefined)
    
    inline def setShowMousePosition(value: Boolean): Self = StObject.set(x, "showMousePosition", value.asInstanceOf[js.Any])
    
    inline def setShowMousePositionUndefined: Self = StObject.set(x, "showMousePosition", js.undefined)
    
    inline def setShowPerformance(value: Boolean): Self = StObject.set(x, "showPerformance", value.asInstanceOf[js.Any])
    
    inline def setShowPerformanceUndefined: Self = StObject.set(x, "showPerformance", js.undefined)
    
    inline def setShowPositions(value: Boolean): Self = StObject.set(x, "showPositions", value.asInstanceOf[js.Any])
    
    inline def setShowPositionsUndefined: Self = StObject.set(x, "showPositions", js.undefined)
    
    inline def setShowSeparations(value: Boolean): Self = StObject.set(x, "showSeparations", value.asInstanceOf[js.Any])
    
    inline def setShowSeparationsUndefined: Self = StObject.set(x, "showSeparations", js.undefined)
    
    inline def setShowSleeping(value: Boolean): Self = StObject.set(x, "showSleeping", value.asInstanceOf[js.Any])
    
    inline def setShowSleepingUndefined: Self = StObject.set(x, "showSleeping", js.undefined)
    
    inline def setShowStats(value: Boolean): Self = StObject.set(x, "showStats", value.asInstanceOf[js.Any])
    
    inline def setShowStatsUndefined: Self = StObject.set(x, "showStats", js.undefined)
    
    inline def setShowVelocity(value: Boolean): Self = StObject.set(x, "showVelocity", value.asInstanceOf[js.Any])
    
    inline def setShowVelocityUndefined: Self = StObject.set(x, "showVelocity", js.undefined)
    
    inline def setShowVertexNumbers(value: Boolean): Self = StObject.set(x, "showVertexNumbers", value.asInstanceOf[js.Any])
    
    inline def setShowVertexNumbersUndefined: Self = StObject.set(x, "showVertexNumbers", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWireframeBackground(value: String): Self = StObject.set(x, "wireframeBackground", value.asInstanceOf[js.Any])
    
    inline def setWireframeBackgroundUndefined: Self = StObject.set(x, "wireframeBackground", js.undefined)
    
    inline def setWireframes(value: Boolean): Self = StObject.set(x, "wireframes", value.asInstanceOf[js.Any])
    
    inline def setWireframesUndefined: Self = StObject.set(x, "wireframes", js.undefined)
  }
}
