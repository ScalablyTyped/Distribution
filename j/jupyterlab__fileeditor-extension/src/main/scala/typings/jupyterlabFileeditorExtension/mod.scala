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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Export the plugins as default.
    */
  @JSImport("@jupyterlab/fileeditor-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  
  object Commands {
    
    /**
      * Add the Auto Close Brackets for Text Editor command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addAutoClosingBracketsCommand")
    @js.native
    def addAutoClosingBracketsCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, id: String): Unit = js.native
    
    /**
      * Add a command to change font size for File Editor
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addChangeFontSizeCommand")
    @js.native
    def addChangeFontSizeCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, id: String): Unit = js.native
    
    /**
      * Add commands to change the font size to the File Editor palette
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addChangeFontSizeCommandsToPalette")
    @js.native
    def addChangeFontSizeCommandsToPalette(palette: ICommandPalette): Unit = js.native
    
    /**
      * Add command for changing tabs size or type in File Editor
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addChangeTabsCommand")
    @js.native
    def addChangeTabsCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, id: String): Unit = js.native
    
    /**
      * Add commands to change the tab indentation to the File Editor palette
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addChangeTabsCommandsToPalette")
    @js.native
    def addChangeTabsCommandsToPalette(palette: ICommandPalette): Unit = js.native
    
    /**
      * Add a File Editor code runner to the Run menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCodeRunnersToRunMenu")
    @js.native
    def addCodeRunnersToRunMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker
    ): Unit = js.native
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCodeRunnersToRunMenu")
    @js.native
    def addCodeRunnersToRunMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker,
      sessionDialogs: ISessionContextDialogs
    ): Unit = js.native
    
    /**
      * Wrapper function for adding the default File Editor commands
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCommands")
    @js.native
    def addCommands(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      id: String,
      isEnabled: js.Function0[Boolean],
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      browserFactory: IFileBrowserFactory
    ): Unit = js.native
    
    /**
      * Add a File Editor console creator to the File menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addConsoleCreatorToFileMenu")
    @js.native
    def addConsoleCreatorToFileMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]
    ): Unit = js.native
    
    /**
      * Wrapper function for adding the default items to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addContextMenuItems")
    @js.native
    def addContextMenuItems(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add copy command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCopyCommand")
    @js.native
    def addCopyCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Copy item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCopyCommandToContextMenu")
    @js.native
    def addCopyCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add the Create Console for Editor command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCreateConsoleCommand")
    @js.native
    def addCreateConsoleCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Create Console item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCreateConsoleToContextMenu")
    @js.native
    def addCreateConsoleToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add the New File command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCreateNewCommand")
    @js.native
    def addCreateNewCommand(commands: CommandRegistry, browserFactory: IFileBrowserFactory): Unit = js.native
    
    /**
      * Add a Create New File command to the File Editor palette
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCreateNewCommandToPalette")
    @js.native
    def addCreateNewCommandToPalette(palette: ICommandPalette): Unit = js.native
    
    /**
      * Add a Create New File command to the File menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCreateNewFileToFileMenu")
    @js.native
    def addCreateNewFileToFileMenu(menu: IMainMenu): Unit = js.native
    
    /**
      * Add the New Markdown File command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCreateNewMarkdownCommand")
    @js.native
    def addCreateNewMarkdownCommand(commands: CommandRegistry, browserFactory: IFileBrowserFactory): Unit = js.native
    
    /**
      * Add a Create New Markdown command to the File Editor palette
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCreateNewMarkdownCommandToPalette")
    @js.native
    def addCreateNewMarkdownCommandToPalette(palette: ICommandPalette): Unit = js.native
    
    /**
      * Add a Create New Markdown File command to the File menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCreateNewMarkdownFileToFileMenu")
    @js.native
    def addCreateNewMarkdownFileToFileMenu(menu: IMainMenu): Unit = js.native
    
    /**
      * Add Create New Markdown to the Launcher
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCreateNewMarkdownToLauncher")
    @js.native
    def addCreateNewMarkdownToLauncher(launcher: ILauncher): Unit = js.native
    
    /**
      * Add Create New Text File to the Launcher
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCreateNewToLauncher")
    @js.native
    def addCreateNewToLauncher(launcher: ILauncher): Unit = js.native
    
    /**
      * Add cut command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCutCommand")
    @js.native
    def addCutCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Cut item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addCutCommandToContextMenu")
    @js.native
    def addCutCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add File Editor editing commands to the Settings menu, including:
      * Indent with Tab, Tab Spaces, Change Font Size, and auto closing brackets
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addEditingCommandsToSettingsMenu")
    @js.native
    def addEditingCommandsToSettingsMenu(menu: IMainMenu, commands: CommandRegistry): Unit = js.native
    
    /**
      * Add a File Editor editor viewer to the View Menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addEditorViewerToViewMenu")
    @js.native
    def addEditorViewerToViewMenu(menu: IMainMenu, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = js.native
    
    /**
      * Wrapper function for adding the default launcher items for File Editor
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addLauncherItems")
    @js.native
    def addLauncherItems(launcher: ILauncher): Unit = js.native
    
    /**
      * Add the Line Numbers command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addLineNumbersCommand")
    @js.native
    def addLineNumbersCommand(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      id: String,
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add markdown preview command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addMarkdownPreviewCommand")
    @js.native
    def addMarkdownPreviewCommand(commands: CommandRegistry, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = js.native
    
    /**
      * Add a Markdown Preview item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addMarkdownPreviewToContextMenu")
    @js.native
    def addMarkdownPreviewToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add the Match Brackets command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addMatchBracketsCommand")
    @js.native
    def addMatchBracketsCommand(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      id: String,
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Wrapper function for adding the default menu items for File Editor
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addMenuItems")
    @js.native
    def addMenuItems(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker
    ): Unit = js.native
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addMenuItems")
    @js.native
    def addMenuItems(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker,
      sessionDialogs: ISessionContextDialogs
    ): Unit = js.native
    
    /**
      * Wrapper function for adding the default items to the File Editor palette
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addPaletteItems")
    @js.native
    def addPaletteItems(palette: ICommandPalette): Unit = js.native
    
    /**
      * Add paste command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addPasteCommand")
    @js.native
    def addPasteCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Paste item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addPasteCommandToContextMenu")
    @js.native
    def addPasteCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add redo command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addRedoCommand")
    @js.native
    def addRedoCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Redo item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addRedoCommandToContextMenu")
    @js.native
    def addRedoCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add the replace selection for text editor command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addReplaceSelectionCommand")
    @js.native
    def addReplaceSelectionCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add the Run All Code command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addRunAllCodeCommand")
    @js.native
    def addRunAllCodeCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add the Run Code command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addRunCodeCommand")
    @js.native
    def addRunCodeCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add select all command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addSelectAllCommand")
    @js.native
    def addSelectAllCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Select All item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addSelectAllCommandToContextMenu")
    @js.native
    def addSelectAllCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add undo command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addUndoCommand")
    @js.native
    def addUndoCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Undo item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addUndoCommandToContextMenu")
    @js.native
    def addUndoCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add File Editor undo and redo widgets to the Edit menu
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addUndoRedoToEditMenu")
    @js.native
    def addUndoRedoToEditMenu(menu: IMainMenu, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = js.native
    
    /**
      * Add the Word Wrap command
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.addWordWrapCommand")
    @js.native
    def addWordWrapCommand(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      id: String,
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Update the setting values.
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.updateSettings")
    @js.native
    def updateSettings(settings: ISettings, commands: CommandRegistry): Unit = js.native
    
    /**
      * Update the settings of the current tracker instances.
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.updateTracker")
    @js.native
    def updateTracker(tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = js.native
    
    /**
      * Update the settings of a widget.
      * Skip global settings for transient editor specific configs.
      */
    @JSImport("@jupyterlab/fileeditor-extension", "Commands.updateWidget")
    @js.native
    def updateWidget(widget: FileEditor): Unit = js.native
  }
  
  @JSImport("@jupyterlab/fileeditor-extension", "tabSpaceStatus")
  @js.native
  val tabSpaceStatus: JupyterFrontEndPlugin[Unit] = js.native
  
  type _To = js.Array[JupyterFrontEndPlugin[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[js.Any]] = default
}
