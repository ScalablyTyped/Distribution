package typings.heremaps.HNs.mapNs.providerNs

import typings.heremaps.HNs.mapNs.AbstractMarker
import typings.heremaps.HNs.mapNs.providerNs.MarkerTileProviderNs.Options
import typings.heremaps.HNs.mathNs.BitMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A MarkerTileProvider uses network service to provide markers on tile basis.
  * @property requestTile {} - Request data on a tile basis
  * @property cancelTile {} - Cancels tile from being requested using x, y, z coordinates (column, row, zoom)
  * @property cancelTileByKey {} - Cancels tile from being requested using a tile-key
  * @property uri {string} - This provider's unique resource identifier, if not provided at construction time it defaults to provider's uid
  * @property min {number} - Minimum zoom level at which provider can serve data, set at construction time
  * @property max {number} - Maximum zoom level at which provider can server data, set at construction time
  * @property uid {string} - Provider instance unique identifier, generated at construction time
  */
@JSGlobal("H.map.provider.MarkerTileProvider")
@js.native
class MarkerTileProvider protected () extends RemoteTileProvider {
  /**
    * Constructor
    * @param options {H.map.provider.MarkerTileProvider.Options} - configuration for tile provider
    */
  def this(options: Options) = this()
  /**
    * To signal to this provider that a map object has been changed. The method marks tile, that contains that object as invalid and triggers dispatchUpdate()
    * @param marker {!H.map.AbstractMarker} - The map object to be invalidated
    * @param flags {H.math.BitMask} - The flags indicating the types of occurred changes
    */
  def invalidateObject(marker: AbstractMarker, flags: BitMask): Unit = js.native
  /**
    * Checks whether this provider is currently providing H.map.DomMarker map objects.
    * @returns {boolean}
    */
  def providesDomMarkers(): Boolean = js.native
}

