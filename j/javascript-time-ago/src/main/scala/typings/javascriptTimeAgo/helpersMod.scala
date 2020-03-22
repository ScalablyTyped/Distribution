package typings.javascriptTimeAgo

import typings.javascriptTimeAgo.gradationMod.Gradation
import typings.javascriptTimeAgo.gradationMod.Unit
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-time-ago/gradation/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  val day: Double = js.native
  val hour: Double = js.native
  val minute: Double = js.native
  val month: Double = js.native
  val year: Double = js.native
  def getDate(value: Double): Date = js.native
  def getDate(value: Date): Date = js.native
  def getStep(gradation: js.Array[Gradation], unit: Unit): js.UndefOr[Gradation] = js.native
}

