package typings.materialUi

import typings.materialUi.MaterialUI.List.SelectableProps
import typings.materialUi.materialUiStrings.onChange
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-ui/List/makeSelectable", JSImport.Namespace)
@js.native
object makeSelectableMod extends js.Object {
  
  def default[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ComponentClass[(Omit[P, onChange]) with SelectableProps, ComponentState] = js.native
  
  def makeSelectable[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ComponentClass[(Omit[P, onChange]) with SelectableProps, ComponentState] = js.native
}
