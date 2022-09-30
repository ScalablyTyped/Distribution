package typings.leaflet.global.L

import typings.leaflet.mod.TileLayerOptions
import typings.leaflet.mod.WMSOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.TileLayer")
@js.native
open class TileLayer_ protected ()
  extends typings.leaflet.mod.TileLayer_ {
  def this(urlTemplate: String) = this()
  def this(urlTemplate: String, options: TileLayerOptions) = this()
}
object TileLayer_ {
  
  @JSGlobal("L.TileLayer.WMS")
  @js.native
  open class WMS protected ()
    extends typings.leaflet.mod.TileLayer_.WMS {
    def this(baseUrl: String, options: WMSOptions) = this()
  }
}
