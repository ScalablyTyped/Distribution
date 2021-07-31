package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashReduceRight1x1[T, TResult] extends StObject {
  
  def apply(accumulator: TResult): LodashReduceRight1x3[T, TResult] = js.native
  def apply(accumulator: TResult, collection: js.Array[T]): TResult = js.native
  def apply(accumulator: TResult, collection: List[T]): TResult = js.native
  def apply(accumulator: __): LodashReduceRight1x5[TResult] = js.native
  def apply(accumulator: __, collection: js.Array[T]): LodashReduceRight1x5[TResult] = js.native
  def apply(accumulator: __, collection: List[T]): LodashReduceRight2x5[TResult] = js.native
}
