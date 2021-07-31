package typings.materialUi

import typings.materialUi.MaterialUI.List.ListItemProps
import typings.materialUi.MaterialUI.List.ListProps
import typings.materialUi.MaterialUI.List.SelectableProps
import typings.materialUi.materialUiStrings.onChange
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialUiListMod {
  
  @JSImport("material-ui/List", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("material-ui/List", JSImport.Default)
  @js.native
  class default () extends List
  
  @JSImport("material-ui/List", "List")
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @JSImport("material-ui/List", "ListItem")
  @js.native
  class ListItem ()
    extends Component[ListItemProps, js.Object, js.Any]
  
  @scala.inline
  def makeSelectable[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ComponentClass[(Omit[P, onChange]) & SelectableProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSelectable")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[(Omit[P, onChange]) & SelectableProps, ComponentState]]
}
