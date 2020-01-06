package typings.lodash.fpMod

import typings.lodash.lodashMod.AnyKindOfDictionary
import typings.lodash.lodashMod.Many
import typings.lodash.lodashMod.PropertyName
import typings.lodash.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOmit extends js.Object {
  def apply(paths: Many[PropertyName]): LodashOmit1x1 = js.native
  def apply[T /* <: AnyKindOfDictionary */](paths: Many[PropertyName], `object`: T): T = js.native
  def apply[T /* <: js.Object */](paths: __): LodashOmit2x2[T] = js.native
  def apply[T /* <: js.Object */](paths: __, `object`: T): LodashOmit2x2[T] = js.native
}

