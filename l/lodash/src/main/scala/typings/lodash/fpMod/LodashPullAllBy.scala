package typings.lodash.fpMod

import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPullAllBy extends StObject {
  
  def apply[T](iteratee: ValueIteratee[T]): LodashPullAllBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: typings.lodash.mod.List[T]): LodashPullAllBy1x3[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: typings.lodash.mod.List[T], array: js.Array[T]): js.Array[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: typings.lodash.mod.List[T], array: typings.lodash.mod.List[T]): typings.lodash.mod.List[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: __, array: js.Array[T]): LodashPullAllBy1x5[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], values: __, array: typings.lodash.mod.List[T]): LodashPullAllBy2x5[T] = js.native
  def apply[T](iteratee: __, values: typings.lodash.mod.List[T]): LodashPullAllBy1x2[T] = js.native
  def apply[T](iteratee: __, values: typings.lodash.mod.List[T], array: js.Array[T]): LodashPullAllBy1x6[T] = js.native
  def apply[T](iteratee: __, values: typings.lodash.mod.List[T], array: typings.lodash.mod.List[T]): LodashPullAllBy2x6[T] = js.native
  def apply[T](iteratee: __, values: __, array: js.Array[T]): LodashPullAllBy1x4[T] = js.native
  def apply[T](iteratee: __, values: __, array: typings.lodash.mod.List[T]): LodashPullAllBy2x4[T] = js.native
}
