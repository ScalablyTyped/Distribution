package typings.mapboxMapboxSdk.geocodingMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeService extends js.Object {
  def forwardGeocode(request: GeocodeRequest): MapiRequest
  def reverseGeocode(request: GeocodeRequest): MapiRequest
}

object GeocodeService {
  @scala.inline
  def apply(forwardGeocode: GeocodeRequest => MapiRequest, reverseGeocode: GeocodeRequest => MapiRequest): GeocodeService = {
    val __obj = js.Dynamic.literal(forwardGeocode = js.Any.fromFunction1(forwardGeocode), reverseGeocode = js.Any.fromFunction1(reverseGeocode))
    __obj.asInstanceOf[GeocodeService]
  }
}

