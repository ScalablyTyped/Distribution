package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPull extends js.Object {
  def apply[T](values: T): LodashPull1x1[T] = js.native
  def apply[T](values: T, array: js.Array[T]): js.Array[T] = js.native
  def apply[T](values: T, array: List[T]): List[T] = js.native
  def apply[T](values: __, array: js.Array[T]): LodashPull1x2[T] = js.native
  def apply[T](values: __, array: List[T]): LodashPull2x2[T] = js.native
}

