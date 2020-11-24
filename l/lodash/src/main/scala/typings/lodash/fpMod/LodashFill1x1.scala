package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFill1x1 extends js.Object {
  
  def apply(end: Double): LodashFill1x3 = js.native
  def apply[T](end: Double, value: T): LodashFill1x7[T] = js.native
  def apply[U](end: Double, value: __): LodashFill2x11[U] = js.native
  def apply[U](end: Double, value: __, array: js.Array[U]): LodashFill1x11[U] = js.native
  def apply[U](end: Double, value: __, array: List[U]): LodashFill2x11[U] = js.native
  def apply[T](end: __, value: T): LodashFill1x5[T] = js.native
  def apply[U](end: __, value: __): LodashFill1x9[U] = js.native
  def apply[U](end: __, value: __, array: js.Array[U]): LodashFill1x9[U] = js.native
  def apply[U](end: __, value: __, array: List[U]): LodashFill2x9[U] = js.native
  def apply[T, U](end: Double, value: T, array: js.Array[U]): js.Array[T | U] = js.native
  def apply[T, U](end: Double, value: T, array: List[U]): List[T | U] = js.native
  def apply[T, U](end: __, value: T, array: js.Array[U]): LodashFill1x13[T, U] = js.native
  def apply[T, U](end: __, value: T, array: List[U]): LodashFill2x13[T, U] = js.native
}
