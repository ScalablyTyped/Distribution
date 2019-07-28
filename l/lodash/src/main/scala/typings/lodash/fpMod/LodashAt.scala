package typings.lodash.fpMod

import typings.lodash.lodashMod.Dictionary
import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.Many
import typings.lodash.lodashMod.NumericDictionary
import typings.lodash.lodashMod.PropertyPath
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashAt extends js.Object {
  def apply(props: PropertyPath): LodashAt1x1 = js.native
  def apply[T /* <: js.Object */](props: Many[String], `object`: T): js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any] = js.native
  def apply[T](props: PropertyPath, `object`: Dictionary[T]): js.Array[T] = js.native
  def apply[T](props: PropertyPath, `object`: List[T]): js.Array[T] = js.native
  def apply[T](props: PropertyPath, `object`: NumericDictionary[T]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](props: __): LodashAt2x2[T] = js.native
  def apply[T /* <: js.Object */](props: __, `object`: T): LodashAt2x2[T] = js.native
  def apply[T](props: __, `object`: Dictionary[T]): LodashAt1x2[T] = js.native
  def apply[T](props: __, `object`: List[T]): LodashAt1x2[T] = js.native
  def apply[T](props: __, `object`: NumericDictionary[T]): LodashAt1x2[T] = js.native
}

