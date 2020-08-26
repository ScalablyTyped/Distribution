package typings.layuiSrc.layui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TplObject extends js.Object {
  def render(data: js.Object, callback: js.Function1[/* str */ String, Unit]): js.Any = js.native
}

object TplObject {
  @scala.inline
  def apply(render: (js.Object, js.Function1[/* str */ String, Unit]) => js.Any): TplObject = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[TplObject]
  }
  @scala.inline
  implicit class TplObjectOps[Self <: TplObject] (val x: Self) extends AnyVal {
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
    def setRender(value: (js.Object, js.Function1[/* str */ String, Unit]) => js.Any): Self = this.set("render", js.Any.fromFunction2(value))
  }
  
}

