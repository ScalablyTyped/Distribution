package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "TileLayer")
@js.native
object TileLayerNs extends js.Object {
  @js.native
  class WMS protected ()
    extends leafletLib.leafletMod.TileLayer {
    def this(baseUrl: java.lang.String, options: leafletLib.leafletMod.WMSOptions) = this()
    @JSName("options")
    var options_WMS: leafletLib.leafletMod.WMSOptions = js.native
    var wmsParams: leafletLib.leafletMod.WMSParams = js.native
    def setParams(params: leafletLib.leafletMod.WMSParams): this.type = js.native
    def setParams(params: leafletLib.leafletMod.WMSParams, noRedraw: scala.Boolean): this.type = js.native
  }
  
}

@JSImport("leaflet", "tileLayer")
@js.native
object tileLayerNs extends js.Object {
  def wms(baseUrl: java.lang.String): leafletLib.leafletMod.TileLayerNs.WMS = js.native
  def wms(baseUrl: java.lang.String, options: leafletLib.leafletMod.WMSOptions): leafletLib.leafletMod.TileLayerNs.WMS = js.native
}

