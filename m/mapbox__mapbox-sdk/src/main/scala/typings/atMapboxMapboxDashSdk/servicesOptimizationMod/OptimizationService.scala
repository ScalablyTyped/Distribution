package typings.atMapboxMapboxDashSdk.servicesOptimizationMod

import typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizationService extends js.Object {
  def getContours(config: OptimizationRequest): MapiRequest
}

object OptimizationService {
  @scala.inline
  def apply(getContours: OptimizationRequest => MapiRequest): OptimizationService = {
    val __obj = js.Dynamic.literal(getContours = js.Any.fromFunction1(getContours))
  
    __obj.asInstanceOf[OptimizationService]
  }
}

