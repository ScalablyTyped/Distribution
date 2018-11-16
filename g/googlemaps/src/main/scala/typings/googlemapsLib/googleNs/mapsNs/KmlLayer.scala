package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.KmlLayer")
@js.native
class KmlLayer () extends MVCObject {
  def this(opts: KmlLayerOptions) = this()
  def getDefaultViewport(): LatLngBounds = js.native
  def getMap(): Map = js.native
  def getMetadata(): KmlLayerMetadata = js.native
  def getStatus(): KmlLayerStatus = js.native
  def getUrl(): java.lang.String = js.native
  def getZIndex(): scala.Double = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOptions(options: KmlLayerOptions): scala.Unit = js.native
  def setUrl(url: java.lang.String): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

