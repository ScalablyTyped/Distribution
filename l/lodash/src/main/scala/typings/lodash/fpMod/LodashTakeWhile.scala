package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashTakeWhile extends StObject {
  
  def apply[T](predicate: ValueIteratee[T]): LodashTakeWhile1x1[T] = js.native
  def apply[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def apply[T](predicate: __): LodashTakeWhile1x2[T] = js.native
  def apply[T](predicate: __, array: List[T]): LodashTakeWhile1x2[T] = js.native
}
