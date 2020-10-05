package typings.lodash.fpMod

import typings.lodash.mod.AssignCustomizer
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashExtendWith1x2[TObject] extends js.Object {
  def apply(customizer: AssignCustomizer): LodashExtendWith1x3[TObject] = js.native
  def apply[TSource](customizer: AssignCustomizer, source: TSource): TObject with TSource = js.native
  def apply[TSource](customizer: __, source: TSource): LodashExtendWith1x6[TObject, TSource] = js.native
}

