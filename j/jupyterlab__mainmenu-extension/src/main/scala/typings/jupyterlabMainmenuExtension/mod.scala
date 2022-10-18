package typings.jupyterlabMainmenuExtension

import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApplication.libShellMod.ILabShell
import typings.jupyterlabApplication.libTokensMod.IRouter
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabMainmenu.libEditMod.IEditMenu
import typings.jupyterlabMainmenu.libFileMod.IFileMenu
import typings.jupyterlabMainmenu.libKernelMod.IKernelMenu
import typings.jupyterlabMainmenu.libRunMod.IRunMenu
import typings.jupyterlabMainmenu.libTabsMod.ITabsMenu
import typings.jupyterlabMainmenu.libTokensMod.IMainMenu
import typings.jupyterlabMainmenu.libViewMod.IViewMenu
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.desktop
import typings.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.mobile
import typings.jupyterlabTranslation.libTokensMod.TranslationBundle
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
  val default: JupyterFrontEndPlugin[IMainMenu, IShell, desktop | mobile] = js.native
  
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
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.reconnectToKernel")
    @js.native
    val reconnectToKernel: /* "kernelmenu:reconnect-to-kernel" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.redo")
    @js.native
    val redo: /* "editmenu:redo" */ String = js.native
    
    @JSImport("@jupyterlab/mainmenu-extension", "CommandIDs.restartAndRunAll")
    @js.native
    val restartAndRunAll: /* "runmenu:restart-and-run-all" */ String = js.native
    
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
  
  inline def createEditMenu(app: JupyterFrontEnd[IShell, desktop | mobile], menu: IEditMenu, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createFileMenu(
    app: JupyterFrontEnd[IShell, desktop | mobile],
    menu: IFileMenu,
    router: IRouter,
    trans: TranslationBundle
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], router.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createKernelMenu(app: JupyterFrontEnd[IShell, desktop | mobile], menu: IKernelMenu, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createKernelMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createRunMenu(app: JupyterFrontEnd[IShell, desktop | mobile], menu: IRunMenu, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createRunMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createTabsMenu(
    app: JupyterFrontEnd[IShell, desktop | mobile],
    menu: ITabsMenu,
    labShell: Null,
    trans: TranslationBundle
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTabsMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], labShell.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createTabsMenu(
    app: JupyterFrontEnd[IShell, desktop | mobile],
    menu: ITabsMenu,
    labShell: ILabShell,
    trans: TranslationBundle
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTabsMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], labShell.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createViewMenu(app: JupyterFrontEnd[IShell, desktop | mobile], menu: IViewMenu, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createViewMenu")(app.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
