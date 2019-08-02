package typings.atMapboxMapboxDashSdk.servicesTilequeryMod

import typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileQueryService extends js.Object {
  /**
    * Get a static map image..
    * @param request
    */
  def listFeatures(request: TileQueryRequest): MapiRequest
}

object TileQueryService {
  @scala.inline
  def apply(listFeatures: TileQueryRequest => MapiRequest): TileQueryService = {
    val __obj = js.Dynamic.literal(listFeatures = js.Any.fromFunction1(listFeatures))
  
    __obj.asInstanceOf[TileQueryService]
  }
}

