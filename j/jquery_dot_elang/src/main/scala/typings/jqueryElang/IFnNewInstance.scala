package typings.jqueryElang

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interfaces for jQuery.fn.__plugin
@js.native
trait IFnNewInstance extends js.Object {
  def createInstance(el: HTMLElement, options: js.Any, pluginName: String): JQuery[HTMLElement] = js.native
}

object IFnNewInstance {
  @scala.inline
  def apply(createInstance: (HTMLElement, js.Any, String) => JQuery[HTMLElement]): IFnNewInstance = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction3(createInstance))
    __obj.asInstanceOf[IFnNewInstance]
  }
  @scala.inline
  implicit class IFnNewInstanceOps[Self <: IFnNewInstance] (val x: Self) extends AnyVal {
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
    def setCreateInstance(value: (HTMLElement, js.Any, String) => JQuery[HTMLElement]): Self = this.set("createInstance", js.Any.fromFunction3(value))
  }
  
}

