package typings.jqueryDotElang

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interfaces for jQuery.fn.__plugin
trait IFnNewInstance extends js.Object {
  def createInstance(el: HTMLElement, options: js.Any, pluginName: String): JQuery[HTMLElement]
}

object IFnNewInstance {
  @scala.inline
  def apply(createInstance: (HTMLElement, js.Any, String) => JQuery[HTMLElement]): IFnNewInstance = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction3(createInstance))
  
    __obj.asInstanceOf[IFnNewInstance]
  }
}

