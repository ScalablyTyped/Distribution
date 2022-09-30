package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashCountBy extends StObject {
  
  def apply[T](iteratee: ValueIteratee[T]): LodashCountBy1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): Dictionary[Double] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: typings.lodash.mod.List[T]): Dictionary[Double] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashCountBy2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashCountBy2x2[T] = js.native
  def apply[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashCountBy1x2[T] = js.native
}
