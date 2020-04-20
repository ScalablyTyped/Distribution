package typings.mapboxMapboxSdk.mapMatchingMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMatchingService extends js.Object {
  def getMatching(request: MapMatchingRequest): MapiRequest
}

object MapMatchingService {
  @scala.inline
  def apply(getMatching: MapMatchingRequest => MapiRequest): MapMatchingService = {
    val __obj = js.Dynamic.literal(getMatching = js.Any.fromFunction1(getMatching))
    __obj.asInstanceOf[MapMatchingService]
  }
}

