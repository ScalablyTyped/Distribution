package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.Many
import typings.lodash.lodashMod.NotVoid
import typings.lodash.lodashMod.ValueIteratee
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy1x2 extends js.Object {
  def apply[T](iteratees: Many[(js.Function1[/* value */ T, NotVoid]) | ValueIteratee[T]]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]) | (ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ])
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](iteratees: Many[(js.Function1[/* value */ T, NotVoid]) | ValueIteratee[T]], collection: List[T]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __): LodashOrderBy3x6[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, collection: T): LodashOrderBy3x6[T] = js.native
  def apply[T](iteratees: __, collection: List[T]): LodashOrderBy1x6[T] = js.native
}

