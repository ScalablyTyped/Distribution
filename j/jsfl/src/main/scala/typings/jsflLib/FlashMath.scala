package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashMath extends js.Object {
  /** Method; performs a matrix concatenation and returns the result. */
  def concatMatrix(mat1: FlashMatrix, mat2: FlashMatrix): FlashMatrix
  /** A Matrix object that is the inverse of the original matrix. */
  def invertMatrix(mat: FlashMatrix): FlashMatrix
  /** A floating-point value that represents the distance between the points. */
  def pointDistance(pt1: FlashPoint, pt2: FlashPoint): scala.Double
}

object FlashMath {
  @scala.inline
  def apply(
    concatMatrix: js.Function2[FlashMatrix, FlashMatrix, FlashMatrix],
    invertMatrix: js.Function1[FlashMatrix, FlashMatrix],
    pointDistance: js.Function2[FlashPoint, FlashPoint, scala.Double]
  ): FlashMath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("concatMatrix")(concatMatrix)
    __obj.updateDynamic("invertMatrix")(invertMatrix)
    __obj.updateDynamic("pointDistance")(pointDistance)
    __obj.asInstanceOf[FlashMath]
  }
}

