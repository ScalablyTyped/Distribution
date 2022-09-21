package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxGl.anon.Data
import typings.mapboxGl.anon.Diff
import typings.mapboxGl.anon.PixelRatio
import typings.mapboxGl.anon.layersArraystringundefine
import typings.mapboxGl.anon.sourceLayerstringundefine
import typings.mapboxGl.mapboxGlStrings.`bottom-left`
import typings.mapboxGl.mapboxGlStrings.`bottom-right`
import typings.mapboxGl.mapboxGlStrings.`top-left`
import typings.mapboxGl.mapboxGlStrings.`top-right`
import typings.mapboxGl.mapboxGlStrings.boxzoomcancel
import typings.mapboxGl.mapboxGlStrings.boxzoomend
import typings.mapboxGl.mapboxGlStrings.boxzoomstart
import typings.mapboxGl.mapboxGlStrings.click
import typings.mapboxGl.mapboxGlStrings.contextmenu
import typings.mapboxGl.mapboxGlStrings.data
import typings.mapboxGl.mapboxGlStrings.dataloading
import typings.mapboxGl.mapboxGlStrings.dblclick
import typings.mapboxGl.mapboxGlStrings.drag
import typings.mapboxGl.mapboxGlStrings.dragend
import typings.mapboxGl.mapboxGlStrings.dragstart
import typings.mapboxGl.mapboxGlStrings.error
import typings.mapboxGl.mapboxGlStrings.idle
import typings.mapboxGl.mapboxGlStrings.load
import typings.mapboxGl.mapboxGlStrings.mousedown
import typings.mapboxGl.mapboxGlStrings.mouseenter
import typings.mapboxGl.mapboxGlStrings.mouseleave
import typings.mapboxGl.mapboxGlStrings.mousemove
import typings.mapboxGl.mapboxGlStrings.mouseout
import typings.mapboxGl.mapboxGlStrings.mouseover
import typings.mapboxGl.mapboxGlStrings.mouseup
import typings.mapboxGl.mapboxGlStrings.move
import typings.mapboxGl.mapboxGlStrings.moveend
import typings.mapboxGl.mapboxGlStrings.movestart
import typings.mapboxGl.mapboxGlStrings.pitch
import typings.mapboxGl.mapboxGlStrings.pitchend
import typings.mapboxGl.mapboxGlStrings.pitchstart
import typings.mapboxGl.mapboxGlStrings.remove
import typings.mapboxGl.mapboxGlStrings.render
import typings.mapboxGl.mapboxGlStrings.resize
import typings.mapboxGl.mapboxGlStrings.rotate
import typings.mapboxGl.mapboxGlStrings.rotateend
import typings.mapboxGl.mapboxGlStrings.rotatestart
import typings.mapboxGl.mapboxGlStrings.sourcedata
import typings.mapboxGl.mapboxGlStrings.sourcedataloading
import typings.mapboxGl.mapboxGlStrings.styledata
import typings.mapboxGl.mapboxGlStrings.styledataloading
import typings.mapboxGl.mapboxGlStrings.tiledataloading
import typings.mapboxGl.mapboxGlStrings.touchcancel
import typings.mapboxGl.mapboxGlStrings.touchend
import typings.mapboxGl.mapboxGlStrings.touchmove
import typings.mapboxGl.mapboxGlStrings.touchstart
import typings.mapboxGl.mapboxGlStrings.webglcontextlost
import typings.mapboxGl.mapboxGlStrings.webglcontextrestored
import typings.mapboxGl.mapboxGlStrings.wheel
import typings.mapboxGl.mapboxGlStrings.zoom
import typings.mapboxGl.mapboxGlStrings.zoomend
import typings.mapboxGl.mapboxGlStrings.zoomstart
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "Map")
@js.native
open class Map () extends Evented {
  def this(options: MapboxOptions) = this()
  
  def addControl(control: Control): this.type = js.native
  def addControl(control: Control, position: `top-right` | `top-left` | `bottom-right` | `bottom-left`): this.type = js.native
  def addControl(control: IControl): this.type = js.native
  def addControl(control: IControl, position: `top-right` | `top-left` | `bottom-right` | `bottom-left`): this.type = js.native
  
  def addImage(name: String, image: js.typedarray.ArrayBufferView): Unit = js.native
  def addImage(name: String, image: js.typedarray.ArrayBufferView, options: PixelRatio): Unit = js.native
  def addImage(name: String, image: Data): Unit = js.native
  def addImage(name: String, image: Data, options: PixelRatio): Unit = js.native
  def addImage(name: String, image: HTMLImageElement): Unit = js.native
  def addImage(name: String, image: HTMLImageElement, options: PixelRatio): Unit = js.native
  def addImage(name: String, image: ImageBitmap): Unit = js.native
  def addImage(name: String, image: ImageBitmap, options: PixelRatio): Unit = js.native
  def addImage(name: String, image: ImageData): Unit = js.native
  def addImage(name: String, image: ImageData, options: PixelRatio): Unit = js.native
  
  def addLayer(layer: AnyLayer): this.type = js.native
  def addLayer(layer: AnyLayer, before: String): this.type = js.native
  
  def addSource(id: String, source: AnySourceData): this.type = js.native
  
  def areTilesLoaded(): Boolean = js.native
  
  var boxZoom: BoxZoomHandler = js.native
  
  def cameraForBounds(bounds: LngLatBoundsLike): js.UndefOr[CameraForBoundsResult] = js.native
  def cameraForBounds(bounds: LngLatBoundsLike, options: CameraForBoundsOptions): js.UndefOr[CameraForBoundsResult] = js.native
  
  var doubleClickZoom: DoubleClickZoomHandler = js.native
  
  var dragPan: DragPanHandler = js.native
  
  var dragRotate: DragRotateHandler = js.native
  
  def easeTo(options: EaseToOptions): this.type = js.native
  def easeTo(options: EaseToOptions, eventData: EventData): this.type = js.native
  
  def fitBounds(bounds: LngLatBoundsLike): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: Unit, eventData: EventData): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: FitBoundsOptions): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: FitBoundsOptions, eventData: EventData): this.type = js.native
  
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: Double): this.type = js.native
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: Double, options: AnimationOptions & CameraOptions): this.type = js.native
  def fitScreenCoordinates(
    p0: PointLike,
    p1: PointLike,
    bearing: Double,
    options: AnimationOptions & CameraOptions,
    eventData: EventData
  ): this.type = js.native
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: Double, options: Unit, eventData: EventData): this.type = js.native
  
  def flyTo(options: FlyToOptions): this.type = js.native
  def flyTo(options: FlyToOptions, eventData: EventData): this.type = js.native
  
  def getBearing(): Double = js.native
  
  def getBounds(): LngLatBounds = js.native
  
  def getCanvas(): HTMLCanvasElement = js.native
  
  def getCanvasContainer(): HTMLElement = js.native
  
  def getCenter(): LngLat = js.native
  
  def getContainer(): HTMLElement = js.native
  
  def getFeatureState(feature: FeatureIdentifier): StringDictionary[Any] = js.native
  def getFeatureState(feature: MapboxGeoJSONFeature): StringDictionary[Any] = js.native
  
  def getFilter(layer: String): js.Array[Any] = js.native
  
  def getFog(): Fog | Null = js.native
  
  /**
    * Returns position and orientation of the camera entity.
    *
    * @memberof Map#
    * @returns {FreeCameraOptions} The camera state
    */
  def getFreeCameraOptions(): FreeCameraOptions = js.native
  
  def getLayer(id: String): AnyLayer = js.native
  
  def getLayoutProperty(layer: String, name: String): Any = js.native
  
  def getLight(): Light = js.native
  
  def getMaxBounds(): LngLatBounds | Null = js.native
  
  def getMaxPitch(): Double = js.native
  
  def getMaxZoom(): Double = js.native
  
  def getMinPitch(): Double = js.native
  
  def getMinZoom(): Double = js.native
  
  /**
    * Returns the current padding applied around the map viewport.
    *
    * @memberof Map#
    * @returns The current padding around the map viewport.
    */
  def getPadding(): PaddingOptions = js.native
  
  def getPaintProperty(layer: String, name: String): Any = js.native
  
  def getPitch(): Double = js.native
  
  def getRenderWorldCopies(): Boolean = js.native
  
  def getSource(id: String): AnySourceImpl = js.native
  
  def getStyle(): Style = js.native
  
  def getTerrain(): TerrainSpecification | Null = js.native
  
  def getZoom(): Double = js.native
  
  /**
    * Checks if a control exists on the map.
    *
    * @param {IControl} control The {@link IControl} to check.
    * @returns {boolean} True if map contains control.
    * @example
    */
  def hasControl(control: IControl): Boolean = js.native
  
  def hasImage(name: String): Boolean = js.native
  
  def isEasing(): Boolean = js.native
  
  def isMoving(): Boolean = js.native
  
  def isRotating(): Boolean = js.native
  
  def isSourceLoaded(id: String): Boolean = js.native
  
  def isStyleLoaded(): Boolean = js.native
  
  def isZooming(): Boolean = js.native
  
  def jumpTo(options: CameraOptions): this.type = js.native
  def jumpTo(options: CameraOptions, eventData: EventData): this.type = js.native
  
  var keyboard: KeyboardHandler = js.native
  
  def listImages(): js.Array[String] = js.native
  
  def loadImage(
    url: String,
    callback: js.Function2[
      /* error */ js.UndefOr[js.Error], 
      /* result */ js.UndefOr[HTMLImageElement | ImageBitmap], 
      Unit
    ]
  ): Unit = js.native
  
  def loaded(): Boolean = js.native
  
  def moveLayer(id: String): this.type = js.native
  def moveLayer(id: String, beforeId: String): this.type = js.native
  
  @JSName("off")
  def off_boxzoomcancel(`type`: boxzoomcancel, listener: js.Function1[/* ev */ MapBoxZoomEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_boxzoomend(`type`: boxzoomend, listener: js.Function1[/* ev */ MapBoxZoomEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_boxzoomstart(`type`: boxzoomstart, listener: js.Function1[/* ev */ MapBoxZoomEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_click(
    `type`: click,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_click(
    `type`: click,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_click(`type`: click, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_contextmenu(
    `type`: contextmenu,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_contextmenu(
    `type`: contextmenu,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_data(`type`: data, listener: js.Function1[/* ev */ MapDataEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_dataloading(`type`: dataloading, listener: js.Function1[/* ev */ MapDataEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_dblclick(
    `type`: dblclick,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dblclick(
    `type`: dblclick,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_drag(
    `type`: drag,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dragend(
    `type`: dragend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dragstart(
    `type`: dragstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_idle(`type`: idle, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_load(`type`: load, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mousedown(
    `type`: mousedown,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousedown(
    `type`: mousedown,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mouseenter(
    `type`: mouseenter,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseenter(
    `type`: mouseenter,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseleave(
    `type`: mouseleave,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseleave(
    `type`: mouseleave,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousemove(
    `type`: mousemove,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousemove(
    `type`: mousemove,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mouseout(
    `type`: mouseout,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseout(
    `type`: mouseout,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mouseover(
    `type`: mouseover,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseover(
    `type`: mouseover,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mouseup(
    `type`: mouseup,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseup(
    `type`: mouseup,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_move(
    `type`: move,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_moveend(
    `type`: moveend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_movestart(
    `type`: movestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pitch(
    `type`: pitch,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_pitchend(
    `type`: pitchend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_pitchstart(
    `type`: pitchstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_remove(`type`: remove, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_render(`type`: render, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_rotate(
    `type`: rotate,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rotateend(
    `type`: rotateend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rotatestart(
    `type`: rotatestart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_sourcedata(`type`: sourcedata, listener: js.Function1[/* ev */ MapSourceDataEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_sourcedataloading(`type`: sourcedataloading, listener: js.Function1[/* ev */ MapSourceDataEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_styledata(`type`: styledata, listener: js.Function1[/* ev */ MapStyleDataEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_styledataloading(`type`: styledataloading, listener: js.Function1[/* ev */ MapStyleDataEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_tiledataloading(`type`: tiledataloading, listener: js.Function1[/* ev */ MapDataEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_touchcancel(
    `type`: touchcancel,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchcancel(
    `type`: touchcancel,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchcancel(`type`: touchcancel, listener: js.Function1[/* ev */ MapTouchEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_touchend(
    `type`: touchend,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchend(
    `type`: touchend,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchend(`type`: touchend, listener: js.Function1[/* ev */ MapTouchEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_touchmove(`type`: touchmove, listener: js.Function1[/* ev */ MapTouchEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_touchstart(
    `type`: touchstart,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchstart(
    `type`: touchstart,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchstart(`type`: touchstart, listener: js.Function1[/* ev */ MapTouchEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_webglcontextlost(`type`: webglcontextlost, listener: js.Function1[/* ev */ MapContextEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_webglcontextrestored(`type`: webglcontextrestored, listener: js.Function1[/* ev */ MapContextEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_wheel(`type`: wheel, listener: js.Function1[/* ev */ MapWheelEvent & EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_zoom(
    `type`: zoom,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_zoomend(
    `type`: zoomend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_zoomstart(
    `type`: zoomstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("on")
  def on_boxzoomcancel(`type`: boxzoomcancel, listener: js.Function1[/* ev */ MapBoxZoomEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_boxzoomend(`type`: boxzoomend, listener: js.Function1[/* ev */ MapBoxZoomEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_boxzoomstart(`type`: boxzoomstart, listener: js.Function1[/* ev */ MapBoxZoomEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_click(
    `type`: click,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_click(
    `type`: click,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_click(`type`: click, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_contextmenu(
    `type`: contextmenu,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_contextmenu(
    `type`: contextmenu,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_data(`type`: data, listener: js.Function1[/* ev */ MapDataEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_dataloading(`type`: dataloading, listener: js.Function1[/* ev */ MapDataEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_dblclick(
    `type`: dblclick,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dblclick(
    `type`: dblclick,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_drag(
    `type`: drag,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dragend(
    `type`: dragend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dragstart(
    `type`: dragstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_idle(`type`: idle, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_load(`type`: load, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mousedown(
    `type`: mousedown,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousedown(
    `type`: mousedown,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mouseenter(
    `type`: mouseenter,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseenter(
    `type`: mouseenter,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseleave(
    `type`: mouseleave,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseleave(
    `type`: mouseleave,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousemove(
    `type`: mousemove,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousemove(
    `type`: mousemove,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mouseout(
    `type`: mouseout,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseout(
    `type`: mouseout,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mouseover(
    `type`: mouseover,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseover(
    `type`: mouseover,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mouseup(
    `type`: mouseup,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseup(
    `type`: mouseup,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_move(
    `type`: move,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_moveend(
    `type`: moveend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_movestart(
    `type`: movestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pitch(
    `type`: pitch,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pitchend(
    `type`: pitchend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pitchstart(
    `type`: pitchstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_remove(`type`: remove, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_render(`type`: render, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_resize(`type`: resize, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_rotate(
    `type`: rotate,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rotateend(
    `type`: rotateend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rotatestart(
    `type`: rotatestart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_sourcedata(`type`: sourcedata, listener: js.Function1[/* ev */ MapSourceDataEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_sourcedataloading(`type`: sourcedataloading, listener: js.Function1[/* ev */ MapSourceDataEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_styledata(`type`: styledata, listener: js.Function1[/* ev */ MapStyleDataEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_styledataloading(`type`: styledataloading, listener: js.Function1[/* ev */ MapStyleDataEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_tiledataloading(`type`: tiledataloading, listener: js.Function1[/* ev */ MapDataEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_touchcancel(
    `type`: touchcancel,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchcancel(
    `type`: touchcancel,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchcancel(`type`: touchcancel, listener: js.Function1[/* ev */ MapTouchEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_touchend(
    `type`: touchend,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchend(
    `type`: touchend,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchend(`type`: touchend, listener: js.Function1[/* ev */ MapTouchEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_touchmove(`type`: touchmove, listener: js.Function1[/* ev */ MapTouchEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_touchstart(
    `type`: touchstart,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchstart(
    `type`: touchstart,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchstart(`type`: touchstart, listener: js.Function1[/* ev */ MapTouchEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_webglcontextlost(`type`: webglcontextlost, listener: js.Function1[/* ev */ MapContextEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_webglcontextrestored(`type`: webglcontextrestored, listener: js.Function1[/* ev */ MapContextEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_wheel(`type`: wheel, listener: js.Function1[/* ev */ MapWheelEvent & EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_zoom(
    `type`: zoom,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_zoomend(
    `type`: zoomend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_zoomstart(
    `type`: zoomstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("once")
  def once_boxzoomcancel(`type`: boxzoomcancel): js.Promise[MapBoxZoomEvent] = js.native
  @JSName("once")
  def once_boxzoomcancel(`type`: boxzoomcancel, listener: js.Function1[/* ev */ MapBoxZoomEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_boxzoomend(`type`: boxzoomend): js.Promise[MapBoxZoomEvent] = js.native
  @JSName("once")
  def once_boxzoomend(`type`: boxzoomend, listener: js.Function1[/* ev */ MapBoxZoomEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_boxzoomstart(`type`: boxzoomstart): js.Promise[MapBoxZoomEvent] = js.native
  @JSName("once")
  def once_boxzoomstart(`type`: boxzoomstart, listener: js.Function1[/* ev */ MapBoxZoomEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_click(`type`: click): js.Promise[MapMouseEvent] = js.native
  @JSName("once")
  def once_click(
    `type`: click,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_click(
    `type`: click,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_click(`type`: click, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_contextmenu(`type`: contextmenu): js.Promise[MapMouseEvent] = js.native
  @JSName("once")
  def once_contextmenu(
    `type`: contextmenu,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_contextmenu(
    `type`: contextmenu,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_data(`type`: data): js.Promise[MapDataEvent] = js.native
  @JSName("once")
  def once_data(`type`: data, listener: js.Function1[/* ev */ MapDataEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_dataloading(`type`: dataloading): js.Promise[MapDataEvent] = js.native
  @JSName("once")
  def once_dataloading(`type`: dataloading, listener: js.Function1[/* ev */ MapDataEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_dblclick(`type`: dblclick): js.Promise[MapMouseEvent] = js.native
  @JSName("once")
  def once_dblclick(
    `type`: dblclick,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dblclick(
    `type`: dblclick,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_drag(`type`: drag): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]] = js.native
  @JSName("once")
  def once_drag(
    `type`: drag,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dragend(`type`: dragend): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]] = js.native
  @JSName("once")
  def once_dragend(
    `type`: dragend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dragstart(`type`: dragstart): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]] = js.native
  @JSName("once")
  def once_dragstart(
    `type`: dragstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(`type`: error): js.Promise[ErrorEvent] = js.native
  @JSName("once")
  def once_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_idle(`type`: idle): js.Promise[MapboxEvent[Unit]] = js.native
  @JSName("once")
  def once_idle(`type`: idle, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_load(`type`: load): js.Promise[MapboxEvent[Unit]] = js.native
  @JSName("once")
  def once_load(`type`: load, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mousedown(`type`: mousedown): js.Promise[MapMouseEvent] = js.native
  @JSName("once")
  def once_mousedown(
    `type`: mousedown,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousedown(
    `type`: mousedown,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseenter(
    `type`: mouseenter,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseenter(
    `type`: mouseenter,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseleave(
    `type`: mouseleave,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseleave(
    `type`: mouseleave,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousemove(`type`: mousemove): js.Promise[MapMouseEvent] = js.native
  @JSName("once")
  def once_mousemove(
    `type`: mousemove,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousemove(
    `type`: mousemove,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseout(`type`: mouseout): js.Promise[MapMouseEvent] = js.native
  @JSName("once")
  def once_mouseout(
    `type`: mouseout,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseout(
    `type`: mouseout,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseover(`type`: mouseover): js.Promise[MapMouseEvent] = js.native
  @JSName("once")
  def once_mouseover(
    `type`: mouseover,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseover(
    `type`: mouseover,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseup(`type`: mouseup): js.Promise[MapMouseEvent] = js.native
  @JSName("once")
  def once_mouseup(
    `type`: mouseup,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseup(
    `type`: mouseup,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerMouseEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MapMouseEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_move(`type`: move): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]] = js.native
  @JSName("once")
  def once_move(
    `type`: move,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_moveend(`type`: moveend): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]] = js.native
  @JSName("once")
  def once_moveend(
    `type`: moveend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_movestart(`type`: movestart): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]] = js.native
  @JSName("once")
  def once_movestart(
    `type`: movestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pitch(`type`: pitch): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]] = js.native
  @JSName("once")
  def once_pitch(
    `type`: pitch,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pitchend(`type`: pitchend): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]] = js.native
  @JSName("once")
  def once_pitchend(
    `type`: pitchend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pitchstart(`type`: pitchstart): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]] = js.native
  @JSName("once")
  def once_pitchstart(
    `type`: pitchstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_remove(`type`: remove): js.Promise[MapboxEvent[Unit]] = js.native
  @JSName("once")
  def once_remove(`type`: remove, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_render(`type`: render): js.Promise[MapboxEvent[Unit]] = js.native
  @JSName("once")
  def once_render(`type`: render, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_resize(`type`: resize): js.Promise[MapboxEvent[Unit]] = js.native
  @JSName("once")
  def once_resize(`type`: resize, listener: js.Function1[/* ev */ MapboxEvent[Unit] & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_rotate(`type`: rotate): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]] = js.native
  @JSName("once")
  def once_rotate(
    `type`: rotate,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rotateend(`type`: rotateend): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]] = js.native
  @JSName("once")
  def once_rotateend(
    `type`: rotateend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rotatestart(`type`: rotatestart): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]] = js.native
  @JSName("once")
  def once_rotatestart(
    `type`: rotatestart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_sourcedata(`type`: sourcedata): js.Promise[MapSourceDataEvent] = js.native
  @JSName("once")
  def once_sourcedata(`type`: sourcedata, listener: js.Function1[/* ev */ MapSourceDataEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_sourcedataloading(`type`: sourcedataloading): js.Promise[MapSourceDataEvent] = js.native
  @JSName("once")
  def once_sourcedataloading(`type`: sourcedataloading, listener: js.Function1[/* ev */ MapSourceDataEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_styledata(`type`: styledata): js.Promise[MapStyleDataEvent] = js.native
  @JSName("once")
  def once_styledata(`type`: styledata, listener: js.Function1[/* ev */ MapStyleDataEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_styledataloading(`type`: styledataloading): js.Promise[MapStyleDataEvent] = js.native
  @JSName("once")
  def once_styledataloading(`type`: styledataloading, listener: js.Function1[/* ev */ MapStyleDataEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_tiledataloading(`type`: tiledataloading): js.Promise[MapDataEvent] = js.native
  @JSName("once")
  def once_tiledataloading(`type`: tiledataloading, listener: js.Function1[/* ev */ MapDataEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_touchcancel(`type`: touchcancel): js.Promise[MapTouchEvent] = js.native
  @JSName("once")
  def once_touchcancel(
    `type`: touchcancel,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchcancel(
    `type`: touchcancel,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchcancel(`type`: touchcancel, listener: js.Function1[/* ev */ MapTouchEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_touchend(`type`: touchend): js.Promise[MapTouchEvent] = js.native
  @JSName("once")
  def once_touchend(
    `type`: touchend,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchend(
    `type`: touchend,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchend(`type`: touchend, listener: js.Function1[/* ev */ MapTouchEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_touchmove(`type`: touchmove): js.Promise[MapTouchEvent] = js.native
  @JSName("once")
  def once_touchmove(`type`: touchmove, listener: js.Function1[/* ev */ MapTouchEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_touchstart(`type`: touchstart): js.Promise[MapTouchEvent] = js.native
  @JSName("once")
  def once_touchstart(
    `type`: touchstart,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchstart(
    `type`: touchstart,
    layer: js.Array[String],
    listener: js.Function1[/* ev */ MapLayerTouchEvent & EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchstart(`type`: touchstart, listener: js.Function1[/* ev */ MapTouchEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_webglcontextlost(`type`: webglcontextlost): js.Promise[MapContextEvent] = js.native
  @JSName("once")
  def once_webglcontextlost(`type`: webglcontextlost, listener: js.Function1[/* ev */ MapContextEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_webglcontextrestored(`type`: webglcontextrestored): js.Promise[MapContextEvent] = js.native
  @JSName("once")
  def once_webglcontextrestored(`type`: webglcontextrestored, listener: js.Function1[/* ev */ MapContextEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_wheel(`type`: wheel): js.Promise[MapWheelEvent] = js.native
  @JSName("once")
  def once_wheel(`type`: wheel, listener: js.Function1[/* ev */ MapWheelEvent & EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_zoom(`type`: zoom): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]] = js.native
  @JSName("once")
  def once_zoom(
    `type`: zoom,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_zoomend(`type`: zoomend): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]] = js.native
  @JSName("once")
  def once_zoomend(
    `type`: zoomend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_zoomstart(`type`: zoomstart): js.Promise[MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]] = js.native
  @JSName("once")
  def once_zoomstart(
    `type`: zoomstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & EventData, 
      Unit
    ]
  ): this.type = js.native
  
  def panBy(offset: PointLike): this.type = js.native
  def panBy(offset: PointLike, options: Unit, eventData: EventData): this.type = js.native
  def panBy(offset: PointLike, options: AnimationOptions): this.type = js.native
  def panBy(offset: PointLike, options: AnimationOptions, eventData: EventData): this.type = js.native
  
  def panTo(lnglat: LngLatLike): this.type = js.native
  def panTo(lnglat: LngLatLike, options: Unit, eventdata: EventData): this.type = js.native
  def panTo(lnglat: LngLatLike, options: AnimationOptions): this.type = js.native
  def panTo(lnglat: LngLatLike, options: AnimationOptions, eventdata: EventData): this.type = js.native
  
  def project(lnglat: LngLatLike): Point = js.native
  
  /**
    * Returns an array of GeoJSON Feature objects representing visible features that satisfy the query parameters.
    *
    * The properties value of each returned feature object contains the properties of its source feature. For GeoJSON sources, only string and numeric property values are supported (i.e. null, Array, and Object values are not supported).
    *
    * Each feature includes top-level layer, source, and sourceLayer properties. The layer property is an object representing the style layer to which the feature belongs. Layout and paint properties in this object contain values which are fully evaluated for the given zoom level and feature.
    *
    * Only features that are currently rendered are included. Some features will not be included, like:
    *
    * - Features from layers whose visibility property is "none".
    * - Features from layers whose zoom range excludes the current zoom level.
    * - Symbol features that have been hidden due to text or icon collision.
    *
    * Features from all other layers are included, including features that may have no visible contribution to the rendered result; for example, because the layer's opacity or color alpha component is set to 0.
    *
    * The topmost rendered feature appears first in the returned array, and subsequent features are sorted by descending z-order. Features that are rendered multiple times (due to wrapping across the antimeridian at low zoom levels) are returned only once (though subject to the following caveat).
    *
    * Because features come from tiled vector data or GeoJSON data that is converted to tiles internally, feature geometries may be split or duplicated across tile boundaries and, as a result, features may appear multiple times in query results. For example, suppose there is a highway running through the bounding rectangle of a query. The results of the query will be those parts of the highway that lie within the map tiles covering the bounding rectangle, even if the highway extends into other tiles, and the portion of the highway within each map tile will be returned as a separate feature. Similarly, a point feature near a tile boundary may appear in multiple tiles due to tile buffering.
    *
    * @param pointOrBox The geometry of the query region: either a single point or southwest and northeast points describing a bounding box. Omitting this parameter (i.e. calling Map#queryRenderedFeatures with zero arguments, or with only a  options argument) is equivalent to passing a bounding box encompassing the entire map viewport.
    * @param options
    */
  def queryRenderedFeatures(): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: js.Tuple2[PointLike, PointLike]): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: js.Tuple2[PointLike, PointLike], options: layersArraystringundefine): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: Unit, options: layersArraystringundefine): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: PointLike): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: PointLike, options: layersArraystringundefine): js.Array[MapboxGeoJSONFeature] = js.native
  
  /**
    * Returns an array of GeoJSON Feature objects representing features within the specified vector tile or GeoJSON source that satisfy the query parameters.
    *
    * In contrast to Map#queryRenderedFeatures, this function returns all features matching the query parameters, whether or not they are rendered by the current style (i.e. visible). The domain of the query includes all currently-loaded vector tiles and GeoJSON source tiles: this function does not check tiles outside the currently visible viewport.
    *
    * Because features come from tiled vector data or GeoJSON data that is converted to tiles internally, feature geometries may be split or duplicated across tile boundaries and, as a result, features may appear multiple times in query results. For example, suppose there is a highway running through the bounding rectangle of a query. The results of the query will be those parts of the highway that lie within the map tiles covering the bounding rectangle, even if the highway extends into other tiles, and the portion of the highway within each map tile will be returned as a separate feature. Similarly, a point feature near a tile boundary may appear in multiple tiles due to tile buffering.
    *
    * @param sourceID The ID of the vector tile or GeoJSON source to query.
    * @param parameters
    */
  def querySourceFeatures(sourceID: String): js.Array[MapboxGeoJSONFeature] = js.native
  def querySourceFeatures(sourceID: String, parameters: sourceLayerstringundefine): js.Array[MapboxGeoJSONFeature] = js.native
  
  /**
    *
    * @param lngLat The coordinate to query
    * @param options Optional {ElevationQueryOptions}
    * @returns The elevation in meters at mean sea level or null
    */
  def queryTerrainElevation(lngLat: LngLatLike): Double | Null = js.native
  def queryTerrainElevation(lngLat: LngLatLike, options: ElevationQueryOptions): Double | Null = js.native
  
  def remove(): Unit = js.native
  
  def removeControl(control: Control): this.type = js.native
  def removeControl(control: IControl): this.type = js.native
  
  def removeFeatureState(target: FeatureIdentifier): Unit = js.native
  def removeFeatureState(target: FeatureIdentifier, key: String): Unit = js.native
  def removeFeatureState(target: MapboxGeoJSONFeature): Unit = js.native
  def removeFeatureState(target: MapboxGeoJSONFeature, key: String): Unit = js.native
  
  def removeImage(name: String): Unit = js.native
  
  def removeLayer(id: String): this.type = js.native
  
  def removeSource(id: String): this.type = js.native
  
  var repaint: Boolean = js.native
  
  def resetNorth(): this.type = js.native
  def resetNorth(options: Unit, eventData: EventData): this.type = js.native
  def resetNorth(options: AnimationOptions): this.type = js.native
  def resetNorth(options: AnimationOptions, eventData: EventData): this.type = js.native
  
  def resetNorthPitch(): this.type = js.native
  def resetNorthPitch(options: Null, eventData: EventData): this.type = js.native
  def resetNorthPitch(options: Unit, eventData: EventData): this.type = js.native
  def resetNorthPitch(options: AnimationOptions): this.type = js.native
  def resetNorthPitch(options: AnimationOptions, eventData: EventData): this.type = js.native
  
  def resize(): this.type = js.native
  def resize(eventData: EventData): this.type = js.native
  
  def rotateTo(bearing: Double): this.type = js.native
  def rotateTo(bearing: Double, options: Unit, eventData: EventData): this.type = js.native
  def rotateTo(bearing: Double, options: AnimationOptions): this.type = js.native
  def rotateTo(bearing: Double, options: AnimationOptions, eventData: EventData): this.type = js.native
  
  var scrollZoom: ScrollZoomHandler = js.native
  
  def setBearing(bearing: Double): this.type = js.native
  def setBearing(bearing: Double, eventData: EventData): this.type = js.native
  
  def setCenter(center: LngLatLike): this.type = js.native
  def setCenter(center: LngLatLike, eventData: EventData): this.type = js.native
  
  def setFeatureState(feature: FeatureIdentifier, state: StringDictionary[Any]): Unit = js.native
  def setFeatureState(feature: MapboxGeoJSONFeature, state: StringDictionary[Any]): Unit = js.native
  
  def setFilter(layer: String): this.type = js.native
  def setFilter(layer: String, filter: js.Array[Any]): this.type = js.native
  def setFilter(layer: String, filter: js.Array[Any], options: FilterOptions): this.type = js.native
  def setFilter(layer: String, filter: Boolean): this.type = js.native
  def setFilter(layer: String, filter: Boolean, options: FilterOptions): this.type = js.native
  def setFilter(layer: String, filter: Null, options: FilterOptions): this.type = js.native
  def setFilter(layer: String, filter: Unit, options: FilterOptions): this.type = js.native
  
  def setFog(fog: Fog): this.type = js.native
  
  /**
    * FreeCameraOptions provides more direct access to the underlying camera entity.
    * For backwards compatibility the state set using this API must be representable with
    * `CameraOptions` as well. Parameters are clamped into a valid range or discarded as invalid
    * if the conversion to the pitch and bearing presentation is ambiguous. For example orientation
    * can be invalid if it leads to the camera being upside down, the quaternion has zero length,
    * or the pitch is over the maximum pitch limit.
    *
    * @memberof Map#
    * @param {FreeCameraOptions} options FreeCameraOptions object
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
    */
  def setFreeCameraOptions(options: FreeCameraOptions): this.type = js.native
  def setFreeCameraOptions(options: FreeCameraOptions, eventData: js.Object): this.type = js.native
  
  def setLayerZoomRange(layerId: String, minzoom: Double, maxzoom: Double): this.type = js.native
  
  def setLayoutProperty(layer: String, name: String, value: Any): this.type = js.native
  def setLayoutProperty(layer: String, name: String, value: Any, options: FilterOptions): this.type = js.native
  
  def setLight(light: Light): this.type = js.native
  def setLight(light: Light, options: FilterOptions): this.type = js.native
  
  def setMaxBounds(): this.type = js.native
  def setMaxBounds(lnglatbounds: LngLatBoundsLike): this.type = js.native
  
  def setMaxPitch(): this.type = js.native
  def setMaxPitch(maxPitch: Double): this.type = js.native
  
  def setMaxZoom(): this.type = js.native
  def setMaxZoom(maxZoom: Double): this.type = js.native
  
  def setMinPitch(): this.type = js.native
  def setMinPitch(minPitch: Double): this.type = js.native
  
  def setMinZoom(): this.type = js.native
  def setMinZoom(minZoom: Double): this.type = js.native
  
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
  def setPadding(padding: PaddingOptions, eventData: EventData): this.type = js.native
  
  def setPaintProperty(layer: String, name: String, value: Any): this.type = js.native
  def setPaintProperty(layer: String, name: String, value: Any, options: FilterOptions): this.type = js.native
  
  def setPitch(pitch: Double): this.type = js.native
  def setPitch(pitch: Double, eventData: EventData): this.type = js.native
  
  def setRenderWorldCopies(): this.type = js.native
  def setRenderWorldCopies(renderWorldCopies: Boolean): this.type = js.native
  
  def setStyle(style: String): this.type = js.native
  def setStyle(style: String, options: Diff): this.type = js.native
  def setStyle(style: Style): this.type = js.native
  def setStyle(style: Style, options: Diff): this.type = js.native
  
  /**
    * Sets the terrain property of the style.
    *
    * @param terrain Terrain properties to set. Must conform to the [Mapbox Style Specification](https://www.mapbox.com/mapbox-gl-style-spec/#terrain).
    * If `null` or `undefined` is provided, function removes terrain.
    * @returns {Map} `this`
    * @example
    * map.addSource('mapbox-dem', {
    *     'type': 'raster-dem',
    *     'url': 'mapbox://mapbox.mapbox-terrain-dem-v1',
    *     'tileSize': 512,
    *     'maxzoom': 14
    * });
    * // add the DEM source as a terrain layer with exaggerated height
    * map.setTerrain({ 'source': 'mapbox-dem', 'exaggeration': 1.5 });
    */
  def setTerrain(): this.type = js.native
  def setTerrain(terrain: TerrainSpecification): this.type = js.native
  
  def setZoom(zoom: Double): this.type = js.native
  def setZoom(zoom: Double, eventData: EventData): this.type = js.native
  
  var showCollisionBoxes: Boolean = js.native
  
  /**
    * Gets and sets a Boolean indicating whether the map will visualize
    * the padding offsets.
    *
    * @name showPadding
    * @type {boolean}
    * @instance
    * @memberof Map
    */
  var showPadding: Boolean = js.native
  
  var showTerrainWireframe: Boolean = js.native
  
  var showTileBoundaries: Boolean = js.native
  
  def snapToNorth(): this.type = js.native
  def snapToNorth(options: Unit, eventData: EventData): this.type = js.native
  def snapToNorth(options: AnimationOptions): this.type = js.native
  def snapToNorth(options: AnimationOptions, eventData: EventData): this.type = js.native
  
  def stop(): this.type = js.native
  
  var touchPitch: TouchPitchHandler = js.native
  
  var touchZoomRotate: TouchZoomRotateHandler = js.native
  
  def triggerRepaint(): Unit = js.native
  
  def unproject(point: PointLike): LngLat = js.native
  
  def updateImage(name: String, image: js.typedarray.ArrayBufferView): Unit = js.native
  def updateImage(name: String, image: Data): Unit = js.native
  def updateImage(name: String, image: HTMLImageElement): Unit = js.native
  def updateImage(name: String, image: ImageBitmap): Unit = js.native
  def updateImage(name: String, image: ImageData): Unit = js.native
  
  def zoomIn(): this.type = js.native
  def zoomIn(options: Unit, eventData: EventData): this.type = js.native
  def zoomIn(options: AnimationOptions): this.type = js.native
  def zoomIn(options: AnimationOptions, eventData: EventData): this.type = js.native
  
  def zoomOut(): this.type = js.native
  def zoomOut(options: Unit, eventData: EventData): this.type = js.native
  def zoomOut(options: AnimationOptions): this.type = js.native
  def zoomOut(options: AnimationOptions, eventData: EventData): this.type = js.native
  
  def zoomTo(zoom: Double): this.type = js.native
  def zoomTo(zoom: Double, options: Unit, eventData: EventData): this.type = js.native
  def zoomTo(zoom: Double, options: AnimationOptions): this.type = js.native
  def zoomTo(zoom: Double, options: AnimationOptions, eventData: EventData): this.type = js.native
}
