package typings.materialUi.global.MaterialUI

import typings.materialUi.MaterialUI.List.ListItemProps
import typings.materialUi.MaterialUI.List.ListProps
import typings.materialUi.MaterialUI.List.SelectableProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__MaterialUI.List")
@js.native
object List extends js.Object {
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @js.native
  class ListItem ()
    extends Component[ListItemProps, js.Object, js.Any]
  
  def makeSelectable[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ComponentClass[P with SelectableProps, ComponentState] = js.native
}

