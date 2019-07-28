package typings.lodash.fpMod

import typings.lodash.lodashMod.PropertyPath
import typings.lodash.lodashMod.SetWithCustomizer
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSetWith1x4 extends js.Object {
  def apply(customizer: __, path: PropertyPath): LodashSetWith1x6 = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T]): LodashSetWith1x5[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath): LodashSetWith1x7[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, `object`: T): T = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, `object`: T): LodashSetWith1x13[T] = js.native
  def apply[T /* <: js.Object */](customizer: __, path: PropertyPath, `object`: T): LodashSetWith1x14[T] = js.native
  def apply[T /* <: js.Object */](customizer: __, path: __, `object`: T): LodashSetWith1x12[T] = js.native
}

