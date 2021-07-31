package typings.lodash.fpMod

import typings.lodash.mod.ValueIterateeCustom
import typings.lodash.mod.ValueIteratorTypeGuard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFind1x2[T] extends StObject {
  
  def apply(predicate: ValueIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
  def apply[S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
}
