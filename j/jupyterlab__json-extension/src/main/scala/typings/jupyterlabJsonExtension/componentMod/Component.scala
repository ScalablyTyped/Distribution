package typings.jupyterlabJsonExtension.componentMod

import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/json-extension/lib/component", "Component")
@js.native
class Component ()
  extends typings.react.mod.Component[IProps, IState, js.Any] {
  
  def handleChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
  
  var timer: Double = js.native
}
