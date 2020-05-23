package typings.kendoUi.kendo.data

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binder extends Class {
  var bindings: Bindings = js.native
  var element: js.Any = js.native
  var options: BinderOptions = js.native
  def bind(binding: Binding, attribute: String): Unit = js.native
  def destroy(): Unit = js.native
  def init(element: js.Any, bindings: Bindings): Unit = js.native
  def init(element: js.Any, bindings: Bindings, options: BinderOptions): Unit = js.native
  def refresh(): Unit = js.native
  def refresh(attribute: String): Unit = js.native
}

