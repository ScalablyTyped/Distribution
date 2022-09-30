package typings.lodash.fpMod

import typings.lodash.mod.Comparator2
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashDifferenceWith extends StObject {
  
  def apply[T1](comparator: __): LodashDifferenceWith1x2[T1] = js.native
  def apply[T1](comparator: __, array: typings.lodash.mod.List[T1]): LodashDifferenceWith1x2[T1] = js.native
  def apply[T2](comparator: __, array: __, values: typings.lodash.mod.List[T2]): LodashDifferenceWith1x4[T2] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2]): LodashDifferenceWith1x1[T1, T2] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2], array: Null, values: typings.lodash.mod.List[T2]): js.Array[T1] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2], array: Unit, values: typings.lodash.mod.List[T2]): js.Array[T1] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2], array: typings.lodash.mod.List[T1]): LodashDifferenceWith1x3[T1, T2] = js.native
  def apply[T1, T2](
    comparator: Comparator2[T1, T2],
    array: typings.lodash.mod.List[T1],
    values: typings.lodash.mod.List[T2]
  ): js.Array[T1] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2], array: __, values: typings.lodash.mod.List[T2]): LodashDifferenceWith1x5[T1] = js.native
  def apply[T1, T2](comparator: __, array: Null, values: typings.lodash.mod.List[T2]): LodashDifferenceWith1x6[T1, T2] = js.native
  def apply[T1, T2](comparator: __, array: Unit, values: typings.lodash.mod.List[T2]): LodashDifferenceWith1x6[T1, T2] = js.native
  def apply[T1, T2](comparator: __, array: typings.lodash.mod.List[T1], values: typings.lodash.mod.List[T2]): LodashDifferenceWith1x6[T1, T2] = js.native
}
