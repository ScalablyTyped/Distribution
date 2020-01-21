package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "TileLayer")
@js.native
class TileLayer_ protected () extends GridLayer_ {
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
object TileLayer_ extends js.Object {
  @js.native
  class WMS protected () extends TileLayer_ {
    def this(baseUrl: String, options: WMSOptions) = this()
    @JSName("options")
    var options_WMS: WMSOptions = js.native
    var wmsParams: WMSParams = js.native
    def setParams(params: WMSParams): this.type = js.native
    def setParams(params: WMSParams, noRedraw: Boolean): this.type = js.native
  }
  
}

