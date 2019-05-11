package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashForOwn extends js.Object {
  def apply[T](
    iteratee: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ]
  ): js.UndefOr[T | scala.Null] = js.native
  def apply[T](
    iteratee: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    `object`: T
  ): js.UndefOr[T | scala.Null] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__): LodashForOwn2x2[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__, `object`: T): LodashForOwn2x2[T] = js.native
}

