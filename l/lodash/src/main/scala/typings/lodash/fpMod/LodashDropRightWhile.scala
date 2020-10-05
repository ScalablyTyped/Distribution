package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashDropRightWhile extends LodashConvertible {
  def apply[T](predicate: ValueIteratee[T]): js.Array[T] = js.native
  def apply[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def apply[T](predicate: __): LodashDropRightWhile1x2[T] = js.native
  def apply[T](predicate: __, array: List[T]): LodashDropRightWhile1x2[T] = js.native
}

