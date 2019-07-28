package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashMath extends js.Object {
  /** Method; performs a matrix concatenation and returns the result. */
  def concatMatrix(mat1: FlashMatrix, mat2: FlashMatrix): FlashMatrix
  /** A Matrix object that is the inverse of the original matrix. */
  def invertMatrix(mat: FlashMatrix): FlashMatrix
  /** A floating-point value that represents the distance between the points. */
  def pointDistance(pt1: FlashPoint, pt2: FlashPoint): Double
}

object FlashMath {
  @scala.inline
  def apply(
    concatMatrix: (FlashMatrix, FlashMatrix) => FlashMatrix,
    invertMatrix: FlashMatrix => FlashMatrix,
    pointDistance: (FlashPoint, FlashPoint) => Double
  ): FlashMath = {
    val __obj = js.Dynamic.literal(concatMatrix = js.Any.fromFunction2(concatMatrix), invertMatrix = js.Any.fromFunction1(invertMatrix), pointDistance = js.Any.fromFunction2(pointDistance))
  
    __obj.asInstanceOf[FlashMath]
  }
}

