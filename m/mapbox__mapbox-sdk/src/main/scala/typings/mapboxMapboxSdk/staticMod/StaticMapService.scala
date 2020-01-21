package typings.mapboxMapboxSdk.staticMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticMapService extends js.Object {
  /**
    * Get a static map image..
    * @param request
    */
  def getStaticImage(request: StaticMapRequest): MapiRequest
}

object StaticMapService {
  @scala.inline
  def apply(getStaticImage: StaticMapRequest => MapiRequest): StaticMapService = {
    val __obj = js.Dynamic.literal(getStaticImage = js.Any.fromFunction1(getStaticImage))
  
    __obj.asInstanceOf[StaticMapService]
  }
}

