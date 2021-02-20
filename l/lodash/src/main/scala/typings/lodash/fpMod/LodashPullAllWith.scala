package typings.lodash.fpMod

import typings.lodash.mod.Comparator
import typings.lodash.mod.List
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPullAllWith extends StObject {
  
  def apply[T](comparator: Comparator[T]): LodashPullAllWith1x1[T] = js.native
  def apply[T](comparator: Comparator[T], values: List[T]): LodashPullAllWith1x3[T] = js.native
  def apply[T](comparator: Comparator[T], values: List[T], array: js.Array[T]): js.Array[T] = js.native
  def apply[T](comparator: Comparator[T], values: List[T], array: List[T]): List[T] = js.native
  def apply[T](comparator: Comparator[T], values: __, array: js.Array[T]): LodashPullAllWith1x5[T] = js.native
  def apply[T](comparator: Comparator[T], values: __, array: List[T]): LodashPullAllWith2x5[T] = js.native
  def apply[T](comparator: __, values: List[T]): LodashPullAllWith1x2[T] = js.native
  def apply[T](comparator: __, values: List[T], array: js.Array[T]): LodashPullAllWith1x6[T] = js.native
  def apply[T](comparator: __, values: List[T], array: List[T]): LodashPullAllWith2x6[T] = js.native
  def apply[T](comparator: __, values: __, array: js.Array[T]): LodashPullAllWith1x4[T] = js.native
  def apply[T](comparator: __, values: __, array: List[T]): LodashPullAllWith2x4[T] = js.native
}
