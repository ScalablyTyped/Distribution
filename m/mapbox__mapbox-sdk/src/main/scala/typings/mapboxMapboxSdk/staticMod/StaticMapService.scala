package typings.mapboxMapboxSdk.staticMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticMapService extends js.Object {
  /**
    * Get a static map image..
    * @param request
    */
  def getStaticImage(request: StaticMapRequest): MapiRequest = js.native
}

object StaticMapService {
  @scala.inline
  def apply(getStaticImage: StaticMapRequest => MapiRequest): StaticMapService = {
    val __obj = js.Dynamic.literal(getStaticImage = js.Any.fromFunction1(getStaticImage))
    __obj.asInstanceOf[StaticMapService]
  }
  @scala.inline
  implicit class StaticMapServiceOps[Self <: StaticMapService] (val x: Self) extends AnyVal {
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
    def setGetStaticImage(value: StaticMapRequest => MapiRequest): Self = this.set("getStaticImage", js.Any.fromFunction1(value))
  }
  
}

