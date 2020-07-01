package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashChunk extends LodashConvertible {
  def apply(size: Double): LodashChunk1x1 = js.native
  def apply[T](size: Double, array: List[T]): js.Array[js.Array[T]] = js.native
  def apply[T](size: __): LodashChunk1x2[T] = js.native
  def apply[T](size: __, array: List[T]): LodashChunk1x2[T] = js.native
}

