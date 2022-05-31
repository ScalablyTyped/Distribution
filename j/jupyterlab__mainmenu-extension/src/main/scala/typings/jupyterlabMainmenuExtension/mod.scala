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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/mainmenu-extension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A service providing an interface to the main menu.
    */
  @JSImport("@jupyterlab/mainmenu-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IMainMenu] = js.native
  
  object CommandIDs {
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.activateById")
    @js.native
    val activateById: /* "tabsmenu:activate-by-id" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.activatePreviouslyUsedTab")
    @js.native
    val activatePreviouslyUsedTab: /* "tabsmenu:activate-previously-used-tab" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.changeKernel")
    @js.native
    val changeKernel: /* "kernelmenu:change" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.clearAll")
    @js.native
    val clearAll: /* "editmenu:clear-all" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.clearCurrent")
    @js.native
    val clearCurrent: /* "editmenu:clear-current" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.closeAndCleanup")
    @js.native
    val closeAndCleanup: /* "filemenu:close-and-cleanup" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.createConsole")
    @js.native
    val createConsole: /* "filemenu:create-console" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.find")
    @js.native
    val find: /* "editmenu:find" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.goToLine")
    @js.native
    val goToLine: /* "editmenu:go-to-line" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.interruptKernel")
    @js.native
    val interruptKernel: /* "kernelmenu:interrupt" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.lineNumbering")
    @js.native
    val lineNumbering: /* "viewmenu:line-numbering" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.logout")
    @js.native
    val logout: /* "filemenu:logout" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.matchBrackets")
    @js.native
    val matchBrackets: /* "viewmenu:match-brackets" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openEdit")
    @js.native
    val openEdit: /* "editmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openFile")
    @js.native
    val openFile: /* "filemenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openFirst")
    @js.native
    val openFirst: /* "mainmenu:open-first" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openHelp")
    @js.native
    val openHelp: /* "helpmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openKernel")
    @js.native
    val openKernel: /* "kernelmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openRun")
    @js.native
    val openRun: /* "runmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openSettings")
    @js.native
    val openSettings: /* "settingsmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openTabs")
    @js.native
    val openTabs: /* "tabsmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.openView")
    @js.native
    val openView: /* "viewmenu:open" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.redo")
    @js.native
    val redo: /* "editmenu:redo" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.restartAndRunAll")
    @js.native
    val restartAndRunAll: /* "runmenu:restart-and-run-all" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.restartAndRunToSelected")
    @js.native
    val restartAndRunToSelected: /* "notebook:restart-and-run-to-selected" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.restartKernel")
    @js.native
    val restartKernel: /* "kernelmenu:restart" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.restartKernelAndClear")
    @js.native
    val restartKernelAndClear: /* "kernelmenu:restart-and-clear" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.run")
    @js.native
    val run: /* "runmenu:run" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.runAbove")
    @js.native
    val runAbove: /* "runmenu:run-above" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.runAll")
    @js.native
    val runAll: /* "runmenu:run-all" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.runBelow")
    @js.native
    val runBelow: /* "runmenu:run-below" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.shutdown")
    @js.native
    val shutdown: /* "filemenu:shutdown" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.shutdownAllKernels")
    @js.native
    val shutdownAllKernels: /* "kernelmenu:shutdownAll" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.shutdownKernel")
    @js.native
    val shutdownKernel: /* "kernelmenu:shutdown" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.undo")
    @js.native
    val undo: /* "editmenu:undo" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.wordWrap")
    @js.native
    val wordWrap: /* "viewmenu:word-wrap" */ String = js.native
  }
  
  inline def createEditMenu(app: JupyterFrontEnd[IShell], menu: EditMenu): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createFileMenu(app: JupyterFrontEnd[IShell], menu: FileMenu, router: IRouter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], router.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createKernelMenu(app: JupyterFrontEnd[IShell], menu: KernelMenu): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createKernelMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createRunMenu(app: JupyterFrontEnd[IShell], menu: RunMenu): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createRunMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createSettingsMenu(_underscore: JupyterFrontEnd[IShell], menu: SettingsMenu): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSettingsMenu")(_underscore.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createTabsMenu(app: JupyterFrontEnd[IShell], menu: TabsMenu): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTabsMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createTabsMenu(app: JupyterFrontEnd[IShell], menu: TabsMenu, labShell: ILabShell): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTabsMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], labShell.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createViewMenu(app: JupyterFrontEnd[IShell], menu: ViewMenu): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createViewMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
