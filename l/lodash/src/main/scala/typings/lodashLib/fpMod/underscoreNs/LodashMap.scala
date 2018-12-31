package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMap extends js.Object {
  def apply(iteratee: java.lang.String): LodashMap5x1 = js.native
  def apply(iteratee: js.Object): LodashMap6x1 = js.native
  def apply[T](iteratee: java.lang.String, collection: lodashLib.lodashMod.underscoreNs.Dictionary[T]): js.Array[_] = js.native
  def apply[T](iteratee: java.lang.String, collection: lodashLib.lodashMod.underscoreNs.List[T]): js.Array[_] = js.native
  def apply[T](iteratee: java.lang.String, collection: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]): js.Array[_] = js.native
  def apply[T](iteratee: js.Object, collection: lodashLib.lodashMod.underscoreNs.Dictionary[T]): js.Array[scala.Boolean] = js.native
  def apply[T](iteratee: js.Object, collection: lodashLib.lodashMod.underscoreNs.List[T]): js.Array[scala.Boolean] = js.native
  def apply[T](iteratee: js.Object, collection: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]): js.Array[scala.Boolean] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.`__`): LodashMap2x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: T): LodashMap3x2[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.underscoreNs.`__`, collection: js.Array[T]): LodashMap1x2[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.Dictionary[T]
  ): LodashMap4x2[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): LodashMap2x2[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.underscoreNs.`__`,
    collection: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]
  ): LodashMap4x2[T] = js.native
  def apply[T, K /* <: java.lang.String */](iteratee: K): js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def apply[T, K /* <: java.lang.String */](iteratee: K, collection: lodashLib.lodashMod.underscoreNs.Dictionary[T]): js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def apply[T, K /* <: java.lang.String */](iteratee: K, collection: lodashLib.lodashMod.underscoreNs.List[T]): js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def apply[T, K /* <: java.lang.String */](iteratee: K, collection: lodashLib.lodashMod.underscoreNs.NumericDictionary[T]): js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* value */ T, TResult]): js.Array[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: js.Array[T]): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[/* value */ T, TResult],
    collection: lodashLib.lodashMod.underscoreNs.List[T]
  ): js.Array[TResult] = js.native
}

