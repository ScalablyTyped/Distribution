package typings.mapboxMapboxSdk.optimizationMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimizationService extends js.Object {
  def getContours(config: OptimizationRequest): MapiRequest = js.native
}

object OptimizationService {
  @scala.inline
  def apply(getContours: OptimizationRequest => MapiRequest): OptimizationService = {
    val __obj = js.Dynamic.literal(getContours = js.Any.fromFunction1(getContours))
    __obj.asInstanceOf[OptimizationService]
  }
  @scala.inline
  implicit class OptimizationServiceOps[Self <: OptimizationService] (val x: Self) extends AnyVal {
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
    def setGetContours(value: OptimizationRequest => MapiRequest): Self = this.set("getContours", js.Any.fromFunction1(value))
  }
  
}

