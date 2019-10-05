package typings.materialDashUi.materialDashUiMod

import typings.materialDashUi.__MaterialUI.List.SelectableProps
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui", "makeSelectable")
@js.native
object makeSelectable extends js.Object {
  def apply[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ComponentClass[P with SelectableProps, ComponentState] = js.native
}

