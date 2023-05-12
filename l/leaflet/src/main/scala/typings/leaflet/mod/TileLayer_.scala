package typings.leaflet.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "TileLayer")
@js.native
open class TileLayer_ protected () extends GridLayer_ {
  def this(urlTemplate: String) = this()
  def this(urlTemplate: String, options: TileLayerOptions) = this()
  
  /* protected */ def _abortLoading(): Unit = js.native
  
  /* protected */ def _getZoomForUrl(): Double = js.native
  
  /* protected */ def _tileOnError(done: DoneCallback, tile: HTMLElement, e: js.Error): Unit = js.native
  
  /* protected */ def _tileOnLoad(done: DoneCallback, tile: HTMLElement): Unit = js.native
  
  def getTileUrl(coords: Coords): String = js.native
  
  @JSName("options")
  var options_TileLayer_ : TileLayerOptions = js.native
  
  def setUrl(url: String): this.type = js.native
  def setUrl(url: String, noRedraw: Boolean): this.type = js.native
}
object TileLayer_ {
  
  @JSImport("leaflet", "TileLayer.WMS")
  @js.native
  open class WMS protected () extends TileLayer_ {
    def this(baseUrl: String, options: WMSOptions) = this()
    
    @JSName("options")
    var options_WMS: WMSOptions = js.native
    
    def setParams(params: WMSParams): this.type = js.native
    def setParams(params: WMSParams, noRedraw: Boolean): this.type = js.native
    
    var wmsParams: WMSParams = js.native
  }
}
