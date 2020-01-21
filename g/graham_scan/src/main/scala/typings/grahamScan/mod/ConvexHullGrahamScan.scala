package typings.grahamScan.mod

import typings.grahamScan.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvexHullGrahamScan extends js.Object {
  def addPoint(x: Double, y: Double): Unit
  def getHull(): js.Array[AnonX]
}

object ConvexHullGrahamScan {
  @scala.inline
  def apply(addPoint: (Double, Double) => Unit, getHull: () => js.Array[AnonX]): ConvexHullGrahamScan = {
    val __obj = js.Dynamic.literal(addPoint = js.Any.fromFunction2(addPoint), getHull = js.Any.fromFunction0(getHull))
  
    __obj.asInstanceOf[ConvexHullGrahamScan]
  }
}

