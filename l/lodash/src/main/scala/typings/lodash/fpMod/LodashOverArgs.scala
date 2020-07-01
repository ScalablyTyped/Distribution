package typings.lodash.fpMod

import typings.lodash.mod.Many
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOverArgs extends LodashConvertible {
  def apply(func: js.Function1[/* repeated */ js.Any, _]): LodashOverArgs1x1 = js.native
  def apply(func: js.Function1[/* repeated */ js.Any, _], transforms: Many[js.Function1[/* repeated */ _, _]]): js.Function1[/* repeated */ js.Any, _] = js.native
  def apply(func: __, transforms: Many[js.Function1[/* repeated */ _, _]]): LodashOverArgs1x2 = js.native
}

