package typings.jsts.jsts.operation.relate

import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.IntersectionMatrix
import typings.jsts.jsts.geom.PrecisionModel
import typings.jsts.jsts.operation.GeometryGraphOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelateOp extends GeometryGraphOperation {
  def getIntersectionMatrix(): IntersectionMatrix
}

object RelateOp {
  @scala.inline
  def apply(
    getArgGeometry: Double => Geometry,
    getIntersectionMatrix: () => IntersectionMatrix,
    setComputationPrecision: PrecisionModel => Unit
  ): RelateOp = {
    val __obj = js.Dynamic.literal(getArgGeometry = js.Any.fromFunction1(getArgGeometry), getIntersectionMatrix = js.Any.fromFunction0(getIntersectionMatrix), setComputationPrecision = js.Any.fromFunction1(setComputationPrecision))
    __obj.asInstanceOf[RelateOp]
  }
}

