package typings.lodash.fpMod

import typings.lodash.mod.Many
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashRearg extends LodashConvertible {
  def apply(indexes: Many[Double]): LodashRearg1x1 = js.native
  def apply(indexes: Many[Double], func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def apply(indexes: __, func: js.Function1[/* repeated */ js.Any, _]): LodashRearg1x2 = js.native
}

