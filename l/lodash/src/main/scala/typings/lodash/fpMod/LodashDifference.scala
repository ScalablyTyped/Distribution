package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashDifference extends js.Object {
  
  def apply[T](): LodashDifference1x1[T] = js.native
  def apply[T](array: js.UndefOr[scala.Nothing], values: List[T]): js.Array[T] = js.native
  def apply[T](array: Null, values: List[T]): js.Array[T] = js.native
  def apply[T](array: List[T]): LodashDifference1x1[T] = js.native
  def apply[T](array: List[T], values: List[T]): js.Array[T] = js.native
  def apply[T](array: __, values: List[T]): LodashDifference1x2[T] = js.native
}
