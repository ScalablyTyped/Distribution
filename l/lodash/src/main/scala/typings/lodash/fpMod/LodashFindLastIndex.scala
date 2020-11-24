package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.ValueIterateeCustom
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFindLastIndex extends js.Object {
  
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): Double = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], array: List[T]): Double = js.native
  def apply[T](predicate: __): LodashFindLastIndex1x2[T] = js.native
  def apply[T](predicate: __, array: List[T]): LodashFindLastIndex1x2[T] = js.native
}
