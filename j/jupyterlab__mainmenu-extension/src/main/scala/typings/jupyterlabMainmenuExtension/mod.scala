package typings.jupyterlabMainmenuExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabApplication.shellMod.ILabShell
import typings.jupyterlabApplication.tokensMod.IRouter
import typings.jupyterlabMainmenu.mod.EditMenu
import typings.jupyterlabMainmenu.mod.FileMenu
import typings.jupyterlabMainmenu.mod.KernelMenu
import typings.jupyterlabMainmenu.mod.RunMenu
import typings.jupyterlabMainmenu.mod.SettingsMenu
import typings.jupyterlabMainmenu.mod.TabsMenu
import typings.jupyterlabMainmenu.mod.ViewMenu
import typings.jupyterlabMainmenu.tokensMod.IMainMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * A service providing an interface to the main menu.
    */
  val default: JupyterFrontEndPlugin[IMainMenu] = js.native
  def createEditMenu(app: JupyterFrontEnd[IShell], menu: EditMenu): Unit = js.native
  def createFileMenu(app: JupyterFrontEnd[IShell], menu: FileMenu, router: IRouter): Unit = js.native
  def createKernelMenu(app: JupyterFrontEnd[IShell], menu: KernelMenu): Unit = js.native
  def createRunMenu(app: JupyterFrontEnd[IShell], menu: RunMenu): Unit = js.native
  def createSettingsMenu(_underscore: JupyterFrontEnd[IShell], menu: SettingsMenu): Unit = js.native
  def createTabsMenu(app: JupyterFrontEnd[IShell], menu: TabsMenu): Unit = js.native
  def createTabsMenu(app: JupyterFrontEnd[IShell], menu: TabsMenu, labShell: ILabShell): Unit = js.native
  def createViewMenu(app: JupyterFrontEnd[IShell], menu: ViewMenu): Unit = js.native
  @js.native
  object CommandIDs extends js.Object {
    val activateById: /* "tabsmenu:activate-by-id" */ String = js.native
    val activatePreviouslyUsedTab: /* "tabsmenu:activate-previously-used-tab" */ String = js.native
    val changeKernel: /* "kernelmenu:change" */ String = js.native
    val clearAll: /* "editmenu:clear-all" */ String = js.native
    val clearCurrent: /* "editmenu:clear-current" */ String = js.native
    val closeAndCleanup: /* "filemenu:close-and-cleanup" */ String = js.native
    val createConsole: /* "filemenu:create-console" */ String = js.native
    val find: /* "editmenu:find" */ String = js.native
    val goToLine: /* "editmenu:go-to-line" */ String = js.native
    val interruptKernel: /* "kernelmenu:interrupt" */ String = js.native
    val lineNumbering: /* "viewmenu:line-numbering" */ String = js.native
    val logout: /* "filemenu:logout" */ String = js.native
    val matchBrackets: /* "viewmenu:match-brackets" */ String = js.native
    val openEdit: /* "editmenu:open" */ String = js.native
    val openFile: /* "filemenu:open" */ String = js.native
    val openFirst: /* "mainmenu:open-first" */ String = js.native
    val openHelp: /* "helpmenu:open" */ String = js.native
    val openKernel: /* "kernelmenu:open" */ String = js.native
    val openRun: /* "runmenu:open" */ String = js.native
    val openSettings: /* "settingsmenu:open" */ String = js.native
    val openTabs: /* "tabsmenu:open" */ String = js.native
    val openView: /* "viewmenu:open" */ String = js.native
    val redo: /* "editmenu:redo" */ String = js.native
    val restartAndRunAll: /* "runmenu:restart-and-run-all" */ String = js.native
    val restartAndRunToSelected: /* "notebook:restart-and-run-to-selected" */ String = js.native
    val restartKernel: /* "kernelmenu:restart" */ String = js.native
    val restartKernelAndClear: /* "kernelmenu:restart-and-clear" */ String = js.native
    val run: /* "runmenu:run" */ String = js.native
    val runAbove: /* "runmenu:run-above" */ String = js.native
    val runAll: /* "runmenu:run-all" */ String = js.native
    val runBelow: /* "runmenu:run-below" */ String = js.native
    val shutdown: /* "filemenu:shutdown" */ String = js.native
    val shutdownAllKernels: /* "kernelmenu:shutdownAll" */ String = js.native
    val shutdownKernel: /* "kernelmenu:shutdown" */ String = js.native
    val undo: /* "editmenu:undo" */ String = js.native
    val wordWrap: /* "viewmenu:word-wrap" */ String = js.native
  }
  
}

