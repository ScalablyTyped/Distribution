package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashForEach extends js.Object {
  def apply[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ]
  ): js.UndefOr[T | Null] = js.native
  def apply[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    collection: T
  ): js.UndefOr[T | Null] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, _], collection: js.Array[T]): js.Array[T] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, _], collection: List[T]): List[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashForEach6x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashForEach3x2[T] = js.native
  def apply[T](iteratee: __, collection: js.Array[T]): LodashForEach1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashForEach2x2[T] = js.native
}

