package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Data *****/
@JSGlobal("google.maps.Data")
@js.native
class Data () extends MVCObject {
  def this(options: googlemapsLib.googleNs.mapsNs.DataNs.DataOptions) = this()
  def add(feature: googlemapsLib.googleNs.mapsNs.DataNs.Feature): googlemapsLib.googleNs.mapsNs.DataNs.Feature = js.native
  def add(feature: googlemapsLib.googleNs.mapsNs.DataNs.FeatureOptions): googlemapsLib.googleNs.mapsNs.DataNs.Feature = js.native
  def addGeoJson(geoJson: js.Object): js.Array[googlemapsLib.googleNs.mapsNs.DataNs.Feature] = js.native
  def addGeoJson(geoJson: js.Object, options: googlemapsLib.googleNs.mapsNs.DataNs.GeoJsonOptions): js.Array[googlemapsLib.googleNs.mapsNs.DataNs.Feature] = js.native
  def contains(feature: googlemapsLib.googleNs.mapsNs.DataNs.Feature): scala.Boolean = js.native
  def forEach(callback: js.Function1[/* feature */ googlemapsLib.googleNs.mapsNs.DataNs.Feature, scala.Unit]): scala.Unit = js.native
  def getControlPosition(): ControlPosition = js.native
  def getControls(): js.Array[DrawingMode] = js.native
  def getDrawingMode(): DrawingMode | scala.Null = js.native
  def getFeatureById(id: java.lang.String): googlemapsLib.googleNs.mapsNs.DataNs.Feature = js.native
  def getFeatureById(id: scala.Double): googlemapsLib.googleNs.mapsNs.DataNs.Feature = js.native
  def getMap(): Map = js.native
  def getStyle(): googlemapsLib.googleNs.mapsNs.DataNs.StylingFunction | googlemapsLib.googleNs.mapsNs.DataNs.StyleOptions = js.native
  def loadGeoJson(url: java.lang.String): scala.Unit = js.native
  def loadGeoJson(url: java.lang.String, options: googlemapsLib.googleNs.mapsNs.DataNs.GeoJsonOptions): scala.Unit = js.native
  def loadGeoJson(
    url: java.lang.String,
    options: googlemapsLib.googleNs.mapsNs.DataNs.GeoJsonOptions,
    callback: js.Function1[/* features */ js.Array[googlemapsLib.googleNs.mapsNs.DataNs.Feature], scala.Unit]
  ): scala.Unit = js.native
  def overrideStyle(
    feature: googlemapsLib.googleNs.mapsNs.DataNs.Feature,
    style: googlemapsLib.googleNs.mapsNs.DataNs.StyleOptions
  ): scala.Unit = js.native
  def remove(feature: googlemapsLib.googleNs.mapsNs.DataNs.Feature): scala.Unit = js.native
  def revertStyle(): scala.Unit = js.native
  def revertStyle(feature: googlemapsLib.googleNs.mapsNs.DataNs.Feature): scala.Unit = js.native
  def setControlPosition(controlPosition: ControlPosition): scala.Unit = js.native
  def setControls(): scala.Unit = js.native
  def setControls(controls: js.Array[DrawingMode]): scala.Unit = js.native
  def setDrawingMode(): scala.Unit = js.native
  def setDrawingMode(drawingMode: DrawingMode): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setStyle(style: googlemapsLib.googleNs.mapsNs.DataNs.StyleOptions): scala.Unit = js.native
  def setStyle(style: googlemapsLib.googleNs.mapsNs.DataNs.StylingFunction): scala.Unit = js.native
  def toGeoJson(callback: js.Function1[/* feature */ js.Object, scala.Unit]): scala.Unit = js.native
}

