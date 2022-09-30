package typings.lodash.fpMod

import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashDifferenceBy extends StObject {
  
  def apply[T1](iteratee: __): LodashDifferenceBy1x2[T1] = js.native
  def apply[T1](iteratee: __, array: typings.lodash.mod.List[T1]): LodashDifferenceBy1x2[T1] = js.native
  def apply[T2](iteratee: __, array: __, values: typings.lodash.mod.List[T2]): LodashDifferenceBy1x4[T2] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashDifferenceBy1x3[T1, T2] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: Null, values: typings.lodash.mod.List[T2]): js.Array[T1] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: Unit, values: typings.lodash.mod.List[T2]): js.Array[T1] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: typings.lodash.mod.List[T1]): LodashDifferenceBy1x3[T1, T2] = js.native
  def apply[T1, T2](
    iteratee: ValueIteratee[T1 | T2],
    array: typings.lodash.mod.List[T1],
    values: typings.lodash.mod.List[T2]
  ): js.Array[T1] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: __, values: typings.lodash.mod.List[T2]): LodashDifferenceBy1x5[T1] = js.native
  def apply[T1, T2](iteratee: __, array: Null, values: typings.lodash.mod.List[T2]): LodashDifferenceBy1x6[T1, T2] = js.native
  def apply[T1, T2](iteratee: __, array: Unit, values: typings.lodash.mod.List[T2]): LodashDifferenceBy1x6[T1, T2] = js.native
  def apply[T1, T2](iteratee: __, array: typings.lodash.mod.List[T1], values: typings.lodash.mod.List[T2]): LodashDifferenceBy1x6[T1, T2] = js.native
}
