package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "TileLayer")
@js.native
class TileLayer protected () extends GridLayer {
  def this(urlTemplate: java.lang.String) = this()
  def this(urlTemplate: java.lang.String, options: TileLayerOptions) = this()
  var options: TileLayerOptions = js.native
  /* protected */ def _abortLoading(): scala.Unit = js.native
  /* protected */ def _getZoomForUrl(): scala.Double = js.native
  def setUrl(url: java.lang.String): this.type = js.native
  def setUrl(url: java.lang.String, noRedraw: scala.Boolean): this.type = js.native
}

