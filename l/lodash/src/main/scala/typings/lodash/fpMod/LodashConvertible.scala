package typings.lodash.fpMod

import typings.lodash.mod.ConvertOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashConvertible extends js.Object {
  def convert(options: ConvertOptions): js.Function1[/* repeated */ js.Any, _] = js.native
}

object LodashConvertible {
  @scala.inline
  def apply(convert: ConvertOptions => js.Function1[/* repeated */ js.Any, _]): LodashConvertible = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
    __obj.asInstanceOf[LodashConvertible]
  }
  @scala.inline
  implicit class LodashConvertibleOps[Self <: LodashConvertible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConvert(value: ConvertOptions => js.Function1[/* repeated */ js.Any, _]): Self = this.set("convert", js.Any.fromFunction1(value))
  }
  
}

