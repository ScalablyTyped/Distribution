package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMergeWith extends js.Object {
  def apply(customizer: lodashLib.lodashMod.underscoreNs.MergeWithCustomizer): LodashMergeWith1x1 = js.native
  def apply[TObject](customizer: lodashLib.lodashMod.underscoreNs.MergeWithCustomizer, `object`: TObject): LodashMergeWith1x3[TObject] = js.native
  def apply[TSource](
    customizer: lodashLib.lodashMod.underscoreNs.MergeWithCustomizer,
    `object`: lodashLib.lodashMod.underscoreNs.`__`,
    source: TSource
  ): LodashMergeWith1x5[TSource] = js.native
  def apply[TObject](customizer: lodashLib.lodashMod.underscoreNs.`__`, `object`: TObject): LodashMergeWith1x2[TObject] = js.native
  def apply[TSource](
    customizer: lodashLib.lodashMod.underscoreNs.`__`,
    `object`: lodashLib.lodashMod.underscoreNs.`__`,
    source: TSource
  ): LodashMergeWith1x4[TSource] = js.native
  def apply[TObject, TSource](
    customizer: lodashLib.lodashMod.underscoreNs.MergeWithCustomizer,
    `object`: TObject,
    source: TSource
  ): TObject with TSource = js.native
  def apply[TObject, TSource](customizer: lodashLib.lodashMod.underscoreNs.`__`, `object`: TObject, source: TSource): LodashMergeWith1x6[TObject, TSource] = js.native
}

