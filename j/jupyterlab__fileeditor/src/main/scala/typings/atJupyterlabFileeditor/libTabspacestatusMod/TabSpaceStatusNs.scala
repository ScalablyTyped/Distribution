package typings.atJupyterlabFileeditor.libTabspacestatusMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.VDomModel
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IConfig
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor/lib/tabspacestatus", "TabSpaceStatus")
@js.native
object TabSpaceStatusNs extends js.Object {
  /**
    * Options for creating a TabSpace status item.
    */
  trait IOptions extends js.Object {
    /**
      * A menu to open when clicking on the status item. This should allow
      * the user to make a different selection about tabs/spaces.
      */
    var menu: Menu
  }
  
  /**
    * A VDomModel for the TabSpace status item.
    */
  @js.native
  class Model () extends VDomModel {
    var _config: js.Any = js.native
    var _triggerChange: js.Any = js.native
    /**
      * The editor config from the settings system.
      */
    var config: IConfig | Null = js.native
  }
  
}

