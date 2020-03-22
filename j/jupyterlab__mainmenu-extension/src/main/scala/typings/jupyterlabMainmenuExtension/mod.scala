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
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`editmenuColonclear-all`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`editmenuColonclear-current`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`editmenuColongo-to-line`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`filemenuColonclose-and-cleanup`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`filemenuColoncreate-console`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`kernelmenuColonrestart-and-clear`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`mainmenuColonopen-first`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`notebookColonrestart-and-run-to-selected`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`runmenuColonrestart-and-run-all`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`runmenuColonrun-above`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`runmenuColonrun-all`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`runmenuColonrun-below`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`tabsmenuColonactivate-by-id`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`tabsmenuColonactivate-previously-used-tab`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`viewmenuColonline-numbering`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`viewmenuColonmatch-brackets`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`viewmenuColonword-wrap`
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.editmenuColonfind
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.editmenuColonopen
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.editmenuColonredo
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.editmenuColonundo
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.filemenuColonlogout
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.filemenuColonopen
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.filemenuColonshutdown
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.helpmenuColonopen
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonchange
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColoninterrupt
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonopen
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonrestart
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonshutdown
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonshutdownAll
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.runmenuColonopen
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.runmenuColonrun
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.settingsmenuColonopen
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.tabsmenuColonopen
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.viewmenuColonopen
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
    val restartAndRunToSelected: `notebookColonrestart-and-run-to-selected` = js.native
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

