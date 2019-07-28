package typings.googlemaps.googleNs.mapsNs

import typings.googlemaps.googleNs.mapsNs.DataNs.DataOptions
import typings.googlemaps.googleNs.mapsNs.DataNs.Feature
import typings.googlemaps.googleNs.mapsNs.DataNs.FeatureOptions
import typings.googlemaps.googleNs.mapsNs.DataNs.GeoJsonOptions
import typings.googlemaps.googleNs.mapsNs.DataNs.StyleOptions
import typings.googlemaps.googleNs.mapsNs.DataNs.StylingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Data *****/
@JSGlobal("google.maps.Data")
@js.native
class Data () extends MVCObject {
  def this(options: DataOptions) = this()
  def add(feature: Feature): Feature = js.native
  def add(feature: FeatureOptions): Feature = js.native
  def addGeoJson(geoJson: js.Object): js.Array[Feature] = js.native
  def addGeoJson(geoJson: js.Object, options: GeoJsonOptions): js.Array[Feature] = js.native
  def contains(feature: Feature): Boolean = js.native
  def forEach(callback: js.Function1[/* feature */ Feature, Unit]): Unit = js.native
  def getControlPosition(): ControlPosition = js.native
  def getControls(): js.Array[DrawingMode] = js.native
  def getDrawingMode(): DrawingMode | Null = js.native
  def getFeatureById(id: String): Feature = js.native
  def getFeatureById(id: Double): Feature = js.native
  def getMap(): Map = js.native
  def getStyle(): StylingFunction | StyleOptions = js.native
  def loadGeoJson(url: String): Unit = js.native
  def loadGeoJson(url: String, options: GeoJsonOptions): Unit = js.native
  def loadGeoJson(
    url: String,
    options: GeoJsonOptions,
    callback: js.Function1[/* features */ js.Array[Feature], Unit]
  ): Unit = js.native
  def overrideStyle(feature: Feature, style: StyleOptions): Unit = js.native
  def remove(feature: Feature): Unit = js.native
  def revertStyle(): Unit = js.native
  def revertStyle(feature: Feature): Unit = js.native
  def setControlPosition(controlPosition: ControlPosition): Unit = js.native
  def setControls(): Unit = js.native
  def setControls(controls: js.Array[DrawingMode]): Unit = js.native
  def setDrawingMode(): Unit = js.native
  def setDrawingMode(drawingMode: DrawingMode): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setStyle(style: StyleOptions): Unit = js.native
  def setStyle(style: StylingFunction): Unit = js.native
  def toGeoJson(callback: js.Function1[/* feature */ js.Object, Unit]): Unit = js.native
}

