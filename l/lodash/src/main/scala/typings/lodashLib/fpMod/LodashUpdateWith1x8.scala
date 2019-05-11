package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUpdateWith1x8[T] extends js.Object {
  def apply(customizer: lodashLib.lodashMod.SetWithCustomizer[T]): LodashUpdateWith1x9[T] = js.native
  def apply(customizer: lodashLib.lodashMod.SetWithCustomizer[T], path: lodashLib.lodashMod.PropertyPath): LodashUpdateWith1x11[T] = js.native
  def apply(
    customizer: lodashLib.lodashMod.SetWithCustomizer[T],
    path: lodashLib.lodashMod.PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _]
  ): T = js.native
  def apply(
    customizer: lodashLib.lodashMod.SetWithCustomizer[T],
    path: lodashLib.lodashMod.__,
    updater: js.Function1[/* oldValue */ js.Any, _]
  ): LodashUpdateWith1x13[T] = js.native
  def apply(customizer: lodashLib.lodashMod.__, path: lodashLib.lodashMod.PropertyPath): LodashUpdateWith1x10[T] = js.native
  def apply(
    customizer: lodashLib.lodashMod.__,
    path: lodashLib.lodashMod.PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _]
  ): LodashUpdateWith1x14[T] = js.native
  def apply(
    customizer: lodashLib.lodashMod.__,
    path: lodashLib.lodashMod.__,
    updater: js.Function1[/* oldValue */ js.Any, _]
  ): LodashUpdateWith1x12[T] = js.native
}

