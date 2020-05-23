package typings.jsts.jsts.operation

import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.PrecisionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryGraphOperation extends js.Object {
  def getArgGeometry(i: Double): Geometry
  def setComputationPrecision(pm: PrecisionModel): Unit
}

object GeometryGraphOperation {
  @scala.inline
  def apply(getArgGeometry: Double => Geometry, setComputationPrecision: PrecisionModel => Unit): GeometryGraphOperation = {
    val __obj = js.Dynamic.literal(getArgGeometry = js.Any.fromFunction1(getArgGeometry), setComputationPrecision = js.Any.fromFunction1(setComputationPrecision))
    __obj.asInstanceOf[GeometryGraphOperation]
  }
}

