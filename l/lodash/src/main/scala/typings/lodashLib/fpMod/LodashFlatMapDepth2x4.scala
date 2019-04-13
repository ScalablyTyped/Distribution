package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFlatMapDepth2x4[T] extends js.Object {
  def apply(iteratee: lodashLib.lodashMod.__, depth: scala.Double): LodashFlatMapDepth2x6[T] = js.native
  def apply[TResult](
    iteratee: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LodashFlatMapDepth2x5[TResult] = js.native
  def apply[TResult](
    iteratee: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: scala.Double
  ): js.Array[TResult] = js.native
}

