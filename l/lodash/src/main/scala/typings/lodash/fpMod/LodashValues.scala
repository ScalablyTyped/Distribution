package typings.lodash.fpMod

import typings.lodash.lodashMod.Dictionary
import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.NumericDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashValues extends js.Object {
  def apply(`object`: js.Any): js.Array[_] = js.native
  def apply[T /* <: js.Object */](): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T /* <: js.Object */](`object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](`object`: Dictionary[T]): js.Array[T] = js.native
  def apply[T](`object`: List[T]): js.Array[T] = js.native
  def apply[T](`object`: NumericDictionary[T]): js.Array[T] = js.native
}

