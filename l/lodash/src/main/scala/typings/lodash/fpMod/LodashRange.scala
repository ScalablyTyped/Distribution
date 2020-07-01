package typings.lodash.fpMod

import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashRange extends LodashConvertible {
  def apply(start: Double): LodashRange1x1 = js.native
  def apply(start: Double, end: Double): js.Array[Double] = js.native
  def apply(start: __, end: Double): LodashRange1x2 = js.native
}

