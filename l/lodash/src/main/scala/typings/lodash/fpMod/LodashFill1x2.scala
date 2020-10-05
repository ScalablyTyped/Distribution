package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFill1x2 extends js.Object {
  def apply(start: Double): LodashFill1x3 = js.native
  def apply[T](start: Double, value: T): LodashFill1x7[T] = js.native
  def apply[U](start: Double, value: __): LodashFill1x11[U] = js.native
  def apply[U](start: Double, value: __, array: js.Array[U]): LodashFill1x11[U] = js.native
  def apply[U](start: Double, value: __, array: List[U]): LodashFill2x11[U] = js.native
  def apply[T](start: __, value: T): LodashFill1x6[T] = js.native
  def apply[U](start: __, value: __): LodashFill1x10[U] = js.native
  def apply[U](start: __, value: __, array: js.Array[U]): LodashFill1x10[U] = js.native
  def apply[U](start: __, value: __, array: List[U]): LodashFill2x10[U] = js.native
  def apply[T, U](start: Double, value: T, array: js.Array[U]): js.Array[T | U] = js.native
  def apply[T, U](start: Double, value: T, array: List[U]): List[T | U] = js.native
  def apply[T, U](start: __, value: T, array: js.Array[U]): LodashFill1x14[T, U] = js.native
  def apply[T, U](start: __, value: T, array: List[U]): LodashFill2x14[T, U] = js.native
}

