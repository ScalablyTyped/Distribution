package typings.leafletProviders.mod

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.TileLayerOptions
import typings.leafletProviders.mod.TileLayer_.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "tileLayer")
@js.native
object tileLayer extends js.Object {
  def provider(provider: String): Provider = js.native
  def provider(provider: String, options: StringDictionary[String]): Provider = js.native
  def provider(provider: String, options: TileLayerOptions): Provider = js.native
}

