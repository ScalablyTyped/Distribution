package typings.materialUi

import typings.materialUi.MaterialUI.List.SelectableProps
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMakeSelectableMod {
  
  @JSImport("material-ui/List/makeSelectable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ComponentClass[(Omit[P, "onChange"]) & SelectableProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[(Omit[P, "onChange"]) & SelectableProps, ComponentState]]
  
  inline def makeSelectable[P /* <: js.Object */](component: ComponentClass[P, ComponentState]): ComponentClass[(Omit[P, "onChange"]) & SelectableProps, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSelectable")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[(Omit[P, "onChange"]) & SelectableProps, ComponentState]]
}
