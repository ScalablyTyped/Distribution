package typings
package mapboxDashGlLib.mapboxDashGlMod

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
  var repaint: scala.Boolean = js.native
  var scrollZoom: ScrollZoomHandler = js.native
  var showCollisionBoxes: scala.Boolean = js.native
  var showTileBoundaries: scala.Boolean = js.native
  var touchZoomRotate: TouchZoomRotateHandler = js.native
  def addControl(control: Control): this.type = js.native
  def addControl(control: IControl): this.type = js.native
  @JSName("addControl")
  def `addControl_bottom-left`(control: Control, position: mapboxDashGlLib.mapboxDashGlLibStrings.`bottom-left`): this.type = js.native
  @JSName("addControl")
  def `addControl_bottom-left`(control: IControl, position: mapboxDashGlLib.mapboxDashGlLibStrings.`bottom-left`): this.type = js.native
  @JSName("addControl")
  def `addControl_bottom-right`(control: Control, position: mapboxDashGlLib.mapboxDashGlLibStrings.`bottom-right`): this.type = js.native
  @JSName("addControl")
  def `addControl_bottom-right`(control: IControl, position: mapboxDashGlLib.mapboxDashGlLibStrings.`bottom-right`): this.type = js.native
  @JSName("addControl")
  def `addControl_top-left`(control: Control, position: mapboxDashGlLib.mapboxDashGlLibStrings.`top-left`): this.type = js.native
  @JSName("addControl")
  def `addControl_top-left`(control: IControl, position: mapboxDashGlLib.mapboxDashGlLibStrings.`top-left`): this.type = js.native
  @JSName("addControl")
  def `addControl_top-right`(control: Control, position: mapboxDashGlLib.mapboxDashGlLibStrings.`top-right`): this.type = js.native
  @JSName("addControl")
  def `addControl_top-right`(control: IControl, position: mapboxDashGlLib.mapboxDashGlLibStrings.`top-right`): this.type = js.native
  def addImage(name: java.lang.String, image: mapboxDashGlLib.Anon_Data): this.type = js.native
  def addImage(name: java.lang.String, image: mapboxDashGlLib.Anon_Data, options: mapboxDashGlLib.Anon_PixelRatio): this.type = js.native
  def addImage(name: java.lang.String, image: stdLib.ArrayBufferView): this.type = js.native
  def addImage(name: java.lang.String, image: stdLib.ArrayBufferView, options: mapboxDashGlLib.Anon_PixelRatio): this.type = js.native
  def addImage(name: java.lang.String, image: stdLib.HTMLImageElement): this.type = js.native
  def addImage(name: java.lang.String, image: stdLib.HTMLImageElement, options: mapboxDashGlLib.Anon_PixelRatio): this.type = js.native
  def addImage(name: java.lang.String, image: stdLib.ImageData): this.type = js.native
  def addImage(name: java.lang.String, image: stdLib.ImageData, options: mapboxDashGlLib.Anon_PixelRatio): this.type = js.native
  def addLayer(layer: Layer): this.type = js.native
  def addLayer(layer: Layer, before: java.lang.String): this.type = js.native
  def addSource(id: java.lang.String, source: AnySourceData): this.type = js.native
  def areTilesLoaded(): scala.Boolean = js.native
  def cameraForBounds(bounds: LngLatBoundsLike): js.UndefOr[CameraOptions] = js.native
  def cameraForBounds(bounds: LngLatBoundsLike, options: CameraForBoundsOptions): js.UndefOr[CameraOptions] = js.native
  def easeTo(options: CameraOptions with AnimationOptions with mapboxDashGlLib.Anon_DelayEndEvents): this.type = js.native
  def easeTo(
    options: CameraOptions with AnimationOptions with mapboxDashGlLib.Anon_DelayEndEvents,
    eventData: EventData
  ): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: FitBoundsOptions): this.type = js.native
  def fitBounds(bounds: LngLatBoundsLike, options: FitBoundsOptions, eventData: EventData): this.type = js.native
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: scala.Double): this.type = js.native
  def fitScreenCoordinates(p0: PointLike, p1: PointLike, bearing: scala.Double, options: AnimationOptions with CameraOptions): this.type = js.native
  def fitScreenCoordinates(
    p0: PointLike,
    p1: PointLike,
    bearing: scala.Double,
    options: AnimationOptions with CameraOptions,
    eventData: EventData
  ): this.type = js.native
  def flyTo(options: FlyToOptions): this.type = js.native
  def flyTo(options: FlyToOptions, eventData: EventData): this.type = js.native
  def getBearing(): scala.Double = js.native
  def getBounds(): LngLatBounds = js.native
  def getCanvas(): stdLib.HTMLCanvasElement = js.native
  def getCanvasContainer(): stdLib.HTMLElement = js.native
  def getCenter(): LngLat = js.native
  def getContainer(): stdLib.HTMLElement = js.native
  def getFeatureState(feature: mapboxDashGlLib.Anon_Id): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def getFeatureState(feature: MapboxGeoJSONFeature): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def getFilter(layer: java.lang.String): js.Array[_] = js.native
  def getLayer(id: java.lang.String): Layer = js.native
  def getLayoutProperty(layer: java.lang.String, name: java.lang.String): js.Any = js.native
  def getLight(): Light = js.native
  def getMaxBounds(): LngLatBounds | scala.Null = js.native
  def getMaxZoom(): scala.Double = js.native
  def getMinZoom(): scala.Double = js.native
  def getPaintProperty(layer: java.lang.String, name: java.lang.String): js.Any = js.native
  def getPitch(): scala.Double = js.native
  def getRenderWorldCopies(): scala.Boolean = js.native
  def getSource(id: java.lang.String): AnySourceImpl = js.native
  def getStyle(): Style = js.native
  def getZoom(): scala.Double = js.native
  def hasImage(name: java.lang.String): scala.Boolean = js.native
  def isEasing(): scala.Boolean = js.native
  def isMoving(): scala.Boolean = js.native
  def isRotating(): scala.Boolean = js.native
  def isSourceLoaded(id: java.lang.String): scala.Boolean = js.native
  def isStyleLoaded(): scala.Boolean = js.native
  def isZooming(): scala.Boolean = js.native
  def jumpTo(options: CameraOptions): this.type = js.native
  def jumpTo(options: CameraOptions, eventData: EventData): this.type = js.native
  def listImages(): js.Array[java.lang.String] = js.native
  def loadImage(url: java.lang.String, callback: js.Function): this.type = js.native
  def loaded(): scala.Boolean = js.native
  def moveLayer(id: java.lang.String): this.type = js.native
  def moveLayer(id: java.lang.String, beforeId: java.lang.String): this.type = js.native
  def off(`type`: java.lang.String, listener: js.Function1[/* ev */ js.Any, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_boxzoomcancel(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomcancel,
    listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_boxzoomend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomend,
    listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_boxzoomstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomstart,
    listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_click(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.click,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_click(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.click,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_contextmenu(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.contextmenu,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_contextmenu(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.contextmenu,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_data(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.data,
    listener: js.Function1[/* ev */ MapDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dataloading(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dataloading,
    listener: js.Function1[/* ev */ MapDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dblclick(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dblclick,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dblclick(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dblclick,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_drag(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.drag,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_dragend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dragend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_dragstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dragstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_error(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.error,
    listener: js.Function1[/* ev */ ErrorEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_load(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.load,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousedown(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousedown,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousedown(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousedown,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseenter(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseenter,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseleave(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseleave,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousemove(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousemove,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousemove(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousemove,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseout(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseout,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseout(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseout,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseover(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseover,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseover(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseover,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseup(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseup,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseup(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseup,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_move(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.move,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_moveend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.moveend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_movestart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.movestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pitch(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.pitch,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pitchend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.pitchend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pitchstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.pitchstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_remove(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.remove,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_render(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.render,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_resize(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.resize,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_rotate(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.rotate,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_rotateend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.rotateend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_rotatestart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.rotatestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_sourcedata(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.sourcedata,
    listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_sourcedataloading(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.sourcedataloading,
    listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_styledata(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.styledata,
    listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_styledataloading(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.styledataloading,
    listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_tiledataloading(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.tiledataloading,
    listener: js.Function1[/* ev */ MapDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchcancel(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchcancel,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchcancel(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchcancel,
    listener: js.Function1[/* ev */ MapTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchend,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchend,
    listener: js.Function1[/* ev */ MapTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchmove(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchmove,
    listener: js.Function1[/* ev */ MapTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchstart,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchstart,
    listener: js.Function1[/* ev */ MapTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_webglcontextlost(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.webglcontextlost,
    listener: js.Function1[/* ev */ MapContextEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_webglcontextrestored(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.webglcontextrestored,
    listener: js.Function1[/* ev */ MapContextEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_wheel(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.wheel,
    listener: js.Function1[/* ev */ MapWheelEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_zoom(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.zoom,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_zoomend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.zoomend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_zoomstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.zoomstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  def on(`type`: java.lang.String, listener: js.Function1[/* ev */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_boxzoomcancel(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomcancel,
    listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_boxzoomend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomend,
    listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_boxzoomstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomstart,
    listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_click(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.click,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_click(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.click,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_contextmenu(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.contextmenu,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_contextmenu(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.contextmenu,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_data(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.data,
    listener: js.Function1[/* ev */ MapDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dataloading(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dataloading,
    listener: js.Function1[/* ev */ MapDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dblclick(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dblclick,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dblclick(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dblclick,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_drag(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.drag,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_dragend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dragend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_dragstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dragstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.error,
    listener: js.Function1[/* ev */ ErrorEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_load(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.load,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousedown(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousedown,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousedown(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousedown,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseenter(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseenter,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseleave(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseleave,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousemove(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousemove,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousemove(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousemove,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseout(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseout,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseout(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseout,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseover(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseover,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseover(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseover,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseup(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseup,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseup(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseup,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_move(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.move,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_moveend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.moveend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_movestart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.movestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pitch(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.pitch,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pitchend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.pitchend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pitchstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.pitchstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_remove(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.remove,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_render(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.render,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_resize(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.resize,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rotate(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.rotate,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_rotateend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.rotateend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_rotatestart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.rotatestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_sourcedata(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.sourcedata,
    listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_sourcedataloading(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.sourcedataloading,
    listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_styledata(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.styledata,
    listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_styledataloading(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.styledataloading,
    listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_tiledataloading(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.tiledataloading,
    listener: js.Function1[/* ev */ MapDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchcancel(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchcancel,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchcancel(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchcancel,
    listener: js.Function1[/* ev */ MapTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchend,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchend,
    listener: js.Function1[/* ev */ MapTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchmove(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchmove,
    listener: js.Function1[/* ev */ MapTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchstart,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchstart,
    listener: js.Function1[/* ev */ MapTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_webglcontextlost(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.webglcontextlost,
    listener: js.Function1[/* ev */ MapContextEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_webglcontextrestored(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.webglcontextrestored,
    listener: js.Function1[/* ev */ MapContextEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_wheel(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.wheel,
    listener: js.Function1[/* ev */ MapWheelEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_zoom(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.zoom,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_zoomend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.zoomend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_zoomstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.zoomstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  def once(`type`: java.lang.String, listener: js.Function1[/* ev */ js.Any, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_boxzoomcancel(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomcancel,
    listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_boxzoomend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomend,
    listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_boxzoomstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomstart,
    listener: js.Function1[/* ev */ MapBoxZoomEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_click(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.click,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_click(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.click,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_contextmenu(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.contextmenu,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_contextmenu(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.contextmenu,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_data(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.data,
    listener: js.Function1[/* ev */ MapDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dataloading(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dataloading,
    listener: js.Function1[/* ev */ MapDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dblclick(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dblclick,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dblclick(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dblclick,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_drag(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.drag,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_dragend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dragend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_dragstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.dragstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.error,
    listener: js.Function1[/* ev */ ErrorEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_load(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.load,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousedown(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousedown,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousedown(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousedown,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseenter(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseenter,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseleave(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseleave,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousemove(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousemove,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousemove(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousemove,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseout(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseout,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseout(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseout,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseover(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseover,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseover(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseover,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseup(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseup,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseup(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mouseup,
    listener: js.Function1[/* ev */ MapMouseEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_move(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.move,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_moveend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.moveend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_movestart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.movestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pitch(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.pitch,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pitchend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.pitchend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pitchstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.pitchstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_remove(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.remove,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_render(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.render,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_resize(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.resize,
    listener: js.Function1[/* ev */ MapboxEvent[js.UndefOr[scala.Nothing]] with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_rotate(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.rotate,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_rotateend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.rotateend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_rotatestart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.rotatestart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_sourcedata(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.sourcedata,
    listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_sourcedataloading(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.sourcedataloading,
    listener: js.Function1[/* ev */ MapSourceDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_styledata(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.styledata,
    listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_styledataloading(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.styledataloading,
    listener: js.Function1[/* ev */ MapStyleDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_tiledataloading(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.tiledataloading,
    listener: js.Function1[/* ev */ MapDataEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchcancel(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchcancel,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchcancel(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchcancel,
    listener: js.Function1[/* ev */ MapTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchend,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchend,
    listener: js.Function1[/* ev */ MapTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchmove(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchmove,
    listener: js.Function1[/* ev */ MapTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchstart,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchstart,
    listener: js.Function1[/* ev */ MapTouchEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_webglcontextlost(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.webglcontextlost,
    listener: js.Function1[/* ev */ MapContextEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_webglcontextrestored(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.webglcontextrestored,
    listener: js.Function1[/* ev */ MapContextEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_wheel(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.wheel,
    listener: js.Function1[/* ev */ MapWheelEvent with EventData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_zoom(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.zoom,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_zoomend(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.zoomend,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_zoomstart(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.zoomstart,
    listener: js.Function1[
      /* ev */ (MapboxEvent[js.UndefOr[stdLib.MouseEvent | stdLib.TouchEvent | stdLib.WheelEvent]]) with EventData, 
      scala.Unit
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
  def queryRenderedFeatures(pointOrBox: js.Tuple2[PointLike, PointLike], parameters: mapboxDashGlLib.Anon_Filter): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: PointLike): js.Array[MapboxGeoJSONFeature] = js.native
  def queryRenderedFeatures(pointOrBox: PointLike, parameters: mapboxDashGlLib.Anon_Filter): js.Array[MapboxGeoJSONFeature] = js.native
  def querySourceFeatures(sourceID: java.lang.String): js.Array[MapboxGeoJSONFeature] = js.native
  def querySourceFeatures(sourceID: java.lang.String, parameters: mapboxDashGlLib.Anon_FilterSourceLayer): js.Array[MapboxGeoJSONFeature] = js.native
  def remove(): scala.Unit = js.native
  def removeControl(control: Control): this.type = js.native
  def removeControl(control: IControl): this.type = js.native
  def removeImage(name: java.lang.String): this.type = js.native
  def removeLayer(id: java.lang.String): this.type = js.native
  def removeSource(id: java.lang.String): this.type = js.native
  def resetNorth(): this.type = js.native
  def resetNorth(options: AnimationOptions): this.type = js.native
  def resetNorth(options: AnimationOptions, eventData: EventData): this.type = js.native
  def resize(): this.type = js.native
  def resize(eventData: EventData): this.type = js.native
  def rotateTo(bearing: scala.Double): this.type = js.native
  def rotateTo(bearing: scala.Double, options: AnimationOptions): this.type = js.native
  def rotateTo(bearing: scala.Double, options: AnimationOptions, eventData: EventData): this.type = js.native
  def setBearing(bearing: scala.Double): this.type = js.native
  def setBearing(bearing: scala.Double, eventData: EventData): this.type = js.native
  def setCenter(center: LngLatLike): this.type = js.native
  def setCenter(center: LngLatLike, eventData: EventData): this.type = js.native
  def setFeatureState(feature: mapboxDashGlLib.Anon_Id, state: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def setFeatureState(feature: MapboxGeoJSONFeature, state: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def setFilter(layer: java.lang.String): this.type = js.native
  def setFilter(layer: java.lang.String, filter: js.Array[_]): this.type = js.native
  def setLayerZoomRange(layerId: java.lang.String, minzoom: scala.Double, maxzoom: scala.Double): this.type = js.native
  def setLayoutProperty(layer: java.lang.String, name: java.lang.String, value: js.Any): this.type = js.native
  def setLight(options: Light): this.type = js.native
  def setLight(options: Light, lightOptions: js.Any): this.type = js.native
  def setMaxBounds(): this.type = js.native
  def setMaxBounds(lnglatbounds: LngLatBoundsLike): this.type = js.native
  def setMaxZoom(): this.type = js.native
  def setMaxZoom(maxZoom: scala.Double): this.type = js.native
  def setMinZoom(): this.type = js.native
  def setMinZoom(minZoom: scala.Double): this.type = js.native
  def setPaintProperty(layer: java.lang.String, name: java.lang.String, value: js.Any): this.type = js.native
  def setPaintProperty(layer: java.lang.String, name: java.lang.String, value: js.Any, klass: java.lang.String): this.type = js.native
  def setPitch(pitch: scala.Double): this.type = js.native
  def setPitch(pitch: scala.Double, eventData: EventData): this.type = js.native
  def setRenderWorldCopies(): this.type = js.native
  def setRenderWorldCopies(renderWorldCopies: scala.Boolean): this.type = js.native
  def setStyle(style: java.lang.String): this.type = js.native
  def setStyle(style: java.lang.String, options: mapboxDashGlLib.Anon_Diff): this.type = js.native
  def setStyle(style: Style): this.type = js.native
  def setStyle(style: Style, options: mapboxDashGlLib.Anon_Diff): this.type = js.native
  def setZoom(zoom: scala.Double): this.type = js.native
  def setZoom(zoom: scala.Double, eventData: EventData): this.type = js.native
  def snapToNorth(): this.type = js.native
  def snapToNorth(options: AnimationOptions): this.type = js.native
  def snapToNorth(options: AnimationOptions, eventData: EventData): this.type = js.native
  def stop(): this.type = js.native
  def unproject(point: PointLike): LngLat = js.native
  def zoomIn(): this.type = js.native
  def zoomIn(options: AnimationOptions): this.type = js.native
  def zoomIn(options: AnimationOptions, eventData: EventData): this.type = js.native
  def zoomOut(): this.type = js.native
  def zoomOut(options: AnimationOptions): this.type = js.native
  def zoomOut(options: AnimationOptions, eventData: EventData): this.type = js.native
  def zoomTo(zoom: scala.Double): this.type = js.native
  def zoomTo(zoom: scala.Double, options: AnimationOptions): this.type = js.native
  def zoomTo(zoom: scala.Double, options: AnimationOptions, eventData: EventData): this.type = js.native
}

