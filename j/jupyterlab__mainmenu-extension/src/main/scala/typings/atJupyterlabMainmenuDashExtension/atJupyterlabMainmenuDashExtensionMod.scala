package typings.atJupyterlabMainmenuDashExtension

import typings.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.atJupyterlabApplication.libShellMod.ILabShell
import typings.atJupyterlabApplication.libTokensMod.IRouter
import typings.atJupyterlabMainmenu.atJupyterlabMainmenuMod.EditMenu
import typings.atJupyterlabMainmenu.atJupyterlabMainmenuMod.FileMenu
import typings.atJupyterlabMainmenu.atJupyterlabMainmenuMod.KernelMenu
import typings.atJupyterlabMainmenu.atJupyterlabMainmenuMod.RunMenu
import typings.atJupyterlabMainmenu.atJupyterlabMainmenuMod.SettingsMenu
import typings.atJupyterlabMainmenu.atJupyterlabMainmenuMod.TabsMenu
import typings.atJupyterlabMainmenu.atJupyterlabMainmenuMod.ViewMenu
import typings.atJupyterlabMainmenu.libTokensMod.IMainMenu
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenuColonclear-all`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenuColonclear-current`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`editmenuColongo-to-line`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`filemenuColonclose-and-cleanup`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`filemenuColoncreate-console`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`kernelmenuColonrestart-and-clear`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`mainmenuColonopen-first`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenuColonrestart-and-run-all`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenuColonrun-above`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenuColonrun-all`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`runmenuColonrun-below`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`tabsmenuColonactivate-by-id`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`tabsmenuColonactivate-previously-used-tab`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`viewmenuColonline-numbering`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`viewmenuColonmatch-brackets`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.`viewmenuColonword-wrap`
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.editmenuColonfind
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.editmenuColonopen
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.editmenuColonredo
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.editmenuColonundo
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.filemenuColonlogout
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.filemenuColonopen
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.filemenuColonshutdown
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.helpmenuColonopen
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.kernelmenuColonchange
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.kernelmenuColoninterrupt
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.kernelmenuColonopen
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.kernelmenuColonrestart
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.kernelmenuColonshutdown
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.kernelmenuColonshutdownAll
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.runmenuColonopen
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.runmenuColonrun
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.settingsmenuColonopen
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.tabsmenuColonopen
import typings.atJupyterlabMainmenuDashExtension.atJupyterlabMainmenuDashExtensionStrings.viewmenuColonopen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu-extension", JSImport.Namespace)
@js.native
object atJupyterlabMainmenuDashExtensionMod extends js.Object {
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
    val activateById: `tabsmenuColonactivate-by-id` = js.native
    val activatePreviouslyUsedTab: `tabsmenuColonactivate-previously-used-tab` = js.native
    val changeKernel: kernelmenuColonchange = js.native
    val clearAll: `editmenuColonclear-all` = js.native
    val clearCurrent: `editmenuColonclear-current` = js.native
    val closeAndCleanup: `filemenuColonclose-and-cleanup` = js.native
    val createConsole: `filemenuColoncreate-console` = js.native
    val find: editmenuColonfind = js.native
    val goToLine: `editmenuColongo-to-line` = js.native
    val interruptKernel: kernelmenuColoninterrupt = js.native
    val lineNumbering: `viewmenuColonline-numbering` = js.native
    val logout: filemenuColonlogout = js.native
    val matchBrackets: `viewmenuColonmatch-brackets` = js.native
    val openEdit: editmenuColonopen = js.native
    val openFile: filemenuColonopen = js.native
    val openFirst: `mainmenuColonopen-first` = js.native
    val openHelp: helpmenuColonopen = js.native
    val openKernel: kernelmenuColonopen = js.native
    val openRun: runmenuColonopen = js.native
    val openSettings: settingsmenuColonopen = js.native
    val openTabs: tabsmenuColonopen = js.native
    val openView: viewmenuColonopen = js.native
    val redo: editmenuColonredo = js.native
    val restartAndRunAll: `runmenuColonrestart-and-run-all` = js.native
    val restartKernel: kernelmenuColonrestart = js.native
    val restartKernelAndClear: `kernelmenuColonrestart-and-clear` = js.native
    val run: runmenuColonrun = js.native
    val runAbove: `runmenuColonrun-above` = js.native
    val runAll: `runmenuColonrun-all` = js.native
    val runBelow: `runmenuColonrun-below` = js.native
    val shutdown: filemenuColonshutdown = js.native
    val shutdownAllKernels: kernelmenuColonshutdownAll = js.native
    val shutdownKernel: kernelmenuColonshutdown = js.native
    val undo: editmenuColonundo = js.native
    val wordWrap: `viewmenuColonword-wrap` = js.native
  }
  
}

