package typings.materialDashUi

import typings.materialDashUi.__MaterialUI.List.ListItemProps
import typings.materialDashUi.__MaterialUI.List.ListProps
import typings.materialDashUi.__MaterialUI.List.SelectableProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui/List", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @js.native
  class ListItem ()
    extends Component[ListItemProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[ListProps, js.Object, js.Any]
  
  def makeSelectable[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ComponentClass[P with SelectableProps, ComponentState] = js.native
}

