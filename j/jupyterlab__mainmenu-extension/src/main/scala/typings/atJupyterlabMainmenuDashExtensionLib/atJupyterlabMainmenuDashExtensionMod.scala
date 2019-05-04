package typings
package atJupyterlabMainmenuDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu-extension", JSImport.Namespace)
@js.native
object atJupyterlabMainmenuDashExtensionMod extends js.Object {
  /**
    * A service providing an interface to the main menu.
    */
  val default: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLabPlugin[atJupyterlabMainmenuLib.libMainmenuMod.IMainMenu] = js.native
  def createEditMenu(
    app: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLab,
    menu: atJupyterlabMainmenuLib.atJupyterlabMainmenuMod.EditMenu
  ): scala.Unit = js.native
  def createFileMenu(
    app: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLab,
    menu: atJupyterlabMainmenuLib.atJupyterlabMainmenuMod.FileMenu
  ): scala.Unit = js.native
  def createKernelMenu(
    app: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLab,
    menu: atJupyterlabMainmenuLib.atJupyterlabMainmenuMod.KernelMenu
  ): scala.Unit = js.native
  def createRunMenu(
    app: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLab,
    menu: atJupyterlabMainmenuLib.atJupyterlabMainmenuMod.RunMenu
  ): scala.Unit = js.native
  def createSettingsMenu(
    app: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLab,
    menu: atJupyterlabMainmenuLib.atJupyterlabMainmenuMod.SettingsMenu
  ): scala.Unit = js.native
  def createTabsMenu(
    app: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLab,
    menu: atJupyterlabMainmenuLib.atJupyterlabMainmenuMod.TabsMenu
  ): scala.Unit = js.native
  def createViewMenu(
    app: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLab,
    menu: atJupyterlabMainmenuLib.atJupyterlabMainmenuMod.ViewMenu
  ): scala.Unit = js.native
  @JSName("CommandIDs")
  @js.native
  object CommandIDsNs extends js.Object {
    val activatePreviouslyUsedTab: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`tabmenu:activate-previously-used-tab` = js.native
    val changeKernel: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`kernelmenu:change` = js.native
    val clearAll: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`editmenu:clear-all` = js.native
    val clearCurrent: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`editmenu:clear-current` = js.native
    val closeAndCleanup: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`filemenu:close-and-cleanup` = js.native
    val createConsole: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`filemenu:create-console` = js.native
    val find: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`editmenu:find` = js.native
    val findAndReplace: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`editmenu:find-and-replace` = js.native
    val goToLine: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`editmenu:go-to-line` = js.native
    val interruptKernel: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`kernelmenu:interrupt` = js.native
    val lineNumbering: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`viewmenu:line-numbering` = js.native
    val matchBrackets: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`viewmenu:match-brackets` = js.native
    val persistAndSave: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`filemenu:persist-and-save` = js.native
    val quit: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`filemenu:quit` = js.native
    val redo: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`editmenu:redo` = js.native
    val restartAndRunAll: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`runmenu:restart-and-run-all` = js.native
    val restartKernel: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`kernelmenu:restart` = js.native
    val restartKernelAndClear: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`kernelmenu:restart-and-clear` = js.native
    val run: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`runmenu:run` = js.native
    val runAbove: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`runmenu:run-above` = js.native
    val runAll: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`runmenu:run-all` = js.native
    val runBelow: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`runmenu:run-below` = js.native
    val shutdownAllKernels: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`kernelmenu:shutdownAll` = js.native
    val shutdownKernel: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`kernelmenu:shutdown` = js.native
    val undo: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`editmenu:undo` = js.native
    val wordWrap: atJupyterlabMainmenuDashExtensionLib.atJupyterlabMainmenuDashExtensionLibStrings.`viewmenu:word-wrap` = js.native
  }
  
}

