package typings.grahamScan.mod

import typings.grahamScan.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvexHullGrahamScan extends js.Object {
  def addPoint(x: Double, y: Double): Unit = js.native
  def getHull(): js.Array[X] = js.native
}

object ConvexHullGrahamScan {
  @scala.inline
  def apply(addPoint: (Double, Double) => Unit, getHull: () => js.Array[X]): ConvexHullGrahamScan = {
    val __obj = js.Dynamic.literal(addPoint = js.Any.fromFunction2(addPoint), getHull = js.Any.fromFunction0(getHull))
    __obj.asInstanceOf[ConvexHullGrahamScan]
  }
  @scala.inline
  implicit class ConvexHullGrahamScanOps[Self <: ConvexHullGrahamScan] (val x: Self) extends AnyVal {
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
    def setAddPoint(value: (Double, Double) => Unit): Self = this.set("addPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setGetHull(value: () => js.Array[X]): Self = this.set("getHull", js.Any.fromFunction0(value))
  }
  
}

