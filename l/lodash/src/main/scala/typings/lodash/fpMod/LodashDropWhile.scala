package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashDropWhile extends js.Object {
  
  def apply[T](predicate: ValueIteratee[T]): LodashDropWhile1x1[T] = js.native
  def apply[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def apply[T](predicate: __): LodashDropWhile1x2[T] = js.native
  def apply[T](predicate: __, array: List[T]): LodashDropWhile1x2[T] = js.native
}
