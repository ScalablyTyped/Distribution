package typings.lodash.fpMod

import typings.lodash.mod.MergeWithCustomizer
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashMergeWith extends StObject {
  
  def apply(customizer: MergeWithCustomizer): LodashMergeWith1x1 = js.native
  def apply[TObject](customizer: MergeWithCustomizer, `object`: TObject): LodashMergeWith1x3[TObject] = js.native
  def apply[TSource](customizer: MergeWithCustomizer, `object`: __, source: TSource): LodashMergeWith1x5[TSource] = js.native
  def apply[TObject](customizer: __, `object`: TObject): LodashMergeWith1x2[TObject] = js.native
  def apply[TSource](customizer: __, `object`: __, source: TSource): LodashMergeWith1x4[TSource] = js.native
  def apply[TObject, TSource](customizer: MergeWithCustomizer, `object`: TObject, source: TSource): TObject with TSource = js.native
  def apply[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashMergeWith1x6[TObject, TSource] = js.native
}
