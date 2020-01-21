package typings.lodash.fpMod

import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashForOwn extends js.Object {
  def apply[T](iteratee: js.Function1[/* value */ T, _]): LodashForOwn1x1[T] = js.native
  def apply[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    `object`: T
  ): js.UndefOr[T | Null] = js.native
  def apply[T](iteratee: __): LodashForOwn2x2[T] = js.native
  def apply[T](iteratee: __, `object`: T): LodashForOwn1x2[T] = js.native
}

