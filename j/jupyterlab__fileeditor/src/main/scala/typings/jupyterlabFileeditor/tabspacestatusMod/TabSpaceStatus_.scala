package typings.jupyterlabFileeditor.tabspacestatusMod

import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus.IOptions
import typings.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/fileeditor/lib/tabspacestatus", "TabSpaceStatus")
@js.native
class TabSpaceStatus_ protected () extends VDomRenderer[Model] {
  /**
    * Create a new tab/space status item.
    */
  def this(options: IOptions) = this()
  
  /**
    * Handle a click on the status item.
    */
  var _handleClick: js.Any = js.native
  
  var _menu: js.Any = js.native
  
  var _menuClosed: js.Any = js.native
  
  var _popup: js.Any = js.native
}
