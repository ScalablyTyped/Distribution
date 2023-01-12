package typings.jupyterlabFileeditorExtension

import typings.jupyterlabApputils.libCommandpaletteMod.ICommandPalette
import typings.jupyterlabApputils.libTokensMod.ISessionContextDialogs
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabConsole.libTokensMod.IConsoleTracker
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.jupyterlabFilebrowser.libTokensMod.IFileBrowserFactory
import typings.jupyterlabFileeditor.mod.FileEditor
import typings.jupyterlabLauncher.mod.ILauncher
import typings.jupyterlabMainmenu.libTokensMod.IMainMenu
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.ISettings
import typings.jupyterlabTranslation.libTokensMod.TranslationBundle
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.typesJsonMod.ReadonlyJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommandsMod {
  
  object CommandIDs {
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.autoClosingBrackets")
    @js.native
    val autoClosingBrackets: /* "fileeditor:toggle-autoclosing-brackets" */ String = js.native
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "CommandIDs.autoClosingBracketsUniversal")
    @js.native
    val autoClosingBracketsUniversal: /* "fileeditor:toggle-autoclosing-brackets-universal" */ String = js.native
    
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
    
    @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "Commands")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add the Auto Close Brackets for Text Editor command
      */
    inline def addAutoClosingBracketsCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, trans: TranslationBundle, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAutoClosingBracketsCommand")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a command to change font size for File Editor
      */
    inline def addChangeFontSizeCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, trans: TranslationBundle, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangeFontSizeCommand")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add commands to change the font size to the File Editor palette
      */
    inline def addChangeFontSizeCommandsToPalette(palette: ICommandPalette, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangeFontSizeCommandsToPalette")(palette.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add command for changing tabs size or type in File Editor
      */
    inline def addChangeTabsCommand(commands: CommandRegistry, settingRegistry: ISettingRegistry, trans: TranslationBundle, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangeTabsCommand")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add commands to change the tab indentation to the File Editor palette
      */
    inline def addChangeTabsCommandsToPalette(palette: ICommandPalette, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChangeTabsCommandsToPalette")(palette.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a File Editor code runner to the Run menu
      */
    inline def addCodeRunnersToRunMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker,
      trans: TranslationBundle
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCodeRunnersToRunMenu")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], consoleTracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addCodeRunnersToRunMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      consoleTracker: IConsoleTracker,
      trans: TranslationBundle,
      sessionDialogs: ISessionContextDialogs
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCodeRunnersToRunMenu")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], consoleTracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], sessionDialogs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wrapper function for adding the default File Editor commands
      */
    inline def addCommands(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      trans: TranslationBundle,
      id: String,
      isEnabled: js.Function0[Boolean],
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      browserFactory: IFileBrowserFactory
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCommands")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], id.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], browserFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a File Editor console creator to the File menu
      */
    inline def addConsoleCreatorToFileMenu(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addConsoleCreatorToFileMenu")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add copy command
      */
    inline def addCopyCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCopyCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add the Create Console for Editor command
      */
    inline def addCreateConsoleCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCreateConsoleCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add the New File command
      *
      * Defaults to Text/.txt if file type data is not specified
      */
    inline def addCreateNewCommand(commands: CommandRegistry, browserFactory: IFileBrowserFactory, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewCommand")(commands.asInstanceOf[js.Any], browserFactory.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a Create New File command to the File Editor palette
      */
    inline def addCreateNewCommandToPalette(palette: ICommandPalette, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewCommandToPalette")(palette.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add the New Markdown File command
      */
    inline def addCreateNewMarkdownCommand(commands: CommandRegistry, browserFactory: IFileBrowserFactory, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewMarkdownCommand")(commands.asInstanceOf[js.Any], browserFactory.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a Create New Markdown command to the File Editor palette
      */
    inline def addCreateNewMarkdownCommandToPalette(palette: ICommandPalette, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewMarkdownCommandToPalette")(palette.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add Create New Markdown to the Launcher
      */
    inline def addCreateNewMarkdownToLauncher(launcher: ILauncher, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewMarkdownToLauncher")(launcher.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add Create New Text File to the Launcher
      */
    inline def addCreateNewToLauncher(launcher: ILauncher, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCreateNewToLauncher")(launcher.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add cut command
      */
    inline def addCutCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCutCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a File Editor editor viewer to the View Menu
      */
    inline def addEditorViewerToViewMenu(menu: IMainMenu, tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEditorViewerToViewMenu")(menu.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add ___ File items to the Launcher for common file types associated with available kernels
      */
    inline def addKernelLanguageLauncherItems(
      launcher: ILauncher,
      trans: TranslationBundle,
      availableKernelFileTypes: js.Iterable[IFileTypeData]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addKernelLanguageLauncherItems")(launcher.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], availableKernelFileTypes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add Create New ___ File commands to the File menu for common file types associated with available kernels
      */
    inline def addKernelLanguageMenuItems(menu: IMainMenu, availableKernelFileTypes: js.Iterable[IFileTypeData]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addKernelLanguageMenuItems")(menu.asInstanceOf[js.Any], availableKernelFileTypes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add New ___ File commands to the File Editor palette for common file types associated with available kernels
      */
    inline def addKernelLanguagePaletteItems(
      palette: ICommandPalette,
      trans: TranslationBundle,
      availableKernelFileTypes: js.Iterable[IFileTypeData]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addKernelLanguagePaletteItems")(palette.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], availableKernelFileTypes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wrapper function for adding the default launcher items for File Editor
      */
    inline def addLauncherItems(launcher: ILauncher, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLauncherItems")(launcher.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add the Line Numbers command
      */
    inline def addLineNumbersCommand(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      trans: TranslationBundle,
      id: String,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLineNumbersCommand")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], id.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add markdown preview command
      */
    inline def addMarkdownPreviewCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMarkdownPreviewCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add the Match Brackets command
      */
    inline def addMatchBracketsCommand(
      commands: CommandRegistry,
      settingRegistry: ISettingRegistry,
      trans: TranslationBundle,
      id: String,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMatchBracketsCommand")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], id.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wrapper function for adding the default menu items for File Editor
      */
    inline def addMenuItems(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMenuItems")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addMenuItems(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      consoleTracker: Null,
      sessionDialogs: ISessionContextDialogs
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMenuItems")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], consoleTracker.asInstanceOf[js.Any], sessionDialogs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addMenuItems(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      consoleTracker: IConsoleTracker
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMenuItems")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], consoleTracker.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addMenuItems(
      menu: IMainMenu,
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      consoleTracker: IConsoleTracker,
      sessionDialogs: ISessionContextDialogs
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMenuItems")(menu.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], consoleTracker.asInstanceOf[js.Any], sessionDialogs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wrapper function for adding the default items to the File Editor palette
      */
    inline def addPaletteItems(palette: ICommandPalette, trans: TranslationBundle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPaletteItems")(palette.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add paste command
      */
    inline def addPasteCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPasteCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add redo command
      */
    inline def addRedoCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRedoCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add the replace selection for text editor command
      */
    inline def addReplaceSelectionCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addReplaceSelectionCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add the Run All Code command
      */
    inline def addRunAllCodeCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRunAllCodeCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add the Run Code command
      */
    inline def addRunCodeCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRunCodeCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add select all command
      */
    inline def addSelectAllCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSelectAllCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add undo command
      */
    inline def addUndoCommand(
      commands: CommandRegistry,
      tracker: WidgetTracker[IDocumentWidget[FileEditor, IModel]],
      trans: TranslationBundle,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addUndoCommand")(commands.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
      trans: TranslationBundle,
      id: String,
      isEnabled: js.Function0[Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWordWrapCommand")(commands.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], trans.asInstanceOf[js.Any], id.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
  
  @JSImport("@jupyterlab/fileeditor-extension/lib/commands", "FACTORY")
  @js.native
  val FACTORY: /* "Editor" */ String = js.native
  
  trait IFileTypeData
    extends StObject
       with ReadonlyJSONObject {
    
    var caption: String
    
    var fileExt: String
    
    var iconName: String
    
    var launcherLabel: String
    
    var paletteLabel: String
  }
  object IFileTypeData {
    
    inline def apply(caption: String, fileExt: String, iconName: String, launcherLabel: String, paletteLabel: String): IFileTypeData = {
      val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], fileExt = fileExt.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], launcherLabel = launcherLabel.asInstanceOf[js.Any], paletteLabel = paletteLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileTypeData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFileTypeData] (val x: Self) extends AnyVal {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setFileExt(value: String): Self = StObject.set(x, "fileExt", value.asInstanceOf[js.Any])
      
      inline def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
      
      inline def setLauncherLabel(value: String): Self = StObject.set(x, "launcherLabel", value.asInstanceOf[js.Any])
      
      inline def setPaletteLabel(value: String): Self = StObject.set(x, "paletteLabel", value.asInstanceOf[js.Any])
    }
  }
}
