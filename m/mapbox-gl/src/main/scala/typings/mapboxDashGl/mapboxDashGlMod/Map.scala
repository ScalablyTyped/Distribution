package typings.mapboxDashGl.mapboxDashGlMod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxDashGl.Anon_Data
import typings.mapboxDashGl.Anon_Diff
import typings.mapboxDashGl.Anon_Filter
import typings.mapboxDashGl.Anon_FilterSourceLayer
import typings.mapboxDashGl.Anon_Id
import typings.mapboxDashGl.Anon_PixelRatio
import typings.mapboxDashGl.mapboxDashGlStrings.`bottom-left`
import typings.mapboxDashGl.mapboxDashGlStrings.`bottom-right`
import typings.mapboxDashGl.mapboxDashGlStrings.`top-left`
import typings.mapboxDashGl.mapboxDashGlStrings.`top-right`
import typings.mapboxDashGl.mapboxDashGlStrings.boxzoomcancel
import typings.mapboxDashGl.mapboxDashGlStrings.boxzoomend
import typings.mapboxDashGl.mapboxDashGlStrings.boxzoomstart
import typings.mapboxDashGl.mapboxDashGlStrings.click
import typings.mapboxDashGl.mapboxDashGlStrings.contextmenu
import typings.mapboxDashGl.mapboxDashGlStrings.data
import typings.mapboxDashGl.mapboxDashGlStrings.dataloading
import typings.mapboxDashGl.mapboxDashGlStrings.dblclick
import typings.mapboxDashGl.mapboxDashGlStrings.drag
import typings.mapboxDashGl.mapboxDashGlStrings.dragend
import typings.mapboxDashGl.mapboxDashGlStrings.dragstart
import typings.mapboxDashGl.mapboxDashGlStrings.error
import typings.mapboxDashGl.mapboxDashGlStrings.load
import typings.mapboxDashGl.mapboxDashGlStrings.mousedown
import typings.mapboxDashGl.mapboxDashGlStrings.mouseenter
import typings.mapboxDashGl.mapboxDashGlStrings.mouseleave
import typings.mapboxDashGl.mapboxDashGlStrings.mousemove
import typings.mapboxDashGl.mapboxDashGlStrings.mouseout
import typings.mapboxDashGl.mapboxDashGlStrings.mouseover
import typings.mapboxDashGl.mapboxDashGlStrings.mouseup
import typings.mapboxDashGl.mapboxDashGlStrings.move
import typings.mapboxDashGl.mapboxDashGlStrings.moveend
import typings.mapboxDashGl.mapboxDashGlStrings.movestart
import typings.mapboxDashGl.mapboxDashGlStrings.pitch
import typings.mapboxDashGl.mapboxDashGlStrings.pitchend
import typings.mapboxDashGl.mapboxDashGlStrings.pitchstart
import typings.mapboxDashGl.mapboxDashGlStrings.remove
import typings.mapboxDashGl.mapboxDashGlStrings.render
import typings.mapboxDashGl.mapboxDashGlStrings.resize
import typings.mapboxDashGl.mapboxDashGlStrings.rotate
import typings.mapboxDashGl.mapboxDashGlStrings.rotateend
import typings.mapboxDashGl.mapboxDashGlStrings.rotatestart
import typings.mapboxDashGl.mapboxDashGlStrings.sourcedata
import typings.mapboxDashGl.mapboxDashGlStrings.sourcedataloading
import typings.mapboxDashGl.mapboxDashGlStrings.styledata
import typings.mapboxDashGl.mapboxDashGlStrings.styledataloading
import typings.mapboxDashGl.mapboxDashGlStrings.tiledataloading
import typings.mapboxDashGl.mapboxDashGlStrings.touchcancel
import typings.mapboxDashGl.mapboxDashGlStrings.touchend
import typings.mapboxDashGl.mapboxDashGlStrings.touchmove
import typings.mapboxDashGl.mapboxDashGlStrings.touchstart
import typings.mapboxDashGl.mapboxDashGlStrings.webglcontextlost
import typings.mapboxDashGl.mapboxDashGlStrings.webglcontextrestored
import typings.mapboxDashGl.mapboxDashGlStrings.wheel
import typings.mapboxDashGl.mapboxDashGlStrings.zoom
import typings.mapboxDashGl.mapboxDashGlStrings.zoomend
import typings.mapboxDashGl.mapboxDashGlStrings.zoomstart
import typings.std.ArrayBufferView
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "Map")
@js.native
class Map () extends Evented {
  def this(options: MapboxOptions) = this()
  var boxZoom: BoxZoomHandler = js.native
  var doubleClickZoom: DoubleClickZoomHandler = js.native
  var dragPan: DragPanHandler = js.native
  var dragRotate: DragRotateHandler = js.native
  var keyboard: KeyboardHandler = js.native
  var repaint: Boolean = js.native
  var scrollZoom: ScrollZoomHandler = js.native
  var showCollisionBoxes: Boolean = js.native
  var showTileBoundaries: Boolean = js.native
  var touchZoomRotate: TouchZoomRotateHandler = js.native
  def addControl(control: Control): this.type = js.native
  def addControl(control: IControl): this.type = js.native
  @JSName("addControl")
  def addControl_bottomleft(control: Control, position: `bottom-left`): this.type = js.native
  @JSName("addControl")
  def addControl_bottomleft(control: IControl, position: `bottom-left`): this.type = js.native
  @JSName("addControl")
  def addControl_bottomright(control: Control, position: `bottom-right`): this.type = js.native
  @JSName("addControl")
  def addControl_bottomright(control: IControl, position: `bottom-right`): this.type = js.native
  @JSName("addControl")
  def addControl_topleft(control: Control, position: `top-left`): this.type = js.native
  @JSName("addControl")
  def addControl_topleft(control: IControl, position: `top-left`): this.type = js.native
  @JSName("addControl")
  def addControl_topright(control: Control, position: `top-right`): this.type = js.native
  @JSName("addControl")
  def addControl_topright(control: IControl, position: `top-right`): this.type = js.native
  def addImage(name: String, image: Anon_Data): this.type = js.native
  def addImage(name: String, image: Anon_Data, options: Anon_PixelRatio): this.type = js.native
  def addImage(name: String, image: ArrayBufferView): this.type = js.native
  def addImage(name: String, image: ArrayBufferView, options: Anon_PixelRatio): this.type = js.native
  def addImage(name: String, image: HTMLImageElement): this.type = js.native
  def addImage(name: String, image: HTMLImageElement, options: Anon_PixelRatio): this.type = js.native
  def addImage(name: String, image: ImageData): this.type = js.native
  def addImage(name: String, image: ImageData, options: Anon_PixelRatio): this.type = js.native
  def addLayer(layer: Layer): this.type = js.native
  def addLayer(layer: Layer, before: String): this.type = js.native
  def addSource(id: String, source: AnySourceData): this.type = js.native
  def areTilesLoaded(): Boolean = js.native
  def cameraForBounds(bounds: LngLatBoundsLike): js.UndefOr[CameraForBoundsResult] = js.native
  def cameraForBounds(bounds: LngLatBoundsLike, options: CameraForBoundsOptions): js.UndefOr[CameraForBoundsResult] = js.native
  def easeTo(options: EaseToOptions): this.type = js.native
  def easeTo(options: EaseToOptions, eventData: EventData): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: FitBoundsOptions): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: FitBoundsOptions, eventData: EventData): this.type = js.native
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: Double): this.type = js.native
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: Double, options: AnimationOptions with CameraOptions): this.type = js.native
  def fitScreenCoordinates(
    p0: PointLike,
    p1: PointLike,
    bearing: Double,
    options: AnimationOptions with CameraOptions,
    eventData: EventData
  ): this.type = js.native
  def flyTo(options: FlyToOptions): this.type = js.native
  def flyTo(options: FlyToOptions, eventData: EventData): this.type = js.native
  def getBearing(): Double = js.native
  def getBounds(): LngLatBounds = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def getCanvasContainer(): HTMLElement = js.native
  def getCenter(): LngLat = js.native
  def getContainer(): HTMLElement = js.native
  def getFeatureState(feature: Anon_Id): StringDictionary[js.Any] = js.native
  def getFeatureState(feature: MapboxGeoJSONFeature): StringDictionary[js.Any] = js.native
  def getFilter(layer: String): js.Array[_] = js.native
  def getLayer(id: String): Layer = js.native
  def getLayoutProperty(layer: String, name: String): js.Any = js.native
  def getLight(): Light = js.native
  def getMaxBounds(): LngLatBounds | Null = js.native
  def getMaxZoom(): Double = js.native
  def getMinZoom(): Double = js.native
  def getPaintProperty(layer: String, name: String): js.Any = js.native
  def getPitch(): Double = js.native
  def getRenderWorldCopies(): Boolean = js.native
  def getSource(id: String): AnySourceImpl = js.native
  def getStyle(): Style = js.native
  def getZoom(): Double = js.native
  def hasImage(name: String): Boolean = js.native
  def isEasing(): Boolean = js.native
  def isMoving(): Boolean = js.native
  def isRotating(): Boolean = js.native
  def isSourceLoaded(id: String): Boolean = js.native
  def isStyleLoaded(): Boolean = js.native
  def isZooming(): Boolean = js.native
  def jumpTo(options: CameraOptions): this.type = js.native
  def jumpTo(options: CameraOptions, eventData: EventData): this.type = js.native
  def listImages(): js.Array[String] = js.native
  def loadImage(url: String, callback: js.Function): this.type = js.native
  def loaded(): Boolean = js.native
  def moveLayer(id: String): this.type = js.native
  def moveLayer(id: String, beforeId: String): this.type = js.native
  def off(`type`: String, listener: js.Function1[/* ev */ js.Any, Unit]): this.type = js.native
  @JSName("off")
  def off_boxzoomcancel(`type`: boxzoomcancel, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_boxzoomend(`type`: boxzoomend, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_boxzoomstart(`type`: boxzoomstart, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_click(
    `type`: click,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_click(`type`: click, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_contextmenu(
    `type`: contextmenu,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_data(`type`: data, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_dataloading(`type`: dataloading, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_dblclick(
    `type`: dblclick,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_drag(
    `type`: drag,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dragend(
    `type`: dragend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dragstart(
    `type`: dragstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_load(
    `type`: load,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousedown(
    `type`: mousedown,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mouseenter(
    `type`: mouseenter,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseleave(
    `type`: mouseleave,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousemove(
    `type`: mousemove,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mouseout(
    `type`: mouseout,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mouseover(
    `type`: mouseover,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_mouseup(
    `type`: mouseup,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_move(
    `type`: move,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_moveend(
    `type`: moveend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_movestart(
    `type`: movestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pitch(
    `type`: pitch,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_pitchend(
    `type`: pitchend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_pitchstart(
    `type`: pitchstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_remove(
    `type`: remove,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_render(
    `type`: render,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_resize(
    `type`: resize,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rotate(
    `type`: rotate,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rotateend(
    `type`: rotateend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rotatestart(
    `type`: rotatestart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_sourcedata(`type`: sourcedata, listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_sourcedataloading(
    `type`: sourcedataloading,
    listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_styledata(`type`: styledata, listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_styledataloading(`type`: styledataloading, listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_tiledataloading(`type`: tiledataloading, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_touchcancel(
    `type`: touchcancel,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchcancel(`type`: touchcancel, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_touchend(
    `type`: touchend,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchend(`type`: touchend, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_touchmove(`type`: touchmove, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_touchstart(
    `type`: touchstart,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchstart(`type`: touchstart, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_webglcontextlost(`type`: webglcontextlost, listener: js.Function1[/* ev */ MapContextEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_webglcontextrestored(
    `type`: webglcontextrestored,
    listener: js.Function1[/* ev */ MapContextEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_wheel(`type`: wheel, listener: js.Function1[/* ev */ MapWheelEvent with EventData, Unit]): this.type = js.native
  @JSName("off")
  def off_zoom(
    `type`: zoom,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_zoomend(
    `type`: zoomend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_zoomstart(
    `type`: zoomstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  def on(`type`: String, listener: js.Function1[/* ev */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_boxzoomcancel(`type`: boxzoomcancel, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_boxzoomend(`type`: boxzoomend, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_boxzoomstart(`type`: boxzoomstart, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_click(
    `type`: click,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_click(`type`: click, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_contextmenu(
    `type`: contextmenu,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_data(`type`: data, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_dataloading(`type`: dataloading, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_dblclick(
    `type`: dblclick,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_drag(
    `type`: drag,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dragend(
    `type`: dragend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dragstart(
    `type`: dragstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_load(
    `type`: load,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousedown(
    `type`: mousedown,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mouseenter(
    `type`: mouseenter,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseleave(
    `type`: mouseleave,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousemove(
    `type`: mousemove,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mouseout(
    `type`: mouseout,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mouseover(
    `type`: mouseover,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_mouseup(
    `type`: mouseup,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_move(
    `type`: move,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_moveend(
    `type`: moveend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_movestart(
    `type`: movestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pitch(
    `type`: pitch,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pitchend(
    `type`: pitchend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pitchstart(
    `type`: pitchstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_remove(
    `type`: remove,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_render(
    `type`: render,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_resize(
    `type`: resize,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rotate(
    `type`: rotate,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rotateend(
    `type`: rotateend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rotatestart(
    `type`: rotatestart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_sourcedata(`type`: sourcedata, listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_sourcedataloading(
    `type`: sourcedataloading,
    listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_styledata(`type`: styledata, listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_styledataloading(`type`: styledataloading, listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_tiledataloading(`type`: tiledataloading, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_touchcancel(
    `type`: touchcancel,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchcancel(`type`: touchcancel, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_touchend(
    `type`: touchend,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchend(`type`: touchend, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_touchmove(`type`: touchmove, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_touchstart(
    `type`: touchstart,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchstart(`type`: touchstart, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_webglcontextlost(`type`: webglcontextlost, listener: js.Function1[/* ev */ MapContextEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_webglcontextrestored(
    `type`: webglcontextrestored,
    listener: js.Function1[/* ev */ MapContextEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_wheel(`type`: wheel, listener: js.Function1[/* ev */ MapWheelEvent with EventData, Unit]): this.type = js.native
  @JSName("on")
  def on_zoom(
    `type`: zoom,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_zoomend(
    `type`: zoomend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_zoomstart(
    `type`: zoomstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  def once(`type`: String, listener: js.Function1[/* ev */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_boxzoomcancel(`type`: boxzoomcancel, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_boxzoomend(`type`: boxzoomend, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_boxzoomstart(`type`: boxzoomstart, listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_click(
    `type`: click,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_click(`type`: click, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_contextmenu(
    `type`: contextmenu,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_data(`type`: data, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_dataloading(`type`: dataloading, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_dblclick(
    `type`: dblclick,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_drag(
    `type`: drag,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dragend(
    `type`: dragend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dragstart(
    `type`: dragstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_load(
    `type`: load,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousedown(
    `type`: mousedown,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseenter(
    `type`: mouseenter,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseleave(
    `type`: mouseleave,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousemove(
    `type`: mousemove,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseout(
    `type`: mouseout,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseover(
    `type`: mouseover,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseup(
    `type`: mouseup,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MapMouseEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_move(
    `type`: move,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_moveend(
    `type`: moveend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_movestart(
    `type`: movestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pitch(
    `type`: pitch,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pitchend(
    `type`: pitchend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pitchstart(
    `type`: pitchstart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_remove(
    `type`: remove,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_render(
    `type`: render,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_resize(
    `type`: resize,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rotate(
    `type`: rotate,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rotateend(
    `type`: rotateend,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rotatestart(
    `type`: rotatestart,
    listener: js.Function1[/* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent]]) with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_sourcedata(`type`: sourcedata, listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_sourcedataloading(
    `type`: sourcedataloading,
    listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_styledata(`type`: styledata, listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_styledataloading(`type`: styledataloading, listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_tiledataloading(`type`: tiledataloading, listener: js.Function1[/* ev */ MapDataEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_touchcancel(
    `type`: touchcancel,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchcancel(`type`: touchcancel, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_touchend(
    `type`: touchend,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchend(`type`: touchend, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_touchmove(`type`: touchmove, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_touchstart(
    `type`: touchstart,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchstart(`type`: touchstart, listener: js.Function1[/* ev */ MapTouchEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_webglcontextlost(`type`: webglcontextlost, listener: js.Function1[/* ev */ MapContextEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_webglcontextrestored(
    `type`: webglcontextrestored,
    listener: js.Function1[/* ev */ MapContextEvent with EventData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_wheel(`type`: wheel, listener: js.Function1[/* ev */ MapWheelEvent with EventData, Unit]): this.type = js.native
  @JSName("once")
  def once_zoom(
    `type`: zoom,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_zoomend(
    `type`: zoomend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_zoomstart(
    `type`: zoomstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) with EventData, 
      Unit
    ]
  ): this.type = js.native
  def panBy(offset: PointLike): this.type = js.native
  def panBy(offset: PointLike, options: AnimationOptions): this.type = js.native
  def panBy(offset: PointLike, options: AnimationOptions, eventData: EventData): this.type = js.native
  def panTo(lnglat: LngLatLike): this.type = js.native
  def panTo(lnglat: LngLatLike, options: AnimationOptions): this.type = js.native
  def panTo(lnglat: LngLatLike, options: AnimationOptions, eventdata: EventData): this.type = js.native
  def project(lnglat: LngLatLike): Point = js.native
  def queryRenderedFeatures(): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: js.Tuple2[PointLike, PointLike]): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: js.Tuple2[PointLike, PointLike], parameters: Anon_Filter): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: PointLike): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: PointLike, parameters: Anon_Filter): js.Array[MapboxGeoJSONFeature] = js.native
  def querySourceFeatures(sourceID: String): js.Array[MapboxGeoJSONFeature] = js.native
  def querySourceFeatures(sourceID: String, parameters: Anon_FilterSourceLayer): js.Array[MapboxGeoJSONFeature] = js.native
  def remove(): Unit = js.native
  def removeControl(control: Control): this.type = js.native
  def removeControl(control: IControl): this.type = js.native
  def removeImage(name: String): this.type = js.native
  def removeLayer(id: String): this.type = js.native
  def removeSource(id: String): this.type = js.native
  def resetNorth(): this.type = js.native
  def resetNorth(options: AnimationOptions): this.type = js.native
  def resetNorth(options: AnimationOptions, eventData: EventData): this.type = js.native
  def resize(): this.type = js.native
  def resize(eventData: EventData): this.type = js.native
  def rotateTo(bearing: Double): this.type = js.native
  def rotateTo(bearing: Double, options: AnimationOptions): this.type = js.native
  def rotateTo(bearing: Double, options: AnimationOptions, eventData: EventData): this.type = js.native
  def setBearing(bearing: Double): this.type = js.native
  def setBearing(bearing: Double, eventData: EventData): this.type = js.native
  def setCenter(center: LngLatLike): this.type = js.native
  def setCenter(center: LngLatLike, eventData: EventData): this.type = js.native
  def setFeatureState(feature: Anon_Id, state: StringDictionary[js.Any]): Unit = js.native
  def setFeatureState(feature: MapboxGeoJSONFeature, state: StringDictionary[js.Any]): Unit = js.native
  def setFilter(layer: String): this.type = js.native
  def setFilter(layer: String, filter: js.Array[_]): this.type = js.native
  def setLayerZoomRange(layerId: String, minzoom: Double, maxzoom: Double): this.type = js.native
  def setLayoutProperty(layer: String, name: String, value: js.Any): this.type = js.native
  def setLight(options: Light): this.type = js.native
  def setLight(options: Light, lightOptions: js.Any): this.type = js.native
  def setMaxBounds(): this.type = js.native
  def setMaxBounds(lnglatbounds: LngLatBoundsLike): this.type = js.native
  def setMaxZoom(): this.type = js.native
  def setMaxZoom(maxZoom: Double): this.type = js.native
  def setMinZoom(): this.type = js.native
  def setMinZoom(minZoom: Double): this.type = js.native
  def setPaintProperty(layer: String, name: String, value: js.Any): this.type = js.native
  def setPaintProperty(layer: String, name: String, value: js.Any, klass: String): this.type = js.native
  def setPitch(pitch: Double): this.type = js.native
  def setPitch(pitch: Double, eventData: EventData): this.type = js.native
  def setRenderWorldCopies(): this.type = js.native
  def setRenderWorldCopies(renderWorldCopies: Boolean): this.type = js.native
  def setStyle(style: String): this.type = js.native
  def setStyle(style: String, options: Anon_Diff): this.type = js.native
  def setStyle(style: Style): this.type = js.native
  def setStyle(style: Style, options: Anon_Diff): this.type = js.native
  def setZoom(zoom: Double): this.type = js.native
  def setZoom(zoom: Double, eventData: EventData): this.type = js.native
  def snapToNorth(): this.type = js.native
  def snapToNorth(options: AnimationOptions): this.type = js.native
  def snapToNorth(options: AnimationOptions, eventData: EventData): this.type = js.native
  def stop(): this.type = js.native
  def triggerRepaint(): Unit = js.native
  def unproject(point: PointLike): LngLat = js.native
  def zoomIn(): this.type = js.native
  def zoomIn(options: AnimationOptions): this.type = js.native
  def zoomIn(options: AnimationOptions, eventData: EventData): this.type = js.native
  def zoomOut(): this.type = js.native
  def zoomOut(options: AnimationOptions): this.type = js.native
  def zoomOut(options: AnimationOptions, eventData: EventData): this.type = js.native
  def zoomTo(zoom: Double): this.type = js.native
  def zoomTo(zoom: Double, options: AnimationOptions): this.type = js.native
  def zoomTo(zoom: Double, options: AnimationOptions, eventData: EventData): this.type = js.native
}

