package typings.lodash.fpMod

import typings.lodash.mod.ConvertOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LodashConvertible extends js.Object {
  def convert(options: ConvertOptions): js.Function1[/* repeated */ js.Any, _]
}

object LodashConvertible {
  @scala.inline
  def apply(convert: ConvertOptions => js.Function1[/* repeated */ js.Any, _]): LodashConvertible = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
    __obj.asInstanceOf[LodashConvertible]
  }
}

