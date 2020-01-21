package typings.lodash.fpMod

import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashClamp extends js.Object {
  def apply(lower: Double): LodashClamp1x1 = js.native
  def apply(lower: Double, upper: Double): LodashClamp1x3 = js.native
  def apply(lower: Double, upper: Double, number: Double): Double = js.native
  def apply(lower: Double, upper: __, number: Double): LodashClamp1x5 = js.native
  def apply(lower: __, upper: Double): LodashClamp1x2 = js.native
  def apply(lower: __, upper: Double, number: Double): LodashClamp1x6 = js.native
  def apply(lower: __, upper: __, number: Double): LodashClamp1x4 = js.native
}

