package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.List
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashCountBy extends js.Object {
  
  def apply[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[Double] = js.native
  def apply[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): Dictionary[Double] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): Dictionary[Double] = js.native
  def apply[T](iteratee: __): LodashCountBy1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashCountBy2x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashCountBy1x2[T] = js.native
}
