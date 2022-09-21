package typings.materialUi

import typings.materialUi.MaterialUI.Toolbar.ToolbarGroupProps
import typings.materialUi.MaterialUI.Toolbar.ToolbarProps
import typings.materialUi.MaterialUI.Toolbar.ToolbarSeparatorProps
import typings.materialUi.MaterialUI.Toolbar.ToolbarTitleProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("material-ui/Toolbar", JSImport.Default)
  @js.native
  open class default () extends Toolbar
  
  @JSImport("material-ui/Toolbar", "Toolbar")
  @js.native
  open class Toolbar ()
    extends Component[ToolbarProps, js.Object, Any]
  
  @JSImport("material-ui/Toolbar", "ToolbarGroup")
  @js.native
  open class ToolbarGroup ()
    extends Component[ToolbarGroupProps, js.Object, Any]
  
  @JSImport("material-ui/Toolbar", "ToolbarSeparator")
  @js.native
  open class ToolbarSeparator ()
    extends Component[ToolbarSeparatorProps, js.Object, Any]
  
  @JSImport("material-ui/Toolbar", "ToolbarTitle")
  @js.native
  open class ToolbarTitle ()
    extends Component[ToolbarTitleProps, js.Object, Any]
}
