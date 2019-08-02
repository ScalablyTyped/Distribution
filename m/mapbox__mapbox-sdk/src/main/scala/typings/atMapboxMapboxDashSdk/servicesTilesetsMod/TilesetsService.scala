package typings.atMapboxMapboxDashSdk.servicesTilesetsMod

import typings.atMapboxMapboxDashSdk.Anon_OwnerIdString
import typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TilesetsService extends js.Object {
  def listTilesets(config: Anon_OwnerIdString): MapiRequest
}

object TilesetsService {
  @scala.inline
  def apply(listTilesets: Anon_OwnerIdString => MapiRequest): TilesetsService = {
    val __obj = js.Dynamic.literal(listTilesets = js.Any.fromFunction1(listTilesets))
  
    __obj.asInstanceOf[TilesetsService]
  }
}

