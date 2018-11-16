package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.Binder")
@js.native
class Binder protected ()
  extends kendoDashUiLib.kendoNs.Class {
  def this(element: js.Any, bindings: Bindings) = this()
  def this(element: js.Any, bindings: Bindings, options: BinderOptions) = this()
  var bindings: Bindings = js.native
  var element: js.Any = js.native
  var options: BinderOptions = js.native
  def bind(binding: Binding, attribute: java.lang.String): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def init(element: js.Any, bindings: Bindings): scala.Unit = js.native
  def init(element: js.Any, bindings: Bindings, options: BinderOptions): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def refresh(attribute: java.lang.String): scala.Unit = js.native
}

@JSGlobal("kendo.data.Binder")
@js.native
object Binder extends js.Object {
  var fn: kendoDashUiLib.kendoNs.dataNs.Binder = js.native
  def extend(prototype: js.Object): kendoDashUiLib.kendoNs.dataNs.Binder = js.native
}

