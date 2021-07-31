package typings.lodash.fpMod

import typings.lodash.mod.MemoIteratorCapped
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashReduce3x4[T] extends StObject {
  
  def apply[TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]
  ): LodashReduce3x5[TResult] = js.native
  def apply[TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult
  ): TResult = js.native
  def apply[TResult](callback: __, accumulator: TResult): LodashReduce3x6[T, TResult] = js.native
}
