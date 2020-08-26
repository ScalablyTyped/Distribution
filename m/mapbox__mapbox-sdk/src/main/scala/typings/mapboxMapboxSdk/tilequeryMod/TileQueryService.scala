package typings.mapboxMapboxSdk.tilequeryMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileQueryService extends js.Object {
  /**
    * Get a static map image..
    * @param request
    */
  def listFeatures(request: TileQueryRequest): MapiRequest = js.native
}

object TileQueryService {
  @scala.inline
  def apply(listFeatures: TileQueryRequest => MapiRequest): TileQueryService = {
    val __obj = js.Dynamic.literal(listFeatures = js.Any.fromFunction1(listFeatures))
    __obj.asInstanceOf[TileQueryService]
  }
  @scala.inline
  implicit class TileQueryServiceOps[Self <: TileQueryService] (val x: Self) extends AnyVal {
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
    def setListFeatures(value: TileQueryRequest => MapiRequest): Self = this.set("listFeatures", js.Any.fromFunction1(value))
  }
  
}

