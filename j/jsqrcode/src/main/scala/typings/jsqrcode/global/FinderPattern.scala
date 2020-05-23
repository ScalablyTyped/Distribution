package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FinderPattern")
@js.native
class FinderPattern protected ()
  extends typings.jsqrcode.FinderPattern {
  def this(posX: Double, posY: Double, estimatedModuleSize: Double) = this()
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val EstimatedModuleSize: Double = js.native
  /* CompleteClass */
  override val X: Double = js.native
  /* CompleteClass */
  override val Y: Double = js.native
  /* CompleteClass */
  override var count: Double = js.native
  /* CompleteClass */
  override var estimatedModuleSize: Double = js.native
  /* CompleteClass */
  override var x: Double = js.native
  /* CompleteClass */
  override var y: Double = js.native
  /* CompleteClass */
  override def aboutEquals(moduleSize: Double, i: Double, j: Double): Boolean = js.native
  /* CompleteClass */
  override def incrementCount(): Unit = js.native
}

