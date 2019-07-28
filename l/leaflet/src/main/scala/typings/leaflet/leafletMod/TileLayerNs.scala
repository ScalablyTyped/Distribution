package typings.leaflet.leafletMod

import typings.leaflet.leafletMod.TileLayerNs.WMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "TileLayer")
@js.native
object TileLayerNs extends js.Object {
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
object tileLayerNs extends js.Object {
  def wms(baseUrl: String): WMS = js.native
  def wms(baseUrl: String, options: WMSOptions): WMS = js.native
}

