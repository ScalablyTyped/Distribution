package typings.materialDashUi

import typings.materialDashUi.__MaterialUI.List.SelectableProps
import typings.materialDashUi.listMod.List
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
    extends typings.materialDashUi.__MaterialUI.List.List
  
  @js.native
  class ListItem ()
    extends typings.materialDashUi.__MaterialUI.List.ListItem
  
  @js.native
  class default () extends List
  
  def makeSelectable[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ComponentClass[P with SelectableProps, ComponentState] = js.native
}

