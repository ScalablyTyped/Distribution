package typings.materialUi.mod

import typings.materialUi.MaterialUI.List.SelectableProps
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-ui", "makeSelectable")
@js.native
object makeSelectable extends js.Object {
  def apply[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ComponentClass[P with SelectableProps, ComponentState] = js.native
}

