package typings.heremaps.H

import typings.heremaps.H.Map_.EngineType
import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.geo.Rect
import typings.heremaps.H.map.DataModel
import typings.heremaps.H.map.Group
import typings.heremaps.H.map.Imprint
import typings.heremaps.H.map.Object
import typings.heremaps.H.map.ViewModel
import typings.heremaps.H.map.ViewModel.ILookAtData
import typings.heremaps.H.map.ViewPort
import typings.heremaps.H.map.ViewPort.Padding
import typings.heremaps.H.map.layer.BaseTileLayer
import typings.heremaps.H.map.layer.Layer
import typings.heremaps.H.map.render.p2d.RenderEngine
import typings.heremaps.H.math.Point
import typings.heremaps.H.util.EventTarget
import typings.heremaps.H.util.ICapturable
import typings.heremaps.H.util.Request
import typings.std.Element
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** Map *****/
/**
  * Map class defines map instance in the application. By creating this object you will initialize a visible map object which is attached to the provided dom element.
  * Map class is an entry point to all operations related to layers, map objects and geo-screen transformations. By specifying options you can initialize map with predefined view.
  */
@js.native
trait Map_
  extends StObject
     with EventTarget {
  
  /**
    * This method adds a layer to the map.
    * @param layer {H.map.layer.Layer} - The map layer to be added
    * @param opt_idx {number=} - index at which the new layer should be inserted
    * @returns {H.Map} - current map instance
    */
  def addLayer(layer: Layer): Map_ = js.native
  def addLayer(layer: Layer, opt_idx: Double): Map_ = js.native
  
  /**
    * This method adds an map object to the map. Map object can be a marker or a spatial object like polygon or polyline.
    * @param mapObject {!H.map.Object} - The map object to add
    * @returns {!H.map.Object} - the added map object
    */
  def addObject(mapObject: Object): Object = js.native
  
  /**
    * This method adds an array of objects or an object group to the map.
    * @param mapObjects {Array<!H.map.Object>}
    * @returns {H.Map} - the map instance
    */
  def addObjects(mapObjects: js.Array[Object]): Map_ = js.native
  
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  
  /**
    * This method captures desired region of the map and objects on it. Result is returned as an HTML5 Canvas element.
    * Origin of coordinate system for capturing is in the top left corner of the viewport.
    * @param callback {function(HTMLCanvasElement=)} - Callback function to call once result of the capturing is ready
    * @param opt_capturables {Array<H.util.ICapturable>=} - Collection of "capturable" element(s) to draw into the resulting canvas
    * @param opt_x1 {number=} - The X coordinate of the left edge of the capturing rectangle defaults to 0
    * @param opt_y1 {number=} - The Y coordinate of the top edge of the capturing rectangle defaults to 0
    * @param opt_x2 {number=} - The X coordinate of the right edge of the capturing rectangle defaults to viewport width
    * @param opt_y2 {number=} - The Y coordinate of the bottom edge of the capturing rectangle defaults to viewport height
    */
  def capture(
    callback: js.UndefOr[js.Function1[/* canvas */ HTMLCanvasElement, Unit]],
    opt_capturables: js.UndefOr[js.Array[ICapturable]],
    opt_x1: js.UndefOr[Double],
    opt_y1: js.UndefOr[Double],
    opt_x2: js.UndefOr[Double],
    opt_y2: js.UndefOr[Double]
  ): Unit = js.native
  
  /**
    * To clear the entire stored content
    * @param opt_onprogress {function(H.util.Request)=} - A callback which is invoked every time when the progress state of the returned clear request changes
    * @returns {H.util.Request} - A handle to the created flush request
    */
  def clearContent(): Request = js.native
  def clearContent(opt_onprogress: js.Function1[/* req */ Request, Unit]): Request = js.native
  
  /**
    * Returns the screen coordinates according to the given geographical coordinates. This method returns a screen pixel coordinates for the provided geo point.
    * @param geoPoint {H.geo.IPoint} - point on the map
    * @returns {?H.math.Point}
    */
  def geoToScreen(geoPoint: IPoint): Point = js.native
  
  /**
    * To get the current base map layer.
    * @returns {?H.map.layer.Layer}
    */
  def getBaseLayer(): Layer = js.native
  
  /**
    * This method returns currently rendered center of the map.
    * @returns {H.geo.Point}
    */
  def getCenter(): typings.heremaps.H.geo.Point = js.native
  
  /**
    * This method returns the map root html element
    * @returns {Element}
    */
  def getElement(): Element = js.native
  
  /**
    * This returns the map's render engine
    * @return {H.map.render.p2d.RenderEngine} - map render engine
    */
  def getEngine(): RenderEngine = js.native
  
  /**
    * This method returns the imprint object for this map.
    * @returns {H.map.Imprint}
    */
  def getImprint(): Imprint = js.native
  
  /**
    * This method returns the map's current layer collection.
    * @returns {H.map.DataModel}
    */
  def getLayers(): DataModel = js.native
  
  /**
    * Returns the top most z-ordered map object found under the specific screen coordinates. Coordinates are viewport pixel coordinates starting from top left corner as (0, 0) point.
    * @param x {number} - map viewport x-axis pixel coordinate
    * @param y {number} - map viewport y-axis pixel coordinate
    * @param callback {function}
    * @returns {?H.map.Object} - the encountered top most map object or null if no object found
    */
  def getObjectAt(x: Double, y: Double, callback: js.Function1[/* obj */ Object, js.Any]): Object = js.native
  
  /**
    * This method retrieves the list of all objects which have been added to the map.
    * @returns {Array<H.map.Object>} - the list of all use objects which are currently on the map.
    */
  def getObjects(): js.Array[Object] = js.native
  
  /**
    * Returns a list of map objects in descending z-order found under the specific screen coordinates. Coordinates are viewport pixel coordinates starting from top left corner as (0, 0) point.
    * @param x {number} - map viewport x-axis pixel coordinate
    * @param y {number} - map viewport y-axis pixel coordinate
    * @returns {Array<!H.map.Object>}
    */
  def getObjectsAt(x: Double, y: Double): js.Array[Object] = js.native
  
  /**
    * This method returns current view model. View model can be used to modify the current view or camera. H.map.ViewModel
    * @returns {H.map.ViewModel}
    */
  def getViewModel(): ViewModel = js.native
  
  /**
    * This method returns current map viewport.
    * Viewport can be used to modify padding and margin which will reflect the position of the viewport center and the amount of extra data loaded (for margin)
    * @returns {H.map.ViewPort}
    */
  def getViewPort(): ViewPort = js.native
  
  /**
    * This method returns currently rendered zoom level.
    * @returns {number}
    */
  def getZoom(): Double = js.native
  
  /**
    * This method removes layer from the map.
    * @param layer {H.map.layer.Layer} - The map layer to be removed
    * @returns {H.Map} - current map instance
    */
  def removeLayer(layer: Layer): Map_ = js.native
  
  /**
    * This method removes previously added map object from the map.
    * @param mapObject {!H.map.Object} - The map object to remove
    * @returns {!H.map.Object} - the removed map object
    */
  def removeObject(mapObject: Object): Object = js.native
  
  /**
    * This method removes an array of object or an object group from the map.
    * @param mapObjects {(Array<H.map.Object> | H.map.Group)}
    * @returns {H.Map} - the map instance
    */
  def removeObjects(mapObjects: js.Array[Object]): Map_ = js.native
  def removeObjects(mapObjects: Group): Map_ = js.native
  
  /**
    * Returns the geographical coordinates according to the given screen coordinates.
    * @param x {number} - map viewport x-axis pixel coordinate
    * @param y {number} - map viewport y-axis pixel coordinate
    * @returns {?H.geo.Point}
    */
  def screenToGeo(x: Double, y: Double): typings.heremaps.H.geo.Point = js.native
  
  /**
    * Returns the camera data according to the given screen coordinates. Method converts screen pixel coordinates to correct camera data object
    * @param x {number} - map viewport x-axis pixel coordinate
    * @param y {number} - map viewport y-axis pixel coordinate
    * @returns {H.map.ViewModel.ILookAtData}
    */
  def screenToLookAtData(x: Double, y: Double): ILookAtData = js.native
  
  /**
    * This method will set provided layer as base map. The layer will be inserted as the bottom most layer in the map.
    * @param layer {H.map.layer.Layer} - The layer to use as base map
    * @returns {H.Map} - the instance itself
    */
  def setBaseLayer(layer: Layer): Map_ = js.native
  
  /**
    * This method sets the new center on a map.
    * @param center {H.geo.IPoint} - requested center to be set
    * @param opt_animate {boolean=} - parameter indicates if animated transition should be applied, default is false
    * @returns {H.Map} - the instance itself
    */
  def setCenter(center: IPoint): Map_ = js.native
  def setCenter(center: IPoint, opt_animate: Boolean): Map_ = js.native
  
  /**
    * This method sets the rendering engine type for the map. Rendering engine is responsible for displaying i.e tiles and data on the map.
    * @param type {H.Map.EngineType}
    * @returns {H.Map} - the map itself
    */
  def setEngineType(`type`: EngineType): Map_ = js.native
  
  /**
    * This method sets the zoom level on the map. Every zoom level represents different scale i.e map at zoom level 2 is twice as large as the map at zoom level 1.
    * @param zoom {number} - requested zoom level
    * @param opt_animate {boolean=} - parameter indicates if animated transition should be applied, default is false
    * @returns {H.Map} - the instance itself
    */
  def setZoom(zoom: Double): Map_ = js.native
  def setZoom(zoom: Double, opt_animate: Boolean): Map_ = js.native
  
  /**
    * To persistently store the content of a map layer for a given area and range of zoom levels.
    * It can be used to enable map rendering when no internet connection is established and also to reduce the download traffic for frequently visited map areas.
    * @param opt_onprogress {function(H.util.Request)=} - A callback which is invoked every time when the progress state of the returned store request changes.
    * @param opt_bounds {H.geo.Rect=} - The area to store, default is the current view bounds
    * @param opt_min {number=} - The minimum zoom level to store, default is the current zoom level
    * @param opt_max {number=} - The maximum zoom level to store, default is the current zoom level
    * @param opt_layer {H.map.layer.BaseTileLayer=} - The layer to store, default is the current base layer
    * @returns {H.util.Request} - A handle to the created storage request
    */
  def storeContent(): Request = js.native
  def storeContent(opt_onprogress: js.Function1[/* req */ Request, Unit]): Request = js.native
  def storeContent(opt_onprogress: js.Function1[/* req */ Request, Unit], opt_bounds: Unit, opt_min: Double): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Unit,
    opt_min: Double,
    opt_max: Double
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Unit,
    opt_min: Double,
    opt_max: Double,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Unit,
    opt_min: Double,
    opt_max: Unit,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Unit,
    opt_min: Unit,
    opt_max: Double
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Unit,
    opt_min: Unit,
    opt_max: Double,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Unit,
    opt_min: Unit,
    opt_max: Unit,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(opt_onprogress: js.Function1[/* req */ Request, Unit], opt_bounds: Rect): Request = js.native
  def storeContent(opt_onprogress: js.Function1[/* req */ Request, Unit], opt_bounds: Rect, opt_min: Double): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Rect,
    opt_min: Double,
    opt_max: Double
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Rect,
    opt_min: Double,
    opt_max: Double,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Rect,
    opt_min: Double,
    opt_max: Unit,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Rect,
    opt_min: Unit,
    opt_max: Double
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Rect,
    opt_min: Unit,
    opt_max: Double,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(
    opt_onprogress: js.Function1[/* req */ Request, Unit],
    opt_bounds: Rect,
    opt_min: Unit,
    opt_max: Unit,
    opt_layer: BaseTileLayer
  ): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Unit, opt_min: Double): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Unit, opt_min: Double, opt_max: Double): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Unit, opt_min: Double, opt_max: Double, opt_layer: BaseTileLayer): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Unit, opt_min: Double, opt_max: Unit, opt_layer: BaseTileLayer): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Unit, opt_min: Unit, opt_max: Double): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Unit, opt_min: Unit, opt_max: Double, opt_layer: BaseTileLayer): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Unit, opt_min: Unit, opt_max: Unit, opt_layer: BaseTileLayer): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Rect): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Rect, opt_min: Double): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Rect, opt_min: Double, opt_max: Double): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Rect, opt_min: Double, opt_max: Double, opt_layer: BaseTileLayer): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Rect, opt_min: Double, opt_max: Unit, opt_layer: BaseTileLayer): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Rect, opt_min: Unit, opt_max: Double): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Rect, opt_min: Unit, opt_max: Double, opt_layer: BaseTileLayer): Request = js.native
  def storeContent(opt_onprogress: Unit, opt_bounds: Rect, opt_min: Unit, opt_max: Unit, opt_layer: BaseTileLayer): Request = js.native
  
  /**
    * This method changes the map zoom while keeping target screen coordinates specified as x,y at the same place where they were before.
    * @param zoom {number} - new zoom level
    * @param x {number} - map viewport x-axis pixel coordinate
    * @param y {number} - map viewport y-axis pixel coordinate
    */
  def zoomAt(zoom: Double, x: Double, y: Double): Unit = js.native
}
object Map_ {
  
  @js.native
  sealed trait EngineType extends StObject
  /**
    * Types of engines
    */
  @JSGlobal("H.Map.EngineType")
  @js.native
  object EngineType extends StObject {
    
    @js.native
    sealed trait P2D
      extends StObject
         with EngineType
    
    @js.native
    sealed trait PANORAMA
      extends StObject
         with EngineType
  }
  
  /**
    * It defines the number of lower and higher zoom levels, where cached content of the base map is rendered while content of the current zoom level is still loading.
    * Example: if range was set to {lower: 3, higher: 2} and current level is 10 then rendering engine will try to display cached tiles from lower zoom levels 7, 8, 9 and higher levels 11 and 12.
    * @property lower {number} - The number of lower zoom levels to take into account, default is 0
    * @property higher {number} - The number of higher zoom levels to take into account, default is 0
    */
  trait BackgroundRange extends StObject {
    
    var higher: Double
    
    var lower: Double
  }
  object BackgroundRange {
    
    @scala.inline
    def apply(higher: Double, lower: Double): BackgroundRange = {
      val __obj = js.Dynamic.literal(higher = higher.asInstanceOf[js.Any], lower = lower.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundRange]
    }
    
    @scala.inline
    implicit class BackgroundRangeMutableBuilder[Self <: BackgroundRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHigher(value: Double): Self = StObject.set(x, "higher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLower(value: Double): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This type defines options which can be used to initialize the map.
    * @property center {H.geo.IPoint=} - The initial center of the map, default is {lat:0, lng: 0}
    * @property zoom {number=} - The initial zoom level of the map, default is 0 respectively the minimal zoom level of the base map
    * @property bounds {H.geo.Rect=} - The view bounds to be displayed on the map. If provided, it takes precedence over center and zoom. and zoom if provided)
    * @property layers {Array<H.map.layer.Layer>=} - A list of layers to render on top of the base map
    * @property engineType: {H.Map.EngineType=} - The initial engine type to use, default is P2D
    * @property pixelRatio {number} - The pixelRatio to use for over-sampling in cases of high-resolution displays, default is 1
    * @property imprint {H.map.Imprint.Options=} - The imprint options or null to suppress the imprint
    * @property renderBaseBackground {H.Map.BackgroundRange=} - Object describes how many cached zoom levels should be used as a base map background while base map tiles are loading.
    * Example: {lower: 3, higher: 2}
    * @property autoColor {boolean=} - Indicates whether the UI's colors should automatically adjusted to the base layer, default is true. Up to now only the copyright style will be adjusted.
    * See H.map.layer.Layer.Options#dark
    * @property margin {number=} - The size in pixel of the supplemental area to render for each side of the map
    * @property padding {H.map.ViewPort.Padding=} - The padding in pixels for each side of the map
    * @property fixedCenter {boolean=} - Indicates whether the center of the map should remain unchanged if the viewport's size or padding has been changed, default is true
    * @property noWrap {boolean=} - Indicates whether to wrap the world on longitude axes. When set to true, only one world will be rendered. Default is false, multiple worlds are rendered.
    */
  trait Options extends StObject {
    
    var autoColor: js.UndefOr[Boolean] = js.undefined
    
    var bounds: js.UndefOr[Rect] = js.undefined
    
    var center: js.UndefOr[IPoint] = js.undefined
    
    var engineType: js.UndefOr[EngineType] = js.undefined
    
    var fixedCenter: js.UndefOr[Boolean] = js.undefined
    
    var imprint: js.UndefOr[typings.heremaps.H.map.Imprint.Options] = js.undefined
    
    var layers: js.UndefOr[js.Array[Layer]] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var noWrap: js.UndefOr[Boolean] = js.undefined
    
    var padding: js.UndefOr[Padding] = js.undefined
    
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    var renderBaseBackground: js.UndefOr[BackgroundRange] = js.undefined
    
    var zoom: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoColor(value: Boolean): Self = StObject.set(x, "autoColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoColorUndefined: Self = StObject.set(x, "autoColor", js.undefined)
      
      @scala.inline
      def setBounds(value: Rect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setCenter(value: IPoint): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setEngineType(value: EngineType): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineTypeUndefined: Self = StObject.set(x, "engineType", js.undefined)
      
      @scala.inline
      def setFixedCenter(value: Boolean): Self = StObject.set(x, "fixedCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedCenterUndefined: Self = StObject.set(x, "fixedCenter", js.undefined)
      
      @scala.inline
      def setImprint(value: typings.heremaps.H.map.Imprint.Options): Self = StObject.set(x, "imprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImprintUndefined: Self = StObject.set(x, "imprint", js.undefined)
      
      @scala.inline
      def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setRenderBaseBackground(value: BackgroundRange): Self = StObject.set(x, "renderBaseBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderBaseBackgroundUndefined: Self = StObject.set(x, "renderBaseBackground", js.undefined)
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
