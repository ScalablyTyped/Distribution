package typings.materialUi.global.MaterialUI

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @JSGlobal("__MaterialUI.List.List")
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @JSGlobal("__MaterialUI.List.ListItem")
  @js.native
  class ListItem ()
    extends Component[ListItemProps, js.Object, js.Any]
  
  @JSGlobal("__MaterialUI.List.makeSelectable")
  @js.native
  def makeSelectable[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ComponentClass[(Omit[P, onChange]) with SelectableProps, ComponentState] = js.native
}
