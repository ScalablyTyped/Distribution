package typings.lodash.fpMod

import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashSumBy extends StObject {
  
  def apply[T](iteratee: String): LodashSumBy1x1[T] = js.native
  def apply[T](iteratee: String, collection: typings.lodash.mod.List[T]): Double = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Double]): LodashSumBy1x1[T] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Double], collection: typings.lodash.mod.List[T]): Double = js.native
  def apply[T](iteratee: __): LodashSumBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: typings.lodash.mod.List[T]): LodashSumBy1x2[T] = js.native
}
