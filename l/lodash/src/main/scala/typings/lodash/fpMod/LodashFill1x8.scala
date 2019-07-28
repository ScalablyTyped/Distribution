package typings.lodash.fpMod

import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFill1x8[U] extends js.Object {
  def apply(start: Double): LodashFill1x9[U] = js.native
  def apply(start: Double, end: Double): LodashFill1x11[U] = js.native
  def apply(start: __, end: Double): LodashFill1x10[U] = js.native
  def apply[T](start: Double, end: Double, value: T): js.Array[T | U] = js.native
  def apply[T](start: Double, end: __, value: T): LodashFill1x13[T, U] = js.native
  def apply[T](start: __, end: Double, value: T): LodashFill1x14[T, U] = js.native
  def apply[T](start: __, end: __, value: T): LodashFill1x12[T, U] = js.native
}

