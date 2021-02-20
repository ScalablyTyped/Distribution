package typings.lodash.fpMod

import typings.lodash.mod.AssignCustomizer
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashAssignInWith extends StObject {
  
  def apply(customizer: AssignCustomizer): LodashAssignInWith1x1 = js.native
  def apply[TObject](customizer: AssignCustomizer, `object`: TObject): LodashAssignInWith1x3[TObject] = js.native
  def apply[TSource](customizer: AssignCustomizer, `object`: __, source: TSource): LodashAssignInWith1x5[TSource] = js.native
  def apply[TObject](customizer: __, `object`: TObject): LodashAssignInWith1x2[TObject] = js.native
  def apply[TSource](customizer: __, `object`: __, source: TSource): LodashAssignInWith1x4[TSource] = js.native
  def apply[TObject, TSource](customizer: AssignCustomizer, `object`: TObject, source: TSource): TObject with TSource = js.native
  def apply[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashAssignInWith1x6[TObject, TSource] = js.native
}
