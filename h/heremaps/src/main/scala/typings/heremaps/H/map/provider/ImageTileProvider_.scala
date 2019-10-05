package typings.heremaps.H.map.provider

import typings.heremaps.H.map.provider.ImageTileProvider.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ImageTileProvider uses network service to provide bitmap images as tiles.
  * @property tileSize {number} - Size of a tile image supported by the provider
  */
@JSGlobal("H.map.provider.ImageTileProvider")
@js.native
class ImageTileProvider_ protected () extends RemoteTileProvider {
  /**
    * Constructor
    * @param options {H.map.provider.ImageTileProvider.Options} - configuration for tile provider
    */
  def this(options: Options) = this()
  var tileSize: Double = js.native
}

