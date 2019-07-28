package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "TileLayer")
@js.native
class TileLayer protected () extends GridLayer {
  def this(urlTemplate: String) = this()
  def this(urlTemplate: String, options: TileLayerOptions) = this()
  var options: TileLayerOptions = js.native
  /* protected */ def _abortLoading(): Unit = js.native
  /* protected */ def _getZoomForUrl(): Double = js.native
  def setUrl(url: String): this.type = js.native
  def setUrl(url: String, noRedraw: Boolean): this.type = js.native
}

