package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashUnzipWith extends StObject {
  
  def apply[T](iteratee: __): LodashUnzipWith1x2[T] = js.native
  def apply[T](iteratee: __, array: List[List[T]]): LodashUnzipWith1x2[T] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult]): js.Array[TResult] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult], array: List[List[T]]): js.Array[TResult] = js.native
}
