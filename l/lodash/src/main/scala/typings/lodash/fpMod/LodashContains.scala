package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.List
import typings.lodash.mod.NumericDictionary
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashContains extends LodashConvertible {
  def apply[T](target: T): Boolean = js.native
  def apply[T](target: T, collection: Dictionary[T]): Boolean = js.native
  def apply[T](target: T, collection: List[T]): Boolean = js.native
  def apply[T](target: T, collection: NumericDictionary[T]): Boolean = js.native
  def apply[T](target: __): LodashContains1x2[T] = js.native
  def apply[T](target: __, collection: Dictionary[T]): LodashContains1x2[T] = js.native
  def apply[T](target: __, collection: List[T]): LodashContains1x2[T] = js.native
  def apply[T](target: __, collection: NumericDictionary[T]): LodashContains1x2[T] = js.native
}

