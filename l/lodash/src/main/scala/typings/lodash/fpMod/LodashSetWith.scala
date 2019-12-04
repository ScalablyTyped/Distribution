package typings.lodash.fpMod

import typings.lodash.lodashMod.PropertyPath
import typings.lodash.lodashMod.SetWithCustomizer
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSetWith extends js.Object {
  def apply(customizer: __, path: PropertyPath): LodashSetWith1x2 = js.native
  def apply(customizer: __, path: PropertyPath, value: js.Any): LodashSetWith1x6 = js.native
  def apply(customizer: __, path: __, value: js.Any): LodashSetWith1x4 = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T]): LodashSetWith1x1[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath): LodashSetWith1x3[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, value: js.Any): LodashSetWith1x7[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, value: js.Any, `object`: T): T = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, value: __, `object`: T): LodashSetWith1x11[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, value: js.Any): LodashSetWith1x5[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, value: js.Any, `object`: T): LodashSetWith1x13[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, value: __, `object`: T): LodashSetWith1x9[T] = js.native
  def apply[T /* <: js.Object */](customizer: __, path: PropertyPath, value: js.Any, `object`: T): LodashSetWith1x14[T] = js.native
  def apply[T /* <: js.Object */](customizer: __, path: PropertyPath, value: __, `object`: T): LodashSetWith1x10[T] = js.native
  def apply[T /* <: js.Object */](customizer: __, path: __, value: js.Any, `object`: T): LodashSetWith1x12[T] = js.native
  def apply[T /* <: js.Object */](customizer: __, path: __, value: __, `object`: T): LodashSetWith1x8[T] = js.native
}

