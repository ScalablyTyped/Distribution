package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashExtendWith extends js.Object {
  def apply(customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer): LodashExtendWith1x1 = js.native
  def apply[TObject](customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer, `object`: TObject): LodashExtendWith1x3[TObject] = js.native
  def apply[TSource](
    customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer,
    `object`: lodashLib.lodashMod.underscoreNs.`__`,
    source: TSource
  ): LodashExtendWith1x5[TSource] = js.native
  def apply[TObject](customizer: lodashLib.lodashMod.underscoreNs.`__`, `object`: TObject): LodashExtendWith1x2[TObject] = js.native
  def apply[TSource](
    customizer: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: lodashLib.lodashMod.underscoreNs.`__`,
    source: TSource
  ): LodashExtendWith1x4[TSource] = js.native
  def apply[TObject, TSource](customizer: lodashLib.lodashMod.underscoreNs.AssignCustomizer, `object`: TObject, source: TSource): TObject with TSource = js.native
  def apply[TObject, TSource](customizer: lodashLib.lodashMod.underscoreNs.`__`, `object`: TObject, source: TSource): LodashExtendWith1x6[TObject, TSource] = js.native
}

