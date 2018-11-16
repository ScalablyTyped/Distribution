package typings
package heremapsLib.HNs.mapNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * An ImageTileProvider uses network service to provide bitmap images as tiles.
             * @property tileSize {number} - Size of a tile image supported by the provider
             */
@JSGlobal("H.map.provider.ImageTileProvider")
@js.native
class ImageTileProvider protected () extends RemoteTileProvider {
  /**
                   * Constructor
                   * @param options {H.map.provider.ImageTileProvider.Options} - configuration for tile provider
                   */
  def this(options: heremapsLib.HNs.mapNs.providerNs.ImageTileProviderNs.Options) = this()
  var tileSize: scala.Double = js.native
}

