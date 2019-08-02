package typings.atMapboxMapboxDashSdk.servicesDirectionsMod

import typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsService extends js.Object {
  def getDirections(request: DirectionsRequest): MapiRequest
}

object DirectionsService {
  @scala.inline
  def apply(getDirections: DirectionsRequest => MapiRequest): DirectionsService = {
    val __obj = js.Dynamic.literal(getDirections = js.Any.fromFunction1(getDirections))
  
    __obj.asInstanceOf[DirectionsService]
  }
}

