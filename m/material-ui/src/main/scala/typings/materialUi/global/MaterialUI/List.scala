package typings.materialUi.global.MaterialUI

import typings.materialUi.MaterialUI.List.ListItemProps
import typings.materialUi.MaterialUI.List.ListProps
import typings.materialUi.MaterialUI.List.SelectableProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @JSGlobal("__MaterialUI.List")
  @js.native
  val ^ : js.Any = js.native
  @JSGlobal("__MaterialUI.List.List")
  @js.native
  open class List ()
    extends Component[ListProps, js.Object, Any]
  
  @JSGlobal("__MaterialUI.List.ListItem")
  @js.native
  open class ListItem ()
    extends Component[ListItemProps, js.Object, Any]
  
  inline def makeSelectable[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ComponentClass[(Omit[P, "onChange"]) & SelectableProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSelectable")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[(Omit[P, "onChange"]) & SelectableProps, ComponentState]]
}
