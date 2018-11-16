package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.Feature")
@js.native
class Feature () extends js.Object {
  def this(options: FeatureOptions) = this()
  def forEachProperty(callback: js.Function2[/* value */ js.Any, /* name */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getGeometry(): Geometry = js.native
  def getId(): scala.Double | java.lang.String = js.native
  def getProperty(name: java.lang.String): js.Any = js.native
  def removeProperty(name: java.lang.String): scala.Unit = js.native
  def setGeometry(newGeometry: Geometry): scala.Unit = js.native
  def setGeometry(newGeometry: googlemapsLib.googleNs.mapsNs.LatLng): scala.Unit = js.native
  def setGeometry(newGeometry: googlemapsLib.googleNs.mapsNs.LatLngLiteral): scala.Unit = js.native
  def setProperty(name: java.lang.String, newValue: js.Any): scala.Unit = js.native
  def toGeoJson(callback: js.Function1[/* feature */ js.Object, scala.Unit]): scala.Unit = js.native
}

