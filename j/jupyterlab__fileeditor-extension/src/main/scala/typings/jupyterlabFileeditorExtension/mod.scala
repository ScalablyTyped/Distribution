package typings.jupyterlabFileeditorExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabApputils.commandpaletteMod.ICommandPalette
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabApputils.tokensMod.ISessionContextDialogs
import typings.jupyterlabConsole.tokensMod.IConsoleTracker
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.jupyterlabFilebrowser.tokensMod.IFileBrowserFactory
import typings.jupyterlabFileeditor.mod.FileEditor
import typings.jupyterlabLauncher.mod.ILauncher
import typings.jupyterlabMainmenu.tokensMod.IMainMenu
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.luminoCommands.mod.CommandRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Export the plugins as default.
    */
  @JSImport("@jupyterlab/fileeditor-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  
  object Commands {
    
    @JSImport("@jupyterlab/fileeditor-extension", "Commands")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add the Auto Close Brackets for Text Editor command
      */
    inline def addAutoClosingBracketsCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAutoClosingBracketsCommand")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a command to change font size for File Editor
      */
    inline def addChangeFontSizeCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangeFontSizeCommand")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add commands to change the font size to the File Editor palette
      */
    inline def addChangeFontSizeCommandsToPalette(palette: ICommandPalette): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addChangeFontSizeCommandsToPalette")(palette.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add command for changing tabs size or type in File Editor
      */
    inline def addChangeTabsCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangeTabsCommand")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add commands to change the tab indentation to the File Editor palette
      */
    inline def addChangeTabsCommandsToPalette(palette: ICommandPalette): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addChangeTabsCommandsToPalette")(palette.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add a File Editor code runner to the Run menu
      */
    inline def addCodeRunnersToRunMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCodeRunnersToRunMenu")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], consoleTracker.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addCodeRunnersToRunMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker,
      sessionDialogs: ISessionContextDialogs
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCodeRunnersToRunMenu")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], consoleTracker.asInstanceOf[js.Any], sessionDialogs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wrapper function for adding the default File Editor commands
      */
    inline def addCommands(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      id: String,
      isEnabled: js.Function0[Boolean],
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      browserFactory: IFileBrowserFactory
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCommands")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], id.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], browserFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a File Editor console creator to the File menu
      */
    inline def addConsoleCreatorToFileMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addConsoleCreatorToFileMenu")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wrapper function for adding the default items to the File Editor context menu
      */
    inline def addContextMenuItems(app: JupyterFrontEnd[IShell]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addContextMenuItems")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add copy command
      */
    inline def addCopyCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCopyCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a Copy item to the File Editor context menu
      */
    inline def addCopyCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCopyCommandToContextMenu")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add the Create Console for Editor command
      */
    inline def addCreateConsoleCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCreateConsoleCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a Create Console item to the File Editor context menu
      */
    inline def addCreateConsoleToContextMenu(app: JupyterFrontEnd[IShell]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCreateConsoleToContextMenu")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add the New File command
      */
    inline def addCreateNewCommand(commands: CommandRegistry, browserFactory: IFileBrowserFactory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewCommand")(commands.asInstanceOf[js.Any], browserFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a Create New File command to the File Editor palette
      */
    inline def addCreateNewCommandToPalette(palette: ICommandPalette): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewCommandToPalette")(palette.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add a Create New File command to the File menu
      */
    inline def addCreateNewFileToFileMenu(menu: IMainMenu): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewFileToFileMenu")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add the New Markdown File command
      */
    inline def addCreateNewMarkdownCommand(commands: CommandRegistry, browserFactory: IFileBrowserFactory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewMarkdownCommand")(commands.asInstanceOf[js.Any], browserFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a Create New Markdown command to the File Editor palette
      */
    inline def addCreateNewMarkdownCommandToPalette(palette: ICommandPalette): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewMarkdownCommandToPalette")(palette.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add a Create New Markdown File command to the File menu
      */
    inline def addCreateNewMarkdownFileToFileMenu(menu: IMainMenu): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewMarkdownFileToFileMenu")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add Create New Markdown to the Launcher
      */
    inline def addCreateNewMarkdownToLauncher(launcher: ILauncher): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewMarkdownToLauncher")(launcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add Create New Text File to the Launcher
      */
    inline def addCreateNewToLauncher(launcher: ILauncher): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewToLauncher")(launcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add cut command
      */
    inline def addCutCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCutCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a Cut item to the File Editor context menu
      */
    inline def addCutCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCutCommandToContextMenu")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add File Editor editing commands to the Settings menu, including:
      * Indent with Tab, Tab Spaces, Change Font Size, and auto closing brackets
      */
    inline def addEditingCommandsToSettingsMenu(menu: IMainMenu, commands: CommandRegistry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEditingCommandsToSettingsMenu")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a File Editor editor viewer to the View Menu
      */
    inline def addEditorViewerToViewMenu(menu: IMainMenu, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEditorViewerToViewMenu")(menu.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wrapper function for adding the default launcher items for File Editor
      */
    inline def addLauncherItems(launcher: ILauncher): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLauncherItems")(launcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add the Line Numbers command
      */
    inline def addLineNumbersCommand(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      id: String,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLineNumbersCommand")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], id.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add markdown preview command
      */
    inline def addMarkdownPreviewCommand(commands: CommandRegistry, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMarkdownPreviewCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a Markdown Preview item to the File Editor context menu
      */
    inline def addMarkdownPreviewToContextMenu(app: JupyterFrontEnd[IShell]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMarkdownPreviewToContextMenu")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add the Match Brackets command
      */
    inline def addMatchBracketsCommand(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      id: String,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMatchBracketsCommand")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], id.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wrapper function for adding the default menu items for File Editor
      */
    inline def addMenuItems(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMenuItems")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], consoleTracker.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addMenuItems(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker,
      sessionDialogs: ISessionContextDialogs
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMenuItems")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], consoleTracker.asInstanceOf[js.Any], sessionDialogs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wrapper function for adding the default items to the File Editor palette
      */
    inline def addPaletteItems(palette: ICommandPalette): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPaletteItems")(palette.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add paste command
      */
    inline def addPasteCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPasteCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a Paste item to the File Editor context menu
      */
    inline def addPasteCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPasteCommandToContextMenu")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add redo command
      */
    inline def addRedoCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRedoCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a Redo item to the File Editor context menu
      */
    inline def addRedoCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRedoCommandToContextMenu")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add the replace selection for text editor command
      */
    inline def addReplaceSelectionCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addReplaceSelectionCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add the Run All Code command
      */
    inline def addRunAllCodeCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRunAllCodeCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add the Run Code command
      */
    inline def addRunCodeCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRunCodeCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add select all command
      */
    inline def addSelectAllCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSelectAllCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a Select All item to the File Editor context menu
      */
    inline def addSelectAllCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addSelectAllCommandToContextMenu")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add undo command
      */
    inline def addUndoCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addUndoCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a Undo item to the File Editor context menu
      */
    inline def addUndoCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addUndoCommandToContextMenu")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add File Editor undo and redo widgets to the Edit menu
      */
    inline def addUndoRedoToEditMenu(menu: IMainMenu, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addUndoRedoToEditMenu")(menu.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add the Word Wrap command
      */
    inline def addWordWrapCommand(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      id: String,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWordWrapCommand")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], id.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Update the setting values.
      */
    inline def updateSettings(settings: ISettings, commands: CommandRegistry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSettings")(settings.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Update the settings of the current tracker instances.
      */
    inline def updateTracker(tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateTracker")(tracker.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Update the settings of a widget.
      * Skip global settings for transient editor specific configs.
      */
    inline def updateWidget(widget: FileEditor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateWidget")(widget.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@jupyterlab/fileeditor-extension", "tabSpaceStatus")
  @js.native
  val tabSpaceStatus: JupyterFrontEndPlugin[Unit] = js.native
  
  type _To = js.Array[JupyterFrontEndPlugin[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[js.Any]] = default
}
