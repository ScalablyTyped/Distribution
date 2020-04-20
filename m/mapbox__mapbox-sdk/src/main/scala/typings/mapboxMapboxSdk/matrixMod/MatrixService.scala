package typings.mapboxMapboxSdk.matrixMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixService extends js.Object {
  /**
    * Get a duration and/or distance matrix showing travel times and distances between coordinates.
    * @param request
    */
  def getMatrix(request: MatrixRequest): MapiRequest
}

object MatrixService {
  @scala.inline
  def apply(getMatrix: MatrixRequest => MapiRequest): MatrixService = {
    val __obj = js.Dynamic.literal(getMatrix = js.Any.fromFunction1(getMatrix))
    __obj.asInstanceOf[MatrixService]
  }
}

