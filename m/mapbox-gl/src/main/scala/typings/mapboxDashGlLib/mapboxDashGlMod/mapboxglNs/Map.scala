package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map extends Evented {
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
  def addImage(name: java.lang.String, image: mapboxDashGlLib.Anon_Data, options: mapboxDashGlLib.Anon_Sdf): this.type = js.native
  def addImage(name: java.lang.String, image: stdLib.ArrayBufferView): this.type = js.native
  def addImage(name: java.lang.String, image: stdLib.ArrayBufferView, options: mapboxDashGlLib.Anon_Sdf): this.type = js.native
  def addImage(name: java.lang.String, image: stdLib.HTMLImageElement): this.type = js.native
  def addImage(name: java.lang.String, image: stdLib.HTMLImageElement, options: mapboxDashGlLib.Anon_Sdf): this.type = js.native
  def addImage(name: java.lang.String, image: stdLib.ImageData): this.type = js.native
  def addImage(name: java.lang.String, image: stdLib.ImageData, options: mapboxDashGlLib.Anon_Sdf): this.type = js.native
  def addLayer(layer: Layer): this.type = js.native
  def addLayer(layer: Layer, before: java.lang.String): this.type = js.native
  def addSource(id: java.lang.String, source: GeoJSONSource): this.type = js.native
  def addSource(id: java.lang.String, source: GeoJSONSourceRaw): this.type = js.native
  def addSource(id: java.lang.String, source: ImageSource): this.type = js.native
  def addSource(id: java.lang.String, source: RasterDemSource): this.type = js.native
  def addSource(id: java.lang.String, source: RasterSource): this.type = js.native
  def addSource(id: java.lang.String, source: VectorSource): this.type = js.native
  def addSource(id: java.lang.String, source: VideoSource): this.type = js.native
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
  def getFeatureState(feature: mapboxDashGlLib.Anon_SourceLayerSource): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def getFeatureState(feature: MapboxGeoJSONFeature): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
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
  def getSource(id: java.lang.String): VectorSource | RasterSource | RasterDemSource | GeoJSONSource | ImageSource | VideoSource = js.native
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
  def off[T /* <: java.lang.String */](
    `type`: T,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ js.Any with EventData, scala.Unit]
  ): this.type = js.native
  def off[T /* <: java.lang.String */](`type`: T, listener: js.Function1[/* ev */ js.Any with EventData, scala.Unit]): this.type = js.native
  def on(`type`: java.lang.String, listener: js.Function1[/* ev */ js.Any, scala.Unit]): this.type = js.native
  def on[T /* <: java.lang.String */](
    `type`: T,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ js.Any with EventData, scala.Unit]
  ): this.type = js.native
  def on[T /* <: java.lang.String */](`type`: T, listener: js.Function1[/* ev */ js.Any with EventData, scala.Unit]): this.type = js.native
  def once(`type`: java.lang.String, listener: js.Function1[/* ev */ js.Any, scala.Unit]): this.type = js.native
  def once[T /* <: java.lang.String */](
    `type`: T,
    layer: java.lang.String,
    listener: js.Function1[/* ev */ js.Any with EventData, scala.Unit]
  ): this.type = js.native
  def once[T /* <: java.lang.String */](`type`: T, listener: js.Function1[/* ev */ js.Any with EventData, scala.Unit]): this.type = js.native
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
  def querySourceFeatures(sourceID: java.lang.String, parameters: mapboxDashGlLib.Anon_SourceLayer): js.Array[MapboxGeoJSONFeature] = js.native
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
  def setFeatureState(
    feature: mapboxDashGlLib.Anon_SourceLayerSource,
    state: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def setFeatureState(feature: MapboxGeoJSONFeature, state: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
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

