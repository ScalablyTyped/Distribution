package typings
package grahamUnderscoreScanLib.grahamUnderscoreScanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvexHullGrahamScan extends js.Object {
  def addPoint(x: scala.Double, y: scala.Double): scala.Unit
  def getHull(): js.Array[grahamUnderscoreScanLib.Anon_X]
}

object ConvexHullGrahamScan {
  @scala.inline
  def apply(
    addPoint: (scala.Double, scala.Double) => scala.Unit,
    getHull: () => js.Array[grahamUnderscoreScanLib.Anon_X]
  ): ConvexHullGrahamScan = {
    val __obj = js.Dynamic.literal(addPoint = js.Any.fromFunction2(addPoint), getHull = js.Any.fromFunction0(getHull))
  
    __obj.asInstanceOf[ConvexHullGrahamScan]
  }
}

