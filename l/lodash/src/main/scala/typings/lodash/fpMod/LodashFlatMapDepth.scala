package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.ListOfRecursiveArraysOrValues
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFlatMapDepth extends StObject {
  
  def apply(iteratee: String): LodashFlatMapDepth3x1 = js.native
  def apply(iteratee: String, depth: Double): LodashFlatMapDepth3x3 = js.native
  def apply(iteratee: String, depth: Double, collection: js.Object): js.Array[_] = js.native
  def apply(iteratee: String, depth: __): LodashFlatMapDepth3x5 = js.native
  def apply(iteratee: String, depth: __, collection: js.Object): LodashFlatMapDepth3x5 = js.native
  def apply(iteratee: js.Object): LodashFlatMapDepth4x1 = js.native
  def apply(iteratee: js.Object, depth: Double): LodashFlatMapDepth4x3 = js.native
  def apply(iteratee: js.Object, depth: Double, collection: js.Object): js.Array[Boolean] = js.native
  def apply(iteratee: js.Object, depth: __): LodashFlatMapDepth4x5 = js.native
  def apply(iteratee: js.Object, depth: __, collection: js.Object): LodashFlatMapDepth4x5 = js.native
  def apply(iteratee: __, depth: Double): LodashFlatMapDepth3x6 = js.native
  def apply(iteratee: __, depth: Double, collection: js.Object): LodashFlatMapDepth3x6 = js.native
  def apply(iteratee: __, depth: __): LodashFlatMapDepth3x4 = js.native
  def apply(iteratee: __, depth: __, collection: js.Object): LodashFlatMapDepth3x4 = js.native
  def apply[T /* <: js.Object */](iteratee: __, depth: Double, collection: T): LodashFlatMapDepth2x6[T] = js.native
  def apply[T](iteratee: __, depth: Double, collection: List[T]): LodashFlatMapDepth1x6[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, depth: __, collection: T): LodashFlatMapDepth2x4[T] = js.native
  def apply[T](iteratee: __, depth: __, collection: List[T]): LodashFlatMapDepth1x4[T] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult]): LodashFlatMapDepth1x1[T, TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): LodashFlatMapDepth1x3[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: Double,
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double,
    collection: List[T]
  ): js.Array[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: __
  ): LodashFlatMapDepth2x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: __,
    collection: T
  ): LodashFlatMapDepth2x5[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: __,
    collection: List[T]
  ): LodashFlatMapDepth1x5[TResult] = js.native
}
