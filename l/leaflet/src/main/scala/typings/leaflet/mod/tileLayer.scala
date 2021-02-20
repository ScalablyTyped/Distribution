package typings.leaflet.mod

import typings.leaflet.mod.TileLayer_.WMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileLayer {
  
  @JSImport("leaflet", "tileLayer")
  @js.native
  def apply(urlTemplate: String): TileLayer_ = js.native
  @JSImport("leaflet", "tileLayer")
  @js.native
  def apply(urlTemplate: String, options: TileLayerOptions): TileLayer_ = js.native
  
  @JSImport("leaflet", "tileLayer.wms")
  @js.native
  def wms(baseUrl: String): WMS = js.native
  @JSImport("leaflet", "tileLayer.wms")
  @js.native
  def wms(baseUrl: String, options: WMSOptions): WMS = js.native
}
