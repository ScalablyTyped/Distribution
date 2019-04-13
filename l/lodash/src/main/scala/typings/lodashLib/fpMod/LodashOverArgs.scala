package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOverArgs extends js.Object {
  def apply(func: js.Function1[/* repeated */ js.Any, _]): LodashOverArgs1x1 = js.native
  def apply(
    func: js.Function1[/* repeated */ js.Any, _],
    transforms: lodashLib.lodashMod.Many[js.Function1[/* repeated */ _, _]]
  ): js.Function1[/* repeated */ js.Any, _] = js.native
  def apply(
    func: lodashLib.lodashMod.__,
    transforms: lodashLib.lodashMod.Many[js.Function1[/* repeated */ _, _]]
  ): LodashOverArgs1x2 = js.native
}

