package typings.lodash.fpMod

import typings.lodash.lodashMod.NumericDictionary
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPathOr5x2 extends js.Object {
  def apply[TDefault](defaultValue: TDefault): LodashPathOr5x3[TDefault] = js.native
  def apply[T](defaultValue: __): LodashPathOr5x6[T] = js.native
  def apply[T](defaultValue: __, `object`: NumericDictionary[T]): LodashPathOr5x6[T] = js.native
  def apply[T, TDefault](defaultValue: TDefault, `object`: NumericDictionary[T]): T | TDefault = js.native
}

