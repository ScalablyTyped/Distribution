package typings.grahamScan.mod

import typings.grahamScan.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graham_scan", JSImport.Namespace)
@js.native
class ^ () extends ConvexHullGrahamScan {
  /* CompleteClass */
  override def addPoint(x: Double, y: Double): Unit = js.native
  /* CompleteClass */
  override def getHull(): js.Array[X] = js.native
}

