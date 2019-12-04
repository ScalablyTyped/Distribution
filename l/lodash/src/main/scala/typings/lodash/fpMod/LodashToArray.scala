package typings.lodash.fpMod

import typings.lodash.lodashMod.Dictionary
import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.NumericDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashToArray extends js.Object {
  def apply(): js.Array[_] = js.native
  def apply[T](value: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](value: Dictionary[T]): js.Array[T] = js.native
  def apply[T](value: List[T]): js.Array[T] = js.native
  def apply[T](value: NumericDictionary[T]): js.Array[T] = js.native
}

