package typings.mapboxMapboxSdk.tilesetsMod

import typings.mapboxMapboxSdk.anon.OwnerIdString
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TilesetsService extends js.Object {
  def listTilesets(config: OwnerIdString): MapiRequest = js.native
}

object TilesetsService {
  @scala.inline
  def apply(listTilesets: OwnerIdString => MapiRequest): TilesetsService = {
    val __obj = js.Dynamic.literal(listTilesets = js.Any.fromFunction1(listTilesets))
    __obj.asInstanceOf[TilesetsService]
  }
  @scala.inline
  implicit class TilesetsServiceOps[Self <: TilesetsService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setListTilesets(value: OwnerIdString => MapiRequest): Self = this.set("listTilesets", js.Any.fromFunction1(value))
  }
  
}

