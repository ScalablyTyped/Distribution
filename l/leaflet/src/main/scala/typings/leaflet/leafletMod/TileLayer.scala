package typings.leaflet.leafletMod

import typings.leaflet.leafletMod.TileLayer.WMS
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

@JSImport("leaflet", "TileLayer")
@js.native
object TileLayer extends js.Object {
  @js.native
  class WMS protected () extends TileLayer {
    def this(baseUrl: String, options: WMSOptions) = this()
    @JSName("options")
    var options_WMS: WMSOptions = js.native
    var wmsParams: WMSParams = js.native
    def setParams(params: WMSParams): this.type = js.native
    def setParams(params: WMSParams, noRedraw: Boolean): this.type = js.native
  }
  
}

@JSImport("leaflet", "tileLayer")
@js.native
object tileLayer extends js.Object {
  def apply(urlTemplate: String): TileLayer = js.native
  def apply(urlTemplate: String, options: TileLayerOptions): TileLayer = js.native
  def wms(baseUrl: String): WMS = js.native
  def wms(baseUrl: String, options: WMSOptions): WMS = js.native
}

