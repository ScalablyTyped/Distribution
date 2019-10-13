package typings.atJupyterlabFileeditor.libTabspacestatusMod

import typings.atJupyterlabApputils.libVdomMod.VDomRenderer
import typings.atJupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus.IOptions
import typings.atJupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

