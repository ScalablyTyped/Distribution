package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduce3x4[T] extends js.Object {
  def apply[TResult](
    callback: lodashLib.lodashMod.MemoIteratorCapped[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]
  ): LodashReduce3x5[TResult] = js.native
  def apply[TResult](
    callback: lodashLib.lodashMod.MemoIteratorCapped[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult
  ): TResult = js.native
  def apply[TResult](callback: lodashLib.lodashMod.__, accumulator: TResult): LodashReduce3x6[T, TResult] = js.native
}

