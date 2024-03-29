package typings.lodash.fpMod

import typings.lodash.mod.CloneWithCustomizer
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashCloneWith extends StObject {
  
  def apply[T](customizer: __, value: T): LodashCloneWith1x2[T] = js.native
  def apply[T, TResult /* <: js.Object | String | Double | Boolean | Null */](customizer: CloneWithCustomizer[T, TResult]): LodashCloneWith1x1[T, TResult] = js.native
  def apply[T, TResult](customizer: CloneWithCustomizer[T, js.UndefOr[TResult]], value: T): TResult | T = js.native
}
