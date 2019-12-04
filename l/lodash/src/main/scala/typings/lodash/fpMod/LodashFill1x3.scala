package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFill1x3 extends js.Object {
  def apply[T](value: T): LodashFill1x7[T] = js.native
  def apply[U](value: __): LodashFill1x11[U] = js.native
  def apply[U](value: __, array: js.Array[U]): LodashFill1x11[U] = js.native
  def apply[U](value: __, array: List[U]): LodashFill2x11[U] = js.native
  def apply[T, U](value: T, array: js.Array[U]): js.Array[T | U] = js.native
  def apply[T, U](value: T, array: List[U]): List[T | U] = js.native
}

