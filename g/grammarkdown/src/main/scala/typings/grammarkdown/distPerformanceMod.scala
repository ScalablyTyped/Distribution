package typings.grammarkdown

import typings.std.ReadonlyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/performance", JSImport.Namespace)
@js.native
object distPerformanceMod extends js.Object {
  def getDuration(measureName: String): Double = js.native
  def getMark(markName: String): Double = js.native
  def getMarks(): ReadonlyMap[String, Double] = js.native
  def getMeasures(): ReadonlyMap[String, Double] = js.native
  def mark(markName: String): Unit = js.native
  def measure(measureName: String): Unit = js.native
  def measure(measureName: String, startMark: String): Unit = js.native
  def measure(measureName: String, startMark: String, endMark: String): Unit = js.native
  def reset(): Unit = js.native
}

