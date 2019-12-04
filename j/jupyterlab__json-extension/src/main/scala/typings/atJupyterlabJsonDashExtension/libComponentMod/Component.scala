package typings.atJupyterlabJsonDashExtension.libComponentMod

import typings.react.reactMod.ChangeEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/json-extension/lib/component", "Component")
@js.native
class Component ()
  extends typings.react.reactMod.Component[IProps, IState, js.Any] {
  var timer: Double = js.native
  def handleChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
}

