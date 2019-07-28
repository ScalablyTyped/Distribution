package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FinderPattern")
@js.native
class FinderPattern protected () extends js.Object {
  def this(posX: Double, posY: Double, estimatedModuleSize: Double) = this()
  val Count: Double = js.native
  val EstimatedModuleSize: Double = js.native
  val X: Double = js.native
  val Y: Double = js.native
  var count: Double = js.native
  var estimatedModuleSize: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def aboutEquals(moduleSize: Double, i: Double, j: Double): Boolean = js.native
  def incrementCount(): Unit = js.native
}

