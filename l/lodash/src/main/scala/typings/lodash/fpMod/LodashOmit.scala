package typings.lodash.fpMod

import typings.lodash.mod.Many
import typings.lodash.mod.PartialObject
import typings.lodash.mod.PropertyName
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashOmit extends js.Object {
  
  def apply(paths: Many[PropertyName]): LodashOmit2x1 = js.native
  def apply[T /* <: js.Object */](paths: Many[PropertyName], `object`: T): PartialObject[T] = js.native
  def apply[T /* <: js.Object */](paths: __): LodashOmit1x2[T] = js.native
  def apply[T /* <: js.Object */](paths: __, `object`: T): LodashOmit1x2[T] = js.native
}
