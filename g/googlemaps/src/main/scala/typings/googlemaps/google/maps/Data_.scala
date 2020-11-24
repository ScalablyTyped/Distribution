package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.Data.Feature
import typings.googlemaps.google.maps.Data.FeatureOptions
import typings.googlemaps.google.maps.Data.GeoJsonOptions
import typings.googlemaps.google.maps.Data.StyleOptions
import typings.googlemaps.google.maps.Data.StylingFunction
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data_ extends MVCObject {
  
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
  
  def getMap(): Map[Element] = js.native
  
  def getStyle(): StylingFunction | StyleOptions = js.native
  
  def loadGeoJson(url: String): Unit = js.native
  def loadGeoJson(
    url: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* features */ js.Array[Feature], Unit]
  ): Unit = js.native
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
  def setMap(map: Map[Element]): Unit = js.native
  
  def setStyle(style: StyleOptions): Unit = js.native
  def setStyle(style: StylingFunction): Unit = js.native
  
  def toGeoJson(callback: js.Function1[/* feature */ js.Object, Unit]): Unit = js.native
}
