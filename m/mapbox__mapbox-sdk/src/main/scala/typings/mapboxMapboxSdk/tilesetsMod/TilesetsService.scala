package typings.mapboxMapboxSdk.tilesetsMod

import typings.mapboxMapboxSdk.anon.OwnerIdString
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TilesetsService extends js.Object {
  def listTilesets(config: OwnerIdString): MapiRequest
}

object TilesetsService {
  @scala.inline
  def apply(listTilesets: OwnerIdString => MapiRequest): TilesetsService = {
    val __obj = js.Dynamic.literal(listTilesets = js.Any.fromFunction1(listTilesets))
    __obj.asInstanceOf[TilesetsService]
  }
}

