package typings.mapboxMapboxSdk.tilesetsMod

import typings.mapboxMapboxSdk.AnonOwnerIdString
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TilesetsService extends js.Object {
  def listTilesets(config: AnonOwnerIdString): MapiRequest
}

object TilesetsService {
  @scala.inline
  def apply(listTilesets: AnonOwnerIdString => MapiRequest): TilesetsService = {
    val __obj = js.Dynamic.literal(listTilesets = js.Any.fromFunction1(listTilesets))
    __obj.asInstanceOf[TilesetsService]
  }
}

