package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashForEachRight extends StObject {
  
  def apply[T](iteratee: js.Function1[/* value */ T, Any]): LodashForEachRight1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    collection: T
  ): T = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Any], collection: js.Array[T]): js.Array[T] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Any], collection: List[T]): List[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashForEachRight6x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashForEachRight6x2[T] = js.native
  def apply[T](iteratee: __, collection: js.Array[T]): LodashForEachRight1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashForEachRight2x2[T] = js.native
  def apply[T, TList /* <: js.UndefOr[List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Null & TList): TList = js.native
  def apply[T, TList /* <: js.UndefOr[List[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Unit & TList): TList = js.native
  def apply[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: Unit & TArray): LodashForEachRight4x2[T, TArray] = js.native
  def apply[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: Null & TArray): LodashForEachRight4x2[T, TArray] = js.native
}
