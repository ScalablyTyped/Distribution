package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashAssignInWith extends js.Object {
  def apply(customizer: lodashLib.lodashMod.AssignCustomizer): LodashAssignInWith1x1 = js.native
  def apply[TObject](customizer: lodashLib.lodashMod.AssignCustomizer, `object`: TObject): LodashAssignInWith1x3[TObject] = js.native
  def apply[TSource](
    customizer: lodashLib.lodashMod.AssignCustomizer,
    `object`: lodashLib.lodashMod.__,
    source: TSource
  ): LodashAssignInWith1x5[TSource] = js.native
  def apply[TObject](customizer: lodashLib.lodashMod.__, `object`: TObject): LodashAssignInWith1x2[TObject] = js.native
  def apply[TSource](customizer: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.__, source: TSource): LodashAssignInWith1x4[TSource] = js.native
  def apply[TObject, TSource](customizer: lodashLib.lodashMod.AssignCustomizer, `object`: TObject, source: TSource): TObject with TSource = js.native
  def apply[TObject, TSource](customizer: lodashLib.lodashMod.__, `object`: TObject, source: TSource): LodashAssignInWith1x6[TObject, TSource] = js.native
}

