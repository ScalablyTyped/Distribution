package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFlatMapDepth extends js.Object {
  def apply(iteratee: java.lang.String): LodashFlatMapDepth3x1 = js.native
  def apply(iteratee: java.lang.String, depth: lodashLib.lodashMod.__): LodashFlatMapDepth3x5 = js.native
  def apply(iteratee: java.lang.String, depth: lodashLib.lodashMod.__, collection: js.Object): LodashFlatMapDepth3x5 = js.native
  def apply(iteratee: java.lang.String, depth: scala.Double): js.Array[_] = js.native
  def apply(iteratee: java.lang.String, depth: scala.Double, collection: js.Object): js.Array[_] = js.native
  def apply(iteratee: js.Object): LodashFlatMapDepth4x1 = js.native
  def apply(iteratee: js.Object, depth: lodashLib.lodashMod.__): LodashFlatMapDepth4x5 = js.native
  def apply(iteratee: js.Object, depth: lodashLib.lodashMod.__, collection: js.Object): LodashFlatMapDepth4x5 = js.native
  def apply(iteratee: js.Object, depth: scala.Double): js.Array[scala.Boolean] = js.native
  def apply(iteratee: js.Object, depth: scala.Double, collection: js.Object): js.Array[scala.Boolean] = js.native
  def apply(iteratee: lodashLib.lodashMod.__, depth: lodashLib.lodashMod.__): LodashFlatMapDepth3x4 = js.native
  def apply(iteratee: lodashLib.lodashMod.__, depth: lodashLib.lodashMod.__, collection: js.Object): LodashFlatMapDepth3x4 = js.native
  def apply(iteratee: lodashLib.lodashMod.__, depth: scala.Double): LodashFlatMapDepth1x2 = js.native
  def apply(iteratee: lodashLib.lodashMod.__, depth: scala.Double, collection: js.Object): LodashFlatMapDepth3x6 = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.__, depth: lodashLib.lodashMod.__, collection: T): LodashFlatMapDepth2x4[T] = js.native
  def apply[T](
    iteratee: lodashLib.lodashMod.__,
    depth: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashFlatMapDepth1x4[T] = js.native
  def apply[T /* <: js.Object */](iteratee: lodashLib.lodashMod.__, depth: scala.Double, collection: T): LodashFlatMapDepth2x6[T] = js.native
  def apply[T](iteratee: lodashLib.lodashMod.__, depth: scala.Double, collection: lodashLib.lodashMod.List[T]): LodashFlatMapDepth1x6[T] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[
      /* value */ T, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LodashFlatMapDepth1x1[T, TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[
      /* value */ T, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: lodashLib.lodashMod.__
  ): LodashFlatMapDepth1x5[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: lodashLib.lodashMod.__,
    collection: T
  ): LodashFlatMapDepth2x5[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[
      /* value */ T, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: lodashLib.lodashMod.__,
    collection: lodashLib.lodashMod.List[T]
  ): LodashFlatMapDepth1x5[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[
      /* value */ T, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: scala.Double
  ): js.Array[TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: scala.Double,
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](
    iteratee: js.Function1[
      /* value */ T, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: scala.Double,
    collection: lodashLib.lodashMod.List[T]
  ): js.Array[TResult] = js.native
}

