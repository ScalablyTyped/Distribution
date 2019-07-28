package typings.googlemaps.googleNs.mapsNs.DataNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.Feature")
@js.native
class Feature () extends js.Object {
  def this(options: FeatureOptions) = this()
  def forEachProperty(callback: js.Function2[/* value */ js.Any, /* name */ String, Unit]): Unit = js.native
  def getGeometry(): Geometry = js.native
  def getId(): Double | String = js.native
  def getProperty(name: String): js.Any = js.native
  def removeProperty(name: String): Unit = js.native
  def setGeometry(newGeometry: Geometry): Unit = js.native
  def setGeometry(newGeometry: LatLng): Unit = js.native
  def setGeometry(newGeometry: LatLngLiteral): Unit = js.native
  def setProperty(name: String, newValue: js.Any): Unit = js.native
  def toGeoJson(callback: js.Function1[/* feature */ js.Object, Unit]): Unit = js.native
}

