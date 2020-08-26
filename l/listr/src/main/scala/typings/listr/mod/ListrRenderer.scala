package typings.listr.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListrRenderer extends js.Object {
  def end(err: Error): Unit = js.native
  def render(): Unit = js.native
}

object ListrRenderer {
  @scala.inline
  def apply(end: Error => Unit, render: () => Unit): ListrRenderer = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[ListrRenderer]
  }
  @scala.inline
  implicit class ListrRendererOps[Self <: ListrRenderer] (val x: Self) extends AnyVal {
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
    def setEnd(value: Error => Unit): Self = this.set("end", js.Any.fromFunction1(value))
    @scala.inline
    def setRender(value: () => Unit): Self = this.set("render", js.Any.fromFunction0(value))
  }
  
}

