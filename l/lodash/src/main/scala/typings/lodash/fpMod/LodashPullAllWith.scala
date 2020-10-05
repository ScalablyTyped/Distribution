package typings.lodash.fpMod

import typings.lodash.mod.Comparator
import typings.lodash.mod.List
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPullAllWith extends LodashConvertible {
  def apply[T](comparator: Comparator[T]): LodashPullAllWith1x1[T] = js.native
  def apply[T](comparator: Comparator[T], values: List[T]): LodashPullAllWith1x3[T] = js.native
  def apply[T](comparator: Comparator[T], values: List[T], array: js.Array[T]): js.Array[T] = js.native
  def apply[T](comparator: Comparator[T], values: List[T], array: List[T]): List[T] = js.native
  def apply[T](comparator: Comparator[T], values: __, array: js.Array[T]): LodashPullAllWith1x5[T] = js.native
  def apply[T](comparator: Comparator[T], values: __, array: List[T]): LodashPullAllWith2x5[T] = js.native
  def apply[T2](comparator: __, values: List[T2]): LodashPullAllWith3x2[T2] = js.native
  def apply[T](comparator: __, values: List[T], array: js.Array[T]): LodashPullAllWith1x6[T] = js.native
  def apply[T](comparator: __, values: List[T], array: List[T]): LodashPullAllWith2x6[T] = js.native
  def apply[T](comparator: __, values: __, array: js.Array[T]): LodashPullAllWith1x4[T] = js.native
  def apply[T1](comparator: __, values: __, array: List[T1]): LodashPullAllWith4x4[T1] = js.native
}

