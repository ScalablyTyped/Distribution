package typings.lodash.fpMod

import typings.lodash.lodashMod.SetWithCustomizer
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUpdateWith1x2 extends js.Object {
  def apply(customizer: __, updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x6 = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T]): LodashUpdateWith1x3[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x7[T] = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], updater: js.Function1[/* oldValue */ js.Any, _], `object`: T): T = js.native
  def apply[T /* <: js.Object */](customizer: SetWithCustomizer[T], updater: __, `object`: T): LodashUpdateWith1x11[T] = js.native
  def apply[T /* <: js.Object */](customizer: __, updater: js.Function1[/* oldValue */ js.Any, _], `object`: T): LodashUpdateWith1x14[T] = js.native
  def apply[T /* <: js.Object */](customizer: __, updater: __, `object`: T): LodashUpdateWith1x10[T] = js.native
}

