package typings.lodash.fpMod

import typings.lodash.lodashMod.ValueIterateeCustom
import typings.lodash.lodashMod.ValueIteratorTypeGuard
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindLastFrom3x4[T] extends js.Object {
  def apply(
    predicate: ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ]
  ): LodashFindLastFrom4x5[T] = js.native
  def apply(
    predicate: ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: Double
  ): js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply(predicate: __, fromIndex: Double): LodashFindLastFrom3x6[T] = js.native
  def apply[S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFindLastFrom3x5[S] = js.native
  def apply[S /* <: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double
  ): js.UndefOr[S] = js.native
}

