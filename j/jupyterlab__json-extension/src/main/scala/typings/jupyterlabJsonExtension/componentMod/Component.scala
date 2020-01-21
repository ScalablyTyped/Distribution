package typings.jupyterlabJsonExtension.componentMod

import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/json-extension/lib/component", "Component")
@js.native
class Component ()
  extends typings.react.mod.Component[IProps, IState, js.Any] {
  var timer: Double = js.native
  def handleChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
}

