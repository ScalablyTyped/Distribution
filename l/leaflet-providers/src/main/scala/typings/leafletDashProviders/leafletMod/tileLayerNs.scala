package typings.leafletDashProviders.leafletMod

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.leafletMod.TileLayerOptions
import typings.leafletDashProviders.leafletMod.TileLayerNs.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.tileLayer")
@js.native
object tileLayerNs extends js.Object {
  def provider(provider: String): Provider = js.native
  def provider(provider: String, options: StringDictionary[String]): Provider = js.native
  def provider(provider: String, options: TileLayerOptions): Provider = js.native
}

