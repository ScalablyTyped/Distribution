package typings.jupyterlabFileeditorExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
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

object commandsMod {
  
  object CommandIDs {
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.autoClosingBrackets")
    @js.native
    val autoClosingBrackets: /* "fileeditor:toggle-autoclosing-brackets" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.changeFontSize")
    @js.native
    val changeFontSize: /* "fileeditor:change-font-size" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.changeTabs")
    @js.native
    val changeTabs: /* "fileeditor:change-tabs" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.copy")
    @js.native
    val copy: /* "fileeditor:copy" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.createConsole")
    @js.native
    val createConsole: /* "fileeditor:create-console" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.createNew")
    @js.native
    val createNew: /* "fileeditor:create-new" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.createNewMarkdown")
    @js.native
    val createNewMarkdown: /* "fileeditor:create-new-markdown-file" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.cut")
    @js.native
    val cut: /* "fileeditor:cut" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.lineNumbers")
    @js.native
    val lineNumbers: /* "fileeditor:toggle-line-numbers" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.lineWrap")
    @js.native
    val lineWrap: /* "fileeditor:toggle-line-wrap" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.markdownPreview")
    @js.native
    val markdownPreview: /* "fileeditor:markdown-preview" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.matchBrackets")
    @js.native
    val matchBrackets: /* "fileeditor:toggle-match-brackets" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.paste")
    @js.native
    val paste: /* "fileeditor:paste" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.redo")
    @js.native
    val redo: /* "fileeditor:redo" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.replaceSelection")
    @js.native
    val replaceSelection: /* "fileeditor:replace-selection" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.runAllCode")
    @js.native
    val runAllCode: /* "fileeditor:run-all" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.runCode")
    @js.native
    val runCode: /* "fileeditor:run-code" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.selectAll")
    @js.native
    val selectAll: /* "fileeditor:select-all" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.undo")
    @js.native
    val undo: /* "fileeditor:undo" */ String = js.native
  }
  
  object Commands {
    
    /**
      * Add the Auto Close Brackets for Text Editor command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addAutoClosingBracketsCommand")
    @js.native
    def addAutoClosingBracketsCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, id: String): Unit = js.native
    
    /**
      * Add a command to change font size for File Editor
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addChangeFontSizeCommand")
    @js.native
    def addChangeFontSizeCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, id: String): Unit = js.native
    
    /**
      * Add commands to change the font size to the File Editor palette
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addChangeFontSizeCommandsToPalette")
    @js.native
    def addChangeFontSizeCommandsToPalette(palette: ICommandPalette): Unit = js.native
    
    /**
      * Add command for changing tabs size or type in File Editor
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addChangeTabsCommand")
    @js.native
    def addChangeTabsCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, id: String): Unit = js.native
    
    /**
      * Add commands to change the tab indentation to the File Editor palette
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addChangeTabsCommandsToPalette")
    @js.native
    def addChangeTabsCommandsToPalette(palette: ICommandPalette): Unit = js.native
    
    /**
      * Add a File Editor code runner to the Run menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCodeRunnersToRunMenu")
    @js.native
    def addCodeRunnersToRunMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker
    ): Unit = js.native
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCodeRunnersToRunMenu")
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
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCommands")
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
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addConsoleCreatorToFileMenu")
    @js.native
    def addConsoleCreatorToFileMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]
    ): Unit = js.native
    
    /**
      * Wrapper function for adding the default items to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addContextMenuItems")
    @js.native
    def addContextMenuItems(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add copy command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCopyCommand")
    @js.native
    def addCopyCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Copy item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCopyCommandToContextMenu")
    @js.native
    def addCopyCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add the Create Console for Editor command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCreateConsoleCommand")
    @js.native
    def addCreateConsoleCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Create Console item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCreateConsoleToContextMenu")
    @js.native
    def addCreateConsoleToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add the New File command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCreateNewCommand")
    @js.native
    def addCreateNewCommand(commands: CommandRegistry, browserFactory: IFileBrowserFactory): Unit = js.native
    
    /**
      * Add a Create New File command to the File Editor palette
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCreateNewCommandToPalette")
    @js.native
    def addCreateNewCommandToPalette(palette: ICommandPalette): Unit = js.native
    
    /**
      * Add a Create New File command to the File menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCreateNewFileToFileMenu")
    @js.native
    def addCreateNewFileToFileMenu(menu: IMainMenu): Unit = js.native
    
    /**
      * Add the New Markdown File command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCreateNewMarkdownCommand")
    @js.native
    def addCreateNewMarkdownCommand(commands: CommandRegistry, browserFactory: IFileBrowserFactory): Unit = js.native
    
    /**
      * Add a Create New Markdown command to the File Editor palette
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCreateNewMarkdownCommandToPalette")
    @js.native
    def addCreateNewMarkdownCommandToPalette(palette: ICommandPalette): Unit = js.native
    
    /**
      * Add a Create New Markdown File command to the File menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCreateNewMarkdownFileToFileMenu")
    @js.native
    def addCreateNewMarkdownFileToFileMenu(menu: IMainMenu): Unit = js.native
    
    /**
      * Add Create New Markdown to the Launcher
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCreateNewMarkdownToLauncher")
    @js.native
    def addCreateNewMarkdownToLauncher(launcher: ILauncher): Unit = js.native
    
    /**
      * Add Create New Text File to the Launcher
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCreateNewToLauncher")
    @js.native
    def addCreateNewToLauncher(launcher: ILauncher): Unit = js.native
    
    /**
      * Add cut command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCutCommand")
    @js.native
    def addCutCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Cut item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addCutCommandToContextMenu")
    @js.native
    def addCutCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add File Editor editing commands to the Settings menu, including:
      * Indent with Tab, Tab Spaces, Change Font Size, and auto closing brackets
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addEditingCommandsToSettingsMenu")
    @js.native
    def addEditingCommandsToSettingsMenu(menu: IMainMenu, commands: CommandRegistry): Unit = js.native
    
    /**
      * Add a File Editor editor viewer to the View Menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addEditorViewerToViewMenu")
    @js.native
    def addEditorViewerToViewMenu(menu: IMainMenu, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = js.native
    
    /**
      * Wrapper function for adding the default launcher items for File Editor
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addLauncherItems")
    @js.native
    def addLauncherItems(launcher: ILauncher): Unit = js.native
    
    /**
      * Add the Line Numbers command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addLineNumbersCommand")
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
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addMarkdownPreviewCommand")
    @js.native
    def addMarkdownPreviewCommand(commands: CommandRegistry, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = js.native
    
    /**
      * Add a Markdown Preview item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addMarkdownPreviewToContextMenu")
    @js.native
    def addMarkdownPreviewToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add the Match Brackets command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addMatchBracketsCommand")
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
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addMenuItems")
    @js.native
    def addMenuItems(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker
    ): Unit = js.native
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addMenuItems")
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
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addPaletteItems")
    @js.native
    def addPaletteItems(palette: ICommandPalette): Unit = js.native
    
    /**
      * Add paste command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addPasteCommand")
    @js.native
    def addPasteCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Paste item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addPasteCommandToContextMenu")
    @js.native
    def addPasteCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add redo command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addRedoCommand")
    @js.native
    def addRedoCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Redo item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addRedoCommandToContextMenu")
    @js.native
    def addRedoCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add the replace selection for text editor command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addReplaceSelectionCommand")
    @js.native
    def addReplaceSelectionCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add the Run All Code command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addRunAllCodeCommand")
    @js.native
    def addRunAllCodeCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add the Run Code command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addRunCodeCommand")
    @js.native
    def addRunCodeCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add select all command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addSelectAllCommand")
    @js.native
    def addSelectAllCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Select All item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addSelectAllCommandToContextMenu")
    @js.native
    def addSelectAllCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add undo command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addUndoCommand")
    @js.native
    def addUndoCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      isEnabled: js.Function0[Boolean]
    ): Unit = js.native
    
    /**
      * Add a Undo item to the File Editor context menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addUndoCommandToContextMenu")
    @js.native
    def addUndoCommandToContextMenu(app: JupyterFrontEnd[IShell]): Unit = js.native
    
    /**
      * Add File Editor undo and redo widgets to the Edit menu
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addUndoRedoToEditMenu")
    @js.native
    def addUndoRedoToEditMenu(menu: IMainMenu, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = js.native
    
    /**
      * Add the Word Wrap command
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.addWordWrapCommand")
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
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.updateSettings")
    @js.native
    def updateSettings(settings: ISettings, commands: CommandRegistry): Unit = js.native
    
    /**
      * Update the settings of the current tracker instances.
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.updateTracker")
    @js.native
    def updateTracker(tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = js.native
    
    /**
      * Update the settings of a widget.
      * Skip global settings for transient editor specific configs.
      */
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands.updateWidget")
    @js.native
    def updateWidget(widget: FileEditor): Unit = js.native
  }
  
  @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "FACTORY")
  @js.native
  val FACTORY: /* "Editor" */ String = js.native
}
